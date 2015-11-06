package Aggregators;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import resources.Common_Variables;
import resources.Aggregators.Generate_Motor_Quote_DeleteHelper;
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
public class Generate_Motor_Quote_Delete extends Generate_Motor_Quote_DeleteHelper
{
	/**
	 * Script Name   : <b>Generate_Quote_DEBUG</b>
	 * Generated     : <b>19 Mar 2015 13:38:26</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/03/19
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		// Detect End of Year for Quote Handling  -  DONE IN CALLER - Aggregator_Tests
		String sCurrentMonth = CurrMonth(0);
		String sCurrentYear = CurrYear(0);
		if (sCurrentMonth == "12"){
			sCurrentYear =  CurrYear(1); // (+1)
		}
		
//				//-------------------------------------
//				// Test Data Start
//				//-------------------------------------
//				// Insurance
				String sCoverStartDate_YYYY = sCurrentYear;
				String sCoverStartDate_MM = CurrMonth(1);
				String sCoverStartDate_DD = CurrDay(Common_Variables.numberFutureDays);
//				String sExpiryDate_YYYY = CurrYear(0);
//				String sExpiryDate_MM = CurrMonth(0);
//				String sExpiryDate_DD = CurrDay(0);
//				//-------------------------------------
//				// Quote Retrieval
//		 		String sQuoteReference_Addons = "";
//		 		String sQuoteReference = "";
//				//-------------------------------------
//				// Person
////				String sTitle = "Mr";
////				String sFirstname = "TESTERFIRSTNAME";
////				String sSurname = "TESTERSURNAME";
////				String sPostcode = "RG1%202ns";  /// RG1 2NS   // RG1%202ns
////				String sDOBDate_YYYY = "1960";
////				String sDOBDate_MM = "03";
////				String sDOBDate_DD = "02";
//				//-------------------------------------	
//				// Vehicle Details
//				String sVehicleRegistration = "";
		//		
				// Home
		//-------------------------------------
		// Test Data End  Mrs
		//-------------------------------------
 		
//		String sQuoteReference_Addons = "";
// 		String sQuoteReference = "";
//
//		
 		String selectedEnvironment = Common_Variables.selectedEnvironment;
// 		String sCoverStartDate_DD  = Common_Variables.Cover_Start_Day;
// 		String sCoverStartDate_MM  = Common_Variables.Cover_Start_Month;
// 		String sCoverStartDate_YYYY  = Common_Variables.Cover_Start_Year;
 		String sAffinity =  Common_Variables.xmlAffinity;
 		String sDOBDate_DD = Common_Variables.dob_Day;
 		String sDOBDate_MM = Common_Variables.dob_Month;
 		String sDOBDate_YYYY = Common_Variables.dob_Year;
		String sPostcode = Common_Variables.proposer_PostCode;
		String sFirstname = Common_Variables.proposerForename;
		String sSurname = Common_Variables.proposerLastname;
		String sTitle = Common_Variables.proposerTitle;
		String sRequestType = Common_Variables.xmlRequestType;
		String sVoluntaryExcess = Common_Variables.xmlVoluntaryExcess;  // (values 01 through 13, depends on affinity though)
		
 		Common_Variables.proposerDOB = sDOBDate_DD+"/"+sDOBDate_MM+"/"+sDOBDate_YYYY;

		// GOCOMPARE 1960  volexcess
		// https://prelive1.theaa.com/car-insurance/buy/quote-retrieval?aa.quoteRetrieve.reference=WW1MT065QBGX&aa.quoteRetrieve.surname=TESTERSURNAME&aa.quoteRetrieve.postcode=RG1%202ns&aa.quoteRetrieve.dateOfBirth=02/03/1960&submitForm=true&PNCD=N&fromConfused=null
		// AFTER RETRIEVE motor
		// https://prelive1.theaa.com/car-insurance/buy/quote
		// Final Retrieve Verify
		//https://prelive1.theaa.com/car-insurance/buy/quote-retrieval?aa.quoteRetrieve.reference=WW1MT065QBGX&aa.quoteRetrieve.surname=TESTERSURNAME&aa.quoteRetrieve.postcode=RG1%202ns&aa.quoteRetrieve.dateOfBirth=02/03/1960&submitForm=true&PNCD=N&fromConfused=null                22"+sCoverStartDate_YYYY+"-"+sCoverStartDate_MM+"-"+sCoverStartDate_DD+"%22
// MOTOR:		
		// Set String Motor Insurance // http://www.theaa.com  // GOCOMPARE                                                                                                                                                                                                                                                // 2015-03-28   28    "+sCoverStartDate_DD+"                                                           "+sAffinity+"
		//String sXML = "http://www.theaa.com/aaservlet/InsuranceXMLQuote?xmlString=%3C%3Fxml%20version%3D%221.0%22%20encoding%3D%22utf-8%22%3F%3E%3CAAInsurance%20xsi%3AnoNamespaceSchemaLocation%3D%22http%3A//10.192.51.16%3A80/schemas/AAInsurance.xsd%22%20coverstartdate%3D%222015-03-28%22%20coverperiod%3D%220%22%20suppressmailings%3D%22N%22%20affinity%3D%22GOCOMPARE%22%20volexcess%3D%2204X%22%20xmlns%3Axsi%3D%22http%3A//www.w3.org/2001/XMLSchema-instance%22%20xmlns%3Aref%3D%22http%3A//callconnection.co.uk/referencedata%22%20xmlns%3Ahelper%3D%22urn%3AXsltHelper%22%20xmlns%3AabiManager%3D%22urn%3AAbiCodeManager%22%3E%3Cmotor%3E%3Cquotetype%20code%3D%221%22%3ENon-PCND%3C/quotetype%3E%3Clevelofcover%20code%3D%221%22%3E%3C/levelofcover%3E%3Cresponse%20code%3D%2209%22%3EPrice%20comparison%20website%3C/response%3E%3Cpreviousinsurer%20code%3D%22500%22%20expiry%3D%222013-12-22%22%20yearsnoclaims%3D%222%22%3EUnknown/Other%3C/previousinsurer%3E%3Cproposer%3E%3Cvehicleusage%20code%3D%221%22%3ESocialAndCommuting%3C/vehicleusage%3E%3Caddress%20line1%3D%2278%22%20line2%3D%22A%22%20line3%3D%22A%22%20line4%3D%22A%22%20postcode%3D%22RG1%202ns%22%20/%3E%3Ccontact%3E%3Ctelephone%20type%3D%22home%22%3E01234567890%3C/telephone%3E%3Cemail%20type%3D%22home%22%3Edotcomtester@theaa.com%3C/email%3E%3C/contact%3E%3Cdriver%20dob%3D%221960-03-02%22%20othervehicle%3D%22N%22%3E%3Cname%20firstname%3D%22TESTERFIRSTNAME%22%20lastname%3D%22TESTERSURNAME%22%20title%3D%22Mrs%22%20/%3E%3Cmaritalstatus%20code%3D%222%22%3ESingle%3C/maritalstatus%3E%3Coccupation%3E%3Cfulltimeocc%20code%3D%22264%22%3EAccounts%20Clerk%3C/fulltimeocc%3E%3Cfulltimebus%20code%3D%22304%22%3ECourier%20Services%3C/fulltimebus%3E%3C/occupation%3E%3Clicence%20code%3D%221%22%20held%3D%229%22%20unit%3D%22Y%22%20/%3E%3C/driver%3E%3C/proposer%3E%3Cvehicle%20purchasedate%3D%222008-05-01%22%20value%3D%22999%22%20annualmileage%3D%223000%22%20registration%3D%22E30MER%22%20regyear%3D%221988%22%3E%3Cwherekept%20code%3D%222%22%20/%3E%3Cabi%20code%3D%2253536402%22%3E1988%2C%20GOLF%20GTI%2C%201781cc%2C%205%20Door%2C%20Petrol%2C%20Manual%3C/abi%3E%3C/vehicle%3E%3C/motor%3E%3C/AAInsurance%3E";
		String sXML = selectedEnvironment+"/aaservlet/InsuranceXMLQuote?xmlString=%3C%3Fxml%20version%3D%221.0%22%20encoding%3D%22utf-8%22%3F%3E%3CAAInsurance%20xsi%3AnoNamespaceSchemaLocation%3D%22http%3A//10.192.51.16%3A80/schemas/AAInsurance.xsd%22%20coverstartdate%3D%22"+sCoverStartDate_YYYY+"-"+sCoverStartDate_MM+"-"+sCoverStartDate_DD+"%22%20coverperiod%3D%220%22%20suppressmailings%3D%22N%22%20affinity%3D%22"+sAffinity+"%22%20volexcess%3D%22"+sVoluntaryExcess+"X%22%20xmlns%3Axsi%3D%22http%3A//www.w3.org/2001/XMLSchema-instance%22%20xmlns%3Aref%3D%22http%3A//callconnection.co.uk/referencedata%22%20xmlns%3Ahelper%3D%22urn%3AXsltHelper%22%20xmlns%3AabiManager%3D%22urn%3AAbiCodeManager%22%3E%3Cmotor%3E%3Cquotetype%20code%3D%221%22%3ENon-PCND%3C/quotetype%3E%3Clevelofcover%20code%3D%221%22%3E%3C/levelofcover%3E%3Cresponse%20code%3D%2209%22%3EPrice%20comparison%20website%3C/response%3E%3Cpreviousinsurer%20code%3D%22500%22%20expiry%3D%222013-12-22%22%20yearsnoclaims%3D%222%22%3EUnknown/Other%3C/previousinsurer%3E%3Cproposer%3E%3Cvehicleusage%20code%3D%221%22%3ESocialAndCommuting%3C/vehicleusage%3E%3Caddress%20line1%3D%2278%22%20line2%3D%22A%22%20line3%3D%22A%22%20line4%3D%22A%22%20postcode%3D%22"+sPostcode+"%22%20/%3E%3Ccontact%3E%3Ctelephone%20type%3D%22home%22%3E01234567890%3C/telephone%3E%3Cemail%20type%3D%22home%22%3Edotcomtester@theaa.com%3C/email%3E%3C/contact%3E%3Cdriver%20dob%3D%22"+sDOBDate_YYYY+"-"+sDOBDate_MM+"-"+sDOBDate_DD+"%22%20othervehicle%3D%22N%22%3E%3Cname%20firstname%3D%22TESTERFIRSTNAME%22%20lastname%3D%22"+sSurname+"%22%20title%3D%22"+sTitle+"%22%20/%3E%3Cmaritalstatus%20code%3D%222%22%3ESingle%3C/maritalstatus%3E%3Coccupation%3E%3Cfulltimeocc%20code%3D%22264%22%3EAccounts%20Clerk%3C/fulltimeocc%3E%3Cfulltimebus%20code%3D%22304%22%3ECourier%20Services%3C/fulltimebus%3E%3C/occupation%3E%3Clicence%20code%3D%221%22%20held%3D%229%22%20unit%3D%22Y%22%20/%3E%3C/driver%3E%3C/proposer%3E%3Cvehicle%20purchasedate%3D%222008-05-01%22%20value%3D%22999%22%20annualmileage%3D%223000%22%20registration%3D%22E30MER%22%20regyear%3D%221988%22%3E%3Cwherekept%20code%3D%222%22%20/%3E%3Cabi%20code%3D%2253536402%22%3E1988%2C%20GOLF%20GTI%2C%201781cc%2C%205%20Door%2C%20Petrol%2C%20Manual%3C/abi%3E%3C/vehicle%3E%3C/motor%3E%3C/AAInsurance%3E";
		//VB	//	
		
		
//  HOME:		
		// Set String Home Insurance                           // GOCOMPARE
// 	    String sXML1 = "http://www.theaa.com/aaservlet/InsuranceXMLQuote?xmlString=%3C%3Fxml%20version%3D%221.0%22%20encoding%3D%22utf-8%22%3F%3E%3CAAInsurance%20xmlns%3Axsi%3D%22http%3A//www.w3.org/2001/XMLSchema-instance%22%20xmlns%3Axsd%3D%22http%3A//www.w3.org/2001/XMLSchema%22%20coverstartdate%3D%22"+sCoverStartDate_YYYY+"-"+sCoverStartDate_MM+"-"+sCoverStartDate_DD+"%22%20coverperiod%3D%220%22%20suppressmailings%3D%22Y%22%20affinity%3D%22"+sAffinity+"%22%20volexcess%3D%221%22%20xsi%3AnoNamespaceSchemaLocation%3D%22http%3A//10.192.101.28%3A80/schemas/AAInsurance.xsd%22%3E%3Chome%3E%3Cresponse%20code%3D%2209%22%3EPrice%20comparison%20website%3C/response%3E%3Cproposer%20dob%3D%221960-03-02%22%20aamembership%3D%22N%22%20firsttimebuyer%3D%22N%22%3E%3Cname%20title%3D%22Ms%22%20firstname%3D%22TESTERFIRSTNAME%22%20lastname%3D%22"+sSurname+"%22%20/%3E%3Coccupation%3E%3Cfulltimeocc%20code%3D%2254%22%3EBank%20Clerk%3C/fulltimeocc%3E%3Cfulltimebus%20code%3D%2215%22%3EBanking%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%3C/fulltimebus%3E%3C/occupation%3E%3Caddress%20line1%3D%228%2078%22%20line2%3D%22A%22%20line3%3D%22A%22%20postcode%3D%22"+sPostcode+"%22%20/%3E%3Ccontact%3E%3Ctelephone%20type%3D%22Home%22%3E01633%20468888%3C/telephone%3E%3Cemail%20type%3D%22Home%22%3Edotcomtester@theaa.com%3C/email%3E%3C/contact%3E%3C/proposer%3E%3Cbuilding%20marketvalue%3D%22100000%22%20bedroomcount%3D%222%22%20occupiedday%3D%22N%22%20smokedetector%3D%22Y%22%20neighbourwatch%3D%22N%22%20nacossalarm%3D%22N%22%20doorwindowlocks%3D%22Y%22%3E%3Cpropertytype%20type%3D%22D%22%3EDetached%3C/propertytype%3E%3Cpropertyage%20code%3D%226%22%3E1980-1989%3C/propertyage%3E%3Cmortgage%20code%3D%220%22%20/%3E%3C/building%3E%3Ccontents%20worldwidecover%3D%22N%22%20accdamage%3D%22N%22%3E%3Cpreviousinsurer%20code%3D%221%22%3EUnknown/Other%3C/previousinsurer%3E%3Clevelofcover%20code%3D%223%22%3EUp%20To%20%A340000%3C/levelofcover%3E%3Citems%3E%3Citem%20value%3D%222000%22%20coverrequired%3D%22Y%22%3EPlatinum%20solitaire%20diamond%20engagement%20ring%3C/item%3E%3C/items%3E%3C/contents%3E%3C/home%3E%3C/AAInsurance%3E";
		
		
		// Tidy Before Start
		CloseAllBrowsers();		
		sleep(2);
		// Start IE
		loadURL(sXML);
		//callScript("Debug", "sXML");
		sleep(5);
		//startBrowser("IE"); // IE
		
		// Give The Browser Time To Wake Up :-) - Quote to Return
		BrowserSync();
		 
 		// Verify Raw XML Returned In Browser
		String sCalling_XML = (String)browser_htmlBrowser().getProperty(".documentName");
		//-----------------------------------------------------------------------------------------------------------------------------------		
		// Verify Returned Raw XML
		sTitle = "XML_QuoteReturned"; String sReport = "Raw XML Quote Returned, Bypassing Landing Page"; 
		VerifyandReport(sTitle, sXML, sCalling_XML, sReport);
		//-----------------------------------------------------------------------------------------------------------------------------------
		// Grab RAW XML For TO Confirm Reception
		callScript("Aggregators.XML.Copy_RAW_Browser_XML");
		//-----------------------------------------------------------------------------------------------------------------------------------
		// Clipboard Management
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
  		//-----------------------------------------------------------------------------------------------------------------------------------
		BrowserSync();
		// Convert Clipboard capture To String (Motor or Home)
		String sReturned_XML = "";
		try {
			sReturned_XML = (String) clipboard.getData(DataFlavor.stringFlavor);
			logTestResult(" RAW XML Parameterized String Data - Intermediate Stage Data Retrieve Verified - ", true);
		} catch (UnsupportedFlavorException e) {
			 
			e.printStackTrace();
		} catch (IOException e) {
			 
			e.printStackTrace();
		}
		
		Common_Variables.xmlString = sReturned_XML;

		//-----------------------------------------------------------------------------------------------------------------------------------
		BrowserSync();
		//-----------------------------------------------------------------------------------------------------------------------------------
		// Each Affinity has the XML Variation and the Actual Web Site Name Variation
		Affinity_Transform(); // Detects XML Definition and Transforms to Actual Rendering of Affinity on Target Webpage
  		//-----------------------------------------------------------------------------------------------------------------------------------
		
		sTitle = "XML_QuoteDataCaptured"; sReport = "Raw XML Quote Data Captured, Prior To Re-Direction To Landing Page"; 
		VerifyandReport(sTitle, sXML, sCalling_XML, sReport);

		BrowserSync();
		
		callScript("Aggregators.XML.Get_XML_Motor_Policy_Data");
				
		BrowserSync();
		//-----------------------------------------------------------------------------------------------------------------------------------
	
	}
}


