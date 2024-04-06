package Apple__Store_Frame_Work;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class POM_Framework extends BaseClass_Framework {

	@FindBy(xpath = "//a[@data-autom=\"gn_apple\"]")
	private WebElement Applelogo;

	@FindBy(xpath = "(//span[@class=\"globalnav-link-text-container\"])[1]")
	private WebElement Store;

	@FindBy(xpath = "(//span[@class=\"globalnav-link-text-container\"])[2]")
	private WebElement Mac;

	@FindBy(xpath = "(//span[@class=\"globalnav-link-text-container\"])[3]")
	private WebElement ipad;

	@FindBy(xpath = "(//span[@class=\"globalnav-link-text-container\"])[4]")
	private WebElement iphone;

	@FindBy(xpath = "(//span[@class=\"globalnav-link-text-container\"])[5]")
	private WebElement Watch;

	@FindBy(xpath = "(//span[@class=\"globalnav-link-text-container\"])[6]")
	private WebElement Airpods;

	@FindBy(xpath = "(//span[@class=\"globalnav-link-text-container\"])[7]")
	private WebElement TvHome;

	@FindBy(xpath = "(//span[@class=\"globalnav-link-text-container\"])[8]")
	private WebElement Entertainment;

	@FindBy(xpath = "(//span[@class=\"globalnav-link-text-container\"])[9]")
	private WebElement Accessories;

	@FindBy(xpath = "(//span[@class=\"globalnav-link-text-container\"])[10]")
	private WebElement Support;

	@FindBy(xpath = "(//a[@role=\"button\"])[1]")
	private WebElement Search_Box_Height;
	@FindBy(xpath = "(//span[@class=\"globalnav-image-compact\"])[1]")
	private WebElement Search_Box_Height1;

	@FindBy(xpath = "(//a[@target=\"_blank\"])[1]")
	private WebElement Need_Shop_help;
	@FindBy(xpath = "//button[.='Visit Apple Support']")
	private WebElement Need_Shop_help1;
	// @FindBy(xpath = "//h2")
	// private WebElement Need_Shop_help1 ;

	@FindBy(xpath = "(//a[@target=\"_blank\"])[2]")
	private WebElement Visit_Apple_Store;

	@FindBy(xpath = "(//div[@class=\"rf-ccard-content-desc\"])[1]")
	private WebElement Pre_Order_iphone_15pro;

	@FindBy(xpath = "(//div[@class=\"rf-ccard-content-desc\"])[2]")
	private WebElement Pre_Order_iphone_15;

	@FindBy(xpath = "(//div[@class=\"rf-ccard-content-desc\"])[3]")
	private WebElement Apple_watch_Series_9;

	@FindBy(xpath = "(//div[@class=\"rf-ccard-content-desc\"])[4]")
	private WebElement Apple_watch_Ultra_2;

	@FindBy(xpath = "(//div[@class=\"rf-ccard-content-desc\"])[5]")
	private WebElement Apple_Watch_Straps;

	@FindBy(xpath = "(//div[@class=\"rf-ccard-content-desc\"])[6]")
	private WebElement Airpods_Pro_2_Generation;

	@FindBy(xpath = "(//div[@class=\"rf-ccard-content-desc\"])[7]")
	private WebElement Offer_Ends_02_10;

	@FindBy(xpath = "(//div[@class=\"rf-ccard-content-desc\"])[8]")
	private WebElement Macbook_Air_15;

	@FindBy(xpath = "//div[.='PAYMENT OPTIONS']")
	private WebElement Payment_Option;
	@FindBy(xpath = "(//p[@class=\"dd-subcopy\"])[1]")
	private WebElement Payment_Option0;
	@FindBy(xpath = "//h2[@class=\"dd-modal-header\"]")
	private WebElement Payment_Option1;
	@FindBy(xpath = "//span[@class=\"rc-overlay-closesvg\"]")
	private WebElement Payment_Option2;

	@FindBy(xpath = "//h3[.='APPLE SPECIALIST']")
	private WebElement Apple_Specialist;
	@FindBy(xpath = "//h2[@class=\"t-headline-reduced\"]")
	private WebElement Apple_Specialist0;
	@FindBy(xpath = "//p[@class=\"t-body dd-compact-right-large-10\"]")
	private WebElement Apple_Specialist1;
	@FindBy(xpath = "//span[@class=\"rc-overlay-closesvg\"]")
	private WebElement Apple_Specialist2;

	@FindBy(xpath = "//a[.='Get to know your new device with a free Personal Session. ']")
	private WebElement New_device_with_a_free_Personal_Session;
	@FindBy(xpath = "//h2[@class='t-headline-reduced']")
	private WebElement New_device_with_a_free_Personal_Session0;
	@FindBy(xpath = "(//h2[@class=\"t-headline-reduced\"]//../p)[1]")
	private WebElement New_device_with_a_free_Personal_Session1;
	@FindBy(xpath = "//span[@class=\"rc-overlay-closesvg\"]")
	private WebElement New_device_with_a_free_Personal_Session2;

	@FindBy(xpath = "//h3[.='WATCH AND LEARN']")
	private WebElement Watch_and_Learn;
	@FindBy(xpath = "//h2[@id=\"videoplayer-overlay-title\"]")
	private WebElement Watch_and_Learn0;
	@FindBy(xpath = "//h2[.='Get help and schedule repairs. It’s simple. ']")
	private WebElement Watch_and_Learn1;
	@FindBy(xpath = "//span[@class=\"rc-overlay-closesvg\"]")
	private WebElement Watch_and_Learn2;

	@FindBy(xpath = "//h3[.='APPLE TV+']")
	private WebElement Apple_Tv;
	@FindBy(xpath = "//button[@data-analytics-click=\"prop3:pause-hero\"]")
	private WebElement Apple_Tv0;

	@FindBy(xpath = "(//h3[@class=\"rf-ccard-content-eyebrow\"])[12]")
	private WebElement New;

	@FindBy(xpath = "//h3[.='EDUCATION']")
	private WebElement Education;
	@FindBy(xpath = "//h2[@class=\"t-headline-reduced\"]")
	private WebElement Education0;
	@FindBy(xpath = "//button[@value=\"Play\"]")
	private WebElement Education1;
	@FindBy(xpath = "//button[@value=\"Pause\"]")
	private WebElement Education2;
	@FindBy(xpath = "//span[@class=\"rc-overlay-closesvg\"]")
	private WebElement Education3;

	@FindBy(xpath = "(//a[.='Order Status'])[2]")
	private WebElement Order_Status;

	@FindBy(xpath = "//a[.='Shopping Help']")
	private WebElement Shopping_Help;

	@FindBy(xpath = "//a[.='Your Saves']")
	private WebElement Your_Saves;

	@FindBy(xpath = "//a[.='Privacy Policy']")
	private WebElement Privacy_Policy;

	@FindBy(xpath = "//a[.='Terms of Use']")
	private WebElement Terms_of_Use;

	@FindBy(xpath = "//a[.='Sales Policy']")
	private WebElement Sales_Policy;

	@FindBy(xpath = "//a[.='Legal']")
	private WebElement Legal;

	@FindBy(xpath = "//a[.='other retailer']")
	private WebElement Other_retailer;

	@FindBy(xpath = "//a[.='Find an Apple Store']")
	private WebElement Find_an_Apple_Store;

	@FindBy(xpath = "//a[.='Site Map']")
	private WebElement Apple_Leadership_Names;
	@FindBy(xpath = "(//a[.='Apple Leadership'])[1]")
	private WebElement Apple_Leadership_Names1;
	@FindBy(xpath = "//figcaption[@class=\"profile-caption\"]")
	private List<WebElement> Apple_Leadership_Names2;

	@FindBy(xpath = "//div[@class=\"as-footnotes-sosumi\"]")
	private List<WebElement> Qucik_Link_Text;

	@FindBy(xpath = "(//a[@data-slot-name=\"footerConfig\"])[3]")
	private WebElement India;
	@FindBy(xpath = "//ul[@class=\"category-sections list list-nobullet\"]")
	private List<WebElement> All_Country;
	@FindBy(xpath = "//a[@data-analytics-title=\"product index\"]")
	private WebElement Heading;

	@FindBy(xpath = "(//a[@data-feature-name=\"Footer Navigation\"])[43]")
	private WebElement Career_Education;
	@FindBy(xpath = "//span[.='Watch the film']")
	private WebElement Watch_The_Film;
	@FindBy(xpath = "//button[@value=\"Pause\"]")
	private WebElement Video_001;
	@FindBy(xpath = "//button[@class=\"modal-close\"]")
	private WebElement Close;

	@FindBy(xpath = "(//a[@role=\"button\"])[1]")
	private WebElement Click_the_Search_Box;
	@FindBy(xpath = "//input[@class=\"globalnav-searchfield-input\"]")
	private WebElement Search_Box;
	@FindBy(xpath = "(//a[@class=\"rf-serp-productname-link\"])[1]")
	private WebElement Click_IPhone;
	@FindBy(xpath = "(//span[@class=\"icon-copy\"])[1]")
	private WebElement Watch_the_Add;
	@FindBy(xpath = "//span[@class=\"icons\"]")
	private WebElement Play;
	@FindBy(xpath = "//span[@class=\"modal-close-icon\"]")
	private WebElement Cancel;
	@FindBy(xpath = "//a[@class=\"welcome__lockup-cta show\"]")
	private WebElement Buy;
	@FindBy(xpath = "(//span[@class=\"form-selector-title\"])[2]")
	private WebElement Click;
	@FindBy(xpath = "(//img[@class=\"colornav-swatch\"])[1]")
	private WebElement Colour;
	@FindBy(xpath = "(//label[@class=\"form-selector-label\"])[5]")
	private WebElement Storage;
	@FindBy(xpath = "//label[@id=\"noTradeIn_label\"]")
	private WebElement Trade;
	@FindBy(xpath = "(//input[@name=\"applecareplus_59\"])[1]")
	private WebElement Apple_Care;
	@FindBy(xpath = "//button[@class=\"button-super form-button\"]")
	private WebElement Add;
	@FindBy(xpath = "//span[@class=\"rc-overlay-closesvg\"]")
	private WebElement Cancel1;
	@FindBy(xpath = "(//button[@type=\"submit\"])[2]")
	private WebElement Add_bag;
	@FindBy(xpath = "//button[.='Review Bag']")
	private WebElement Review_Bag;
	@FindBy(xpath = "//div[@id=\"bag-content\"]")
	private List<WebElement> iphone_Details;
	@FindBy(xpath = "//button[@id=\"shoppingCart.actions.checkout\"]")
	private WebElement Check_Out;

	@FindBy(xpath = "(//div[@class=\"rf-productnav-card-content\"])[1]")
	private WebElement Mac1;

	/**
	 * Get the URL
	 */
	public void Testcase_001() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String Url = driver.getCurrentUrl();
		Reporter.log(Url, true);
	}

	/**
	 * Get the Title
	 */
	public void Testcase_002() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String Title = driver.getTitle();
		Reporter.log(Title, true);
	}

	/**
	 * Click on the AppleLogo link Get the Title
	 * 
	 * @throws InterruptedException
	 */
	public void Testcase_003() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Applelogo.click();
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.navigate().back();
	}

	/**
	 * Click on the Store link Get the Title
	 * 
	 * @throws InterruptedException
	 */
	public void Testcase_004() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Store.click();
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.navigate().back();
	}

	/**
	 * Click on the Mac link Get the Title
	 * 
	 * @throws InterruptedException
	 */
	public void Testcase_005() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Mac.click();
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.navigate().back();
	}

	/**
	 * Click on the ipad link Get the Title
	 */
	public void Testcase_006() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ipad.click();
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.navigate().back();
	}

	/**
	 * Click on the iphone link Get the Title
	 */
	public void Testcase_007() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		iphone.click();
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.navigate().back();
	}

	/**
	 * Click on the Watch link Get the Title
	 */
	public void Testcase_008() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Watch.click();
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.navigate().back();
	}

	/**
	 * Click on the Airpods link Get the Title
	 */
	public void Testcase_009() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Airpods.click();
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.navigate().back();
	}

	/**
	 * Click on the Tv & Home link Get the Title
	 */
	public void Testcase_010() // Click on the Tv & Home link Get the Title
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		TvHome.click();
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.navigate().back();
	}

	/**
	 * Click on the Entertainment link Get the Title
	 */
	public void Testcase_011() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Entertainment.click();
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.navigate().back();
	}

	/**
	 * Click on the Accessories link Get the Title
	 */
	public void Testcase_012() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Accessories.click();
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.navigate().back();
	}

	/**
	 * Click on the Support link Get the Title
	 */
	public void Testcase_013() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Support.click();
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.navigate().back();
	}

	/**
	 * Click on the Search_Box_Height
	 */
	public void Testcase_014() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Search_Box_Height.click();
		int H = Search_Box_Height1.getSize().getHeight();
		Reporter.log("Search_Box_height" + H, true);
		int W = Search_Box_Height1.getSize().getWidth();
		Reporter.log("Search_Box_height" + W, true);
	}

	/**
	 * Click on the Need_Shop_help Get the Title
	 * 
	 * @throws InterruptedException
	 */
	public void Testcase_015() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Parent Windows:
		Need_Shop_help.click();
		Thread.sleep(10000);
		Set<String> Windows = driver.getWindowHandles();
		ArrayList<String> Al = new ArrayList<String>(Windows);
		driver.switchTo().window(Al.get(1));
		String Titles = driver.getTitle();
		Reporter.log(Titles);
		// Child Windows:
		Need_Shop_help1.click();
		Set<String> Window1 = driver.getWindowHandles();
		ArrayList<String> Al1 = new ArrayList<String>(Window1);
		driver.switchTo().window(Al1.get(1));
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.close();
		driver.switchTo().window(Al1.get(0));
