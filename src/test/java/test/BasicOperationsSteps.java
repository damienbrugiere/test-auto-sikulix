package test;


import cucumber.api.java.en.When;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class BasicOperationsSteps {

	private static final String workingDirectory = System.getProperty("user.dir") + "/src/test/resources/";
	private CommonStepDefinition commonStepDefinition;
	private Screen s;
	public BasicOperationsSteps() {
		this.commonStepDefinition = CommonStepDefinition.getInstance();
		s = this.commonStepDefinition.getScreen();
	}

	@When("^je clique sur le navigateur$")
	public void clickNav() throws FindFailed{
		s.click(FileUtils.file("images/int.png"));
	}
	@When("^je tape sur la recherche (.*)$")
	public void search(String word){
		s.type(FileUtils.file("images/search.png"), word);
	}
}