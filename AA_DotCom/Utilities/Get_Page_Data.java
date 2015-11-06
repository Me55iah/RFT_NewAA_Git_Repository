package Utilities;
import resources.Common_Variables;
import resources.Utilities.Get_Page_DataHelper;
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
public class Get_Page_Data extends Get_Page_DataHelper
{
	/**
	 * Script Name   : <b>Get_Page_Data</b>
	 * Generated     : <b>29 Sep 2015 08:51:44</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/09/29
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
//		//------------------------------------------------------------------------------------------						
//		// Test Data
		
		//		String sVehicleType = "Car";//
//		String sVehicleReg = "WU61ZNE";// 
//		// Test Data
//		//------------------------------------------------------------------------------------------						
//		//------------------------------------------------------------------------------------------  
//		// Test Data
//		String sVehicleMake = "MAZDA";
//		String sVehicleModel = "2 SPORT D";
//		String sVehicleAbicode = "31539101";
//		String sVehicleRegYear = "2011";
//		String sVehicleNumberofDoors = "5";
//		String sVehicleDoorPlan = "5 DOOR HATCHBACK";
//		String sVehicleTransmissionType = "MANUAL";
//		String sVehicleEngineSize = "1560 CC";
//		String sRegistration_Value = "WU61ZNE";
//		String sVendorPostcode = "PO1 1DF";
//		// Test Data
//		//------------------------------------------------------------------------------------------  
//		// Debug Test Data Start   ************ COMMENT I AND OUT AS REQUIRED **********		
//		String sTitle = "Miss";
//		String sForename = "Donald";
//		String sSurname = "MacRonald";
//		String sHouseNumber = "1";
//		String sPostcode = "PO12 1LQ";		
//		String sPhoneNumber = "02392112233";
//		String sEmail = "donmacr@macdonalds.com";		
//		String sVendorName = "BAE";
//		String sVendorPhone = "0717234567";
//		//String sVendorPostcode = "PO1 1DF"; // Used in Vehicle Details
//		// Debug Test Data Start   ************ COMMENT I AND OUT AS REQUIRED **********		
//		//------------------------------------------------------------------------------------------
//		// Test Data
//		String sAAMember = "No";
//		String sQuoteType = "Basic";
//		// Test Data
//		//------------------------------------------------------------------------------------------
		// DP Connection
//		String sVehicleStatus = Common_Variables.vehicleStatus;
// 		String sTitle = Common_Variables.title;
// 		String sForename = Common_Variables.foreName;
// 		String sSurname = Common_Variables.surName;
// 		String sEmail = Common_Variables.eMail;
// 		String sPostcode = Common_Variables.postCode;
// 		String sPhoneNumber = Common_Variables.phoneNumber;
//		String sVehicleType = Common_Variables.vehicleType;
// 		String sVehicleReg = Common_Variables.vehicleReg;		
//		String sVehicleMake = Common_Variables.vehicleManufacturer;
//		String sVehicleModel = Common_Variables.vehicleModel;
//		String sVehicleAbicode = Common_Variables.abicode;
//		String sVehicleRegYear = Common_Variables.vehicleRegYear;
//		String sVehicleNumberofDoors = Common_Variables.vehicleNumberofDoors;
//		String sVehicleDoorPlan = Common_Variables.vehicleDoorPlan;
//		String sVehicleTransmissionType = Common_Variables.vehicleGears;
//		String sVehicleEngineSize = Common_Variables.vehicleEngineSize;
//		String sRegistration_Value = Common_Variables.vehicleReg;
//		String sVendorName = Common_Variables.vendorName;
//		String sVendorPostcode = Common_Variables.vendorPostcode;
//		String sAAMember = Common_Variables.membershipYN;
//		String sQuoteType = Common_Variables.quoteType;
		// DP Connection
		//------------------------------------------------------------------------------------------

		
		//------------------------------------------------------------------------------------------
		// Capture Quote Summary Details
		//------------------------------------------------------------------------------------------
//		// Capture Cost (Discernable TestBox Element
//		String sInspectionPrice_Text = (String)html_priceFull().getProperty(".text");		
//		logTestResult("Vehicle Inspection Quote Price Is "+sInspectionPrice_Text, true);
//		System.out.println("Vehicle Inspection Quote Price IS "+sInspectionPrice_Text);
//		logTestResult("The Vehicle ("+sVehicleReg+") is Less Than "+sVehicleStatus+" Years Old ", true);
//		System.out.println("The Vehicle ("+sVehicleReg+") is Less Than "+sVehicleStatus+" Years Old");
		//------------------------------------------------------------------------------------------
		// Store for Compare after PL Purchase
		//------------------------------------------------------------------------------------------
//		Common_Variables.inspectionQuotePrice = sInspectionPrice_Text;
		//------------------------------------------------------------------------------------------
		
//		// DP HookUp
//		//----------------------------------		
//		String sTotalMonthlyPayment = Common_Variables.sM2_TotalMonthlyPayment;
//		String sTotalAnnualPayment = Common_Variables.sM2_TotalAnnualPayment;
//		//----------------------------------		
//		String sCarInsurance = Common_Variables.sM2_CarInsurance;	
//		String sProtectedNoClaimsDiscount = Common_Variables.sM2_ProtectedNoClaimsBonus;		
//		String sExcessProtection = Common_Variables.sM2_ExcessProtection;		
//		String sMotorLegalAssistance = Common_Variables.sM2_MotorLegalAssistance;		
//		String sCarHire = Common_Variables.sM2_CarHire;
//		String sMotorAccidentPlan = Common_Variables.sM2_MotorAccidentPlan;
//		String sBreakdownCover = Common_Variables.sM2_BreakdownCover;
//		//----------------------------------
//		String sPolicyCashPrice = Common_Variables.sM2_PolicyCashPrice;
//		//----------------------------------
//		String sInitialCardPayment = Common_Variables.sM2_InitialCardPayment;
//		String s11MonthlyPayments = Common_Variables.sM2_11MonthlyPayments;
//		String sTotalMonthlyPayments = Common_Variables.sM2_TotalMonthlyPayments;
//		String sTotalCredit = Common_Variables.sM2_TotalCredit;
//		String sTotalPayable = Common_Variables.sM2_TotalPayable;
//		String sFixedInterestRate = Common_Variables.sM2_FixedInterestRate;
//		String sRepresentativeAPR = Common_Variables.sM2_RepresentativeAPR;		
//		//----------------------------------
//		// DP HookUp

		
		
		Common_Variables.sM2_TotalMonthlyPayment = "";
		Common_Variables.sM2_TotalAnnualPayment = "";
		Common_Variables.sM2_CarInsurance = "";
		Common_Variables.sM2_ProtectedNoClaimsBonus = "";
		Common_Variables.sM2_MotorLegalAssistance = "";
		Common_Variables.sM2_ExcessProtection = "";
		Common_Variables.sM2_CarHire = "";
		Common_Variables.sM2_MotorAccidentPlan = "";
		Common_Variables.sM2_BreakdownCover = "";
		Common_Variables.sM2_PolicyCashPrice = "";
		Common_Variables.sM2_InitialCardPayment = "";
		Common_Variables.sM2_11MonthlyPayments = "";
		Common_Variables.sM2_TotalMonthlyPayments = "";
		Common_Variables.sM2_TotalCredit = "";
		Common_Variables.sM2_TotalPayable = "";
		Common_Variables.sM2_FixedInterestRate = "";
		Common_Variables.sM2_RepresentativeAPR = "";
		
		
		//----------------------------------		
		String sTotalMonthlyPayment = "";
		String sTotalAnnualPayment = "";
		//----------------------------------		
		String sCarInsurance = "";	
		String sProtectedNoClaimsDiscount = "";		
		String sExcessProtection = "";		
		String sMotorLegalAssistance = "";		
		String sCarHire = "";
		String sMotorAccidentPlan = "";
		String sBreakdownCover = "";
		//----------------------------------
		String sPolicyCashPrice = "";
		//----------------------------------
		String sInitialCardPayment = "";
		String s11MonthlyPayments = "";
		String sTotalMonthlyPayments = "";
		String sTotalCredit = "";
		String sTotalPayable = "";
		String sFixedInterestRate = "";
		String sRepresentativeAPR = "";		
		//----------------------------------
		
		// MONTHLY DATA
		
		// String Data with Embedded Elements
		//List<List<String>> lCheckContains = new ArrayList<List<String>>();
		String [][] sPageElementLookUp = {
			//--------------------------------------------------------------------
			// Monthly Page Summary (
			//--------------------------------------------------------------------
			{"Total Monthly Payment",sTotalMonthlyPayment},
			{"Total Annual Payment",sTotalAnnualPayment},
			{"Protected No-Claims Discount",sProtectedNoClaimsDiscount},
			{"Total Motor Legal Assistance",sMotorLegalAssistance},
			{"Car Insurance",sCarInsurance},							// Common		    
			{"Excess Protection",sExcessProtection},					// Common	
			{"Car Hire",sCarHire},										// Common	
			{"Motor Accident Plan",sMotorAccidentPlan},					// Common
			{"Breakdown Cover",sBreakdownCover}, // RELAY / HOMESTART   // Common
			//---------------------------------------------------------------------
			
			//--------------------------------------------------------------------
			// Monthly Page Representative Sample (
			//--------------------------------------------------------------------
			{"Policy Cash Price",sPolicyCashPrice},
			//--------------------------------------------------------------------
			// Monthly Payment Details (
			//--------------------------------------------------------------------
		
			//--------------------------------------------------------------------
			{"Initial Card Payment",sInitialCardPayment},
			{"11 Monthy Payments",s11MonthlyPayments},
			{"Total Monthly Payments",sTotalMonthlyPayments},
			{"Total Credit",sTotalCredit},
			{"Total Payable",sTotalPayable},
			{"Fixed Interest Rate",sFixedInterestRate},
			{"Representative APR",sRepresentativeAPR},
			//--------------------------------------------------------------------	
		
		};
		//------------------------------------------------------------------------------------------
		// ANNUAL DATA
		//------------------------------------------------------------------------------------------
		// Capture Remaining Embedded Data and Compare
		String sSummary_Details_Text = (String)html_main().getProperty(".text");
		//------------------------------------------------------------------------------------------
		// Element Name
		for (int i = 0; i < sPageElementLookUp.length; i++) {
		      System.out.print(sPageElementLookUp[i][0] + ": ");
			  //-----------------------------------------------------------------------------------
		      // Element Content
		      for (int j = 1; j < sPageElementLookUp[i].length; j++) {
		    	  //-------------------------------------------------------------------------------
		    	  System.out.print(sPageElementLookUp[i][j]); //  + " "
		    	  //-------------------------------------------------------------------------------
		    	  // Verification
			  		if (sSummary_Details_Text.contains(sPageElementLookUp[i][j])){
						logTestResult("Summary Page Contains "+sPageElementLookUp[i][0] + ": " + sPageElementLookUp[i][j]+" As Expected", true);
					}
			  		else{
						logTestResult("Summary Page DOES NOT Contain "+sPageElementLookUp[i][0] + ": " + sPageElementLookUp[i][j], false);
			  		}
		    	  //-------------------------------------------------------------------------------
		      }
		      System.out.println();			      
		}	
//		//------------------------------------------------------------------------------------------  		
//		// Terms and Conditions
//		checkBox_termson().waitForExistence(5,  0.25);
//		checkBox_termson(ANY, READY).click();
//		//------------------------------------------------------------------------------------------  		
//		// Ready to Pay
//		button_ReadyToPay().waitForExistence(5,  0.25);
//		button_ReadyToPay(ANY, READY).click();
//		try {
//			// sleep(0.5);
//			button_ReadyToPay(ANY, READY).click();
//		} catch (ObjectNotFoundException e) {
//			// Button Actioned 1st Time
//		}
		//------------------------------------------------------------------------------------------  		
	}
}


