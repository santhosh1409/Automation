package com.learn.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.learn.selenium.util.Base;

public class ScrollPageTest {

	private static String upload = "((//button)//span//span)[string()='Upload a file']";

	WebDriver driver = null;

	@BeforeClass
	public void beforeClassTest() {
		driver = Base.getDriver();
	}

	@Test
	public void testNavigationMethods() throws InterruptedException, AWTException {

		// System.setProperty("org.openqa.selenium.edge.EdgeDriver", "");

		driver.get("https://www.grammarly.com/plagiarism-checker");

		System.out.println("Upload BUtton visible before scroll ?:" + Base.isElementDisplayed(By.xpath(upload)));

		Base.scrollTillElementIsVisible("(//a[contains(text(),'AI Detector1 ')])[1]");

		if (Base.isElementDisplayed(By.xpath("(//a[contains(text(),'AI Detector1 ')])[1]"))) {
			System.out.println("Element Found hence clicking");
			Base.clickElement(By.xpath("(//a[contains(text(),'AI Detector1 ')])[1]"));
		} else {

			System.out.println("Element not found");
		}

		Thread.sleep(3000);

		System.out.println("Upload BUtton visible after scroll ?:" + Base.isElementDisplayed(By.xpath(upload)));
		if (Base.isElementDisplayed(By.xpath(upload))) {

			Base.clickElement(By.xpath(upload));

		}

		Thread.sleep(5000);

		Robot robot = new Robot();

		StringSelection fileName = new StringSelection("D:\\Santhosh\\test.html");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileName, null);// ctrl+c Thread.sleep(5000);
																						// //ctrl+v
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		// release ctrl+v robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		Thread.sleep(5000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		System.out.println("Success");

	}

}
