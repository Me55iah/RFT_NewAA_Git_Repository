package Aggregators;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import resources.Common_Variables;
import resources.Aggregators.Generate_QuoteHelper;
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
public class Generate_Quote extends Generate_QuoteHelper
{
	/**
	 * Script Name   : <b>Generate_Quote</b>
	 * Generated     : <b>26 Feb 2015 11:02:32</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/02/26
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
		
				//-------------------------------------
				// Test Data Start
				//-------------------------------------
				// Insurance
//				String sAffinity = "GOCOMPARE";
//				String sQuoteRetrievalType = "motor-retrievequote";
//				String sTestEnvironment = "http://www.theaa.com";
				String sCoverStartDate_YYYY = sCurrentYear;
				String sCoverStartDate_MM = CurrMonth(1);
				String sCoverStartDate_DD = CurrDay(5);
				String sExpiryDate_YYYY = CurrYear(0);
				String sExpiryDate_MM = CurrMonth(0);
				String sExpiryDate_DD = CurrDay(0);
				String sYearsnoClaims = "";
				String sLevelofCover_Code = "";
				String sLevelofCover_Text = "";
				String sVehicleUsage_Code = "";
				String sVehicleUsage_Text = "";
				String sQuoteType_Code = "";
				String sQuoteType_Text = "";
				String sClaims = "";
				String sConvictions = "";
				String sPreviousInsurer ="";
				String sPreviousInsurerExpiryDate = "";
				String sNewCoverStartDate = "";
				String sInsuranceLevelofCover = "";
				//-------------------------------------
				// Quote Retrieval
		 		String sQuoteReference_Addons = "";
		 		String sQuoteReference = "";
				String sExcessType = "";
				String sExcessAmount = "";
				String sExcessTotalAmount = "";
				String sPaymentFrequency = "";
				String sPaymentAmount = "";
				String sAnnualQuotePuchasePrice = "";
				String sAnnualQuotePuchasePrice_Addons = "";
				String sMonthlyQuotePuchasePrice = "";
				String sMonthlyQuotePuchasePrice_Addons = "";
				//String sVoluntaryExcess = "";
				String sVoluntaryExcess_Addons = "";
				//String sCompulsaryExcess = "";
				String sAPR = "";
				String sCompulsaryExcess_Addons = "";
				String sInitialDeposit = "";
				String s_11_Repayments_At = "";
				String sTotalPayable = "";
				//-------------------------------------
				// Person
//				String sTitle = "Mr";
//				String sFirstname = "TESTERFIRSTNAME";
//				String sSurname = "TESTERSURNAME";
				String sAddressLine1 = "";
				String sAddressLine2 = "";
				String sAddressLine3 = "";
				String sAddressLine4 = "";
//				String sPostcode = "RG1%202ns";  /// RG1 2NS   // RG1%202ns
//				String sDOBDate_YYYY = "1960";
//				String sDOBDate_MM = "03";
//				String sDOBDate_DD = "02";
				String sEmail = "";
				String sTelephone = "";
				String sMobile = "";
				String sMaritalStatus = "";
				String sEmploymentStatus = "";
				String sJobTitle = "";
				String sBusinessType = "";
				String sUKResidenceSince = "";
				String sAAMembership = "";
				String sFullUKLicence = "";
				String sFullUKLicenceDate = "";
				//-------------------------------------	
				// Vehicle Details
				String sVehicleRegistration = "";
				String sFromConfused = ""; // Insurer Flag
				String sVehicleRegisterYear = "";
				String sVehicleManufacturer = "";
				String sVehicleModel = "";
				String sFuel = "";
				String sTransmission = "";
				String sEngineCapacity = "";
				String sAnnualMileage = "";
				String sNumberofDoors = "";
				String sVehicleValue = "";
				String sNumberofSeats = "";
				String sVehicleRightHandDrive = "";
				String sVehicleModifications = "";
				String sVehicleSecurityDevice = "";
				String sPurchaseDate = "";
				String sPresentValue = "";
				String sVehicleOwner = "";
				String sRegisteredKeeper = "";
				String sVehicleUseage = "";
				String sVehicleOvernightLocation = "";
				String sVehicleOvernightAddress = "";
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
		// GOCOMPARE
		// https://prelive1.theaa.com/car-insurance/buy/quote-retrieval?aa.quoteRetrieve.reference=WW1MT065QBGX&aa.quoteRetrieve.surname=TESTERSURNAME&aa.quoteRetrieve.postcode=RG1%202ns&aa.quoteRetrieve.dateOfBirth=02/03/1960&submitForm=true&PNCD=N&fromConfused=null
		// AFTER RETRIEVE motor
		// https://prelive1.theaa.com/car-insurance/buy/quote
		// Final Retrieve Verify
		//https://prelive1.theaa.com/car-insurance/buy/quote-retrieval?aa.quoteRetrieve.reference=WW1MT065QBGX&aa.quoteRetrieve.surname=TESTERSURNAME&aa.quoteRetrieve.postcode=RG1%202ns&aa.quoteRetrieve.dateOfBirth=02/03/1960&submitForm=true&PNCD=N&fromConfused=null
// MOTOR:		
		// Set String Motor Insurance // http://www.theaa.com  // GOCOMPARE
		//String sXML = "http://www.theaa.com/aaservlet/InsuranceXMLQuote?xmlString=%3C%3Fxml%20version%3D%221.0%22%20encoding%3D%22utf-8%22%3F%3E%3CAAInsurance%20xsi%3AnoNamespaceSchemaLocation%3D%22http%3A//10.192.51.16%3A80/schemas/AAInsurance.xsd%22%20coverstartdate%3D%222015-03-15%22%20coverperiod%3D%220%22%20suppressmailings%3D%22N%22%20affinity%3D%22GOCOMPARE%22%20volexcess%3D%2204X%22%20xmlns%3Axsi%3D%22http%3A//www.w3.org/2001/XMLSchema-instance%22%20xmlns%3Aref%3D%22http%3A//callconnection.co.uk/referencedata%22%20xmlns%3Ahelper%3D%22urn%3AXsltHelper%22%20xmlns%3AabiManager%3D%22urn%3AAbiCodeManager%22%3E%3Cmotor%3E%3Cquotetype%20code%3D%221%22%3ENon-PCND%3C/quotetype%3E%3Clevelofcover%20code%3D%221%22%3E%3C/levelofcover%3E%3Cresponse%20code%3D%2209%22%3EPrice%20comparison%20website%3C/response%3E%3Cpreviousinsurer%20code%3D%22500%22%20expiry%3D%222013-12-22%22%20yearsnoclaims%3D%222%22%3EUnknown/Other%3C/previousinsurer%3E%3Cproposer%3E%3Cvehicleusage%20code%3D%221%22%3ESocialAndCommuting%3C/vehicleusage%3E%3Caddress%20line1%3D%2278%22%20line2%3D%22A%22%20line3%3D%22A%22%20line4%3D%22A%22%20postcode%3D%22RG1%202ns%22%20/%3E%3Ccontact%3E%3Ctelephone%20type%3D%22home%22%3E01234567890%3C/telephone%3E%3Cemail%20type%3D%22home%22%3Edotcomtester@theaa.com%3C/email%3E%3C/contact%3E%3Cdriver%20dob%3D%221960-03-02%22%20othervehicle%3D%22N%22%3E%3Cname%20firstname%3D%22TESTERFIRSTNAME%22%20lastname%3D%22TESTERSURNAME%22%20title%3D%22Mrs%22%20/%3E%3Cmaritalstatus%20code%3D%222%22%3ESingle%3C/maritalstatus%3E%3Coccupation%3E%3Cfulltimeocc%20code%3D%22264%22%3EAccounts%20Clerk%3C/fulltimeocc%3E%3Cfulltimebus%20code%3D%22304%22%3ECourier%20Services%3C/fulltimebus%3E%3C/occupation%3E%3Clicence%20code%3D%221%22%20held%3D%229%22%20unit%3D%22Y%22%20/%3E%3C/driver%3E%3C/proposer%3E%3Cvehicle%20purchasedate%3D%222008-05-01%22%20value%3D%22999%22%20annualmileage%3D%223000%22%20registration%3D%22E30MER%22%20regyear%3D%221988%22%3E%3Cwherekept%20code%3D%222%22%20/%3E%3Cabi%20code%3D%2253536402%22%3E1988%2C%20GOLF%20GTI%2C%201781cc%2C%205%20Door%2C%20Petrol%2C%20Manual%3C/abi%3E%3C/vehicle%3E%3C/motor%3E%3C/AAInsurance%3E";
		String sXML = selectedEnvironment+"/aaservlet/InsuranceXMLQuote?xmlString=%3C%3Fxml%20version%3D%221.0%22%20encoding%3D%22utf-8%22%3F%3E%3CAAInsurance%20xsi%3AnoNamespaceSchemaLocation%3D%22http%3A//10.192.51.16%3A80/schemas/AAInsurance.xsd%22%20coverstartdate%3D%22"+sCoverStartDate_YYYY+"-"+sCoverStartDate_MM+"-"+sCoverStartDate_DD+"%22%20coverperiod%3D%220%22%20suppressmailings%3D%22N%22%20affinity%3D%22"+sAffinity+"%22%20volexcess%3D%2204X%22%20xmlns%3Axsi%3D%22http%3A//www.w3.org/2001/XMLSchema-instance%22%20xmlns%3Aref%3D%22http%3A//callconnection.co.uk/referencedata%22%20xmlns%3Ahelper%3D%22urn%3AXsltHelper%22%20xmlns%3AabiManager%3D%22urn%3AAbiCodeManager%22%3E%3Cmotor%3E%3Cquotetype%20code%3D%221%22%3ENon-PCND%3C/quotetype%3E%3Clevelofcover%20code%3D%221%22%3E%3C/levelofcover%3E%3Cresponse%20code%3D%2209%22%3EPrice%20comparison%20website%3C/response%3E%3Cpreviousinsurer%20code%3D%22500%22%20expiry%3D%222013-12-22%22%20yearsnoclaims%3D%222%22%3EUnknown/Other%3C/previousinsurer%3E%3Cproposer%3E%3Cvehicleusage%20code%3D%221%22%3ESocialAndCommuting%3C/vehicleusage%3E%3Caddress%20line1%3D%2278%22%20line2%3D%22A%22%20line3%3D%22A%22%20line4%3D%22A%22%20postcode%3D%22"+sPostcode+"%22%20/%3E%3Ccontact%3E%3Ctelephone%20type%3D%22home%22%3E01234567890%3C/telephone%3E%3Cemail%20type%3D%22home%22%3Edotcomtester@theaa.com%3C/email%3E%3C/contact%3E%3Cdriver%20dob%3D%22"+sDOBDate_YYYY+"-"+sDOBDate_MM+"-"+sDOBDate_DD+"%22%20othervehicle%3D%22N%22%3E%3Cname%20firstname%3D%22TESTERFIRSTNAME%22%20lastname%3D%22"+sSurname+"%22%20title%3D%22"+sTitle+"%22%20/%3E%3Cmaritalstatus%20code%3D%222%22%3ESingle%3C/maritalstatus%3E%3Coccupation%3E%3Cfulltimeocc%20code%3D%22264%22%3EAccounts%20Clerk%3C/fulltimeocc%3E%3Cfulltimebus%20code%3D%22304%22%3ECourier%20Services%3C/fulltimebus%3E%3C/occupation%3E%3Clicence%20code%3D%221%22%20held%3D%229%22%20unit%3D%22Y%22%20/%3E%3C/driver%3E%3C/proposer%3E%3Cvehicle%20purchasedate%3D%222008-05-01%22%20value%3D%22999%22%20annualmileage%3D%223000%22%20registration%3D%22E30MER%22%20regyear%3D%221988%22%3E%3Cwherekept%20code%3D%222%22%20/%3E%3Cabi%20code%3D%2253536402%22%3E1988%2C%20GOLF%20GTI%2C%201781cc%2C%205%20Door%2C%20Petrol%2C%20Manual%3C/abi%3E%3C/vehicle%3E%3C/motor%3E%3C/AAInsurance%3E";
		//VB	//	

		
		
//  HOME:		
		// Set String Home Insurance                           // GOCOMPARE
// 	    String sXML1 = "http://www.theaa.com/aaservlet/InsuranceXMLQuote?xmlString=%3C%3Fxml%20version%3D%221.0%22%20encoding%3D%22utf-8%22%3F%3E%3CAAInsurance%20xmlns%3Axsi%3D%22http%3A//www.w3.org/2001/XMLSchema-instance%22%20xmlns%3Axsd%3D%22http%3A//www.w3.org/2001/XMLSchema%22%20coverstartdate%3D%22"+sCoverStartDate_YYYY+"-"+sCoverStartDate_MM+"-"+sCoverStartDate_DD+"%22%20coverperiod%3D%220%22%20suppressmailings%3D%22Y%22%20affinity%3D%22"+sAffinity+"%22%20volexcess%3D%221%22%20xsi%3AnoNamespaceSchemaLocation%3D%22http%3A//10.192.101.28%3A80/schemas/AAInsurance.xsd%22%3E%3Chome%3E%3Cresponse%20code%3D%2209%22%3EPrice%20comparison%20website%3C/response%3E%3Cproposer%20dob%3D%221960-03-02%22%20aamembership%3D%22N%22%20firsttimebuyer%3D%22N%22%3E%3Cname%20title%3D%22Ms%22%20firstname%3D%22TESTERFIRSTNAME%22%20lastname%3D%22"+sSurname+"%22%20/%3E%3Coccupation%3E%3Cfulltimeocc%20code%3D%2254%22%3EBank%20Clerk%3C/fulltimeocc%3E%3Cfulltimebus%20code%3D%2215%22%3EBanking%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%3C/fulltimebus%3E%3C/occupation%3E%3Caddress%20line1%3D%228%2078%22%20line2%3D%22A%22%20line3%3D%22A%22%20postcode%3D%22"+sPostcode+"%22%20/%3E%3Ccontact%3E%3Ctelephone%20type%3D%22Home%22%3E01633%20468888%3C/telephone%3E%3Cemail%20type%3D%22Home%22%3Edotcomtester@theaa.com%3C/email%3E%3C/contact%3E%3C/proposer%3E%3Cbuilding%20marketvalue%3D%22100000%22%20bedroomcount%3D%222%22%20occupiedday%3D%22N%22%20smokedetector%3D%22Y%22%20neighbourwatch%3D%22N%22%20nacossalarm%3D%22N%22%20doorwindowlocks%3D%22Y%22%3E%3Cpropertytype%20type%3D%22D%22%3EDetached%3C/propertytype%3E%3Cpropertyage%20code%3D%226%22%3E1980-1989%3C/propertyage%3E%3Cmortgage%20code%3D%220%22%20/%3E%3C/building%3E%3Ccontents%20worldwidecover%3D%22N%22%20accdamage%3D%22N%22%3E%3Cpreviousinsurer%20code%3D%221%22%3EUnknown/Other%3C/previousinsurer%3E%3Clevelofcover%20code%3D%223%22%3EUp%20To%20%A340000%3C/levelofcover%3E%3Citems%3E%3Citem%20value%3D%222000%22%20coverrequired%3D%22Y%22%3EPlatinum%20solitaire%20diamond%20engagement%20ring%3C/item%3E%3C/items%3E%3C/contents%3E%3C/home%3E%3C/AAInsurance%3E";
		

	   
	   
	   
	   
	   /*		// Quote Data // (Parameterised)
		String sXML = "http://"+sTestEnvironment+"/aaservlet/InsuranceXMLQuote?xmlString=%3C%3Fxml%20version%3D%221.0%22%20encoding" +
				"%3D%22utf-8%22%3F%3E%3CAAInsurance%20xsi%3AnoNamespaceSchemaLocation%3D%22http%3A//10.192.51.16%3A80/schemas/" +
				"AAInsurance.xsd%22%20coverstartdate%3D%22${"+sCoverStartDate_YYYY+"}-${"+sCoverStartDate_MM+"}-${"+sCoverStartDate_DD+"}" +
				"%22%20coverperiod%3D%220%22%20suppressmailings%3D%22N%22%20affinity%3D%22${"+sAffinity+"}" +
				"%22%20volexcess%3D%2204X%22%20xmlns%3Axsi%3D%22http%3A//www.w3.org/2001/XMLSchema-instance" +
				"%22%20xmlns%3Aref%3D%22http%3A//callconnection.co.uk/referencedata%22%20xmlns%3Ahelper%3D%22urn" +
				"%3AXsltHelper%22%20xmlns%3AabiManager%3D%22urn%3AAbiCodeManager%22%3E%3Cmotor%3E%3Cquotetype%20code%3D%22$" +
				"{"+sQuoteType_Code+"}%22%3E${"+sQuoteType_Text+"}%3C/quotetype%3E%3Clevelofcover%20code%3D%22${"+sLevelofCover_Code+"}" +
				"%22%3E${"+sLevelofCover_Text+"}%3C/levelofcover%3E%3Cresponse%20code%3D%2209%22%3EPrice%20comparison%20website" +
				"%3C/response%3E%3Cpreviousinsurer%20code%3D%22500%22%20expiry%3D%22${"+sExpiryDate_YYYY+"}-${"+sExpiryDate_MM+"}-${"+sExpiryDate_DD+"}" +
				"%22%20yearsnoclaims%3D%22${"+sYearsnoClaims+"}%22%3EUnknown/Other%3C/previousinsurer%3E%3Cproposer%3E%3Cvehicleusage" +
				"%20code%3D%22${"+sVehicleUsage_Code+"}%22%3E${"+sVehicleUsage_Text+"}%3C/vehicleusage%3E%3Caddress%20line1%3D%22${"+sAddressLine1+"}" +
				"%22%20line2%3D%22${"+sAddressLine2+"}%22%20line3%3D%22${"+sAddressLine3+"}%22%20line4%3D%22${"+sAddressLine4+"}" +
				"%22%20postcode%3D%22${"+sPostcode+"}%22%20/%3E%3Ccontact%3E%3Ctelephone%20type%3D%22home%22%3E0"+sTelephone+"%3C/telephone" +
				"%3E%3Cemail%20type%3D%22home%22%3E${"+sEmail+"}%3C/email%3E%3C/contact%3E%3Cdriver%20dob%3D%22$" +
				"{"+sDOBDate_YYYY+"}-${"+sDOBDate_MM+"}-${"+sDOBDate_DD+"}%22%20othervehicle%3D%22N%22%3E%3Cname%20firstname%3D%22${"+sFirstname+"}" +
				"%22%20lastname%3D%22${"+sSurname+"}%22%20title%3D%22${"+sTitle+"}%22%20/%3E%3Cmaritalstatus%20code%3D%222%22%3E"+sMaritalStatus+""+
				"%3C/maritalstatus%3E%3Coccupation%3E%3Cfulltimeocc%20code%3D%22264%22%3EAccounts%20Clerk%3C/fulltimeocc%" +
				"3E%3Cfulltimebus%20code%3D%22304%22%3ECourier%20Services%3C/fulltimebus%3E%3C/occupation%3E%3Clicence%20code" +
				"%3D%221%22%20held%3D%229%22%20unit%3D%22Y%22%20/%3E%3C/driver%3E%3C/proposer%3E%3Cvehicle%20purchasedate%3D" +
				"%22"+sPurchaseDate+"%22%20value%3D%22"+sPresentValue+"%22%20annualmileage%3D%22"+sAnnualMileage+"%22%20registration%3D%22"+sVehicleRegistration+"%22%20regyear%3D" +
				"%22"+sVehicleRegisterYear+"%22%3E%3Cwherekept%20code%3D%222%22%20/%3E%3Cabi%20code%3D%2253536402%22%3E"+sVehicleRegisterYear+"%2C%20"+sVehicleManufacturer+"%20"+sVehicleModel+"%2C" +
				"%20"+sEngineCapacity+"%2C%205%20"+sNumberofDoors+"%2C%20"+sFuel+"%2C%20"+sTransmission+"%3C/abi%3E%3C/vehicle%3E%3C/motor%3E%3C/AAInsurance%3E";
*/		
		// Tidy Before Start
		CloseAllBrowsers();		
		sleep(2);
		// Start IE
		loadURL(sXML);
		sleep(5);
		//startBrowser("IE"); // IE
		
