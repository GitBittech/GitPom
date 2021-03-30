import com.demoinsurence.qa.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TestCase extends Driver {
    Driver d = new Driver();
    WebDriver driver;

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

    public void setUp(){
        d.getDriver();
    }

}
