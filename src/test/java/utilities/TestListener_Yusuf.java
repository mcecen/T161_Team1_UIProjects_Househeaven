package utilities;

import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener_Yusuf extends TestBaseRapor_Yusuf implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        extentTest = extentReports.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        extentTest.log(Status.PASS, "Test Passed: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        extentTest.log(Status.FAIL, "Test Failed: " + result.getMethod().getMethodName());
        extentTest.log(Status.FAIL, result.getThrowable());

        try {
            String screenshotPath = ReusableMethods.raporaResimEkle(result.getMethod().getMethodName());
            extentTest.addScreenCaptureFromPath(screenshotPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        extentTest.log(Status.SKIP, "Test Skipped: " + result.getMethod().getMethodName());
    }

    @Override
    public void onStart(ITestContext context) {
        // Raporu başlatma kısmı zaten TestBaseRapor_Yusuf içinde
    }

    @Override
    public void onFinish(ITestContext context) {
        extentReports.flush();
    }
}
