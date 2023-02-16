package uk.co.libraryWK14.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import uk.co.libraryWK14.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    public void acceptCookiesandSwitchToIframe() throws InterruptedException {
        driver.switchTo().frame("gdpr-consent-notice");
        Thread.sleep(100);
        WebElement acceptCookies = driver.findElement(By.xpath("//span[text()='Accept All']"));
        acceptCookies.click();
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitle;
    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement Location;
    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@type='submit']")
    WebElement findJobs;
    @CacheLookup
    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;



    public void enterjobTitle(String jobtitle) {
        sendTextToElement(jobTitle, jobtitle);
        log.info("enter jobtitle" + jobTitle.toString());
    }
    public void enterlocation(String location) {
        sendTextToElement(Location, location);
        log.info("enter location" + Location.toString());
    }
    public void selectDistanceFromDropDown(String distance) {
        selectByVisibleTextFromDropDown(distanceDropDown, distance);
    }
    public void clickonmoreSearchOptionsLink(){
        clickOnElement(moreSearchOptionsLink);
        log.info("click on Moresearchoptionlink"+ moreSearchOptionsLink.toString());
    }
    public void enterSalarymin(String salarymin){
        sendTextToElement(salaryMin,salarymin);
        log.info("enter minsalary"+salaryMin.toString());
    }
    public void enterSalarymax(String salarymax) {
        sendTextToElement(salaryMax, salarymax);
        log.info("enter maxsalary" + salaryMax.toString());
    }
    public void selectSalaryTypeDropDown(String typeSalary){
        selectByValueFromDropDown(salaryTypeDropDown,typeSalary);
    }
    public void selectJobTypeDropDown(String typeJob){
        selectByValueFromDropDown(jobTypeDropDown,typeJob);
    }
    public void clickonfindJobs() {
        clickOnElement(findJobs);
        log.info("clickonfindjobs" + findJobs.toString());
    }
    public String verifyResultText(String T1){
        return getTextFromElement(resultText);
    }

    }



