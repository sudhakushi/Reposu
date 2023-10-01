package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.LoginPage;

public class BaseClass {
public static WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		Reporter.log("open browser",true);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();		
	}
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("login",true);
		FileLib f=new FileLib();
		String url = f.getProperty("url");
		String un = f.getProperty("username");
		String pw = f.getProperty("password");
		driver.get(url);
		LoginPage l=new LoginPage(driver);
		l.setLogin(un,pw);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.setLogout();
	}
	@AfterTest
	public void closeBrowser() {
		Reporter.log("closeBrowser",true);
		driver.close();
	}


}
