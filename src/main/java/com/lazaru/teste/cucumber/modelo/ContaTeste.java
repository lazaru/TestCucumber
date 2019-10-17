package com.lazaru.teste.cucumber.modelo;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:caracteristicas", tags = "@ContaTeste", 
glue = "com.lazaru.teste.cucumber.modelo.passos", monochrome = true, dryRun = false)
public class ContaTeste {
}