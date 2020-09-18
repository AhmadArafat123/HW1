package Acceptance_pa;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import Ma.check;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class checkOut {

	private ArrayList<Integer> num= new ArrayList<Integer>();
	public ArrayList<String> S=new ArrayList<String>() ;
	
	private int totalprice;
	private check c;
	@Given("the price of a {string} is {int}")
	public void thePriceOfAls(String string, Integer int1) {
		S.add(string);
		num.add(int1);
		
	}


	

	@When("I checkout {int} {string}")
	public void iCheckout( Integer int1,String string)
	{
		c=new check();
		totalprice+=c.calculate(int1.intValue(),string,S,num);
	}
	@Then("the total price should be {int}")
	public void theTotalPriceShouldBe(Integer int1)
	{
		assertTrue(totalprice==int1.intValue());
	}
	
	
}
