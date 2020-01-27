package Test.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepDefinations {
	@Given("open the eclipse")
	public void open_the_eclipse(){
		System.out.println("Eclipse is opened...");
	}
	@Then("write code")
	public void write_code(){
		
		System.out.println("......You are in Sample Class.....");
	}
	

}