		// Give The Browser Time To Wake Up :-) - Quote to Return
		BrowserSync();
		 
 		// Verify Raw XML Returned In Browser
		String sCalling_XML = (String)browser_htmlBrowser().getProperty(".documentName");
		
		// Verify Returned Raw XML
		sTitle = "XML_QuoteReturned"; String sReport = "Raw XML Quote Returned, Bypassing Landing Page"; 
		VerifyandReport(sTitle, sXML, sCalling_XML, sReport);

		//-----------------------------------------------------------------------------------------------------------------------------------
		// Copy RAW Returned XML (Properties do not resolve to XML Content (Clipboard)
		// Should Probable Save XML to File (As Above) And Scraped From File
		BrowserSync();
		// Grab the RAM XML From Screen  // This Working Method Is Left In Place (Replaced By Following)
/*		browser_htmlBrowser(document_httpWwwTheaaComAaserv(),DEFAULT_FLAGS).click(atPoint(662,668));
		sleep(1);
		browser_htmlBrowser(document_httpWwwTheaaComAaserv(),DEFAULT_FLAGS).click(RIGHT, atPoint(662,668));
		sleep(1);
		browser_htmlBrowser(document_httpWwwTheaaComAaserv(),DEFAULT_FLAGS).click(atPoint(784,316));
		sleep(1);
		browser_htmlBrowser(document_httpWwwTheaaComAaserv(),DEFAULT_FLAGS).inputKeys("^c");
*/
		// Use Menu Bar - Needs To Be Enabled
		browser_htmlBrowser(document_httpWwwTheaaComAaserv(),DEFAULT_FLAGS).click(atPoint(350,66)); // ENABLE SHORTCUTS
		browser_htmlBrowser(document_httpWwwTheaaComAaserv(),DEFAULT_FLAGS).inputKeys("%e"); // Menu Item - EDIT
		browser_htmlBrowser(document_httpWwwTheaaComAaserv(),DEFAULT_FLAGS).inputChars("a"); // Menu Item - SELECT ALL
		sleep(1);
		browser_htmlBrowser(document_httpWwwTheaaComAaserv(),DEFAULT_FLAGS).click(atPoint(289,67)); // ENABLE SHORTCUTS
		browser_htmlBrowser(document_httpWwwTheaaComAaserv(),DEFAULT_FLAGS).inputKeys("%e"); // Menu Item - EDIT
		browser_htmlBrowser(document_httpWwwTheaaComAaserv(),DEFAULT_FLAGS).inputChars("c"); // Menu Item - COPY		
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
		
