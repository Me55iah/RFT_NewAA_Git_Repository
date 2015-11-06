package Aggregators.Motor;
import resources.Common_Variables;
import resources.Aggregators.Motor.Retrieve_Motor_QuoteHelper;
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
public class Retrieve_Motor_Quote extends Retrieve_Motor_QuoteHelper
{
	/**
	 * Script Name   : <b>Retrieve_Quote</b>
	 * Generated     : <b>26 Feb 2015 11:02:50</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/02/26
	 * @author horned  buy
	 */
	public void testMain(Object[] args) 
	{
		// Fire Up URL
		// Look At Parsing The XML Over As A Parameter
		String sProduct = Common_Variables.product; // Home or Motor
		String sXML_QuoteReference = Common_Variables.xmlQuoteReference;
		String sXML_QuoteReference_Addons = Common_Variables.xmlQuoteReferenceAddons;
		String sInsurance_Affinity = Common_Variables.xmlAffinity;
		String sInsuranceRequestType = Common_Variables.xmlRequestType;
		String sPostCode = Common_Variables.proposer_PostCode;
		String sURL = Common_Variables.selectedEnvironment;
		String sFromConfused = Common_Variables.xmlConfusedFlag;
		String sSurname = Common_Variables.proposerLastname;
		String sDateofBirth = Common_Variables.proposerDOB;
		String sInsuranceType = Common_Variables.coverType; 
				
//		Common_Variables.affinity = Common_Variables.affinity.replaceAll("\\s","");
//		int i = (Common_Variables.affinity.length());
		
		
		Affinity_Transform(); // Detects XML Definition and Transforms to Actual Rendering of Affinity
		
		
		
//      URLs		// http://www.theaa.com
		
		if (sURL.equalsIgnoreCase("http://www.theaa.com")){
			sURL = "https://www.theaa.com";
		}
		
		if (sURL.equalsIgnoreCase("http://prelive1.www.theaa.com")){
			sURL = "https://prelive1.theaa.com";
		}
		if (sURL.equalsIgnoreCase("http://prelive2.theaa.com")){
			sURL = "https://prelive2.theaa.com";
		}
	
		if (sURL.equalsIgnoreCase("http://prelive3.theaa.com")){
			sURL = "https://prelive3.theaa.com";
		}
		
		if (sURL.equalsIgnoreCase("http://prelive4.theaa.com")){
			sURL = "https://prelive4.theaa.com";
		}

		BrowserSync();
		
		//sURL = "https://www.theaa.com/car-insurance/";
		
		//-----------------------------------------------------------------------------------------------------------------------------------
		// Save TO Common Variables
		
		
//		Common_Variables.xmlPrice = sPrice;
//		Common_Variables.xmlPriceAddons = sPriceAddons;
//		Common_Variables.xmlTotalAmount = sTotalAmount;
//		Common_Variables.xmlTotalAmountAddons = sTotalAmountAddons;
//		Common_Variables.xmlInstallmentAmount = sInstallmentAmount;
//		Common_Variables.xmlInstallmentAmountAddons = sInstallmentAmountAddons;
//		Common_Variables.xmlInstallmentAmountDeposit = sInstallmentAmountDeposit;
//		Common_Variables.xmlInstallmentAmountDepositAddons = sInstallmentAmountDepositAddons;
//		Common_Variables.xmlInsurerName = sInsurerName;
//		Common_Variables.xmlVoluntaryExcess = sVoluntaryExcess;
//		Common_Variables.xmlCompulsoryExcess = sCompulsaryExcess;
//		//--------------------------------------------------------------------------
//		// Test Data
//		sXML_QuoteReference = "WW1MT069KW4K";
//		sXML_QuoteReference_Addons = "WW1MT069KW4K";
//		sInsurance_Affinity = "MGOCOMPAREBUNDLE";
//		sInsuranceRequestType = "motor";
//		sURL = "https://www.theaa.com/car-insurance/";
//		sFromConfused = "null"; // yes/true?
// 		sSurname = "TESTERSURNAME";
//		sDateofBirth = "02/03/1960";
// 		sPostCode = "RG1%202NS";  // RG1 2NS
//		// Test Data
//		//--------------------------------------------------------------------------
		// GOCOMPARE
		// https://prelive1.theaa.com/car-insurance/buy/quote-retrieval?aa.quoteRetrieve.reference=WW1MT065QBGX&aa.quoteRetrieve.surname=TESTERSURNAME&aa.quoteRetrieve.postcode=RG1%202ns&aa.quoteRetrieve.dateOfBirth=02/03/1960&submitForm=true&PNCD=N&fromConfused=null
		// Final Retrieve Verify
		
		String sXMLRetrieve = "";
		
		switch (sProduct){
		
		case "Motor": 							//  
			
			sXMLRetrieve = sURL+"/"+sInsuranceType+"/buy/quote-retrieval?aa.quoteRetrieve.reference="+sXML_QuoteReference+"" +
					"&aa.quoteRetrieve.surname="+sSurname+"&aa.quoteRetrieve.postcode="+sPostCode+"&aa.quoteRetrieve.dateOfBirth="
					+sDateofBirth+"&submitForm=true&PNCD=N&fromConfused="+sFromConfused+"";

			break;
			
		case "Home":							//  

			sXMLRetrieve = sURL+"/home-insurance/viewQuoteRetrieve.do";
			
			// Manual Field Entry and Submit
			
			break;
	}		

		
		
		// MOTOR
		

		// HOME
		
		
		
		
		// https://prelive1.theaa.com/car-insurance/buy/quote-retrieval?aa.quoteRetrieve.reference=WW1MT065QCJ2&aa.quoteRetrieve.surname=TESTERSURNAME&aa.quoteRetrieve.postcode=RG1%202ns&aa.quoteRetrieve.dateOfBirth=02/03/1960&submitForm=true&PNCD=N&fromConfused=null
		unregisterAll();
		
//		// Retrieve URL
//		String sXMLRetrieve = sURL+"quote-retrieval?aa.quoteRetrieve.reference="+sXML_QuoteReference_Addons+
//				"&aa.quoteRetrieve.surname="+sSurname+"&aa.quoteRetrieve.postcode="+sPostCode+
//				"&aa.quoteRetrieve.dateOfBirth="+sDateofBirth+"&submitForm=true&PNCD=N&fromConfused="+sFromConfused+"";
		//--------------------------------------------------------------------------------------------------------------
		// Give The Browser Time To Wake Up :-) - Quote to Return
			// Tidy Before Start
			CloseAllBrowsers();		

			sleep(2);       
			// Start IE, Send XML String To Retrieve Quote
			startBrowser(sXMLRetrieve);// IE
			
			//stop();
			
			BrowserSync();			
			sleep(2);
			// Detect Question
			// DO You Have Another Job (Part-time occupation)	
			if (radioButton_driver0HAS_PART_TI().exists()){
				radioButton_driver0HAS_PART_TI(ANY, READY).click();
				radioButton_driver0HAS_PART_TI2(ANY, READY).click();
				button_nextsubmit(ANY, READY).click();
			}
			
			//--------------------------------------------------------------------------------------------------------------
			// Give The Browser Time To Wake Up :-) - Quote to Return
			BrowserSync();
			unregisterAll();
			//--------------------------------------------------------------------------------------------------------------
			// Verify Quote Returned In Browser
			// Scrape From HMI
			String sReturned_Page = (String)browser_htmlBrowser().getProperty(".documentName");
			// Parsed From XML
			String sReturnPage = sURL+"/"+sInsuranceType+"/buy/quote";
			//--------------------------------------------------------------------------------------------------------------
//			Object done;        // MOVED TO SUPER
//			// Compare Strings More detailed variant
//			if ((boolean) (done=vpManual("Quote_Page_Retrieved", sReturned_Page, sReturnPage).performTest())){
//				// passed
//			}
//			else{
//				// Failed
//				logTestResult(" The Quote Page Did Not Return Correctly, Or Browser Reports Page Not Found", false);
//			}
			// Transformation Required http and https
			if (sReturned_Page.contains("insurance/buy/quote")){
				sReturned_Page = "insurance/buy/quote";
			}
			if (sReturnPage.contains("insurance/buy/quote")){
				sReturnPage = "insurance/buy/quote";
			}
					
			String sTitle = "Quote_Page_Retrieval"; String sReport = sTitle;
			VerifyandReport(sTitle, sReturned_Page, sReturnPage, sReport);
			//--------------------------------------------------------------------------------------------------------------
		
			unregisterAll();
			//callScript("Aggregators.Verify_Quote");
	}
}

