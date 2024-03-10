package co.com.qvision.petstore.runners.compras;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/compra.feature",
        glue="co.com.qvision.petstore.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class ComprarAnimalRunner {
}
