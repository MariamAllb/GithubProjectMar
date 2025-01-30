package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPath.GithubPath.signIn;

public class LoginPages {

    WebDriver driver = null;
    public LoginPages(WebDriver driver){
        this.driver = driver;
    }

    public void openGitUrl(){
        driver.get("https://github.com/");
    }

    public void clickOnSignInBtn(){
        WebElement SignInBat = driver.findElement(signIn);
    }

}
