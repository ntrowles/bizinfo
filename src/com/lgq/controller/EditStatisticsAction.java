package com.lgq.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import com.lgq.entity.TbusinesstypeEntity;
import com.lgq.entity.TparselinksEntity;
import com.lgq.entity.TvisitorEntity;
import com.lgq.entity.TvisitstatisticsEntity;
import com.lgq.service.TbusinesstypeManager;
import com.lgq.service.TparselinksManager;
import com.lgq.service.TvisitorManager;
import com.lgq.service.TvisitstatisticsManager;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class EditStatisticsAction extends ActionSupport implements Preparable {
	private static final long serialVersionUID = 1L;

	// Logger configured using log4j
	private static final Logger logger = Logger
			.getLogger(EditStatisticsAction.class);
	private List<TvisitstatisticsEntity> mstatistics;
	private List<TparselinksEntity> tparselinks;
	private List<TbusinesstypeEntity> tbusinesstypes;
	private List<TvisitorEntity> tvisitors;

	private TvisitstatisticsEntity tvisitstatistics;
	private TparselinksEntity tparselink;
	private TbusinesstypeEntity tbusinesstype;
	private TvisitorEntity tvisitor;

	private TvisitstatisticsManager tvisitstatisticsManager;
	private TparselinksManager tparselinksManager;
	private TbusinesstypeManager tbusinesstypeManager;
	private TvisitorManager tvisitorManager;

	public String listMstatistics() {
		logger.info("listMstatistics method called");
		mstatistics = tvisitstatisticsManager.getAllStatistics();
		tbusinesstypes = tbusinesstypeManager.getAllTypes();
		tparselinks = tparselinksManager.getAllLinks();
		return SUCCESS;
	}
	
	private String ExcelDataFile;
	
	public String getExcelDataFile() {
		return ExcelDataFile;
	}

	public void setExcelDataFile(String excelDataFile) {
		ExcelDataFile = excelDataFile;
	}

	private InputStream fileInputStream;
	

	public InputStream getFileInputStream() {
		return fileInputStream;
	}

	// export the data to the excel
	public String exportToExcel() throws SQLException, FileNotFoundException,
			IOException {

		logger.info("exportToExcel method called");
		//File catalinaBase = new File(  ).getAbsolutePath();
		String sRootPath = new File(System.getProperty( "catalina.base" )).getAbsolutePath();
		System.out.println(sRootPath);
		ExcelDataFile = sRootPath+"\\outputdata.xls";
		System.out.println(ExcelDataFile);
		mstatistics = tvisitstatisticsManager.getAllStatistics();
		tparselinks = tparselinksManager.getAllLinks();
		// Create new Excel workbook and sheet
		HSSFWorkbook xlsWorkbook = new HSSFWorkbook();
		HSSFSheet xlsSheet = xlsWorkbook.createSheet();
		short rowIndex = 0;

		// Get the list of column names and store them as the first
		// row of the spreadsheet.
		// ResultSetMetaData colInfo = rs.getMetaData();
		// List<String> colNames = new ArrayList<String>();
		HSSFRow titleRow = xlsSheet.createRow(rowIndex++);

		String[] colNames = { "title", "url", "date", "visittimes" };

		for (int i = 1; i <= colNames.length; i++) {
			titleRow.createCell((short) (i - 1)).setCellValue(
					new HSSFRichTextString(colNames[i - 1]));
			xlsSheet.setColumnWidth((short) (i - 1), (short) 4000);
		}

		// Save all the data from the database table rows
		for (TvisitstatisticsEntity s : mstatistics) {
			HSSFRow dataRow = xlsSheet.createRow(rowIndex++);
			short colIndex = 0;
			String linktitle = null;
			String linkurl = null;
			for (TparselinksEntity tp : tparselinks) {
				if (s.getLinkid() == tp.getId()) {
					linktitle = tp.getOutlinktitle();
					linkurl = tp.getOutlinkurl();
				}
			}
			// add related information to excel
			Object[] objectArray = new Object[2];
			objectArray[0] = s.getVisitdate();
			objectArray[1] = s.getVisittimes();
			dataRow.createCell(colIndex++).setCellValue(
					new HSSFRichTextString(linktitle));
			dataRow.createCell(colIndex++).setCellValue(
					new HSSFRichTextString(linkurl));
			dataRow.createCell(colIndex++).setCellValue(
					new HSSFRichTextString(objectArray[0].toString()));
			dataRow.createCell(colIndex++).setCellValue(
					new HSSFRichTextString(objectArray[0].toString()));
		}

		// Write to disk
		xlsWorkbook.write(new FileOutputStream(ExcelDataFile));
		System.out.println("Write " + ExcelDataFile + "Successfully!");
		
		fileInputStream = new FileInputStream(new File(ExcelDataFile));
		return SUCCESS;
	}
	
	

	/******************************* Use JDBC ODBC **************************************************/
	/*
	 * Connection con = null; static String url =
	 * "jdbc:odbc:DRIVER={Microsoft Excel Driver (*.xls)};" +
	 * "DBQ=D:/book1.xlsx;ReadOnly=0;";
	 * 
	 * public Connection getExcelRef() { try {
	 * 
	 * Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	 * 
	 * try { con = DriverManager.getConnection(url); return con; } catch
	 * (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); return null; }
	 * 
	 * } catch (ClassNotFoundException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); return null; } }
	 * 
	 * public void exportToExcel() { PreparedStatement ps; mstatistics =
	 * tvisitstatisticsManager.getAllStatistics(); tparselinks =
	 * tparselinksManager.getAllLinks(); int i = 0; for (TvisitstatisticsEntity
	 * s : mstatistics) {
	 * 
	 * try { ps = getExcelRef() .prepareStatement(
	 * "insert into [Sheet1$](NAME,ROLL,MARKS) values(?,?,?) "); String
	 * linktitle = null; String linkurl = null; for (TparselinksEntity tp :
	 * tparselinks) { if (s.getLinkid() == tp.getId()) { linktitle =
	 * tp.getOutlinktitle(); linkurl = tp.getOutlinkurl(); } } ps.setString(1,
	 * linktitle); ps.setString(2, linkurl); java.util.Date utilDate =
	 * s.getVisitdate(); java.sql.Date sqlDate = new
	 * java.sql.Date(utilDate.getTime()); ps.setDate(3, sqlDate); ps.setInt(4,
	 * s.getVisittimes()); i = ps.executeUpdate(); } catch (SQLException ex) {
	 * 
	 * }
	 * 
	 * } if (i > 0) { System.out.println("Data imported successfully"); } else {
	 * System.out.println("Problem in data insertion"); } }
	 */
	/*****************************************************************************************/

	// For statistics of visit time for different visitors recorded by mac
	// address
	public String addStatistics() {
		logger.info("addStatistics method called");

		System.out.println("-------------" + tvisitor.getMacaddress());
		// find macaddress
		tvisitors = tvisitorManager.getAllVisitors();
		int visitorid = tvisitorManager.findVisitor(tvisitor.getMacaddress());
		if (visitorid == 0) {
			tvisitorManager.addVisitor(tvisitor);
			visitorid = tvisitorManager.findVisitor(tvisitor.getMacaddress());
		}

		// get the target URL from parselinks table
		tparselinks = tparselinksManager.getAllLinks();
		for (int index = 0; index < tparselinks.size(); index++) {
			if (tvisitstatistics.getLinkid() == tparselinks.get(index).getId())
				tparselink = tparselinks.get(index);
		}

		// check whether it has been visited in one day
		Date date = new Date();
		Timestamp timeStamp = new Timestamp(date.getTime());

		mstatistics = tvisitstatisticsManager.getAllStatistics();
		for (int index = 0; index < mstatistics.size(); index++) {
			if (mstatistics.get(index).getStatus() == 1) {
				if (tvisitstatistics.getLinkid() == mstatistics.get(index)
						.getLinkid()
						&& visitorid == mstatistics.get(index).getVisitorid()) {
					Timestamp historytime = mstatistics.get(index)
							.getVisitdate();
					int diffdays = getDaysBetween(timeStamp, historytime);
					if (diffdays != 0) { // if visit in different day, it is
											// stills a new record.
						tvisitstatisticsManager.updateStatus(mstatistics.get(
								index).getId());
						TvisitstatisticsEntity CP_tvisitstatistics = new TvisitstatisticsEntity();
						CP_tvisitstatistics.setLinkid(tparselink.getId());
						CP_tvisitstatistics.setTypeid(tparselink.getTypeid());
						CP_tvisitstatistics.setVisitdate(timeStamp);
						CP_tvisitstatistics.setVisittimes(1);
						CP_tvisitstatistics.setStatus(1);
						CP_tvisitstatistics.setVisitorid(visitorid);
						tvisitstatisticsManager
								.addStatistics(CP_tvisitstatistics);
						tbusinesstypeManager.UpdateStatistics(tparselink
								.getTypeid());
						return SUCCESS;
					} else {
						tvisitstatisticsManager.updateStatistics(mstatistics
								.get(index).getId());
						tbusinesstypeManager.UpdateStatistics(tparselink
								.getTypeid());
						return SUCCESS;
					}
				} // end if visitor id
			}// end if (mstatistics.get(index).getStatus() == 1)
		}

		// if it is a new record, create a new entity and add it
		TvisitstatisticsEntity CP_tvisitstatistics = new TvisitstatisticsEntity();
		CP_tvisitstatistics.setLinkid(tparselink.getId());
		CP_tvisitstatistics.setTypeid(tparselink.getTypeid());
		CP_tvisitstatistics.setVisitdate(timeStamp);
		CP_tvisitstatistics.setVisittimes(1);
		CP_tvisitstatistics.setStatus(1);
		CP_tvisitstatistics.setVisitorid(visitorid);
		tvisitstatisticsManager.addStatistics(CP_tvisitstatistics);
		tbusinesstypeManager.UpdateStatistics(tparselink.getTypeid());
		return SUCCESS;
	}

	private int getDaysBetween(Timestamp start, Timestamp end) {

		boolean negative = false;
		if (end.before(start)) {
			negative = true;
			Timestamp temp = start;
			start = end;
			end = temp;
		}

		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(start);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);

		GregorianCalendar calEnd = new GregorianCalendar();
		calEnd.setTime(end);
		calEnd.set(Calendar.HOUR_OF_DAY, 0);
		calEnd.set(Calendar.MINUTE, 0);
		calEnd.set(Calendar.SECOND, 0);
		calEnd.set(Calendar.MILLISECOND, 0);

		if (cal.get(Calendar.YEAR) == calEnd.get(Calendar.YEAR)) {
			if (negative)
				return (calEnd.get(Calendar.DAY_OF_YEAR) - cal
						.get(Calendar.DAY_OF_YEAR)) * -1;
			return calEnd.get(Calendar.DAY_OF_YEAR)
					- cal.get(Calendar.DAY_OF_YEAR);
		}

		int days = 0;
		while (calEnd.after(cal)) {
			cal.add(Calendar.DAY_OF_YEAR, 1);
			days++;
		}
		if (negative)
			return days * -1;
		return days;
	}

	public String deleteStatistics() {
		logger.info("deleteStatistics method called");
		tvisitstatisticsManager.deleteStatistics(tvisitstatistics.getId());
		return SUCCESS;
	}

	// This method will be called before any of Action method is invoked;
	// So some pre-processing if required.
	@Override
	public void prepare() throws Exception {
		tvisitstatistics = null;
		tparselink = null;
		tvisitor = null;
	}

	public List<TvisitstatisticsEntity> getMstatistics() {
		return mstatistics;
	}

	public void setMstatistics(List<TvisitstatisticsEntity> mstatistics) {
		this.mstatistics = mstatistics;
	}

	public TvisitstatisticsEntity getTvisitstatistics() {
		return tvisitstatistics;
	}

	public void setTvisitstatistics(TvisitstatisticsEntity tvisitstatistics) {
		this.tvisitstatistics = tvisitstatistics;
	}

	public TvisitstatisticsManager getTvisitstatisticsManager() {
		return tvisitstatisticsManager;
	}

	public void setTvisitstatisticsManager(
			TvisitstatisticsManager tvisitstatisticsManager) {
		this.tvisitstatisticsManager = tvisitstatisticsManager;
	}

	public List<TparselinksEntity> getTparselinks() {
		return tparselinks;
	}

	public void setTparselinks(List<TparselinksEntity> tparselinks) {
		this.tparselinks = tparselinks;
	}

	public TparselinksEntity getTparselink() {
		return tparselink;
	}

	public void setTparselink(TparselinksEntity tparselink) {
		this.tparselink = tparselink;
	}

	public TparselinksManager getTparselinksManager() {
		return tparselinksManager;
	}

	public void setTparselinksManager(TparselinksManager tparselinksManager) {
		this.tparselinksManager = tparselinksManager;
	}

	public List<TbusinesstypeEntity> getTbusinesstypes() {
		return tbusinesstypes;
	}

	public void setTbusinesstypes(List<TbusinesstypeEntity> tbusinesstypes) {
		this.tbusinesstypes = tbusinesstypes;
	}

	public TbusinesstypeEntity getTbusinesstype() {
		return tbusinesstype;
	}

	public void setTbusinesstype(TbusinesstypeEntity tbusinesstype) {
		this.tbusinesstype = tbusinesstype;
	}

	public TbusinesstypeManager getTbusinesstypeManager() {
		return tbusinesstypeManager;
	}

	public void setTbusinesstypeManager(
			TbusinesstypeManager tbusinesstypeManager) {
		this.tbusinesstypeManager = tbusinesstypeManager;
	}

	public List<TvisitorEntity> getTvisitors() {
		return tvisitors;
	}

	public void setTvisitors(List<TvisitorEntity> tvisitors) {
		this.tvisitors = tvisitors;
	}

	public TvisitorEntity getTvisitor() {
		return tvisitor;
	}

	public void setTvisitor(TvisitorEntity tvisitor) {
		this.tvisitor = tvisitor;
	}

	public TvisitorManager getTvisitorManager() {
		return tvisitorManager;
	}

	public void setTvisitorManager(TvisitorManager tvisitorManager) {
		this.tvisitorManager = tvisitorManager;
	}

}
