package com.calculator;

import com.intuit.karate.junit4.Karate;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Karate.class)
@CucumberOptions(features = "src/main/resources/feature/calculator.feature")
public class CalculatorRunner {

}
