package test;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
public class BasicOperationsSteps {
	private CommonStepDefinition commonStepDefinition;
	private Screen s;
	public BasicOperationsSteps() {
		this.commonStepDefinition = CommonStepDefinition.getInstance();
		s = this.commonStepDefinition.getScreen();
	}

	@When("^je clique sur (.*)$")
	public void clickOnFile(String file) throws FindFailed{
		s.click(FileUtils.file(file));
	}

	@When("^je clique sur le mot (.*)$")
	public void clickOnWord(String word) throws FindFailed{
		s.findWord(word);
		s.click();
	}
	@Given("^je tape (.*)$")
	public void type(String type) throws FindFailed {
		s.wait(FileUtils.file("/images/target.png"), 5000);
		s.type(type);
	}
	
	@Then("^cette image (.*) représente mon résultat$")
	public void check(String file) throws FindFailed {
		s.wait(FileUtils.file(file), 5000);
        Assert.assertNotNull(s.find(FileUtils.matchFile(file)));
	}

	@When("^mon écran contiendra (.*)$")
	public void checkWord(String word) throws FindFailed{
		s.waitText(word, 5000);
		Assert.assertNotNull(s.findWord(word));
	}
}