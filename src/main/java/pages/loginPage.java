package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginPage {
	
	WebDriver driver;
	
	public void openBrowser() {
		 System.setProperty("webdriver.gecko.driver", "C:\\\\\\\\Users\\\\\\\\HP\\\\\\\\Desktop\\\\\\\\Selenium\\\\\\\\SeleniumJars\\\\\\\\geckodriver.exe");
		 driver = new FirefoxDriver();
	}

	public void openScotiabankLoginPage() {
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=-PVZ8vqvtPU&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJvYXV0aF9rZXkiOiItUFZaOHZxdnRQVSIsImNvbnNlbnRfcmVxdWlyZWQiOmZhbHNlLCJyZWRpcmVjdF91cmkiOiJodHRwczpcL1wvd3d3LnNjb3RpYW9ubGluZS5zY290aWFiYW5rLmNvbVwvb25saW5lXC9sYW5kaW5nXC9vYXV0aGxhbmRpbmcuYm5zIiwiZXhwIjoxNjU1MTY3NTEyLCJpYXQiOjE2NTUxNjYzMTIsImp0aSI6ImVjZDk0MzIzLWQwNmUtNDM2YS1hNTA0LTc3Nzk3YjNkNDBkNSIsImNsaWVudF9pZCI6IjhlZTkwYzM5LTFjNTItNGZmNC04YWU2LWE3YjU0YzUzOTkzMyIsImNsaWVudF9tZXRhZGF0YSI6eyJDaGFubmVsSUQiOiJTT0wiLCJBcHBsaWNhdGlvbkNvZGUiOiJINyJ9LCJpc3N1ZXIiOiJodHRwczpcL1wvcGFzc3BvcnQuc2NvdGlhYmFuay5jb20ifQ.mepURr94_HumfqPWriycdfzc61_zFynJCh13_bCpo27cagsd9ibC42l_UPoeb36SBlVWLkPH3okFTeL3ilniUeJ734miXZ44SR6sONjeWWJoxkM5b1jB3UOXM4uhAQ-ruY5t2ZQ9NBGa8FxTq3xqTnV4nP2x8oWWQxy8FyPSiC5B4_StdQr_Yppt4wKA_Y6rcACt7Tn2zEab_dkZ718cAqfWFdk5pDENfQ7ZHtQRroB5rPukLCNEwFexBtRp0kO7pQef_nNvGMiXWXv0kGfmn-CwMVO_ZFJ2Qy5O83H_M2DfremzjePyUlLbJi3A8-iM5dSUQevcJvIupr7yRL1j5w&preferred_environment=");
	}
	
	public String getTitle() {
		 String actualTitle = driver.getTitle();
		 System.out.println(actualTitle);
		 return actualTitle;
	}
	
	public void enterWrongEmailWithSpecialChar(String a) {
		 driver.findElement(By.id("usernameInput-input")).sendKeys(a);
	}
	
	public void enterWrongPassword(String b) {
		driver.findElement(By.id("password-input")).sendKeys(b);
	}
	
	public void clickOnLoginButton() throws InterruptedException {
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(3000);
	}
	
	public String readErr() {
		 String actualErr = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		 System.out.println(actualErr);
		 return actualErr;
	}
	
	public void closeBrowser() {
		driver.quit();
	}
}

// THe changes has been made
