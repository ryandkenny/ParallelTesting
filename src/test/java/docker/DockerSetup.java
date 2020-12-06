package docker;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DockerSetup {

    URL url = new URL("http://localhost:4444/wd/hub");
    public RemoteWebDriver driver = new RemoteWebDriver(url, DesiredCapabilities.chrome());

    public DockerSetup() throws MalformedURLException {
    }



}