		BrowserSync();
		
		
		Affinity_Transform(); // Detects XML Definition and Transforms to Actual Rendering of Affinity


		// Standard Motor XML Primary Node Count = 4
		int iNodeCount = 4;
		if (sAffinity == ("COMPARETHEMARKETP")){
			iNodeCount = 2;
		}
		
		
		// ORDER IN APPEARANCE and AFFINITY
		
		
		
		//-----------------------------------------------------------------------------------------------------------------------------------
		// Grab Contained Quote Reference, Affinity and Request Type (Motor or Home)
		// 2 X Quote References
		String segments[] = (sReturned_XML).split("quoteref=");
		// Quote With Addons
		
		// Length - 4 works for 4 sector motor. CTM = 2 Sector, Home ?
		
		
		
		// Straight Quote - No Additions
		// FIXED 12 Chars Reference Length
		String sQRu = segments[segments.length - 4]; // 4
		String sXML_QuoteReference =  sQRu.substring(1, 13); 

		// Straight Quote - Additions
		String sQRa = segments[segments.length - 1];                  // TRIPS ON COMPARETHEMARKETP - ONLY 1 QUOTE AS EXPECTED (Others have 2)
		String sXML_QuoteReference_Addons =  sQRa.substring(1, 13); 
		//-----------------------------------------------------------------------------------------------------------------------------------
		sQuoteReference = sXML_QuoteReference;
		sQuoteReference_Addons = sXML_QuoteReference_Addons;
		System.out.println("Your Quote Reference In The RAW XML is .... "+sXML_QuoteReference);
		System.out.println("Your Quote Reference In The RAW XML (+Addons) is .... "+sXML_QuoteReference_Addons);
		//-----------------------------------------------------------------------------------------------------------------------------------
		// Affinity
		String segments1[] = (sReturned_XML).split("affinity=");
		String sAf = segments1[1];
		//String[] sAf1 = sAf.split("\""); 
		//sAf1[0] = sAf1[sAf1.length - 1];
		
