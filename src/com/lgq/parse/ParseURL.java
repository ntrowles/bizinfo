package com.lgq.parse;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ParseURL {

	String[][] Tsection;
	String[] tags;
	String newurl;
	int levelSize;

	// This is for test
	public static void main(String[] args) {
		String url = "http://www.businessmigration.wa.gov.au/?page=business-migration";
		int levelSize = 2;
		String[] tags = { "div[id=secondary-content]", "a[href]" };
		ParseURL purl = new ParseURL(url, levelSize, tags);
		String[][] parseResult = purl.getParseContent();

		for (int index = 0; index < parseResult[0].length; index++) {
			String title = parseResult[0][index];
			String link = parseResult[1][index];
			System.out.println(title + "\n" + link);
		}
	}

	public ParseURL() {
		// TODO Auto-generated constructor stub
	}

	public ParseURL(String newurl, int levelSize, String[] tags) {
		// TODO Auto-generated constructor stub
		this.newurl = newurl;
		this.levelSize = levelSize;
		this.tags = tags;
	}

	public String[][] getParseContent() {
		try {
			// Connect to the web site

			// System.out.println("---------------1-------------------");
			Document document = Jsoup.connect(newurl).timeout(0).get();

			Elements[] elementArray = new Elements[levelSize];
			
			//check whether it has conditions, which make it more precisely.
			String[] Ctags = tags[0].split(",");
			if (Ctags.length > 1) {
				Elements originalEle = document.select(Ctags[0]);

				elementArray[0] = searchCurrent(originalEle, Ctags[1]);
			} else
				elementArray[0] = document.select(tags[0]);

			for (int index = 1; index < levelSize; index++) {
				elementArray[index] = elementArray[index - 1]
						.select(tags[index]);
			}

			int elementSize = elementArray[levelSize - 1].size();

			// System.out.println("---------------2-------------------");

			Tsection = new String[2][elementSize];

			int count = 0;
			for (Element src : elementArray[levelSize - 1]) {
				if (src.tagName().equals("a")) {
					Tsection[0][count] = src.text();
					Tsection[1][count] = src.attr("abs:href");
					count++;
				}
			}
			// System.out.println("---------------3-------------------");

			return Tsection;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public Elements searchCurrent(Elements element, String Condition) {
		// find the conditions
		String[] Cvalues = Condition.split("=");
		Elements newelement = new Elements();

		int earray0Size = element.size();
		if (earray0Size > 1) {
			for (int eindex = 0; eindex < earray0Size; eindex++) {
				System.out.println("---searchCurrent--Tag--"
						+ element.get(eindex).tagName());
				if (element.get(eindex).tagName().equals(Cvalues[0]))
					System.out.println("---searchCurrent--attr--"
							+ element.get(eindex).attr(Cvalues[1]));
				if (element.get(eindex).attr(Cvalues[1]).equals(Cvalues[2]))
					newelement.add(element.get(eindex));
			}
		}
		return newelement;
	}
}
