package base;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import utils.DriverFactory;

public class BaseTest {
    protected BrowserContext context;
    protected Page page;

    @BeforeEach
    public void setUp() {
        context = DriverFactory.createContext();
        page = context.newPage();
    }

    @AfterEach
    public void tearDown() {
        context.close();
        DriverFactory.closePlaywright();
    }
}
