package pages;

import com.microsoft.playwright.Page;

public class LoginPage {
    private final Page page;

    private final String usernameInput = "#username";
    private final String passwordInput = "#password";
    private final String loginButton = "button[type='submit']";
    private final String message = "#flash";

    public LoginPage(Page page) {
        this.page = page;
    }

    public void navigate() {
        page.navigate("https://the-internet.herokuapp.com/login");
    }

    public void enterUsername(String username) {
        page.fill(usernameInput, username);
    }

    public void enterPassword(String password) {
        page.fill(passwordInput, password);
    }

    public void clickLogin() {
        page.click(loginButton);
    }

    public String getMessage() {
        return page.textContent(message);
    }
}
