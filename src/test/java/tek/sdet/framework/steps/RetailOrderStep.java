package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderStep extends CommonUtility{ 
	
	POMFactory factory = new POMFactory(); 
	

@When("User click on Orders section")
public void userClickOnOrdersSection() { 
	click(factory.homePage().orderButton); 
	logger.info("user clicked on order section");
    
} 

@And("User click on first order in list")
public void userClickOnFirstOrderInList() {  

	clickElementWithJS(factory.orderPage().headerOne); 
	logger.info("user clicked on first order");
    
} 


@And("User click on Cancel The Order button")
public void userClickOnCancelTheOrderButton() { 
	click(factory.orderPage().orderCancel); 
	logger.info("user clicked on cancel the order button");
    
} 


@And("User select the cancelation Reason {string}")
public void userSelectTheCancelationReason(String reason) { 
	click(factory.orderPage().orderReason); 
	selectByVisibleText(factory.orderPage().orderReason, reason);
	logger.info("user select reason for cancelation");
    
} 


@And("User click on Cancel Order button")
public void userClickOnCancelOrderButton() { 
	click(factory.orderPage().orderSubmitBtn); 
	logger.info("user clicked on cancel order button");
   
} 


@Then("a cancelation message should be displayed {string}")
public void aCancelationMessageShouldBeDisplayed(String message) { 
	String actualMessage = message;
	String expectedMessage = "Your Order Has Been Cancelled";
	Assert.assertEquals(actualMessage, expectedMessage);
	//Assert.assertTrue(isElementDisplayed(factory.homePage().tekschoolLogo));
	Assert.assertTrue(isElementDisplayed(factory.orderPage().orderCancelMessage)); 
	logger.info("Message displyed , order has been cancelled");
    
}  

@And("User click first order in list") 
public void userClickFirstOrderInList() {  
	clickElementWithJS(factory.orderPage().returnheaderOne); 
	logger.info("user clicked first order");
	
}

@And("User click on Return Items button")
public void userClickOnReturnItemsButton() {  
	click(factory.orderPage().returnBtn); 
	logger.info("user clicked return item button");
	
    
}
@And("User select the Return Reason {string}")
public void userSelectTheReturnReason(String reason) { 
	click(factory.orderPage().returnReason); 
	selectByVisibleText(factory.orderPage().returnReason, reason); 
	logger.info("user selected the return reason"); 
    
}
@And("User select the drop off service {string}")
public void userSelectTheDropOffService(String dropOff) { 
	click(factory.orderPage().dropOffInput); 
	selectByVisibleText(factory.orderPage().dropOffInput, dropOff); 
	logger.info("user selected the return drop off service"); 
   
}
@And("User click on Return Order button")
public void userClickOnReturnOrderButton() { 
	click(factory.orderPage().orderReturnSubmit); 
	logger.info("user clicked return order button");
    
} 

@Then("a cancelation message displayed {string}")
public void aCancelationMessageDisplyed(String message) {  
	String actualMessage = message;
	String expectedMessage = "Return was successful";
	Assert.assertEquals(actualMessage, expectedMessage);
	Assert.assertTrue(isElementDisplayed(factory.orderPage().orderReturnSuccessfully)); 
	logger.info("Message displyed , return was successful");	
	
	
} 

@When("User click on first order in the list")
public void userClickOnFirstOrderInTheList() { 
	clickElementWithJS(factory.orderPage().reviewHeader); 
	logger.info("user clicked on first order list");
    
}
@When("User click on Review button")
public void userClickOnReviewButton() { 
	click(factory.orderPage().reviewBtn); 
	logger.info("user clicked on review button");
    
}
@When("User write Review headline {string} and {string}")
public void userWriteReviewHeadlineAnd(String value, String text) { 
	sendText(factory.orderPage().headLineInput, value); 
	sendText(factory.orderPage().commentInput, text); 
	logger.info("user gave comment");
    
}
@When("User click Add your Review button")
public void userClickAddYourReviewButton() { 
	click(factory.orderPage().reviewSubmitBtn); 
	logger.info("user clicked add review button");
    
}
@Then("a review message should be displayed {string}")
public void aReviewMessageShouldBeDisplayed(String message) {
	String actualMessage = message;
	String expectedMessage = "Your review was added successfully";
	Assert.assertEquals(actualMessage, expectedMessage);
	Assert.assertTrue(isElementDisplayed(factory.orderPage().reviewSubmitBtn)); 
	logger.info("Message displyed , review added successfully"); 
}


}
