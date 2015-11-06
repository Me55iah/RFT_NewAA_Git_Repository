package Home_MK2;
import resources.Common_Variables;
import resources.Home_MK2.Quick_QuoteHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author horned
 */
public class Quick_Quote extends Quick_QuoteHelper
{
	/**
	 * Script Name   : <b>Quick_Quote</b>
	 * Generated     : <b>14 Jan 2015 13:30:30</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/01/14
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		//--------------------------------------------------------------------------------------------------
		// Document: Home Membership | Boiler Cover | Home Emergency | AA: RegularExpression(home-membership)		
		//--------------------------------------------------------------------------------------------------
		
		// https://www.theaa.com/home-membership/#/

		// https://prelive1.theaa.com/home-membership/#/

		// https://prelive2.theaa.com/home-membership/#/

		
////		// // Test Data
//		(Common_Variables.membership) = false;
//		(Common_Variables.propertyType) = "Detached";
//		(Common_Variables.numBedrooms) = "4";
//		(Common_Variables.proposer_HouseNumber) ="28";
//		(Common_Variables.proposer_PostCode) = "RG248GB";
////		// // Test Data
		
		//--------------------------------------------------------------------------------------------------
		
		
		//--------------------------------------------------------------------------------------------------
		// Synchronise on Page Start
		getQuote().waitForExistence(10,  0.25);
		//--------------------------------------------------------------------------------------------------			
		// Get a Quote
		getQuote(ANY, READY).click();
		
		// Member - Y/N
		if (Common_Variables.membership == false){
			member_No().click();			
		}		
		else{
			member_Yes().click();
		}
		logTestResult(" AA Home Membership Was Set To "+Common_Variables.membership, true);
		//--------------------------------------------------------------------------------------------------
		// Property Type - (flatMaisonette/terraced/semiDetached/detached/bungalow/terraced
		switch (Common_Variables.propertyType){
		
			case "Flat/Maisonette":
				flatMaisonette(ANY, READY).click();
				break;
				
			case "Terraced":
				terraced(ANY, READY).click();
				break;
				
			case "Semi-Detached":
				semiDetached(ANY, READY).click();
				break;
				
			case "Detached":
				detached(ANY, READY).click();
				break;
				
			case "Bungalow":
				bungalow(ANY, READY).click();
				break;						
		}
		logTestResult(" Property Type Selected Was "+Common_Variables.propertyType, true);
		//--------------------------------------------------------------------------------------------------
		// Bedroom Count (1 thro 5)
		switch (Common_Variables.numBedrooms){
		
			case "1":
				bed_1(ANY, READY).click();
				break;
				
			case "2":
				bed_2(ANY, READY).click();
				break;
				
			case "3":
				bed_3(ANY, READY).click();
				break;
				
			case "4":
				bed_4(ANY, READY).click();
				break;
				
			case "5":
				bed_5(ANY, READY).click();
				break;				
		}
		logTestResult(" Number of Bedrooms Selected Was "+Common_Variables.numBedrooms, true);
		//--------------------------------------------------------------------------------------------------
		// House Number (for policy quote)
		house_Number().waitForExistence(10,  0.25);
		house_Number(ANY, READY).click(atPoint(125,18));
		iE(homeMembership(),DEFAULT_FLAGS).inputChars(Common_Variables.proposer_HouseNumber);
		//-----
		logTestResult(" House Number Set Was "+Common_Variables.proposer_HouseNumber, true);		
		//--------------------------------------------------------------------------------------------------
		// PostCode (for policy quote)
		postCode().waitForExistence(10,  0.25);
		postCode(ANY, READY).click(atPoint(102,18));
		iE(homeMembership(),DEFAULT_FLAGS).inputChars(Common_Variables.proposer_PostCode);
		//-----
		logTestResult(" PostCode of Property Set  Was "+Common_Variables.proposer_PostCode, true);		
		//--------------------------------------------------------------------------------------------------
		// Submit Page (Next Button)
		nextsubmit().waitForExistence(10,  0.25);
		nextsubmit(ANY, READY).click();
		
		//--------------------------------------------------------------------------------------------------
		
	}
}