		sAf = sAf.substring(1, 18); 
		//-----------------------------------------------------------------------------------------------------------------------------------
		System.out.println("Quote Affinity In The RAW XML is .... "+sAf);
		//-----------------------------------------------------------------------------------------------------------------------------------
		// requesttype
		String segments2[] = (sReturned_XML).split("requesttype=");
		String sRT = segments2[1];
		//String[] sRT1 = sRT.split("\""); 
		//sRT1[0] = sRT1[sRT1.length - 1];
		sRT = sRT.substring(1, 6);
		//-----------------------------------------------------------------------------------------------------------------------------------
		System.out.println("Quote Reference Type In The RAW XML is .... "+sRT);
		//-----------------------------------------------------------------------------------------------------------------------------------
		// XML Price
		String segments3[] = (sReturned_XML).split("price=");
		String sPrice = segments3[1];
		String sPriceAddons = segments3[4];

		//-----------------------------------------------------------------------------------------------------------------------------------
		System.out.println("Quote Reference Price In The RAW XML is .... "+sPrice);
		System.out.println("Quote Reference Price With Addons In The RAW XML is .... "+sPriceAddons);
		//-----------------------------------------------------------------------------------------------------------------------------------
		// XML Total Amounts
		String segments4[] = (sReturned_XML).split("totalamount=");
		String sTotalAmount = segments4[1];
		String sTotalAmountAddons = segments4[4];

