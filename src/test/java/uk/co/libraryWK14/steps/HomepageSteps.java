package uk.co.libraryWK14.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import uk.co.libraryWK14.pages.HomePage;

import javax.xml.ws.WebEndpoint;

public class HomepageSteps {
    @Given("^User is on HomePage$")
    public void userOnHomepage(){
    }
    @When("^User accept cookies$")
    public void userAcceptCookies()throws InterruptedException{
        new HomePage().acceptCookiesandSwitchToIframe();
    }
    @And("^User enter job title\"([^\"]*)\"$")
    public void userEnterJobTitle(String JobTie) {
        new HomePage().enterjobTitle(JobTie);
    }
    @And("^User enter Location \"([^\"]*)\"$")
    public void userEnterLocation(String locater) {
        new HomePage().enterlocation(locater);
    }
    @And("^User select distance\"([^\"]*)\"$")
    public void userSelectDistance(String Distance){
     new HomePage().selectDistanceFromDropDown(Distance);
    }

    @And("^User click on moreSearchOptionsLink$")
    public void userClickOnMoreSearchOptionsLink() {
        new HomePage().clickonmoreSearchOptionsLink();
    }

    @And("^User enter salaryMin\"([^\"]*)\"$")
    public void userEnterSalaryMin(String min){
         new HomePage().enterSalarymin(min);
    }

    @And("^User enter salaryMax\"([^\"]*)\"$")
    public void userEnterSalaryMax(String max){
        new HomePage().enterSalarymax(max);
    }

    @And("^User select salaryType\"([^\"]*)\"$")
    public void userSelectSalaryType(String annum){
        new HomePage().selectSalaryTypeDropDown(annum);
    }

    @And("^User select jobType\"([^\"]*)\"$")
    public void userSelectJobType(String Jobs) {
        new HomePage().selectJobTypeDropDown(Jobs);
    }

    @And("^User click on Find Jobs button$")
    public void userClickOnFindJobsButton() {
        new HomePage().clickonfindJobs();
    }

    @Then("^User verify the result\"([^\"]*)\"$")
    public void userVerifyTheResult(String text) {
        Assert.assertEquals(text,new HomePage().verifyResultText(text));
    }

}
