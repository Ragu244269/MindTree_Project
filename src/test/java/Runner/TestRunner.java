/**
 * 
 */
package Runner;

import org.testng.annotations.Test;

import TestSuit.BaseTest;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;

/**
 * @author admin
 *
 */
@CucumberOptions(features = "src/test/java/Feature/", glue = "TestSuit", tags = { "@ANZ", "@FunctionalTesting" }, plugin = { "pretty",
		"json:target/cucumber.json","html:target/html" })
public class TestRunner extends BaseTest {

	@Test(groups = "examples-testng", description = "Example of using TestNGCucumberRunner to invoke cucumber")
	public void invoke() {
		new TestNGCucumberRunner(getClass()).runCukes();
	}

}