		//-----------------------------------------------------------------------------------------------------------------------------------
		System.out.println("Quote Reference Total Price In The RAW XML is .... "+sTotalAmount);
		System.out.println("Quote Reference Total Price With Addons In The RAW XML is .... "+sTotalAmountAddons);
		//-----------------------------------------------------------------------------------------------------------------------------------
		// XML Installment Amounts
		String segments5[] = (sReturned_XML).split("instalmentamount=");
		String sInstallmentAmount = segments5[1];
		String sInstallmentAmountAddons = segments5[4];

		//-----------------------------------------------------------------------------------------------------------------------------------
		System.out.println("Quote Reference Installment Amounts In The RAW XML is .... "+sInstallmentAmount);
		System.out.println("Quote Reference Installment Amounts With Addons In The RAW XML is .... "+sInstallmentAmountAddons);
		//-----------------------------------------------------------------------------------------------------------------------------------
		// XML Deposit For Installment Amounts - Initial Amount
		String segments6[] = (sReturned_XML).split("deposit=");
		String sInstallmentAmountDeposit = segments6[1];
		String sInstallmentAmountDepositAddons = segments6[4];

		//-----------------------------------------------------------------------------------------------------------------------------------
		System.out.println("Quote Reference Installment Amount Deposit In The RAW XML is .... "+sInstallmentAmountDeposit);
		System.out.println("Quote Reference Installment Amount Deposit With Addons In The RAW XML is .... "+sInstallmentAmountDepositAddons);
		//-----------------------------------------------------------------------------------------------------------------------------------
		// XML Insurer Name
		String segments7[] = (sReturned_XML).split("insurername=");
		String sInsurerName = segments7[1];		
		sInsurerName = sInsurerName.replaceAll("\\s","");
		//-----------------------------------------------------------------------------------------------------------------------------------
		System.out.println("Quote Reference Insurer Name In The RAW XML is .... "+sInsurerName);
		//-----------------------------------------------------------------------------------------------------------------------------------
		// XML Voluntary Excess
		String segments8[] = (sReturned_XML).split("volexcess=");
		String sVoluntaryExcess = segments8[1];		 
		String sTotalExcess_Vol = sVoluntaryExcess.substring(1,4);
		sVoluntaryExcess = "£"+sVoluntaryExcess.substring(1,4);
		//-----------------------------------------------------------------------------------------------------------------------------------
		System.out.println("Quote Reference Voluntary Excess In The RAW XML is .... "+sVoluntaryExcess);
		//-----------------------------------------------------------------------------------------------------------------------------------
		// XML Compulsory Excess
		String segments9[] = (sReturned_XML).split("comexcess=");
		String sCompulsaryExcess = segments9[1];
		String sTotalExcess_Com = sCompulsaryExcess.substring(1,4);
		sCompulsaryExcess = "£"+sCompulsaryExcess.substring(1,4);
		//-----------------------------------------------------------------------------------------------------------------------------------
		System.out.println("Quote Reference Compulsory Excess In The RAW XML is .... "+sCompulsaryExcess);
		//-----------------------------------------------------------------------------------------------------------------------------------
		// Excess Totals
		int iTotalExcess_Vol = Integer.parseInt(sTotalExcess_Vol);
		int iTotalExcess_Com = Integer.parseInt(sTotalExcess_Com);
		int iTotalExcess = (iTotalExcess_Com+iTotalExcess_Vol);
		
