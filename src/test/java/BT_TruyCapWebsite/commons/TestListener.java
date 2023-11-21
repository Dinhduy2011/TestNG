package BT_TruyCapWebsite.commons;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//Log result of each TCs
public class TestListener implements ITestListener  {
    @Override
    public void onFinish(ITestContext result) {

    }

    @Override
    public void onStart(ITestContext result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Tên của testcase failed nhưng có phần trăm passed là:" + result.getName());

    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Đây là test case bị fail: " + result.getName());


    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Đây là test case bị bỏ qua: " + result.getName());

    }

    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Đây là test case chạy thành công: " + result.getName());

    }
}
