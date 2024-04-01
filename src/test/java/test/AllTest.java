package test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.awt.*;
import java.io.File;
import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"json:target/cucumber-report/cucumber.json"},
		monochrome = true,
		features = "classpath:features")
public class AllTest {
	private static CustomScreenRecorder screenRecorder;
	private static final String workingDirectory = System.getProperty("user.dir") + "/src/test/resources/";

	@BeforeClass
	public static void init() throws IOException, AWTException {
		screenRecorder = new CustomScreenRecorder(new File(workingDirectory));
		screenRecorder.startRecording("yo", true);
	}

	@AfterClass
	public static void end() throws IOException {
		screenRecorder.stopRecording(true);
	}
}