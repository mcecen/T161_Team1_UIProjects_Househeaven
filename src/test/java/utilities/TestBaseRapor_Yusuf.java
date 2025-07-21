package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class TestBaseRapor_Yusuf {

    protected static ExtentReports extentReports;
    protected static ExtentSparkReporter extentSparkReporter;
    protected static ExtentTest extentTest;
    private static String reportPath;

    @BeforeTest(alwaysRun = true)
    public void setUpTest() {
        extentReports = new ExtentReports();

        // Benzersiz rapor dosya adı
        String date = new SimpleDateFormat("_yyMMdd_HHmmss").format(new Date());
        reportPath = System.getProperty("user.dir") + "/test-output/Rapor" + date + ".html";
        extentSparkReporter = new ExtentSparkReporter(reportPath);
        extentReports.attachReporter(extentSparkReporter);

        // Rapor başlık bilgileri
        extentReports.setSystemInfo("Environment", "Staging");
        extentReports.setSystemInfo("Browser", ConfigReader.getProperty("browser"));
        extentReports.setSystemInfo("OS", System.getProperty("os.name"));
        extentReports.setSystemInfo("Tester", "Yusuf Tonbul");
        extentReports.setSystemInfo("Java Version", System.getProperty("java.version"));

        // Tema ve görünüm ayarları
        extentSparkReporter.config().setDocumentTitle("TestNG Otomasyon Raporu");
        extentSparkReporter.config().setReportName("Automation Suite");
        extentSparkReporter.config().setTheme(Theme.DARK);
        extentSparkReporter.config().setTimelineEnabled(true); // Timeline aktif
        extentSparkReporter.config().setTimeStampFormat("dd MMM yyyy HH:mm:ss");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDownMethod(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) {
            // Başarısız testte ekran görüntüsü ekle
            String screenshotPath = ReusableMethods.raporaResimEkle(result.getName());
            extentTest.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - FAILED", ExtentColor.RED));
            extentTest.addScreenCaptureFromPath(screenshotPath);
            extentTest.fail(result.getThrowable());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            extentTest.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " - PASSED", ExtentColor.GREEN));
        } else if (result.getStatus() == ITestResult.SKIP) {
            extentTest.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - SKIPPED", ExtentColor.ORANGE));
        }
        Driver.quitDriver();
    }

    @AfterTest(alwaysRun = true)
    public void tearDownTest() {
        extentReports.flush();
        try {
            Desktop.getDesktop().browse(new File(reportPath).toURI()); // Raporu otomatik aç
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
