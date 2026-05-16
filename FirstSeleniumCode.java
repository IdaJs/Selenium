package org.my.prj;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class FirstSeleniumCode {
    public static void main(String[] args) {

        FirefoxOptions options = new FirefoxOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver wd = new FirefoxDriver(options);

        System.out.println(options.getBrowserName());

        wd.get("http://www.google.com");
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println(wd.getTitle());
        wd.quit();

    }
}
