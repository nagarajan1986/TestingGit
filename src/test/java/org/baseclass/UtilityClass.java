package org.baseclass;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityClass {
	public static WebDriver driver;

	public static void browserLaunch(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		} else {
			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();
		}

	}
	
	
	

	public static void chromeBrowserLaunch() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
	}

	public static void firefoxBrowserLaunch() {

		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();
	}

	public static void edgeBrowserLaunch() {

		WebDriverManager.edgedriver().setup();

		driver = new EdgeDriver();
	}

	public static void ieBrowserLaunch() {

		WebDriverManager.iedriver().setup();

		driver = new InternetExplorerDriver();
	}

	public static void urlSetup(String url) {

		driver.get(url);

	}

	public static void implicitTimeWait(int seconds) {

		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
	
	public static void webdriverWait(int seconds, WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}
	
	public static void fluentWait(int time, WebElement element) {

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);

		wait.withTimeout(Duration.ofSeconds(time)).pollingEvery(Duration.ofSeconds(time))
				.ignoring(Exception.class);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	

	public static void maxWin() {
		driver.manage().window().maximize();

	}

	public static void sendTextboxValues(WebElement target, String value) {

		target.sendKeys(value);
	}

	public static void clickElements(WebElement targetEle) {

		targetEle.click();

	}

	public static void getAttributeWithConsole(WebElement target, String name) {

		String attribute = target.getAttribute(name);
		System.out.println(attribute);
	}

	public static void getTextWithConsole(WebElement target, String name) {

		String text = target.getText();
		System.out.println(text);
	}

	public static String getAttribute1(WebElement target, String name) {

		String attribute = "";

		attribute = target.getAttribute(name);

		return attribute;
	}

	public static String getText(WebElement target) {

		String text = "";

		text = target.getText();

		return text;

	}

	public static void moveToElement(WebElement target) {

		Actions act = new Actions(driver);
		act.moveToElement(target).perform();

	}

	public static void dragAndDrop(WebElement target1, WebElement target2) {

		Actions act = new Actions(driver);
		act.dragAndDrop(target1, target2).perform();

	}

	public static void doubleClick(WebElement target) {

		Actions act = new Actions(driver);
		act.doubleClick(target).perform();

	}

	public static void contextClick(WebElement target) {

		Actions act = new Actions(driver);
		act.contextClick(target).perform();

	}

	public static void actionPerform() {

		Actions act = new Actions(driver);
		act.build().perform();

	}

	public static void alertAccept() {

		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	public static void alertDismiss() {

		Alert alert = driver.switchTo().alert();
		alert.dismiss();

	}

	public static void alertSendKeys(String textValues) {

		Alert alert = driver.switchTo().alert();
		alert.sendKeys(textValues);

	}

	public static void alertGetText() {

		Alert alert = driver.switchTo().alert();
		alert.getText();

	}

	public static void sendTextUsinJavaScript(WebElement element, String userText) throws AWTException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','userText')", element);
	}

	public static void clickUsinJavaScript(WebElement element) throws AWTException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	public static void replaceUsinJavaScript(WebElement element, String userText) throws AWTException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("return arguments[0].getAttribute('userText')", element);
	}

	public static void scrollUsinJavaScript() throws AWTException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)");
	}

	public static void switchToFrames(String element) {

		driver.switchTo().frame(element);
	}

	public static void switchToFrames(int indexValue) {

		driver.switchTo().frame(indexValue);
	}

	public static void switchToFrames(WebElement ele) {

		driver.switchTo().frame(ele);
	}

	public static void selectByIndex(WebElement element, int indexValue) {

		Select s = new Select(element);
		s.selectByIndex(indexValue);
	}

	public static void selectByVisibleText(WebElement element, String text) {

		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static void selectByValue(WebElement element, String text) {

		Select s = new Select(element);
		s.selectByValue(text);
	}

	public static void selectGetOptions(WebElement element, int indexValue) {

		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		options.get(indexValue);
	}

	public static void takeScreenshot(String fileNaming) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Admin\\eclipse-workspace\\CucumberProject\\snaps\\" + fileNaming + ".png");
		FileUtils.copyFile(src, dest);

	}

	public static void closeBrowser() {

		driver.close();
	}

	public static void quitBrowser() {

		driver.quit();
	}

	public static void createExcel(String fileNaming, String sheetName) throws IOException {

		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\CucumberProject\\ExcelDatas\\" + fileNaming + ".xlsx");

		Workbook w = new XSSFWorkbook();
		Sheet newSheet = w.createSheet(sheetName);
		Row newRow = newSheet.createRow(0);
		Cell newCell = newRow.createCell(0);

		newCell.setCellValue("");

		FileOutputStream fos = new FileOutputStream(f);

		w.write(fos);
	}

	public static void createNewCell(String excelName, String sheetName, int getTheRow, int createTheCell, String data)
			throws IOException {

		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\CucumberProject\\ExcelDatas\\" + excelName + ".xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);
		Sheet newSheet = w.getSheet(sheetName);
		Row newRow = newSheet.getRow(getTheRow);
		Cell newCell = newRow.createCell(createTheCell);

		newCell.setCellValue(data);

		FileOutputStream fos = new FileOutputStream(f);

		w.write(fos);

	}

	public static void createNewRow(String excelName, String sheetName, int createTheRow, int createTheCell,
			String data) throws IOException {

		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\CucumberProject\\ExcelDatas\\" + excelName + ".xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);
		Sheet newSheet = w.getSheet(sheetName);
		Row newRow = newSheet.createRow(createTheRow);
		Cell newCell = newRow.createCell(createTheCell);

		newCell.setCellValue(data);

		FileOutputStream fos = new FileOutputStream(f);

		w.write(fos);

	}

	public static String getDataFromExcel(String excelName, String sheetName, int getTheRow, int getTheCell)
			throws IOException {

		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\CucumberProject\\ExcelDatas\\" + excelName + ".xlsx");
		
		FileInputStream fis = new FileInputStream(f);

		String values = "";

		Workbook w = new XSSFWorkbook(fis);
		Sheet newSheet = w.getSheet(sheetName);
		Row newRow = newSheet.getRow(getTheRow);
		Cell newCell = newRow.getCell(getTheCell);

		//values = newCell.getStringCellValue();
		
		 int cellType = newCell.getCellType();
		 
		 if (cellType == 1) {
			 values = newCell.getStringCellValue();
			 
			 } 
		 
		 
		 else if (DateUtil.isCellDateFormatted(newCell)) { 
			 Date dateCellValue = newCell.getDateCellValue(); 
			 SimpleDateFormat s = new SimpleDateFormat("dd/mm/yyyy"); 
			 values = s.format(dateCellValue);
		 }
		  else {
		 
		 double numericValue = newCell.getNumericCellValue();
		 long l = (long) numericValue;
		 values = String.valueOf(l);
		 } 

		return values;

	}


	public static String updateExcelDatas(String excelName, String sheetName, int getTheRow, int getTheCell,
			String actualData, String expectedNewData) throws IOException {

		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\CucumberProject\\ExcelDatas\\" + excelName + ".xlsx");

		FileInputStream fis = new FileInputStream(f);

		String values = "";

		Workbook w = new XSSFWorkbook(fis);
		Sheet newSheet = w.getSheet(sheetName);
		Row newRow = newSheet.getRow(getTheRow);
		Cell newCell = newRow.getCell(getTheCell);

		values = newCell.getStringCellValue();

		if (values.equalsIgnoreCase(actualData)) {

			newCell.setCellValue(expectedNewData);

		}
		FileOutputStream fos = new FileOutputStream(f);

		w.write(fos);
		return values;

	}

	/*
	 * public static String dataFromExcelDetails(int getRowValues, int
	 * getColumnValues) throws IOException {
	 * 
	 * String dataValues = "";
	 * 
	 * File src = new File(
	 * "C:\\Users\\Admin\\eclipse-workspace\\MavenConfig\\ExcelDatas\\UsernamesDetails.xlsx"
	 * );
	 * 
	 * FileInputStream fs = new FileInputStream(src);
	 * 
	 * Workbook wb = new XSSFWorkbook(fs); Sheet newSheet = wb.getSheetAt(0);
	 * 
	 * Row allRows = newSheet.getRow(getRowValues); Cell allCell =
	 * allRows.getCell(getColumnValues);
	 * 
	 * int cellType = allCell.getCellType();
	 * 
	 * // default String type value is 1. // other than all types such as Numeric
	 * and Date format need to convert to // String if (cellType == 1) {
	 * 
	 * dataValues = allCell.getStringCellValue();
	 * 
	 * } else {
	 * 
	 * double numericValue = allCell.getNumericCellValue();// numeric value in
	 * double datatype long l = (long) numericValue;// convert into long datatype
	 * //by using upcasting dataValues = String.valueOf(l);// convert that long
	 * value into String type
	 * 
	 * } // if date format cell occur in excel. The below format works
	 * 
	 * else if (DateUtil.isCellDateFormatted(allCell)) { Date dateCellValue =
	 * allCell.getDateCellValue(); SimpleDateFormat s = new
	 * SimpleDateFormat("dd/mm/yyyy"); String datavalues = s.format(dateCellValue);
	 * }
	 * 
	 * 
	 * return dataValues;
	 * 
	 * }
	 */

	/*
	 * public static void dataFromExcel() throws IOException {
	 * 
	 * File src = new File(
	 * "C:\\Users\\Admin\\eclipse-workspace\\MavenConfig\\ExcelDatas\\DataDriven.xlsx"
	 * );
	 * 
	 * FileInputStream fs = new FileInputStream(src);
	 * 
	 * Workbook wb = new XSSFWorkbook(fs); Sheet newSheet = wb.getSheetAt(0);
	 * 
	 * for (int i = 0; i < newSheet.getPhysicalNumberOfRows(); i++) { Row allRows =
	 * newSheet.getRow(i);
	 * 
	 * for (int j = 0; j < allRows.getPhysicalNumberOfCells(); j++) { Cell allCell =
	 * allRows.getCell(j); System.out.println(allCell);
	 * 
	 * } } }
	 */

}
