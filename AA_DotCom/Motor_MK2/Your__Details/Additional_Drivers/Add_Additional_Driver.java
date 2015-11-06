package Motor_MK2.Your__Details.Additional_Drivers;
import resources.Common_Variables;
import resources.Motor_MK2.Your__Details.Additional_Drivers.Add_Additional_DriverHelper;
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
public class Add_Additional_Driver extends Add_Additional_DriverHelper
{
	/**
	 * Script Name   : <b>Add_Another_Driver</b>
	 * Generated     : <b>1 Jul 2015 13:32:28</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/07/01
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		boolean bAddDriver = false;
		//--------------------------------------------------------------------
		// Add a Driver    bAddDriver
		if (bAddDriver == true){	
			button_addAnotherDriversubmit().waitForExistence(20,  0.25);
			button_addAnotherDriversubmit(ANY, READY).click();
			callScript("Road_MK2.Additional_Driver");
		}
		else {
			
		}
//		stop();//		// Test Data
//		// debug ---------------------------------------------
//		//Common_Variables.paymentType = ("Single Payment");
//		//Common_Variables.paymentType = ("AA Instalment Account (TIA)");
//		// Common_Variables.Title = "Mrs";
//		
////		Common_Variables.MSM = false;
////		Common_Variables.firstDriverTitle = "Mrs";
////		Common_Variables.firstDriverSurname = "Tiaptufwqpy";
////		Common_Variables.proposerDOB = "21/07/1967";
////		Common_Variables.proposerOccupation = "IT Consultant";
////		Common_Variables.proposerBusiness = "Information Technology";
////		Common_Variables.secondDriverClaims = false;
////		
////		Common_Variables.dateTestPassed = "1990";
////		Common_Variables.insuredClaims = false;
////		Common_Variables.insuredConvictions = true;
////		Common_Variables.NCB = "1";
////		Common_Variables.coverType = "Comprehensive";
////			
////		Common_Variables.personsCovered = "IAS"; //IOD
//		
//		// debug ---------------------------------------------
//
//		
//		button_addAnotherDriversubmit().waitForExistence(10,  0.25);
//		button_addAnotherDriversubmit(ANY, READY).click();
//		
//		//------------------------------------------------------------------------------------------
//		BrowserSync();
//		//------------------------------------------------------------------------------------------
//
//		callScript("Create_New_Customer");
//
//		if (Common_Variables.MSM == false) {
//			if (Common_Variables.personsCovered.equals("IAS")) {
//
//				Common_Variables.Title = "Mrs";
//			} else {
//				Common_Variables.Title = "Mr";
//			}
//		} else {
//			Common_Variables.Title = Common_Variables.firstDriverTitle;
//		}
//
//		// Set Additional Driver Title
//		if (Common_Variables.Title.equals("Mr")) {
//			radioButton_Additional_Driver_Title_Mr().click();
//		}
//
//		if (Common_Variables.Title.equals("Mrs")) {
//			radioButton_Additional_Driver_Title_Mrs().click();
//		}
//
//		if (Common_Variables.Title.equals("Miss")) {
//			radioButton_Additional_Driver_Title_Miss().click();
//		}
//
//		if (Common_Variables.Title.equals("Ms")) {
//			radioButton_Additional_Driver_Title_Ms().click();
//		}
//
//		// Set Additional Driver First and Last Name
//		text_Additional_Driver_FirstName().click(atPoint(4, 11));
//
//		if(Common_Variables.MSM == true){
//		browser_htmlBrowser(document_carInsuranceAdditiona(), DEFAULT_FLAGS)
//				.inputChars("Money-Supermarket");
//		}
//		
//		if(Common_Variables.MSM == false){
//			browser_htmlBrowser(document_carInsuranceAdditiona(), DEFAULT_FLAGS)
//					.inputChars("Dotcom_Regression");
//			}
//
//		text_Additional_Driver_LastName().click(atPoint(3, 11));
//
//		browser_htmlBrowser(document_carInsuranceAdditiona(), DEFAULT_FLAGS)
//				.inputChars(Common_Variables.firstDriverSurname);
//
//		// Set Addititional Driver DOB
//		text_dateOfBirth2().click(atPoint(4, 13));
//
//		if (Common_Variables.MSM == false) {
//			browser_htmlBrowser(document_carInsuranceAdditiona(), DEFAULT_FLAGS)
//					.inputChars(Common_Variables.proposerDOB);
//
//			// How long UK resident
//			checkBox_aaMotorDrivers1UkResi(ANY, READY).click();
//
//			//sleep(1.0);
//			//------------------------------------------------------------------------------------------
//			BrowserSync();
//			//------------------------------------------------------------------------------------------
//
//
//			radioButton_aaMotorDrivers1Mar(ANY, READY).click();
//
//			if (Common_Variables.personsCovered.equals("IAS")) {
//				list_aaMotorDrivers1Relationsh().click();
//				list_aaMotorDrivers1Relationsh().click(
//						atText("Spouse/Civil Partner"));
//			}
//
//			// Additional Driver Occupation
//			text_aaMotorDrivers1Occupation().click(atPoint(16, 11));
//			browser_htmlBrowser(document_carInsuranceAdditiona(), DEFAULT_FLAGS)
//					.inputChars(Common_Variables.proposerOccupation);
//			browser_htmlBrowser(document_carInsuranceAdditiona(), DEFAULT_FLAGS)
//					.inputKeys("{TAB}");
//			//sleep(1.0);
//			//------------------------------------------------------------------------------------------
//			BrowserSync();
//			//------------------------------------------------------------------------------------------
//
//			text_aaMotorDrivers1Fulltimebu().click(atPoint(5, 14));
//			browser_htmlBrowser(document_carInsuranceAdditiona(), DEFAULT_FLAGS)
//					.inputChars(Common_Variables.proposerBusiness);
//			browser_htmlBrowser(document_carInsuranceAdditiona(), DEFAULT_FLAGS)
//					.inputKeys("{TAB}");
//
//			//sleep(1.0);
//			//------------------------------------------------------------------------------------------
//			BrowserSync();
//			//------------------------------------------------------------------------------------------
//
//
//			radioButton_aaMotorDrivers1Non(ANY, READY).click();
//
//			// Additional Driver Driving License
//			list_aaMotorDrivers1LicenceHel(ANY, READY).click();
//			//sleep(2.0);
//			//------------------------------------------------------------------------------------------
//			BrowserSync();
//			//------------------------------------------------------------------------------------------
//
//			list_aaMotorDrivers1LicenceHel().click(
//					atText(Common_Variables.dateTestPassed));
//			//sleep(1.0);
//			//------------------------------------------------------------------------------------------
//			BrowserSync();
//			//------------------------------------------------------------------------------------------
//
//
//			radioButton_aaMotorDrivers1Bus().setState(SELECTED);
//
//			// Additonal Driver has own car
//			radioButton_Additional_Driver_Other_Car_Yes().setState(SELECTED);
//
//			// Additional Driver Previous Claims
//			if (Common_Variables.secondDriverClaims == true) {
//				radioButton_Additional_Driver_Claims_Yes().click();
//			}
//			if (Common_Variables.secondDriverClaims == false) {
//				radioButton_Additional_Driver_Claims_No().click();
//			}
//
//			//sleep(1.0);
//			//------------------------------------------------------------------------------------------
//			BrowserSync();
//			//------------------------------------------------------------------------------------------
//
//			// Additional Driver Convictions
//			if (Common_Variables.secondDriverConvictions == true) {
//				radioButton_Additional_Driver_Convictions_Yes().click();
//			}
//			if (Common_Variables.secondDriverConvictions == false) {
//				radioButton_Additional_Driver_Convictions_No().click();
//			}
//
//			if (Common_Variables.secondDriverConvictions == true) {
//				callScript("Motor.Additional_Driver_Convictions");
//
//			}
//
//			//sleep(1.0);
//			//------------------------------------------------------------------------------------------
//			BrowserSync();
//			//------------------------------------------------------------------------------------------
//
//		}
//		if (Common_Variables.MSM == true) {
//			browser_htmlBrowser(document_carInsuranceAdditiona(), DEFAULT_FLAGS)
//					.inputChars(Common_Variables.firstDriverDOB);
//
//			// How long UK resident
//			checkBox_aaMotorDrivers1UkResi().click();
//
//			//sleep(1.0);
//			//------------------------------------------------------------------------------------------
//			BrowserSync();
//			//------------------------------------------------------------------------------------------
//
//			if (Common_Variables.firstDriverMaritalStatus.equals("Married")) {
//				radioButton_aaMotorDrivers1Mar().click();
//			}
//
//			if (Common_Variables.firstDriverMaritalStatus.equals("Single")) {
//
//				radioButton_aaMotorDrivers1Mar2().click();
//
//			}
//
//			list_aaMotorDrivers1Relationsh().click();
//			list_aaMotorDrivers1Relationsh().click(
//					atText(Common_Variables.firstDriverRelationship));
//
//			// Additional Driver Occupation
//			text_aaMotorDrivers1Occupation().click(atPoint(16, 11));
//			browser_htmlBrowser(document_carInsuranceAdditiona(), DEFAULT_FLAGS)
//					.inputChars(Common_Variables.firstDriverOccupation);
//			//sleep(1.0);
//			//------------------------------------------------------------------------------------------
//			BrowserSync();
//			//------------------------------------------------------------------------------------------
//
//			if (Common_Variables.firstDriverOccupation.contains("-")) {
//				html_mainOccupation_suggest_it().click(atPoint(131, 10));
//			} else {
//				browser_htmlBrowser(document_carInsuranceAdditiona(),
//						DEFAULT_FLAGS).inputKeys("{TAB}");
//				//sleep(1.0);
//				//------------------------------------------------------------------------------------------
//				callScript("Utilities.Portal_Synchronisation"); // Dave Replaced fixed delay with dynamic
//				//------------------------------------------------------------------------------------------
//
//			}
//
//			sleep(1.0);
//			text_aaMotorDrivers1Fulltimebu().click(atPoint(5, 14));
//			browser_htmlBrowser(document_carInsuranceAdditiona(), DEFAULT_FLAGS)
//					.inputChars(Common_Variables.firstDriverEmployerBiz);
//			sleep(1.0);
//
//			if (Common_Variables.firstDriverEmployerBiz.contains("-")) {
//				html_businessType_suggest_item().click(atPoint(131, 10));
//			} else {
//				browser_htmlBrowser(document_carInsuranceAdditiona(),
//						DEFAULT_FLAGS).inputKeys("{TAB}");
//
//				//sleep(1.0);
//				//------------------------------------------------------------------------------------------
//				BrowserSync();
//				//------------------------------------------------------------------------------------------
//
//			}
//
//			//sleep(1.0);
//			//------------------------------------------------------------------------------------------
//			BrowserSync();
//			//------------------------------------------------------------------------------------------
//
//			radioButton_aaMotorDrivers1Non(ANY, READY).click();
//
//			// Additional Driver Driving License
//			list_aaMotorDrivers1LicenceHel(ANY, READY).click();
//			sleep(2.0);
//			list_aaMotorDrivers1LicenceHel(ANY, READY).click(
//					atText(Common_Variables.dateTestPassed));
//			//sleep(1.0);
//			//------------------------------------------------------------------------------------------
//			BrowserSync();
//			//------------------------------------------------------------------------------------------
//
//			// Additional Driver Business Use...?
//			radioButton_aaMotorDrivers1Bus().setState(SELECTED);
//
//			// Additonal Driver has own car
//			radioButton_Additional_Driver_Other_Car_Yes().setState(SELECTED);
//
//			// Additional Driver Previous Claims
//			if (Common_Variables.secondDriverClaims == true) {
//				radioButton_Additional_Driver_Claims_Yes().click();
//			}
//			if (Common_Variables.secondDriverClaims == false) {
//				radioButton_Additional_Driver_Claims_No().click();
//			}
//
//			//sleep(1.0);
//			//------------------------------------------------------------------------------------------
//			BrowserSync();
//			//------------------------------------------------------------------------------------------
//
//			// Additional Driver Convictions
//			if (Common_Variables.secondDriverConvictions == true) {
//				radioButton_Additional_Driver_Convictions_Yes().click();
//			}
//			if (Common_Variables.secondDriverConvictions == false) {
//				radioButton_Additional_Driver_Convictions_No().click();
//			}
//
//			if (Common_Variables.secondDriverConvictions == true) {
//				callScript("Motor.Additional_Driver_Convictions");
//
//			}
//
//		}
//
//		browser_htmlBrowser(document_carInsuranceAdditiona2(), DEFAULT_FLAGS)
//				.inputKeys("{ExtPgDn}");
//
//		button_nextsubmit().waitForExistence(10,  0.25);
//		button_nextsubmit(ANY, READY).click();
//		
//		//------------------------------------------------------------------------------------------
//		BrowserSync();
//		//------------------------------------------------------------------------------------------


	}
}
