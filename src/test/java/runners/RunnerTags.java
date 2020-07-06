package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/demo.feature",
        tags = "@stories",
        glue = " co.com.choucair.certificacion.demo.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}
