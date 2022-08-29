import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://priory.myschoolapp.com/app/student#directory/2647
public class PrioryMyschoolappAppstudePage {
    @FindBy(css = "button[data-userid=\"5358892\"] i[class$=\"fa-ellipsis-h\"]")
    public WebElement element;

    @FindBy(xpath = "//a[@href=\"#profile/5358892/contactcard\"]")
    public WebElement contactCard;

    @FindBy(xpath = "//div[contains(@class, \"detail\")][.//div[@class=\"col-md-8\"]]")
    public WebElement element2;


    public PrioryMyschoolappAppstudePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}