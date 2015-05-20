function TagGenerate() {
	var tagArray = new Array();
	tagArray[0] = 'div';
	tagArray[1] = 'table';
	tagArray[2] = 'td';
	tagArray[3] = 'tr';
	tagArray[4] = 'span';
	tagArray[5] = 'a';
	tagArray[6] = 'body';
	tagArray[7] = 'h1';
	tagArray[8] = 'h2';
	tagArray[9] = 'h3';
	tagArray[10] = 'li';
	tagArray[11] = 'ul';
	return tagArray;
}

function AttributeGenerate() {
	var attributeArray = new Array();
	attributeArray[0] = 'id';
	attributeArray[1] = 'class';
	attributeArray[2] = 'href';
	attributeArray[3] = 'height';
	attributeArray[4] = 'null';
	return attributeArray;
}

function addSelect(tablename) {
	var newtr = document.createElement('p');
	var count = parseInt(document.getElementById("countValue").value);
	document.getElementById("countValue").value = count + 1;

	var html1 = "<select class='text-medium' id='taglevel" + count + "' >", tags = TagGenerate(), i;
	for (i = 0; i < tags.length; i++) {
		html1 += "<option value='" + tags[i] + "'>" + tags[i] + "</option>";
	}
	html1 += "</select>";

	var html2 = "<select class='text-medium' id='attributelevel" + count + "'>", attributes = AttributeGenerate(), j;
	for (j = 0; j < attributes.length; j++) {
		html2 += "<option value='" + attributes[j] + "'>" + attributes[j]
				+ "</option>";
	}
	html2 += "</select>";

	var html3 = "<input type= 'text' class='text-long' id='attrValue" + count + "'></input>";

	newtr.innerHTML = html1 + html2 + html3;
	document.getElementById(tablename).appendChild(newtr);
	document.getElementById("ParseContent").disabled = false;
	document.getElementById("addcontentbutton").style.visibility = 'visible';
}

function addContent() {

	var count = parseInt(document.getElementById("countValue").value);

	var i;
	var content = "";
	// alert(content);
	var tagvalue;
	var attributevalue;
	var attrinputvalue;
	for (i = 1; i < count; i++) {
		tagvalue = document.getElementById("taglevel" + i).value;
		attributevalue = document.getElementById("attributelevel" + i).value;
		attrinputvalue = document.getElementById("attrValue" + i).value;
		if (i == count - 1) {
			if (attributevalue != 'null') {
				if (attrinputvalue != '')
					content = content + tagvalue + "[" + attributevalue + "="
							+ attrinputvalue + "]";
				else
					content = content + tagvalue + "[" + attributevalue + "]";
			} else
				content = content + tagvalue;

		} else {
			if (attributevalue != 'null') {
				if (attrinputvalue != '')
					content = content + tagvalue + "[" + attributevalue + "="
							+ attrinputvalue + "]; ";
				else
					content = content + tagvalue + "[" + attributevalue + "]; ";
			} else
				content = content + tagvalue + "; ";
		}

	}

	document.getElementById("ParseContent").value = content;
	document.getElementById("submitbutton").style.display = "initial";
}
