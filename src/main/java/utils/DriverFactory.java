package utils;

import com.microsoft.playwright.*;

public class DriverFactory {
    private static Playwright playwright;
    private static Browser browser;

    public static BrowserContext createContext() {
        if (playwright == null) {
            playwright = Playwright.create();
            browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        }
        return browser.newContext();
    }

    public static void closePlaywright() {
        if (playwright != null) {
            playwright.close();
        }
    }
}
