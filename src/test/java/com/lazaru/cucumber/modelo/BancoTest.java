package com.lazaru.cucumber.modelo;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//features = "src/test/resources/com/lazaru/cucumber/modelo/banco.feature"
//glue = "com.lazaru.teste.cucumber.modelo.passos",
//@CucumberOptions(tags = "@BancoTest", 
@CucumberOptions(plugin = {"pretty"})
public class BancoTest {
}
