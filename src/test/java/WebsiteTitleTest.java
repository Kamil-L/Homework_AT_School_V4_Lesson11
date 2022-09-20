import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WebsiteTitleTest extends BaseTest {

    @Test
    void checkWebTitle() {
        log.info("<<<<< Starting test >>>>>");
        String actualWebTitle = driver.getTitle();
        log.info("Actual webTitle: {}", actualWebTitle);
        log.info("Expected webTitle: {}", System.getProperty("webTitle"));
        assertThat(actualWebTitle).isEqualTo(System.getProperty("webTitle"));
    }
}
