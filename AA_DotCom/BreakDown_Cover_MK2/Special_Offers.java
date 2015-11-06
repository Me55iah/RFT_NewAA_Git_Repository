package BreakDown_Cover_MK2;
import resources.Common_Variables;
import resources.BreakDown_Cover_MK2.Special_OffersHelper;
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
public class Special_Offers extends Special_OffersHelper
{
	/**
	 * Script Name   : <b>Special_Offers</b>
	 * Generated     : <b>5 Jun 2015 12:55:54</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/05
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		
		String sSortCode = Common_Variables.DD_SortCode;
		String sAccountNumber = Common_Variables.DD_AccountNumber;
		String sAccountName = Common_Variables.Payment_CardName;
		String sNumberofBedrooms = Common_Variables.numBedrooms;
		String sPropertyType = Common_Variables.propertyType;

//		// HTML Browser
//		// Document: Breakdown Cover | Special offer: free Home Emergency Response | AA: https://prelive2.theaa.com/breakdown-cover/uk-breakdown/view-her-details.do
//		form_sorconline_form().click();
//		link_whatHappensAfter6Months().click();
//		link_whatHappensAfter6Months().click();
//		link_doYouOfferAnyOtherTypesOf().click();
//		link_doYouOfferAnyOtherTypesOf().click();
//		html_price().click(atPoint(362,54));
//		label_includeHomeEmergencyResp().click();
//		button_continuesubmit().click();
//		// Document: Breakdown Cover | Special offer: free Home Emergency Response | AA: https://prelive2.theaa.com/breakdown-cover/uk-breakdown/submit-her-details.do
//		label_includeHomeEmergencyResp2().click();
		
		
		
		
		//--------------------------------------------------------------------	
		System.gc();
		
		//------------------------------------------------------------
		BrowserSync();
		//--------------------------------------------------------------------

		String sPricevalue = "";
		
		// GRAB PRE PURCHASE TOTAL PRICE (2 Alternatives)
		// Price Value Field
//		if (html_pricevalue().isEnabled()){
//			sPricevalue = (String)html_pricevalue().getProperty(".contentText");
//		}
	
		sPricevalue = (String)html_pricevalue().getProperty(".contentText");
		//--------------------------------------------------------------------			
		// Store It For Final Comparison
		Common_Variables.priceToPay = sPricevalue;
		//--------------------------------------------------------------------			

		//--------------------------------------------------------------------	
		// Home Response
		if (list_noOfBedrooms().exists()){
		
			list_propertyType().waitForExistence(20,  0.25);
			list_propertyType(ANY, READY).click();			
			list_propertyType(ANY, READY).click(atText(sPropertyType));
			
			
			list_noOfBedrooms().waitForExistence(20,  0.25);
			list_noOfBedrooms(ANY, READY).click();
			list_noOfBedrooms(ANY, READY).click(atText(sNumberofBedrooms));
			
			label_includeHomeEmergencyResp2().waitForExistence(20,  0.25);		
			label_includeHomeEmergencyResp2(ANY, READY).click();
			
			//button_continuesubmit2().waitForExistence(20,  0.25);		
			//button_continuesubmit2(ANY, READY).click();
			
			
		}
		//--------------------------------------------------------------------	
		BrowserSync();		
		//--------------------------------------------------------------------	
		// Direct Debit Detection
		if (text_sortCode().exists()){
		
			text_sortCode().waitForExistence(20,  0.25);		
			text_sortCode(ANY, READY).click(atPoint(222,46));
			iE(document_breakdownCoverYourPay(),DEFAULT_FLAGS).inputChars(sSortCode);
			
			text_accountNo().waitForExistence(20,  0.25);		
			text_accountNo(ANY, READY).click(atPoint(182,9));
			iE(document_breakdownCoverYourPay(),DEFAULT_FLAGS).inputChars(sAccountNumber);
			
			text_accountName().waitForExistence(20,  0.25);		
			text_accountName(ANY, READY).click(atPoint(91,42));
			iE(document_breakdownCoverYourPay(),DEFAULT_FLAGS).inputChars(sAccountName);
			 			
		}

		//--------------------------------------------------------------------			
		BrowserSync();		
		//--------------------------------------------------------------------	
		// TC Detection
		if (label_iConfirmThatYouHaveInfor().exists()){
		
			label_iConfirmThatYouHaveInfor(ANY, READY).click();
			
		}

		//--------------------------------------------------------------------	


		
		
		//--------------------------------------------------------------------				
		// Submit
		if (button_continuesubmit2().exists()){
			button_continuesubmit2().waitForExistence(20,  0.25);
			button_continuesubmit2(ANY, READY).click(atPoint(122,52)); 	
		}
		//--------------------------------------------------------------------		

		
		//--------------------------------------------------------------------				
		// Buy
		if (button_buyBreakdownCoverbutton().exists()){
			button_buyBreakdownCoverbutton().waitForExistence(20,  0.25);
			button_buyBreakdownCoverbutton(ANY, READY).click(atPoint(122,52)); 	
		}
		//--------------------------------------------------------------------		
		
		
 
//		//--------------------------------------------------------------------	
//		String sActual = "";
//		String sTitle = "The_PAYMENT_Details_Screen";
//		String sReport = "The PAYMENT Details Screen Appeared As Expected";
//		String sExpected = "Buy breakdown cover";
//
//		// Scrape Following Screen (YOUR DETAILS) for ACTUAL Value to Compare
//		sActual = (String)button_buyBreakdownCoverbutton().getProperty(".value");
//		//--------------------------------------------------------------------	
//		// Verify Appearance of Following Screen (NO VALIDATION ERRORS)
// 		VerifyandReport(sTitle, sExpected, sActual, sReport);
//		//--------------------------------------------------------------------	

		
		
		
	}
}

