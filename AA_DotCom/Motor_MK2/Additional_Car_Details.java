package Motor_MK2;
import resources.Motor_MK2.Additional_Car_DetailsHelper;
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
public class Additional_Car_Details extends Additional_Car_DetailsHelper
{
	/**
	 * Script Name   : <b>Additional_Car_Details</b>
	 * Generated     : <b>2 Jun 2015 16:39:02</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/02
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		String sRegNumber = "NKD305M";
		
		//Verification
		String sTitle = "The_CAR_Details_Data";
		String sReport = "The CAR Details Data Entry Was Successful";
		String sExpected = "Your details";
		String sActual = "";
		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
		//-----------------------------------------------------------------------------------------


		// Input Registration Number
		text_aaAdditionalRegistration().waitForExistence(20,  0.25);
		text_aaAdditionalRegistration(ANY, READY).click(atPoint(52,11));
		iE(document_carInsuranceAdditiona(),DEFAULT_FLAGS).inputChars(sRegNumber);
		
		//-----------------------------------------------------------------------------------------
		// Submit Registration
		button_nextsubmit().waitForExistence(20,  0.25);
		button_nextsubmit(ANY, READY).click();
		//-----------------------------------------------------------------------------------------
		
		sExpected = (String)html_main().getProperty(".text");
		
		if (sExpected.contains("Registration not found")){
			sExpected = "Registration not found";
			String sCorrectRegistration = (String)label_IsMyCorrectRegist().getProperty(".contentText");
			if (sCorrectRegistration.contains("my correct registration number")){
				logTestResult("Addition Car Details Returns Correct Registration Number", true);
			}
			else{
				logTestResult("Addition Car Details Returned INCORRECT Registration Number", false);
			}
		}
		//-----------------------------------------------------------------------------------------
		// Submit Registration (Finally)
		if (button_nextsubmit().exists()){
			button_nextsubmit(ANY, READY).click();
		}
		//-----------------------------------------------------------------------------------------

		
		
		
		
	}
}

