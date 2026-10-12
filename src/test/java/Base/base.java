package Base;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;


public class base {
	public static WebDriver a;
	public static void main(String[] args) throws InterruptedException, IOException {
	
	{
	WebDriverManager.chromedriver().setup();
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--incognito");
	opt.addArguments("--disable-notifications");
	a=new ChromeDriver(opt);
	a.manage().window().maximize();
	a.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
a.get("https://www.amazon.in/");
a.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("towel");
a.findElement(By.cssSelector("span[class='s-heavy']")).click();
	//even/odd
int n=5;
for(int i=1;i<=n;i++)	
{if(i%2==0) {
	System.out.println(i+" is even");
}
	}
	}}
}
