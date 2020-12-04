package stepDefs;

import docker.DockerSetup;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;

public class BaseStepDefs extends DockerSetup {
    public BaseStepDefs() throws MalformedURLException {
    }

    @Given("^I get the url \"([^\"]*)\"$")
    public void navigateToUrl(String url) {
        driver.get(url);
    }

    @And("^I get the header")
    public void getHeader() {
        System.out.println("Title of page " + driver.getTitle());
    }

    @After
    public void quitDriver() {
        driver.quit();
    }

}