//	for (String i : Al) {
//		Need_Shop_help1.click();
//		Thread.sleep(5000);
//		driver.switchTo().window(i);
//		Thread.sleep(5000);
//		String Title = driver.getTitle();
//		Reporter.log(Title,true);
//		Thread.sleep(5000);
//		driver.quit();
//	  }
	}

	/**
	 * Click on the Visit and Apple Store Get the Title(Window Handling Methods)
	 * 
	 * @throws InterruptedException
	 */
	public void Testcase_016() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Visit_Apple_Store.click();
		Thread.sleep(2000);
		Set<String> Windows = driver.getWindowHandles();
		ArrayList<String> Al = new ArrayList<String>(Windows);
		driver.switchTo().window(Al.get(1));
		Thread.sleep(2000);
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(Al.get(0));
	}

	/**
	 * Click on the Pre_Order_iphone_15pro Get the Title
	 */
	public void Testcase_017() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Pre_Order_iphone_15pro.click();
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.navigate().back();
	}

	/**
	 * Click on the Pre_Order_iphone_15 Get the Title
	 */
	public void Testcase_018() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Pre_Order_iphone_15.click();
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.navigate().back();
	}

	/**
	 * Click on the Apple_watch_Series_9 Get the Title
	 */
	public void Testcase_019() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Apple_watch_Series_9.click();
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.navigate().back();
	}

	/**
	 * Click on the Apple_watch_Ultra_2 Get the Title
	 */
	public void Testcase_020() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Apple_watch_Ultra_2.click();
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.navigate().back();
	}

	/**
	 * Click on the Apple_Watch_Straps Get the Title
	 */
	public void Testcase_021() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Apple_Watch_Straps.click();
		Set<String> Windows = driver.getWindowHandles();
		ArrayList<String> Al = new ArrayList<String>(Windows);
		driver.switchTo().window(Al.get(1));
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.close();
		driver.switchTo().window(Al.get(0));
	}

	/**
	 * Click on the Airpods_Pro_2_Generation Get the Title
	 */
	public void Testcase_022() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Airpods_Pro_2_Generation.click();
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.navigate().back();
	}

	/**
	 * Click on the Offer_Ends_02_10 Get the Title
	 */
	public void Testcase_023() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Offer_Ends_02_10.click();
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.navigate().back();
	}

	/**
	 * Click on the Macbook_Air_15 Get the Title
	 * 
	 * @throws InterruptedException
	 */
	public void Testcase_024() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Macbook_Air_15.click();
		Thread.sleep(2000);
		String Title = driver.getTitle();
		Thread.sleep(2000);
		Reporter.log(Title, true);
		driver.navigate().back();
	}

	/**
	 * Click on the Payment_Option Get the Text(Handling Pop methods)
	 * 
	 * @throws InterruptedException
	 */
	public void Testcase_025() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		int Y = Payment_Option.getLocation().getY();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0," + Y + ")");
		int X = Payment_Option.getLocation().getX();
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		jse1.executeScript("window.scrollBy(0," + X + ")");
		Thread.sleep(2000);
		Payment_Option.click();
		String Heading = Payment_Option1.getText();
		Reporter.log(Heading, true);
		String Text = Payment_Option0.getText();
		Reporter.log(Text, true);
		Thread.sleep(2000);
		Payment_Option2.click();
	}

	/**
	 * Click on the Apple_Specialist Get the Text
	 * 
	 * @throws InterruptedException
	 */
	public void Testcase_026() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		int Y = Apple_Specialist.getLocation().getY();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0," + Y + ")");
		Thread.sleep(2000);
		Apple_Specialist.click();
		Thread.sleep(2000);
		String Heading = Apple_Specialist0.getText();
		Reporter.log(Heading, true);
		Thread.sleep(2000);
		String Text = Apple_Specialist1.getText();
		Reporter.log(Text, true);
		Thread.sleep(2000);
		Apple_Specialist2.click();
	}

	/**
	 * Click on the New_device_with_a_free_Personal_Session Get the Text
	 * 
	 * @throws InterruptedException
	 */
	public void Testcase_027() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		New_device_with_a_free_Personal_Session.click();
		Thread.sleep(2000);
		String Heading = New_device_with_a_free_Personal_Session0.getText();
		Reporter.log(Heading, true);
		Thread.sleep(2000);
		String Text = New_device_with_a_free_Personal_Session1.getText();
		Reporter.log(Text, true);
		New_device_with_a_free_Personal_Session2.click();
	}

	/**
	 * Click on the Watch_and_Learn Get the Text and video pause
	 * 
	 * @throws InterruptedException
	 */
	public void Testcase_028() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Watch_and_Learn.click();
		String Heading = Watch_and_Learn0.getText();
		Thread.sleep(15000);
		Reporter.log(Heading, true);
		Watch_and_Learn1.click();
		Thread.sleep(2000);
		Watch_and_Learn2.click();
	}

	/**
	 * Click on the Apple_Tv Get the Title (Used for Quit Method)
	 * 
	 * @throws AWTException
	 * @throws InterruptedException
	 */
	public void Testcase_029() throws AWTException, InterruptedException

	{
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Apple_Tv.click();
		Thread.sleep(10000);
		Set<String> Windows = driver.getWindowHandles();
		ArrayList<String> Al = new ArrayList<String>(Windows);
		Thread.sleep(2000);
		driver.switchTo().window(Al.get(1));
		Thread.sleep(2000);
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(Al.get(0));
	}

	/**
	 * Click on the New Get the Title
	 * 
	 * @throws InterruptedException
	 */
	public void Testcase_030() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		New.click();
		Set<String> Windows = driver.getWindowHandles();
		Thread.sleep(2000);
		ArrayList<String> Al = new ArrayList<String>(Windows);
		Thread.sleep(2000);
		driver.switchTo().window(Al.get(1));
		Thread.sleep(2000);
		String Title = driver.getTitle();
		Thread.sleep(2000);
		Reporter.log(Title, true);
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(Al.get(0));
	}

	/**
	 * Click on the Education Get the Text and video Play&pause
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 */
	public void Testcase_031() throws InterruptedException, AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Education.click();
		Thread.sleep(2000);
		Education1.click();
		Thread.sleep(15000);
		// Education2.click();
		// Thread.sleep(2000);
		String Heading = Education0.getText();
		Reporter.log(Heading, true);
		Thread.sleep(2000);
		Education3.click();
	}

	/**
	 * Click on the Order_Status Get the Title
	 */
	public void Testcase_032() throws InterruptedException, AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Order_Status.click();
		Set<String> Windows = driver.getWindowHandles();
		ArrayList<String> Al = new ArrayList<String>(Windows);
		driver.switchTo().window(Al.get(1));
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.close();
		driver.switchTo().window(Al.get(0));
	}

	/**
	 * Click on the Shopping_Help Get the Title
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 */
	public void Testcase_033() throws InterruptedException, AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Shopping_Help.click();
		Set<String> Windows = driver.getWindowHandles();
		ArrayList<String> Al = new ArrayList<String>(Windows);
		driver.switchTo().window(Al.get(1));
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.close();
		driver.switchTo().window(Al.get(0));
	}

	/**
	 * Click on the Your_Saves Get the Title
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 */
	public void Testcase_034() throws InterruptedException, AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Your_Saves.click();
		Set<String> Windows = driver.getWindowHandles();
		ArrayList<String> Al = new ArrayList<String>(Windows);
		driver.switchTo().window(Al.get(1));
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.close();
		driver.switchTo().window(Al.get(0));
	}

	/**
	 * Click on the Privacy_Policy Get the Title
	 * 
	 * @throws InterruptedException
	 */
	public void Testcase_035() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(10,document.body.scrollHeight)");
		Privacy_Policy.click();
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.navigate().back();
	}

	/**
	 * Click on the Terms_of_Use Get the Title
	 * 
	 * @throws InterruptedException
	 */
	public void Testcase_036() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(10,document.body.scrollHeight)");
		Terms_of_Use.click();
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.navigate().back();
	}

	/**
	 * Click on the Sales_Policy Get the Title
	 * 
	 * @throws InterruptedException
	 */
	public void Testcase_037() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(10,document.body.scrollHeight)");
		Sales_Policy.click();
		Set<String> Windows = driver.getWindowHandles();
		ArrayList<String> Al = new ArrayList<String>(Windows);
		driver.switchTo().window(Al.get(1));
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.close();
		driver.switchTo().window(Al.get(0));
	}

	/**
	 * Click on the Legal Get the Title
	 * 
	 * @throws InterruptedException
	 */
	public void Testcase_038() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(10,document.body.scrollHeight)");
		Legal.click();
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.navigate().back();
	}

	/**
	 * Click on the Find_an_Apple_Store Get the Title
	 * 
	 * @throws InterruptedException
	 */
	public void Testcase_039() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(10,document.body.scrollHeight)");
		Find_an_Apple_Store.click();
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.navigate().back();
	}

	/**
	 * \ Click on the Other_retailer Get the Title
	 * 
	 * @throws InterruptedException
	 */
	public void Testcase_040() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(10,document.body.scrollHeight)");
		Other_retailer.click();
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.navigate().back();
	}

	/**
	 * Click on the Apple_Leadership Get the Text
	 * 
	 * @throws InterruptedException
	 */
	public void Testcase_041() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(10,document.body.scrollHeight)");
		Apple_Leadership_Names.click();
		Apple_Leadership_Names1.click();
		int count = Apple_Leadership_Names2.size();
		Thread.sleep(2000);
		for (int i = 0, j = 1; i < count; j++, i++) {
			String text = Apple_Leadership_Names2.get(i).getText();
			Thread.sleep(3000);
			Reporter.log(j + ". " + text, true);

		}
	}

	/**
	 * Click on the Qucik_Link_Text Get the Text
	 * 
	 * @throws InterruptedException
	 */
	public void Testcase_042() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(10,document.body.scrollHeight)");
		int count = Qucik_Link_Text.size();
		Thread.sleep(2000);
		for (int i = 0, j = 1; i < count; j++, i++) {
			String text = Qucik_Link_Text.get(i).getText();
			Thread.sleep(3000);
			Reporter.log(j + "." + text, true);

		}
	}

	/**
	 * Click on the India_Link Get the Text
	 * 
	 * @throws InterruptedException
	 */
	public void Testcase_043() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(10,document.body.scrollHeight)");
		India.click();
		String H = Heading.getText();
		Reporter.log(H, true);
		int count = All_Country.size();
		Thread.sleep(2000);
		for (int i = 0, j = 1; i < count; j++, i++) {
			String text = All_Country.get(i).getText();
			Thread.sleep(3000);
			Reporter.log(j + "." + text, true);
		}
	}

	/**
	 * Click on the Career_Education Get the Title
	 * 
	 * @throws InterruptedException
	 */
	public void Testcase_044() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(10,document.body.scrollHeight)");
		Career_Education.click();
		Watch_The_Film.click();
		Thread.sleep(10000);
		Video_001.click();
		Close.click();
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.navigate().back();
	}

	/**
	 * Click on the Order_The_iphone_15pro Get the Title
	 * 
	 * @throws InterruptedException
	 * @throws AWTException
	 * @throws IOException
	 */
	public void Testcase_045() throws InterruptedException, AWTException, IOException {
		Click_the_Search_Box.click();
		Thread.sleep(2000);
		Search_Box.sendKeys("iphone 15 pro");
		Thread.sleep(2000);
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		Robot r = new Robot();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_ENTER);
		Click_IPhone.click();
		String Title1 = driver.getTitle();
		Reporter.log(Title1, true);
		Thread.sleep(4000);
		Watch_the_Add.click();
		Thread.sleep(30000);
		Cancel.click();
		Buy.click();
		String Title2 = driver.getTitle();
		Reporter.log(Title2, true);
		Thread.sleep(2000);
		Click.click();
		Thread.sleep(2000);
		Colour.click();
		Thread.sleep(2000);
		Storage.click();
		Thread.sleep(2000);
		Trade.click();
		Thread.sleep(2000);
		Apple_Care.click();
		Thread.sleep(2000);
		Add.click();
		String Title3 = driver.getTitle();
		Reporter.log(Title3, true);
		Thread.sleep(2000);
		int Y = Add_bag.getLocation().getY();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0," + Y + ")");
		Thread.sleep(2000);
		Add_bag.click();
		Thread.sleep(2000);
		String Title4 = driver.getTitle();
		Reporter.log(Title4, true);
		Thread.sleep(2000);
		Review_Bag.click();
		int count = iphone_Details.size();
		for (int i = 0, j = 1; i < count; j++, i++) {
			Thread.sleep(2000);
			String Text = iphone_Details.get(i).getText();
			Thread.sleep(2000);
			String Title6 = driver.getTitle();
			Reporter.log(Title6, true);
			Reporter.log(j + "." + Text, true);
			TakesScreenshot ts = (TakesScreenshot) driver;
			Thread.sleep(2000);
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("./Screen_Shot/print1.png");
			FileUtils.copyFile(source, destination);
		}
		Check_Out.click();
		Thread.sleep(2000);
		driver.navigate().back();
	}

	public void Testcase_046() throws InterruptedException, IOException {

		int H = Mac1.getSize().getHeight();
		Reporter.log("img height" + H, true);
		int W = Mac1.getSize().getWidth();
		Reporter.log("img Width" + W, true);
		boolean True = Mac1.isDisplayed();
		try {
			Reporter.log("Mac image is Displayed" + True, true);
		} catch (Exception e) {
			// TODO: handle exception
			TakesScreenshot ts = (TakesScreenshot) driver;
			Thread.sleep(2000);
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("./Screen_Shot/print2.png");
			FileUtils.copyFile(source, destination);

		}
	}

}
