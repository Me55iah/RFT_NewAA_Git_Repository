import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;



import resources.Common_Variables;
import resources.DebugHelper;
import Utilities.Joda_Date_Selection_Variant;
import Utilities.Portal_Synchronisation;
//import resources.Utilities.Date_SelectionHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.domain.flex.FlexTestDomainImplementation.GetChildAtPointRunnable;
import com.rational.test.ft.enabler.Browser;
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
public class Debug extends DebugHelper
{
	/**
	 * Script Name   : <b>Debug</b>
	 * Generated     : <b>25 Nov 2014 10:45:29</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/11/25
	 * @author horned
	 */
	
	
//	public static boolean liveTest;
//	public static String[] environmentURL = new String[1];
//
//	public static Integer iLT95;
//	public static Integer iGT95LT11499;
//	public static Integer iGT115LT14499;
//	public static Integer iGT145;
//	public static Integer iActual;

	
	
	public void testMain(Object[] args) 
	{
		
		{       
			
			startBrowser("Chrome", "www.theaa.com");
		
			
		
		// Window: chrome.exe: Breakdown cover, Insurance, Route Planner | AA - Google Chrome
		chromeLegacyWindowwindow().click(atPoint(939,84));
		
		// Window: chrome.exe: Used Cars for sale | Second hand cars for sale | AA Cars - Google Chrome
		chromeLegacyWindowwindow2().click(atPoint(846,266));
		usedCarsForSaleSecondHandCarsF().inputChars("po122he");
		chromeLegacyWindowwindow2().click(atPoint(1049,326));
		chromeLegacyWindowwindow2().click(atPoint(1425,552));
		
		// Window: chrome.exe: 
		chromeLegacyWindowwindow3().click(atPoint(144,19));
			
//			//------------------------------------------------------------
//			// DATUM For Following Verification
//			// Grab ALL Text (String From html - Container
//			String sContainer_Text = (String)html_priceSection2().getProperty(".text");
//			//System.out.println(sContainer_Text);
//			System.out.println(" - - - - - I N S T A L L M E N T    P R I C I N G S - - - - - ");
//			//------------------------------------------------------------
//			// Final Monthly Costing	
//			// DEPOSIT
//			String sStartName = "Car insurance initial card payment:"; // Car insurance initial card payment:
////			String sStartName = "Initial deposit (card payment):";
//			String sEndName = "11 monthly payments of:";               // 11 monthly payments of:
//			int iIndex = 1;
//			String sStartNameContent = null;
//			//------------------------------------------------------------
//			iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputKeys("{ExtPgDn}");
//			//------------------------------------------------------------
//			// Final Monthly Payments		
//			logInfo(" - - - - - M_o_n_t_h_l_y_____D_e_p_o_s_i_t - - - - -");
//			subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);            ///////////////////
//			//------------------------------------------------------------
//			Common_Variables.depositAmount = Common_Variables.sActual;
//			//------------------------------------------------------------
//			// 11 Monthly Costing	
//			// MONTHLY
//			sStartName = "11 monthly payments of:";
//			sEndName = "Total monthly payments:";
//			iIndex = 1;
//			sStartNameContent = null;
//			//------------------------------------------------------------
//			// Final Monthly Deposit		
//			logInfo(" - - - - - M_o_n_t_h_l_y_____P_A_Y_M_E_N_T_S - - - - -");
//			subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);
//			//------------------------------------------------------------
//			Common_Variables.monthlyPrice = Common_Variables.sActual;
//			//------------------------------------------------------------
//			// Final Monthly Costing	
//			// TOTAL CREDIT
//			sStartName = "Total monthly payments:";
//			sEndName = "Total payable:";
//			iIndex = 1;
//			sStartNameContent = null;
//			//------------------------------------------------------------
//			// Final Total Credit		
//			logInfo(" - - - - - T_o_t_a_l_____C_r_e_d_i_t - - - - -");
//			subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);
//			//------------------------------------------------------------
//			Common_Variables.totalCredit = Common_Variables.sActual;
//			Common_Variables.PolicyRemainingBalance = Common_Variables.sActual;
//			//------------------------------------------------------------
//			// Balance Remaining	
//			sStartName = "Total credit:";
//			sEndName = "Total payable:";
//			iIndex = 1;
//			sStartNameContent = null;
//			//------------------------------------------------------------
//			// Intermediate Quote Reference
//			logInfo(" - - - - - Q_u_o_t_e______B_a_l_a_n_c_e - - - - -");
//			subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);
//			//------------------------------------------------------------
//			Common_Variables.PolicyRemainingBalance = Common_Variables.sActual;
//			
//			//------------------------------------------------------------
//			// One Off Card Payment Charge			
//			//------------------------------------------------------------
//			// TOTAL PAYABLE
//			sStartName = "Total payable:";
//			sEndName = "**"; // Detect Space
//			iIndex = 1;
//			sStartNameContent = null;
//			//------------------------------------------------------------
//			// Final Total Credit		
//			logInfo(" - - - - - F_i_n_a_l_____T_o_t_a_l_____P_a_y_a_b_l_e - - - - -");
//			subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);
//			//------------------------------------------------------------
//			Common_Variables.totalPayable = Common_Variables.sActual;
//			//------------------------------------------------------------
//
//			sContainer_Text = (String)document_carInsuranceYourDetai().getProperty(".text");
//			//System.out.println(sContainer_Text);
//
//			//------------------------------------------------------------
//			// QUOTE REFERENCE	
//			sStartName = "Please quote reference:";
//			sEndName = "Call us on:";
//			iIndex = 1;
//			sStartNameContent = null;
//			//------------------------------------------------------------
//			// Intermediate Quote Reference
//			logInfo(" - - - - - Q_u_o_t_e______R_e_f_e_r_e_n_c_e - - - - -");
//			subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);
//			//------------------------------------------------------------
//			Common_Variables.intermediateQuoteReference = Common_Variables.sActual;
//			//------------------------------------------------------------
//
//			
			// CARRY TOTAL PAYABLE TO FINAL PAGE CALCULATION 
			
 			// stop();
			// * * * * * *    ADD ONS    * * * * * * start
			
			// THESE ARE TOTALED ON THIS PAGE - LOGIC INDICATES SELECTIONS, TOTALS ARE CARRIED FORWARD FOR VERIFICATION
						
			// * * * * * *    ADD ONS    * * * * * * end
			//------------------------------------------------------------
			
		//	String sStringData = (String)html_main().getProperty(".text");
		//	System.out.println(sStringData);

			//html_ol_onepersononevehicle().click();
			
			//String sName = “customer name”;

 //			TestObject[]  Customer = form_optionsForm().find(“.class”,”Html.A”,”.text”, sName);
//
//			customer[0].click();

//			// get all test objects that have the title "Place an Order"
//		    TestObject[] to = root.find(atDescendant("title", "Place an Order"));
//		    
//		    // print test object properties to console
//		    for (int i = 0; i < to.length; i++)
//		 {
//		       System.out.println(to[i].getProperties());
//		       }			
			//GetChildAtPointRunnable;
			// For actual Calendar Control Selection Method
		//	int iCalendarToSelect = Integer.parseInt(sCalendarToSelect);
	 		// for Debug
			
 		 	//RootTestObject rto = getRootTestObject();
//			TestObject[] gto = rto.find(atDescendant(".alt","Choose Date",".class","Html.IMG"), false);
		//	TestObject[] gto = rto.find(atDescendant(".class","Html.FORM", ".name","optionsForm"), false);

		// 	TestObject[] gto1 = rto.find(atDescendant("class","bd-check", "id","single"), false);
 		 //	<input name="coverTypeSel" class="bd-check" id="single" type="radio" value="scon100">
			//<input name="coverTypeSel" class="bd-check" id="single" type="radio" value="scon100">

			// input type="radio" class="bd-check" name="coverTypeSel" value="scon100" id="single"
			
			
//			((GuiTestObject)form_optionsForm().find(atDescendant(".class", "Html.A", ".text", var1))[0]).click();
			
			// <label id="youLabel" for="single" class="bd-option">Select this cover</label>
			
			// NO SCREEN POINT :-)
			//((GuiTestObject)form_optionsForm().find(atDescendant("type","radio", "id","single"))[0]).click();
			//((GuiTestObject)form_optionsForm().find(atDescendant("class","bd-option", "id","joint3Label"))[0]).click();
			
			// <label id="carLabel" for="vehicle" class="bd-option-on">Selected</label>

			
		//	((GuiTestObject)form_optionsForm().find(atDescendant("for","vehicle", "id","carLabel"))[0]).click();
			
			//((GuiTestObject)form_optionsForm().find(atDescendant("class","bd-option", "id","youLabel"))[0]).click();
        //                                                                radio-input
			//((GuiTestObject)form_optionsForm().find(atDescendant("class","bd-option", "id","jointLabel"))[0]).click();
			
			//TestObject[] gto1 = rto.find(atDescendant("input name","coverTypeSel", "input id","single"), false);
			
			//				
//			// sCalendarToSelect 
	 		//System.out.println(gto1.length);   // Returns 4 for New Learner
			
			
//			for (int i = 0; i <gto.length; i++){
//				
//			}
//			
//			System.out.println(gto[i].getProperties());
//			
//			
//			GuiTestObject TextArea = (GuiTestObject)gto[1];  // Replace gto[n]; with gto[iCalendarToSelect];
//			
//			
//			
//			TextArea.click();	
			
//			try {
//				Cal_Button.click();		
//				logTestResult(sCalendarName+" Calendar Selected", true);
//			}
//			catch (Exception e){
//				logTestResult(sCalendarName+" Calendar FAILED to Select", false);
//			}
//			
			// Clear the trash created by GuiTestObject Find Functionality above
			unregisterAll();

			
			
			
			
			
			
			
			
			
			
			//ControlClick("label class", "bd-option", "label id", "youLabel", 1);
			
			
			
		
		// HTML Browser
		// Document: RegularExpression(View and choose your cover): RegularExpression(uk-breakdown)
		
			
			// HTML Browser
//		// Document: Car Insurance: Your details - The AA: https://prelive9.theaa.com/car-insurance/buy/policyholder-details
//		text_aaMotorDrivers0Claims0Val().click(atPoint(87,37));
//		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputChars("2000");
//		list_aaMotorDrivers0Claims0Mon().click();
//		list_aaMotorDrivers0Claims0Mon().click(atText("February"));
//		list_aaMotorDrivers0Claims0Yea().click();
//		list_aaMotorDrivers0Claims0Yea().click(atText("2013"));
//		label_no().click();
//		label_no2().click();
//		link_claimsConfirm().click();
//		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputKeys("{ExtDown}");
//		link_claimsConfirm().click();
//		button_close().click();
//		link_addClaim().click();
//		text_aaMotorDrivers0Claims0Val().click(atPoint(60,34));
//		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputChars("2000");
//		list_aaMotorDrivers0Claims0Mon().click();
//		list_aaMotorDrivers0Claims0Mon().click(atText("January"));
//		list_aaMotorDrivers0Claims0Yea().click();
//		list_aaMotorDrivers0Claims0Yea().click(atText("2014"));
//		label_no().click();
//		label_no2().click();
//			
			
			
		
//		// HTML Browser
//		// Document: Car Insurance: Your details - The AA: https://prelive9.theaa.com/car-insurance/buy/policyholder-details
//		text_aaMotorDrivers0Claims0Val().click(atPoint(109,40));
//		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputChars("1234");
//		list_aaMotorDrivers0Claims0Mon().click();
//		list_aaMotorDrivers0Claims0Mon().click(atText("January"));
//		list_aaMotorDrivers0Claims0Yea().click();
//		list_aaMotorDrivers0Claims0Yea().click(atText("2015"));
//		label_no().click();
//		label_no2().click();
			
			
			
//			String sPreviousInsurer = "TSB";
//			//--------------------------------------------------------------------
//			// Previous Insurer
//			list_aaMotorPreviousPolicyInsu().waitForExistence(20,  0.25);
//			list_aaMotorPreviousPolicyInsu(ANY, READY).click();
//			sleep(0.25);
//			list_aaMotorPreviousPolicyInsu(ANY, READY).click(atText(sPreviousInsurer));
//			//--------------------------------------------------------------------

			
			//-----------------------------------------------------------------------------------------
			// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
			//-----------------------------------------------------------------------------------------
//			String sExpectedQuoteReference = "UKCAR1807533"; // WW3MT19681SM";
//			String sExpectedRegNumber = "NKD305M";
//			String sExpectedDriverRestrictions = "You only insured to drive";
//			String sExpectedCoverType = "Comprehensive";
//			String sExpectedCoverStart = "Sun 02 August 2015";
//			String sExpectedRenewalDate = "Tue 02 August 2016";
//			String sExpectedPolicyPrice = "£581.70";
//			String sExpectedCCCharge = "1.5";
//			String sExpectedTotalCost = "£590.43";
			//-----------------------------------------------------------------------------------------
			// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
			//-----------------------------------------------------------------------------------------
//			String sExpectedQuoteReference = Common_Variables.intermediateQuoteReference;
//			String sExpectedRegNumber = Common_Variables.vehicleReg;
//			String sExpectedDriverRestrictions = Common_Variables.driverRestrictions;
//			String sExpectedCoverType = Common_Variables.coverType; 
//			// String sExpectedCoverStart = Common_Variables.coverStartDate;
//			// String sExpectedRenewalDate = Common_Variables.coverEndDate;
//			String sExpectedPolicyPrice = Common_Variables.initialAnnualCost; // 1aCommon_Variables.carInsuranceAnnual; //Common_Variables.policyPrice;
//			String sExpectedCCCharge = Common_Variables.cardPaymentCharge;
//			String sExpectedMonthlyCost = Common_Variables.monthlyPrice;
//			String sExpectedTotalCost = Common_Variables.totalPayable;
//			//-----------------------------------------------------------------------------------------
//			// Verification  -  CONFIRM SCREEN TRANSITION - NO VALIDATION ERRORS!!!!
//			String sTitle = "Done_Payment_Complete";
//			String sReport = "Your Payment Data Was Processed Successfully, DONE! Screen Appeared As Expected";
//			String sExpected = "Thank you for buying";
//			String sActual = "";
//			// 
//			String svTitle = ""; // Datastore Verification Title
//			String sStartNameContent  = ""; 
//			
//			//--------------------------------------------------------------------------------		
//			// Date Format Changes on Final Screen
//			dd_MM_yyyy_to_EEE_dd_MMM_yyyy();
//			String sExpectedCoverStart = Common_Variables.coverStartDate;
//			String sExpectedRenewalDate = Common_Variables.coverEndDate;
//			//--------------------------------------------------------------------------------		
//			
////			//--------------------------------------------------------------------------------		
////			BrowserSync();
//			html_refPolicyNumber().waitForExistence(10,  0.25);
////			//--------------------------------------------------------------------------------		
////			// Grab String Data to Extract Substrings For Comparison to Baseline Data
// 			String sStringData = (String)html_main().getProperty(".text");
////			//--------------------------------------------------------------------------------		
////			//--------------------------------------------------------------------------------		
////			// Grab Insurance policy (QUOTE REFERENCE) number:       S T A R T
////			//--------------------------------------------------------------------------------		
// 			String sStartName  = "Insurance policy number:"; 
// 			String sEndName  = "var loadContentDelay"; // (HIDDEN HMI STRING TEXT)
// 			int iIndex = 1;
////			//--------------------------------------------------------------------------------		
////			// Grab Value Off Of DONE Screen
//			//--------------------------------------------------------------------------------		
//			subString(sStringData, sStartName, sEndName, iIndex, sStartNameContent);
//			//--------------------------------------------------------------------------------	
//			String sActualQuoteReference = Common_Variables.sActual;
//			svTitle = "Insurance_Policy_Number"; sReport = sStartName;
//			//--------------------------------------------------------------------------------		
//			// Compare DONE Value With Initial QUOTE Page Value
//			//--------------------------------------------------------------------------------		
//			//                      |------- Actual -------|------- Expected -------|      
//			VerifyandReport(svTitle, sActualQuoteReference, sExpectedQuoteReference, sReport);
//			//--------------------------------------------------------------------------------		
//			// Grab Insurance policy (QUOTE REFERENCE) number:         E N D
//	 		//--------------------------------------------------------------------
//			//--------------------------------------------------------------------------------		
//			// Grab Insurance policy (ACTUAL) number:       S T A R T
//			//--------------------------------------------------------------------------------		
//			String sActualPolicyNumber_Text = (String)html_refPolicyNumber().getProperty(".text");
//			//--------------------------------------------------------------------------------		
//			logTestResult(" ACTUAL POLICY NUMBER = "+sActualPolicyNumber_Text, true);
//			System.out.println(" ACTUAL POLICY NUMBER = "+sActualPolicyNumber_Text); 
//			//--------------------------------------------------------------------------------		
//			// Grab Insurance policy (ACTUAL) number:         E N D
//	 		//--------------------------------------------------------------------
//			//--------------------------------------------------------------------------------		
//			// Registration Number:       S T A R T
//			//--------------------------------------------------------------------------------		
//			sStartName = "Registration number:"; sEndName = "Driving restrictions:";
//			//--------------------------------------------------------------------------------		
//			subString(sStringData, sStartName, sEndName, iIndex, sStartNameContent);
//			//--------------------------------------------------------------------------------	
//			String sActualRegNumber = Common_Variables.sActual;
//			svTitle = "Registration_Number"; sReport = sStartName;
//			//--------------------------------------------------------------------------------		
//			// Compare DONE Value With Initial CAR Value
//			//--------------------------------------------------------------------------------	
//			//                      |---- Actual ----|---- Expected ----|      
//			VerifyandReport(svTitle, sActualRegNumber, sExpectedRegNumber, sReport);
//			//--------------------------------------------------------------------------------		
//			// Registration Number:         E N D
//	 		//--------------------------------------------------------------------
//			//--------------------------------------------------------------------------------		
//			// Driving restrictions:       S T A R T
//			//--------------------------------------------------------------------------------		
//			sStartName = "Driving restrictions:"; sEndName = "Cover:";
//			//--------------------------------------------------------------------------------		
//			subString(sStringData, sStartName, sEndName, iIndex, sStartNameContent);
//			//--------------------------------------------------------------------------------	
//			String sActualDriverRestrictions = Common_Variables.sActual;
//			svTitle = "Driver_Policy_Restrictions"; sReport = sStartName;
//			//--------------------------------------------------------------------------------		
//			// Compare DONE Value With Initial CAR Value
//			//--------------------------------------------------------------------------------	
//			//                      |---------- Actual ----------|-------- Expected --------|      
//			VerifyandReport(svTitle, sActualDriverRestrictions,  sExpectedDriverRestrictions, sReport);
//			//--------------------------------------------------------------------------------		
//			// Driving restrictions:          E N D
//	 		//--------------------------------------------------------------------
//			//--------------------------------------------------------------------------------		
//			// Cover Type:       S T A R T
//			//--------------------------------------------------------------------------------		
//			sStartName = "Cover:"; sEndName = "Cover starts:";
//			//--------------------------------------------------------------------------------		
//			subString(sStringData, sStartName, sEndName, iIndex, sStartNameContent);
//			//--------------------------------------------------------------------------------	
//			String sActualCoverType = Common_Variables.sActual;
//			svTitle = "Cover_Type"; sReport = sStartName;
//			//--------------------------------------------------------------------------------		
//			// Compare DONE Value With Initial CAR Value
//			//--------------------------------------------------------------------------------	
//			//                      |----- Actual -----|----- Expected -----|      
//			VerifyandReport(svTitle, sActualCoverType,  sExpectedCoverType, sReport);
//			//--------------------------------------------------------------------------------		
//			// Cover Type:         E N D
//	 		//--------------------------------------------------------------------
//			//--------------------------------------------------------------------------------		
//			// Cover starts:       S T A R T
//			//--------------------------------------------------------------------------------		
//			sStartName = "Cover starts:"; sEndName = "Renewal date:";
//			//--------------------------------------------------------------------------------		
//			subString(sStringData, sStartName, sEndName, iIndex, sStartNameContent);
//			//--------------------------------------------------------------------------------	
//			String sActualCoverStart = Common_Variables.sActual;
//			svTitle = "Cover_Start_Date"; sReport = sStartName;
//			//--------------------------------------------------------------------------------		
//			// Compare DONE Value With Initial CAR Value
//			//--------------------------------------------------------------------------------	
//			//                      |----- Actual -----|----- Expected -----|      
//			VerifyandReport(svTitle, sActualCoverStart,  sExpectedCoverStart, sReport);
//			//--------------------------------------------------------------------------------		
//			// Cover starts:         E N D
//	 		//--------------------------------------------------------------------
//			//--------------------------------------------------------------------------------		
//			// Renewal date:       S T A R T
//			//--------------------------------------------------------------------------------		
//			sStartName = "Renewal date:"; sEndName = "Policy price";
//			//--------------------------------------------------------------------------------		
//			subString(sStringData, sStartName, sEndName, iIndex, sStartNameContent);
//			//--------------------------------------------------------------------------------	
//			String sActualRenewalDate = Common_Variables.sActual;
//			svTitle = "Cover_Renewal_Date"; sReport = sStartName;
//			//--------------------------------------------------------------------------------		
//			// Compare DONE Value With Initial CAR Value
//			//--------------------------------------------------------------------------------	
//			//                      |------ Actual ------|----- Expected -----|      
//			VerifyandReport(svTitle, sActualRenewalDate,  sExpectedRenewalDate, sReport);
//			//--------------------------------------------------------------------------------		
//			// Renewal date:        E N D
//	 		//--------------------------------------------------------------------
//			//--------------------------------------------------------------------------------		
//			// Policy price       S T A R T
//			//--------------------------------------------------------------------------------		
//			sStartName = "Policy price"; sEndName = "Credit card charge";
//			//--------------------------------------------------------------------------------		
//			subString(sStringData, sStartName, sEndName, iIndex, sStartNameContent);
//			//--------------------------------------------------------------------------------	
//			String sActualPolicyPrice = Common_Variables.sActual;
//			svTitle = "Cover_Policy_Price"; sReport = sStartName;
//			//--------------------------------------------------------------------------------		
//			// Compare DONE Value With Initial CAR Value                  
//			//--------------------------------------------------------------------------------	
//			//                      |------ Actual ------|----- Expected -----|      
//			VerifyandReport(svTitle, sActualPolicyPrice, sExpectedPolicyPrice, sReport);
//			
//			//--------------------------------------------------------------------------------		
//			// Policy price       E N D
//	 		//--------------------------------------------------------------------
//			//--------------------------------------------------------------------------------		
//			// Credit card charge       S T A R T
//			//--------------------------------------------------------------------------------		
//			sStartName = "Credit card charge"; sEndName = "Total cost";
//			//--------------------------------------------------------------------------------		
//			subString(sStringData, sStartName, sEndName, iIndex, sStartNameContent);            
//			//--------------------------------------------------------------------------------	
//			String sActualCCCharge = Common_Variables.sActual;
//			svTitle = "Credit_Card_Charge"; sReport = sStartName;
//			// Tidy Expected
//			removeStringDebris(sExpectedPolicyPrice);  	// Leading £
//			sExpectedPolicyPrice = Common_Variables.sActual;			
//			// Tidy Actual
//			removeStringDebris(sActualCCCharge);  		// Leading £
//			sActualCCCharge = Common_Variables.sActual;			
//			// Double Conversion From String To Enable Math
//			double dExpectedPolicyPrice = Double.parseDouble(sExpectedPolicyPrice);
//			double dActualCCCharge = Double.parseDouble(sActualCCCharge);
//			double dExpectedCCCharge = Double.parseDouble(sExpectedCCCharge);
//			//  Percentage of Total Calculated
//			double dCardCharge = (dExpectedPolicyPrice * dExpectedCCCharge)/100;
//			// Revert Back To String
//			sExpectedCCCharge = new Double(dCardCharge).toString();
//			// Rounding 2 Significants
//			round2SigFigs(sExpectedCCCharge,sExpectedCCCharge);
//			sExpectedCCCharge = Common_Variables.sActual;
//			//--------------------------------------------------------------------------------		
//			// Compare DONE Value With Initial CAR Value
//			//--------------------------------------------------------------------------------	
//			//                      |---- Actual ----|------ Expected ------|      
//			VerifyandReport(svTitle, sActualCCCharge,  sExpectedCCCharge, sReport);              
//			//--------------------------------------------------------------------------------		
//			// Credit card charge        E N D
//	 		//--------------------------------------------------------------------
//			//--------------------------------------------------------------------------------		
//			// Total cost       S T A R T
//			//--------------------------------------------------------------------------------		
//			sStartName = "Total cost"; sEndName = "How to access";
//			//--------------------------------------------------------------------------------		
//			subString(sStringData, sStartName, sEndName, iIndex, sStartNameContent);
//			//--------------------------------------------------------------------------------	
//			String sActualTotalCost = Common_Variables.sActual;
//			svTitle = "Total_Cost"; sReport = sStartName;
//			//--------------------------------------------------------------------------------		
//			// Compare DONE Value With Initial CAR Value
//			//--------------------------------------------------------------------------------	
//			//                      |----- Actual -----|----- Expected -----|      
//			VerifyandReport(svTitle, sActualTotalCost,  sExpectedTotalCost, sReport);            
//			
////			// FAILED - 	Total cost Result Was £590.43 But Expected
//			//--------------------------------------------------------------------------------		
//			// Total cost        E N D
//	 		//--------------------------------------------------------------------
//			//--------------------------------------------------------------------------------		
//			// VERIFY SUBTOTALS == TOTAL         S T A R T
//	 		//--------------------------------------------------------------------
//			svTitle = "Accross_Page_Cost_Totals"; sReport = "Accross Page Cost Totals";
//			// Remove £(s) and Spaces Before Summation
//			removeStringDebris(sActualCCCharge); sActualCCCharge = Common_Variables.sActual;
//			removeStringDebris(sActualPolicyPrice); sActualPolicyPrice = Common_Variables.sActual;
//	 		//--------------------------------------------------------------------
//			// Convert From String To Double Then Round To Sum The Subs
//			dActualCCCharge = Double.parseDouble(sActualCCCharge);
//			double dActualPolicyPrice = Double.parseDouble(sActualPolicyPrice);
//	 		//--------------------------------------------------------------------
//			// Add The Subs
//			double dCalculatedTotalCost = dActualCCCharge + dActualPolicyPrice;
//	 		//--------------------------------------------------------------------
//			// Back From Double To String And Verify Match
//			String sCalculatedTotalCost = Double.toString(dCalculatedTotalCost);
//			// removeStringDebris(sCalculatedTotalCost); 
//			round2SigFigs(sCalculatedTotalCost, sCalculatedTotalCost);
//			sCalculatedTotalCost = Common_Variables.sActual;
//			//--------------------------------------------------------------------
//			//                      |----- Actual -----|----- Expected -----|      
//			VerifyandReport(svTitle, sActualTotalCost, "£"+sCalculatedTotalCost, sReport);
//			//--------------------------------------------------------------------------------		
//			// VERIFY TOTAL FROM YOUR QUOTE PAGE TO DONE PAGE          S T A R T
//	 		//--------------------------------------------------------------------
//			svTitle = "Total_Price_QUOTE_to_DONE_Page"; sReport = "Total Price QUOTE to DONE Page";
//			// Remove Non Numerical Data From String
//			removeStringDebris(sActualTotalCost);
//			sActualTotalCost = Common_Variables.sActual;
//					
//			removeStringDebris(sExpectedTotalCost); sExpectedTotalCost = Common_Variables.sActual;
//			//--------------------------------------------------------------------
//			//                      |----- Actual -----|----- Expected -----|      
//			VerifyandReport(svTitle, sActualTotalCost, sExpectedTotalCost, sReport);
//			//--------------------------------------------------------------------------------		
//			// VERIFY TOTAL FROM YOUR QUOTE PAGE TO DONE PAGE           E N D
//	 		//--------------------------------------------------------------------
//			svTitle = "Thank_You_For_Buying"; sReport = "Thank You For Buying";
//			//--------------------------------------------------------------------
//			// Scrape Following Screen (BOOST YOUR COVER) for ACTUAL Value to Compare
//			sActual = (String)html_main().getProperty(".text");
//			if (sActual.contains("Thank you for buying AA Car Insurance")){
//				sActual = "Thank you for buying";
//			}
//			//--------------------------------------------------------------------
//			// Verify Success on your Details (YOUR DETAILS SCREEN APPEARANCE)
//			//            |----- Actual -----|----- Expected -----|      
//			VerifyandReport(sTitle, sExpected, sActual, sReport);
//			//--------------------------------------------------------------------
//			// END OF YOUR DONE DETAILS
//			//--------------------------------------------------------------------
			 
			
			
			
			
			//----------------------------------------------------------------------					
			// Integer to Date -  0 = Today, 1 = Tomorrow, -1 = Yesterday
			//----------------------------------------------------------------------		
			// Test Data
			// Common_Variables.EBC_tripFutureStartDay = 333;
			// Test Data
			//----------------------------------------------------------------------		
//			// REUSE OF EBC TRANSPORT - Grab Integer - 0 - Today
//			int iFutureStartDate = Common_Variables.EBC_tripFutureStartDay;
//			//----------------------------------------------------------------------		
//			// HMI DATE FORMAT
//			DateTimeFormatter fmt = DateTimeFormat.forPattern("EEE dd MMM yyyy");
//			//----------------------------------------------------------------------		
//			// Define Transport	
//			Date d1 = null;                         	// DATUM
//			DateTime dtSD = new DateTime(d1); 			// Starting Day
//			DateTime dtED = new DateTime(d1);			// Ending Day
//			DateTime dt1 = new DateTime(d1);  			// Starting Day/Date
//			dtSD = dt1.plusDays(iFutureStartDate);		// offset from today :-) - 0 = today
//			dtED = dt1.plusDays(iFutureStartDate+365);	// 1 Year on - Leap Years?
//			//----------------------------------------------------------------------
//			String sPolicyStartDate = fmt.print(dtSD);
//			String sPolicyEndDate = fmt.print(dtED);
//			//----------------------------------------------------------------------
//			System.out.println("Policy Start Date "+sPolicyStartDate+" Policy End Date "+sPolicyEndDate); 	// Tue 28 July 2015
//			// PUT For Reuse	
//			Common_Variables.coverStartDate = sPolicyStartDate;
//			Common_Variables.coverStartDate = sPolicyEndDate;
//			//----------------------------------------------------------------------
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			// ROAD BREAKDOWN
			
			//Main member

			//MR JULIAN TIAMWDKMFOZ

			//Cover

//			String sStartName = "Main member"; //"Membership number";
//			String sEndName = "Cover"; //"Main member";
//			String sStartNameContent = ""; // 
//			int iIndex = 1;
//	
//			String sContainer_Text = (String)html_container().getProperty(".text");
//
//			
//			sleep(5);
//			
//			// EXTRACT SUBTRING
//		    // Text String To Search | Find item | To Marker | Find Item index | Returned Item |
//			subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);
//			
//			//System.out.println(sStartNameContent);
//
//			String sReportName = "Main_Member";
//			String sExpected = "MR JULIAN TIAMWDKMFOZ"; // Z
//			// VERIFY SUBSTRING AGAINST EXPECTED VALUE
//	 		//------------------------------------------------------------
//			VerifyandReport(sReportName, Common_Variables.sActual, sExpected.trim(), sStartName);
//			//------------------------------------------------------------

			
			
			
			//			callScript("BreakDown_Cover_MK2.BreakDown_Cover");
//			
//			callScript("BreakDown_Cover_MK2.Vehicle_Details");
//			
//			callScript("BreakDown_Cover_MK2.Personal_Details");
//		
//			callScript("BreakDown_Cover_MK2.Special_Offers");
//			
//			callScript("BreakDown_Cover_MK2.Buy_Cover");
//
//			callScript("BreakDown_Cover_MK2.Confirmation");

			//			// DEBUG Angular Motor
//			// https://prelive9.theaa.com/car-insurance/buy/car-details
//			
//			callScript("Road_MK2.The_Car");
//			System.gc();
//			callScript("Road_MK2.Your_Details");
//			System.gc();
//			callScript("Road_MK2.Your_Quote");
//			System.gc();
//			callScript("Road_MK2.Boost_Your_Cover");
//			System.gc();
//			callScript("Road_MK2.Additional_Car_Details");
//			System.gc();
//			callScript("Road_MK2.Check_Your_Details");
//			System.gc();
//			callScript("Road_MK2.Your_Card_Payment");
//			System.gc();
//			callScript("Road_MK2.Payment_Submit");
//			System.gc();
//			callScript("Road_MK2.Thank_You_For_Buying");
		
//			Common_Variables.xmlAffinity = "comparethemarket";
//			// ---------------------------------------------------------------------------------
//			// NOT CTM? - Re-sample To Show Updated HMI for BUILDINGS AND CONTENTS ONLY
//			if (!Common_Variables.xmlAffinity.contains("comparethemarket")){
//				System.out.println("Dodad");
//				//callScript("Aggregators.Home.Retrieve_Home_Contents");
//				
//			}
//			else {
//				System.out.println("Dodad Didn't Work");
//
//			}
			// ---------------------------------------------------------------------------------

			
//			String selectedEnvironment = Common_Variables.selectedEnvironment;
//			selectedEnvironment = "prelive1.theaa.com";
//			
//	        String sXML = selectedEnvironment+"/aaservlet/InsuranceXMLQuote?xmlString=%3CAAInsurance%20xmlns%3Axsi%3D%22http%3A//www.w3.org/2001/XMLSchema-instance%22%20suppressmailings%3D%22N%22%20coverstartdate%3D%222015-05-04%22%20coverperiod%3D%220%22%20affinity%3D%22COMPARETHEMARKETP%22%20volexcess%3D%224%22%20xsi%3AnoNamespaceSchemaLocation%3D%22http%3A//10.192.51.27%3A80/schemas/AAInsurance.xsd%22%3E%3Chome%3E%3Cresponse%20code%3D%2209%22%3EPrice%20comparison%20website%3C/response%3E%3Cproposer%20dob%3D%221960-12-30%22%20firsttimebuyer%3D%22N%22%3E%3Cname%20title%3D%22MR%22%20firstname%3D%22TESTERFIRSTNAME%22%20lastname%3D%22TESTERSURNAME%22%20/%3E%3Coccupation%3E%3Cfulltimeocc%20code%3D%22157%22%3EComputer%20-%20Analyst%3C/fulltimeocc%3E%3Cfulltimebus%20code%3D%2215%22%3EBanking%3C/fulltimebus%3E%3C/occupation%3E%3Caddress%20line1%3D%2250%22%20line2%3D%22Basingstoke%22%20line3%3D%22Hampshire%22%20postcode%3D%22RG24%209PS%22%3E%3C/address%3E%3Ccontact%20/%3E%3C/proposer%3E%3Cbuilding%20marketvalue%3D%22150000%22%20bedroomcount%3D%222%22%20occupiedday%3D%22N%22%20smokedetector%3D%22Y%22%20neighbourwatch%3D%22Y%22%20nacossalarm%3D%22Y%22%20doorwindowlocks%3D%22Y%22%20patiodoorlocks%3D%22Y%22%3E%3Cpreviousinsurer%20code%3D%2273%22%3ENorthern%20Rock%3C/previousinsurer%3E%3Cpropertytype%20type%3D%22B%22%3ETerraced%3C/propertytype%3E%3Cpropertyage%20code%3D%228%22%3E2000%20Onwards%3C/propertyage%3E%3Cmortgage%20code%3D%221255%22%3EC%26amp%3BG%20Guardian%20Division%3C/mortgage%3E%3C/building%3E%3Ccontents%20worldwidecover%3D%22N%22%20accdamage%3D%22N%22%3E%3Cpreviousinsurer%20code%3D%2273%22%3ENorthern%20Rock%3C/previousinsurer%3E%3Clevelofcover%20code%3D%223%22%3EUp%20To%2040000%3C/levelofcover%3E%3Citems%3E%3Citem%20value%3D%222000%22%20coverrequired%3D%22N%22%3ETie%20slide%3C/item%3E%3Citem%20value%3D%221800%22%20coverrequired%3D%22Y%22%3Egrandfather%20clock%3C/item%3E%3C/items%3E%3C/contents%3E%3C/home%3E%3C/AAInsurance%3E";
//			
//			// Tidy Before Start
//			CloseAllBrowsers();		
//			sleep(2);
//			// Start IE
//
//			startBrowser("iE", sXML);

			//waitingForTheaa().i
			
/*			String sText = "";
			boolean bPageLoaded = false;
			
			while (!bPageLoaded);{
				sleep(2.0);
				sText = (String) iE().getProperty(".description");
				if (sText.contains("waiting")){
					bPageLoaded = false;
					System.out.println("Browser Page Loading");
				}
				else{
					bPageLoaded = true;
					System.out.println("Browser Page Load Success");
				}
			}
*/			
			unregisterAll();	
//			www.prelive1.theaa.com/aaservlet/InsuranceXMLQuote?xmlString=%3CAAInsurance%20xmlns%3Axsi%3D%22http%3A//www.w3.org/2001/XMLSchema-instance%22%20suppressmailings%3D%22N%22%20coverstartdate%3D%222015-05-04%22%20coverperiod%3D%220%22%20affinity%3D%22COMPARETHEMARKETP%22%20volexcess%3D%224%22%20xsi%3AnoNamespaceSchemaLocation%3D%22http%3A//10.192.51.27%3A80/schemas/AAInsurance.xsd%22%3E%3Chome%3E%3Cresponse%20code%3D%2209%22%3EPrice%20comparison%20website%3C/response%3E%3Cproposer%20dob%3D%221960-12-30%22%20firsttimebuyer%3D%22N%22%3E%3Cname%20title%3D%22MR%22%20firstname%3D%22TESTERFIRSTNAME%22%20lastname%3D%22TESTERSURNAME%22%20/%3E%3Coccupation%3E%3Cfulltimeocc%20code%3D%22157%22%3EComputer%20-%20Analyst%3C/fulltimeocc%3E%3Cfulltimebus%20code%3D%2215%22%3EBanking%3C/fulltimebus%3E%3C/occupation%3E%3Caddress%20line1%3D%2250%22%20line2%3D%22Basingstoke%22%20line3%3D%22Hampshire%22%20postcode%3D%22RG24%209PS%22%3E%3C/address%3E%3Ccontact%20/%3E%3C/proposer%3E%3Cbuilding%20marketvalue%3D%22150000%22%20bedroomcount%3D%222%22%20occupiedday%3D%22N%22%20smokedetector%3D%22Y%22%20neighbourwatch%3D%22Y%22%20nacossalarm%3D%22Y%22%20doorwindowlocks%3D%22Y%22%20patiodoorlocks%3D%22Y%22%3E%3Cpreviousinsurer%20code%3D%2273%22%3ENorthern%20Rock%3C/previousinsurer%3E%3Cpropertytype%20type%3D%22B%22%3ETerraced%3C/propertytype%3E%3Cpropertyage%20code%3D%228%22%3E2000%20Onwards%3C/propertyage%3E%3Cmortgage%20code%3D%221255%22%3EC%26amp%3BG%20Guardian%20Division%3C/mortgage%3E%3C/building%3E%3Ccontents%20worldwidecover%3D%22N%22%20accdamage%3D%22N%22%3E%3Cpreviousinsurer%20code%3D%2273%22%3ENorthern%20Rock%3C/previousinsurer%3E%3Clevelofcover%20code%3D%223%22%3EUp%20To%2040000%3C/levelofcover%3E%3Citems%3E%3Citem%20value%3D%222000%22%20coverrequired%3D%22N%22%3ETie%20slide%3C/item%3E%3Citem%20value%3D%221800%22%20coverrequired%3D%22Y%22%3Egrandfather%20clock%3C/item%3E%3C/items%3E%3C/contents%3E%3C/home%3E%3C/AAInsurance%3E";

			
			
			//iE().
			///
			 
			// while ()
			//sleep(10);
			
			
			// BrowserSync();
			
//			String sURL  = "http://www.theaa.com/aaservlet/InsuranceXMLQuote?xmlString=%3C%3Fxml%20version%3D%221.0%22%20encoding%3D%22utf-8%22%3F%3E%3CAAInsurance%20xsi%3AnoNamespaceSchemaLocation%3D%22http%3A//10.192.51.16%3A80/schemas/AAInsurance.xsd%22%20coverstartdate%3D%222015-04-28%22%20coverperiod%3D%220%22%20suppressmailings%3D%22N%22%20affinity%3D%22GOCOMPARE%22%20volexcess%3D%2204X%22%20xmlns%3Axsi%3D%22http%3A//www.w3.org/2001/XMLSchema-instance%22%20xmlns%3Aref%3D%22http%3A//callconnection.co.uk/referencedata%22%20xmlns%3Ahelper%3D%22urn%3AXsltHelper%22%20xmlns%3AabiManager%3D%22urn%3AAbiCodeManager%22%3E%3Cmotor%3E%3Cquotetype%20code%3D%221%22%3ENon-PCND%3C/quotetype%3E%3Clevelofcover%20code%3D%221%22%3E%3C/levelofcover%3E%3Cresponse%20code%3D%2209%22%3EPrice%20comparison%20website%3C/response%3E%3Cpreviousinsurer%20code%3D%22500%22%20expiry%3D%222013-12-22%22%20yearsnoclaims%3D%222%22%3EUnknown/Other%3C/previousinsurer%3E%3Cproposer%3E%3Cvehicleusage%20code%3D%221%22%3ESocialAndCommuting%3C/vehicleusage%3E%3Caddress%20line1%3D%2278%22%20line2%3D%22A%22%20line3%3D%22A%22%20line4%3D%22A%22%20postcode%3D%22RG1%202ns%22%20/%3E%3Ccontact%3E%3Ctelephone%20type%3D%22home%22%3E01234567890%3C/telephone%3E%3Cemail%20type%3D%22home%22%3Edotcomtester@theaa.com%3C/email%3E%3C/contact%3E%3Cdriver%20dob%3D%221960-03-02%22%20othervehicle%3D%22N%22%3E%3Cname%20firstname%3D%22TESTERFIRSTNAME%22%20lastname%3D%22TESTERSURNAME%22%20title%3D%22Mrs%22%20/%3E%3Cmaritalstatus%20code%3D%222%22%3ESingle%3C/maritalstatus%3E%3Coccupation%3E%3Cfulltimeocc%20code%3D%22264%22%3EAccounts%20Clerk%3C/fulltimeocc%3E%3Cfulltimebus%20code%3D%22304%22%3ECourier%20Services%3C/fulltimebus%3E%3C/occupation%3E%3Clicence%20code%3D%221%22%20held%3D%229%22%20unit%3D%22Y%22%20/%3E%3C/driver%3E%3C/proposer%3E%3Cvehicle%20purchasedate%3D%222008-05-01%22%20value%3D%22999%22%20annualmileage%3D%223000%22%20registration%3D%22E30MER%22%20regyear%3D%221988%22%3E%3Cwherekept%20code%3D%222%22%20/%3E%3Cabi%20code%3D%2253536402%22%3E1988%2C%20GOLF%20GTI%2C%201781cc%2C%205%20Door%2C%20Petrol%2C%20Manual%3C/abi%3E%3C/vehicle%3E%3C/motor%3E%3C/AAInsurance%3E";
//
//			//http://www.theaa.com/aaservlet/InsuranceXMLQuote?xmlString=%3C%3Fxml%20version%3D%221.0%22%20encoding%3D%22utf-8%22%3F%3E%3CAAInsurance%20xsi%3AnoNamespaceSchemaLocation%3D%22http%3A//10.192.51.16%3A80/schemas/AAInsurance.xsd%22%20coverstartdate%3D%222015-04-28%22%20coverperiod%3D%220%22%20suppressmailings%3D%22N%22%20affinity%3D%22GOCOMPARE%22%20volexcess%3D%2204X%22%20xmlns%3Axsi%3D%22http%3A//www.w3.org/2001/XMLSchema-instance%22%20xmlns%3Aref%3D%22http%3A//callconnection.co.uk/referencedata%22%20xmlns%3Ahelper%3D%22urn%3AXsltHelper%22%20xmlns%3AabiManager%3D%22urn%3AAbiCodeManager%22%3E%3Cmotor%3E%3Cquotetype%20code%3D%221%22%3ENon-PCND%3C/quotetype%3E%3Clevelofcover%20code%3D%221%22%3E%3C/levelofcover%3E%3Cresponse%20code%3D%2209%22%3EPrice%20comparison%20website%3C/response%3E%3Cpreviousinsurer%20code%3D%22500%22%20expiry%3D%222013-12-22%22%20yearsnoclaims%3D%222%22%3EUnknown/Other%3C/previousinsurer%3E%3Cproposer%3E%3Cvehicleusage%20code%3D%221%22%3ESocialAndCommuting%3C/vehicleusage%3E%3Caddress%20line1%3D%2278%22%20line2%3D%22A%22%20line3%3D%22A%22%20line4%3D%22A%22%20postcode%3D%22RG1%202ns%22%20/%3E%3Ccontact%3E%3Ctelephone%20type%3D%22home%22%3E01234567890%3C/telephone%3E%3Cemail%20type%3D%22home%22%3Edotcomtester@theaa.com%3C/email%3E%3C/contact%3E%3Cdriver%20dob%3D%221960-03-02%22%20othervehicle%3D%22N%22%3E%3Cname%20firstname%3D%22TESTERFIRSTNAME%22%20lastname%3D%22TESTERSURNAME%22%20title%3D%22Mrs%22%20/%3E%3Cmaritalstatus%20code%3D%222%22%3ESingle%3C/maritalstatus%3E%3Coccupation%3E%3Cfulltimeocc%20code%3D%22264%22%3EAccounts%20Clerk%3C/fulltimeocc%3E%3Cfulltimebus%20code%3D%22304%22%3ECourier%20Services%3C/fulltimebus%3E%3C/occupation%3E%3Clicence%20code%3D%221%22%20held%3D%229%22%20unit%3D%22Y%22%20/%3E%3C/driver%3E%3C/proposer%3E%3Cvehicle%20purchasedate%3D%222008-05-01%22%20value%3D%22999%22%20annualmileage%3D%223000%22%20registration%3D%22E30MER%22%20regyear%3D%221988%22%3E%3Cwherekept%20code%3D%222%22%20/%3E%3Cabi%20code%3D%2253536402%22%3E1988%2C%20GOLF%20GTI%2C%201781cc%2C%205%20Door%2C%20Petrol%2C%20Manual%3C/abi%3E%3C/vehicle%3E%3C/motor%3E%3C/AAInsurance%3E
//	
//			RootTestObject root = getRootTestObject();
//			TestObject[] testobj = root.find(atDescendant(".class", "Html.HtmlBrowser"));
//			BrowserTestObject bto;
//			bto = new BrowserTestObject(testobj[0]);
//			bto.loadUrl(sURL);
//			sleep(3);
//
//			startBrowser(sURL);
//			BrowserSync();
//			sleep(3);
//
//			RootTestObject root = getRootTestObject();
//			TestObject[] testobj = root.find(atDescendant(".class", "Html.HtmlBrowser")); //.class:  Html.HtmlBrowser
//			
//			BrowserTestObject bto;
//			
//			sleep(5);
//			BrowserSync();
//			
//			boolean success =  false;
//			while (!success){
//						
//				try {
//					bto = new BrowserTestObject(testobj[0]);
//					sleep(10);	
//					bto.loadUrl(sURL);
//					success = true;
//				} catch (ArrayIndexOutOfBoundsException e) {
//					success =  false;
//					//e.printStackTrace();
//				}
//			logInfo("URL Load Success = "+success);
//			}
//			BrowserSync();
//			//sleep(5);
//
//			unregisterAll();
//
//			
//			//startBrowser(sURL);
//			//BrowserSync();
//			//sleep(3);
//
//			//RootTestObject root = getRootTestObject();
//			//TestObject[] testobj = root.find(atDescendant(".class", "Html.HtmlBrowser"));
//			
//			//BrowserTestObject bto;
//			
//			//sleep(10);
//			//BrowserSync();
//			
//			//boolean success =  false;
//			//while (!success){
//						
//			//try {
//			//bto = new BrowserTestObject(testobj[0]);
//				
//			sleep(5);
//
//			iE().loadUrl(sURL);
//			//	success = true;
//			//} catch (ArrayIndexOutOfBoundsException e) {
//			//	success =  false;
//				//e.printStackTrace();
//			//}
//			//logInfo("URL Load Success = "+success);
//			//}
//			BrowserSync();
//			
//			
//			sleep(5);
//
//			unregisterAll();
//			String sQuoteDetails = (String)html_aside().getProperty(".contentText");
//
//			Common_Variables.xmlInstalmentAmount = "38.99";		
//			Common_Variables.MLA = "2.44";
//
//			String sMotorLegalAssistance = "";
//			Double dMotorLegalAssistance = null;
//			int i = 0;
//			try {
//				String[] sMla = sQuoteDetails.split("Motor Legal Assistance ");
//				
//				//i = (Common_Variables.xmlTotalAmount.length());
//				
//				String sMotorLA = sMla[2];  
//				i = (Common_Variables.MLA.length());
//				sMotorLegalAssistance = sMotorLA.substring(1, i+1);
//				
//				//double dCarInsuranceMonth = Double.parseDouble(sMotorLegalAssistance);
//				
//				//sMotorLegalAssistance = Math.round(sMotorLegalAssistance*100.0)/100.0;
//				
//				//-----------------
//				// NEED TO ADD MLA TO TOTAL MONTHLY INSURANCE COST (IF IT EXISTS)
//				// String to Double (For later addition to Insurance Monthly Total)
//				dMotorLegalAssistance = Double.parseDouble(sMotorLegalAssistance);
//				// Rounding 2 sig fig
//				dMotorLegalAssistance = Math.round(dMotorLegalAssistance*100.0)/100.0;
//				
//				System.out.println(" Monthly MLA = "+sMotorLegalAssistance.trim()+" dP  "+Common_Variables.MLA.trim()+" "+i);
//
//				
//				VerifyandReport("Monthly_Motor_Legal_Assistance", sMotorLegalAssistance.trim(), Common_Variables.MLA.trim(), " Motor Legal Assistance ");
//				
//				
//				//--------------------------------------------------------------------------------------------------------------------
//			} catch (Exception e) {
//				System.out.println(" Monthly MLA NOT DETECTED"); 
//				// e.printStackTrace();
//			}
//			//-----------------
//			// Car Insurance
//			i = (Common_Variables.xmlInstalmentAmount.length());
//			String[] sCim = sQuoteDetails.split("Pay monthly");
//			String sCarInsM = sCim[2]; String sCarInsuranceMonth = sCarInsM.substring(1, i); //1 +1
//			
//			
//			//String sMotorLegalAss = String.valueOf(sMotorLegalAssistance);
//			//String sCarInsMonth = String.valueOf(sCarInsuranceMonth);
//			
//			// String to Double
//			double dCarInsuranceMonth = Double.parseDouble(sCarInsuranceMonth);
//			
//			// Rounding 2 sig fig
//
//			dCarInsuranceMonth = Math.round(dCarInsuranceMonth*100.0)/100.0;
//
//			// ADD MLA TO INSURANCE COST (If it exists)
////			try{
//				dCarInsuranceMonth = dCarInsuranceMonth + dMotorLegalAssistance;
////			} catch (Exception e) {
////				System.out.println(" MLA NOT ADDED TO MONTHLY COST AS MLA NOT DETECTED"); 
//				// e.printStackTrace();
////			}
//			
//			// Double To String
//			sCarInsuranceMonth = Double.toString(dCarInsuranceMonth);
//
//			//-----------------
//			System.out.println(" MLA "+dMotorLegalAssistance+" Car Insurance Month = "+sCarInsuranceMonth+" Installment Amount "+Common_Variables.xmlInstalmentAmount);
//			VerifyandReport("Monthly_Car_Insurance_Cost", sCarInsuranceMonth.trim(), Common_Variables.xmlInstalmentAmount, " Car Insurance Monthly Subtotal Cost ");
 		}


			
			
		
	
	}
}


