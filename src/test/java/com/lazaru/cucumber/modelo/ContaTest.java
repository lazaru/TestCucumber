package com.lazaru.cucumber.modelo;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//, glue = "com.lazaru.teste.cucumber.modelo.passos"
//@CucumberOptions(tags = "@ContaTest", monochrome = true, dryRun = false)
@CucumberOptions(plugin = {"pretty"})
public class ContaTest {
}