		String sTE = Integer.toString(iTotalExcess);
		Common_Variables.policyTotalExcess = sTE;
		
 		System.out.println(" "+sTE+" "+Common_Variables.policyTotalExcess+" "+iTotalExcess_Vol+" "+iTotalExcess_Com);
		 
		//Common_Variables.policyTotalExcess = sTotalExcess_Vol+sTotalExcess_Com;
		//-----------------------------------------------------------------------------------------------------------------------------------		
		
		System.out.println(" URL Selected Was "+selectedEnvironment);
		
		//-----------------------------------------------------------------------------------------------------------------------------------
		// Save TO Common Variables
		Common_Variables.xmlQuoteReference = sXML_QuoteReference;
		Common_Variables.xmlQuoteReferenceAddons = sXML_QuoteReference_Addons;
		Common_Variables.xmlAffinity = sAf;
		Common_Variables.xmlRequestType = sRT;
		Common_Variables.xmlPrice = sPrice;
		Common_Variables.xmlPriceAddons = sPriceAddons;
		Common_Variables.xmlTotalAmount = sTotalAmount;
		Common_Variables.xmlTotalAmountAddons = sTotalAmountAddons;
		Common_Variables.xmlInstalmentAmount = sInstallmentAmount;
		Common_Variables.xmlInstallmentAmountAddons = sInstallmentAmountAddons;
		Common_Variables.xmlInstallmentAmountDeposit = sInstallmentAmountDeposit;
		Common_Variables.xmlInstallmentAmountDepositAddons = sInstallmentAmountDepositAddons;
		Common_Variables.xmlInsurerName = sInsurerName;
		Common_Variables.xmlVoluntaryExcess = sVoluntaryExcess;
		Common_Variables.xmlCompulsoryExcess = sCompulsaryExcess;
		Common_Variables.policyTotalExcess = sVoluntaryExcess+sCompulsaryExcess; // sTotalExcess;
		Common_Variables.proposer_PostCode = sPostcode;
		Common_Variables.proposerDOB = sDOBDate_DD+"/"+sDOBDate_MM+"/"+sDOBDate_YYYY;
		Common_Variables.dob_Day = sDOBDate_DD;
		Common_Variables.dob_Month = sDOBDate_MM;
		Common_Variables.dob_Year = sDOBDate_YYYY;
		Common_Variables.proposerLastname = sSurname;
		Common_Variables.selectedEnvironment = selectedEnvironment;

		// Verify Returned Raw XML
		sTitle = "XML_QuoteDataCaptured"; sReport = "Raw XML Quote Data Captured, Prior To Re-Direction To Landing Page"; 
		VerifyandReport(sTitle, sXML, sCalling_XML, sReport);

		BrowserSync();
		//callScript("Aggregators.Retrieve_Quote");
		//-----------------------------------------------------------------------------------------------------------------------------------
		// COSTINGS                  // ALL BELOW DEFINED AT TOP /\
		// Vehicle Details
		
		// Proposer Details
		
		// Excess Details
		
		// Insurer Name
	
	}
}

