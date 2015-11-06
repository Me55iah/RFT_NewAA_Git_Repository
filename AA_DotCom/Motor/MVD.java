package Motor;
import resources.Common_Variables;
import resources.Motor.MVDHelper;
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
public class MVD extends MVDHelper
{
	/**
	 * Script Name   : <b>MVD</b>
	 * Generated     : <b>13 Feb 2015 12:36:57</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2015/02/13
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{			
		//----------------------------------------------------------------
		// Test Data
		//Common_Variables.otherVehicleOption = 1;
		//Common_Variables.NCB = "5";
		// Test Data
		//----------------------------------------------------------------
		// Options 1 and 2 Are Currently Implemented on PL1/Live - 3 Still To Come
		// ALL CODE IN PLACE, But Currently Only Stimulate The Live Options
		Object done;
		BrowserSync();

		// CURRENTLY (Feb 15) Option 2 Not Implemented (Company Car)
		switch (Common_Variables.otherVehicleOption){
			
			case 1: // I have another car insured in my name (I'm the policyholder) 				
				// No Claims Discount Years TextBox Appears
				checkBox_aaMotorDriversOther_1(ANY, READY).click();				
				// 1 and 2 Display NCD Text Box
				text_otherVehicleYearsNCD().click(atPoint(8,10));
				browser_iE(document_carInsuranceTheCarThe(),DEFAULT_FLAGS).inputChars(Common_Variables.NCB);				
				
				break;
	// CURRENTLY NOT IMPLEMENTED			
//			case 2: // I am the main driver of a company car 
//					
//				checkBox_aaMotorDriversOther_2(ANY, READY).click();
//
//				
//				// 1 and 2 Display NCD Text Box
//				text_otherVehicleYearsNCD().click(atPoint(8,10));
//				browser_iE(document_carInsuranceTheCarThe(),DEFAULT_FLAGS).inputChars(Common_Variables.NCB);
//
//				break;
				
			case 3: //  am a named driver on another car insurance policy 
					
				checkBox_aaMotorDriversOther_3(ANY, READY).click();

				break;
			
			case 4: // Top 2
					// I have another car insured in my name (I'm the policyholder)
				    // I am the main driver of a company car 				
				// No Claims Discount Years TextBox Appears
				checkBox_aaMotorDriversOther_1(ANY, READY).click();				
				checkBox_aaMotorDriversOther_2(ANY, READY).click();
				// 1 and 2 Display NCD Text Box
				text_otherVehicleYearsNCD().click(atPoint(8,10));
				browser_iE(document_carInsuranceTheCarThe(),DEFAULT_FLAGS).inputChars(Common_Variables.NCB);				
				break;

			case 5: // Bottom 2
					//  am a named driver on another car insurance policy 
				    // I am the main driver of a company car 				
				checkBox_aaMotorDriversOther_2(ANY, READY).click();
				checkBox_aaMotorDriversOther_3(ANY, READY).click();
				// 1 and 2 Display NCD Text Box
				text_otherVehicleYearsNCD().click(atPoint(8,10));
				browser_iE(document_carInsuranceTheCarThe(),DEFAULT_FLAGS).inputChars(Common_Variables.NCB);
				break;

			case 6: // I have another car insured in my name (I'm the policyholder) 
					//  am a named driver on another car insurance policy 		
				// No Claims Discount Years TextBox Appears
				checkBox_aaMotorDriversOther_1(ANY, READY).click();
				checkBox_aaMotorDriversOther_3(ANY, READY).click();	
				// 1 and 2 Display NCD Text Box
				text_otherVehicleYearsNCD().click(atPoint(8,10));
				browser_iE(document_carInsuranceTheCarThe(),DEFAULT_FLAGS).inputChars(Common_Variables.NCB);
				break;

			case 7: //  ALL SELECTED (3 Buttons) 
				// No Claims Discount Years TextBox Appears
				checkBox_aaMotorDriversOther_1(ANY, READY).click();
				checkBox_aaMotorDriversOther_2(ANY, READY).click();
				checkBox_aaMotorDriversOther_3(ANY, READY).click();
				// 1 and 2 Display NCD Text Box
				text_otherVehicleYearsNCD().click(atPoint(8,10));
				browser_iE(document_carInsuranceTheCarThe(),DEFAULT_FLAGS).inputChars(Common_Variables.NCB);
				//dancd.years(Common_Variables.NCB);				
				break;									
		}
		switch (Common_Variables.otherVehicleOption){
		
			case 1:
			case 2:
				
				// Verify
				String sNCD_Value = (String)text_otherVehicleYearsNCD().getProperty(".value");
				//vpManual("NCD_Value_Verified", Common_Variables.NCB, sNCD_Value).performTest();
				
				if ((boolean) (done=vpManual("NCD_Value_Verified", Common_Variables.NCB,sNCD_Value ).performTest())){
					// passed
				}
				else{
					System.out.println("Reg From DP .... "+Common_Variables.NCB);
					System.out.println("Actua Reg .... "+sNCD_Value);
					stop();
				}		
				break;						
		}
	}
}


//class ncd{
//
//	   public static void years(String nCB) {
//		
//		// HTML Browser
//		// Document: Car Insurance: The car - The AA: RegularExpression(car-insurance)
//		//text_otherVehicleYearsNCD().click(atPoint(106,7));
//		// browser_iE(document_carInsuranceTheCarThe(),DEFAULT_FLAGS).inputKeys("10{TAB}");
//		
//		// HTML Browser
//		// Document: Car Insurance: The car - The AA: RegularExpression(car-insurance)
//		text_otherVehicleYearsNCD().doubleClick(atPoint(10,5));
//		browser_iE(document_carInsuranceTheCarThe(),DEFAULT_FLAGS).inputChars("10");
	     
//	   }

//	}



