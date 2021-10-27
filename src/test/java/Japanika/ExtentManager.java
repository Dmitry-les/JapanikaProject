package Japanika;

import java.awt.AWTException;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.google.common.io.Files;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	
	private WebDriver driver;

	public ExtentManager(WebDriver driver){               
	        this.driver = driver;     
	    }
	private static ExtentReports extent;
	private static ExtentTest test;
	private static ExtentSparkReporter htmlReporter;
		
	
	static DateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
	static Date today = Calendar.getInstance().getTime(); 
	static String reportDate = df.format(today);
	public static String filePath = "...TestReport\\JapanikaProject " +reportDate+ "\\exReport.html";
		
	public static ExtentReports GetExtent(){
		new File("...TestReport\\JapanikaProject " + reportDate).mkdirs();
		if (extent != null)
            return extent; //avoid creating new instance of html file
            extent = new ExtentReports();		
		extent.attachReporter(getHtmlReporter());
		return extent;
	}
		
	private static ExtentSparkReporter getHtmlReporter() {
		
        htmlReporter = new ExtentSparkReporter(filePath);
		
	  // make the charts visible on report open
      //  htmlReporter.config().setChartVisibilityOnOpen(true);
      //  htmlReporter.loadXMLConfig("C:\\selenium\\jars\\extentreports-java-3.1.5/extent-config.xml");
        htmlReporter.config().setDocumentTitle("JapanikaQATest");
        htmlReporter.config().setReportName("Regression cycle");
        htmlReporter.config().setEncoding("utf-8"); 
        return htmlReporter;
	}
		
	public static ExtentTest createTest(String name, String description){
		test = extent.createTest(name, description);
		return test;
	}
	
	public static String CaptureScreen(WebDriver driver) throws AWTException, IOException
	{
		LocalDateTime now = LocalDateTime.now();
		String time =now.format(DateTimeFormatter.ofPattern("ddHHmmss", Locale.ENGLISH)); 		
		String folderPath = ("...TestReport\\JapanikaProject " + reportDate);
		String imagePath   = folderPath  +"/pic" +time +".jpg"; 
		
		TakesScreenshot oScn = (TakesScreenshot) driver;
		File oScnShot = oScn.getScreenshotAs(OutputType.FILE);
		File oDest = new File(imagePath);

		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
		 Files.copy(scrFile, oDest);

//		Robot robot = new Robot();
//		BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//		ImageIO.write(screenShot, "JPG", new File(ImagesPath));
		
		
		return imagePath;
	}
}


