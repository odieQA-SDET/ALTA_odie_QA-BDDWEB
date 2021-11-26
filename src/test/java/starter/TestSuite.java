package starter;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
      // System.setProperty("webdriver.chrome.driver","C:\chromedriver\chromedriver.exe");
      //  driver = new ChromeDriver(),
        plugin = {"pretty"},
        features = "src/test/resources/features/"
)
public class TestSuite {

}
