package Aggregators.Home;
import resources.Common_Variables;
import resources.Aggregators.Home.Retrieve_Home_Combination_QuoteHelper;
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
public class Retrieve_Home_Combination_Quote extends Retrieve_Home_Combination_QuoteHelper
{
	/**
	 * Script Name   : <b>Retrieve_Home_Quote</b>
	 * Generated     : <b>30 Mar 2015 14:03:11</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/03/30
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		// www.theaa.com/services/insuranceandfinance/home/n_quote_retrieve.jsp?QUOTEREF=' + this.form.QUOTEREF.value + '&AffinityID=' + this.form.AffinityID.value + '&Surname=' + this.form.Surname.value + '&DOB=' + this.form.DOB.value + '&Postcode=' + this.form.Postcode.value;" value="Retrieve"/>


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
		String sDOB_Day = Common_Variables.dob_Day;
		String sDOB_Year = Common_Variables.dob_Year;
		String sDOB_Month = Common_Variables.dob_Month;
		String sMarketValue = Common_Variables.xmlMarketValue;
		
		
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
			
			CloseAllBrowsers();
		
			startBrowser("iE", sXMLRetrieve);
			
			sleep(5);
			
			browser_htmlBrowser().waitForExistence(100,  0.25);
			
			callScript("Utilities.Portal_Synchronisation");

			
			//--------------------------------------------------------------------------------------------------------------
			// Manual Field Entry and Submit
			// Synchronise
			button_getQuotesubmit().waitForExistence(20,  0.25);
		
			//---------------------------------------------------------------------------------------------
			// Enter SURNAME
			text_surname(ANY, READY).click(atPoint(62,10));
			browser_htmlBrowser(document_homeInsuranceRetrieve(),DEFAULT_FLAGS).inputChars(sSurname);
			//---------------------------------------------------------------------------------------------
			// Enter BIRTHDAY
			list_birthDay(ANY, READY).click();
			list_birthDay(ANY, READY).click(atText(sDOB_Day));
			//---------------------------------------------------------------------------------------------
			// Enter BIRTHMONTH
			list_birthMonth(ANY, READY).click();
			list_birthMonth(ANY, READY).click(atText(sDOB_Month));
			//---------------------------------------------------------------------------------------------
			// Enter BIRTHYEAR
			list_birthYear(ANY, READY).click();
			list_birthYear(ANY, READY).click(atText(sDOB_Year));
			//---------------------------------------------------------------------------------------------
			// Enter POSTCODE
			text_postcode(ANY, READY).click(atPoint(60,8));
			browser_htmlBrowser(document_homeInsuranceRetrieve(),DEFAULT_FLAGS).inputChars(sPostCode);
			//---------------------------------------------------------------------------------------------
			// Enter REFERENCE NUMBER
			text_quoteref(ANY, READY).click(atPoint(80,5));
			browser_htmlBrowser(document_homeInsuranceRetrieve(),DEFAULT_FLAGS).inputChars(sXML_QuoteReference);
			//---------------------------------------------------------------------------------------------
			// SUBMIT
			button_getQuotesubmit().waitForExistence(20,  0.25);
			button_getQuotesubmit(ANY, READY).click();
			//---------------------------------------------------------------------------------------------
			break;
	}		

		sleep(5);		
		
		browser_htmlBrowser().waitForExistence(100,  0.25);
		
		callScript("Utilities.Portal_Synchronisation");
		
		//--------------------------------------------------------------------------------------------------------------
		// Detect MARKET VALUE Dialog
		if (html_marketValue().exists()){
			html_marketValue().click(atPoint(90,15));
			browser_htmlBrowser(document_homeInsuranceYourHome(),DEFAULT_FLAGS).inputChars(sMarketValue);
			
			button_getQuotesubmit2().waitForExistence(5, 0.25);
			button_getQuotesubmit2(ANY, READY).click();

			browser_htmlBrowser().waitForExistence(100,  0.25);
			
			callScript("Utilities.Portal_Synchronisation");

		}
		//--------------------------------------------------------------------------------------------------------------
		//html_marketValue.
		
		
		// HTML Browser
		// Document: RegularExpression(market value): RegularExpression(theaa)
		
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
//			CloseAllBrowsers();		

//			sleep(2);       
			// Start IE, Send XML String To Retrieve Quote
//			startBrowser(sXMLRetrieve);// IE
		
		// Detect IMPORTANT INFORMATION DIALOG
//		sleep(2);
//		browser_htmlBrowser(document_homeInsuranceYourQuot(),DEFAULT_FLAGS).click(atPoint(784,11));
//		browser_htmlBrowser(document_homeInsuranceYourQuot(),DEFAULT_FLAGS).inputKeys("{ESCAPE}");

		//stop();
		// INSURANCE TYPE BC, C, B
		
		// HTML Browser
		// Document: Home Insurance : You and your home - The AA: https://prelive1.theaa.com/home-insurance/viewMainDetails.do
//		radioButton_Contents_Only_Ins().click();
//		radioButton_Buildings_Only_Ins().click();
//		radioButton_Contents_Only_Ins().click();
//		radioButton_Building_Contents().click();

		//--------------------------------------------------------------------------------------------------------------
		// Detect IMPORTANT INFORMATION DIALOG (Important information about this policy)
		sleep(2);
		
		String sEndorsementsOverlay_Text = "";		
		
		try {
			sEndorsementsOverlay_Text = (String)html_endorsementsOverlay().getProperty(".text");
			if (sEndorsementsOverlay_Text.contains("Important information about this policy")){
				 
				System.out.println(sEndorsementsOverlay_Text+" Security Information Page Displayed");
				
				// DISPEL DIALOG BEFORE WE CAN CONTINUE
 				browser_htmlBrowser(document_homeInsuranceYourQuot(),DEFAULT_FLAGS).click(atPoint(784,11));
 				browser_htmlBrowser(document_homeInsuranceYourQuot(),DEFAULT_FLAGS).inputKeys("{ESCAPE}");
			}else{
				 
				System.out.println(sEndorsementsOverlay_Text+" Security Information Page NOT Displayed");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//--------------------------------------------------------------------------------------------------------------

			//stop();
//			
//			BrowserSync();			
//			sleep(2);
			// Detect Question
			// DO You Have Another Job (Part-time occupation)	
//			if (radioButton_driver0HAS_PART_TI().exists()){
//				radioButton_driver0HAS_PART_TI(ANY, READY).click();
//				radioButton_driver0HAS_PART_TI2(ANY, READY).click();
//				button_nextsubmit(ANY, READY).click();
//			}
			
			//--------------------------------------------------------------------------------------------------------------
			// Give The Browser Time To Wake Up :-) - Quote to Return
//			BrowserSync();
//			unregisterAll();
			//--------------------------------------------------------------------------------------------------------------
			// Verify Quote Returned In Browser
			// Scrape From HMI
			String sReturned_Page = (String)browser_htmlBrowser().getProperty(".documentName");
			// Parsed From XML
			String sReturnPage = ""; //sURL+"/"+sInsuranceType+"/buy/quote";
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
				sReturnPage = sURL+"/"+sInsuranceType+"/buy/quote";
				sReturned_Page = "insurance/buy/quote";
			}
			if (sReturnPage.contains("insurance/buy/quote")){
				sReturnPage = "insurance/buy/quote";
			}
			if (sReturned_Page.contains("insurance/viewQuote")){
				sReturnPage = sURL+"/home-insurance/viewQuote";
				sReturned_Page = "home-insurance/viewQuote";
			}
			if (sReturnPage.contains("insurance/viewQuote")){
				sReturnPage = "home-insurance/viewQuote";
			}
					
			// https://prelive1.theaa.com/home-insurance/viewQuote.do
			
			
			String sTitle = "Quote_Page_Retrieval"; String sReport = sTitle;
			VerifyandReport(sTitle, sReturned_Page, sReturnPage, sReport);
			//--------------------------------------------------------------------------------------------------------------
		
			unregisterAll();          // Verify_Home_Combination_Quote
			
			//--------------------------------------------------------------------------------------------------------------
			// NOT CTM? - Re-sample To Show Updated HMI for BUILDINGS AND CONTENTS ONLY
			// ONLY DO THIS ONCE - 1ST PASS IS ANNUAL - SO DO IT HERE - EXIST IN MONTHLY BUT COMMENTED
			//
			if (!Common_Variables.xmlAffinity.contains("comparethemarket")){
				callScript("Aggregators.Home.Policy_Resample");
			}

			//------------------------------------------------------
			callScript("Aggregators.Home.Important_Info_Dialog");
			//------------------------------------------------------
			BrowserSync();
			//------------------------------------------------------
			// callScript("Utilities.IE11_Page_Loaded");


	}
}



