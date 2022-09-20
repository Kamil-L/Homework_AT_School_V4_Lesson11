import config.AppProperties;
import config.DriverHandler;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseTest {

    static Logger log = LoggerFactory.getLogger(BaseTest.class);
    protected static WebDriver driver;
    protected static DriverHandler driverHandler;
    private static AppProperties appProperties;

    @BeforeAll
    static void setDriver() {
        appProperties = AppProperties.getInstance();
        driverHandler = new DriverHandler();
        driver = driverHandler.getDriver();
        log.info("<<<<<Driver initialized>>>>");
        driver.get(System.getProperty("appUrl"));
    }

    @AfterAll
    static void tearDown() {
        driver.quit();
        log.debug("<<<<<Driver closed>>>>>");
    }
}
