package Motor_MK2.Your__Details;
import resources.Common_Variables;
import resources.Motor_MK2.Your__Details.Employment_DetailsHelper;
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
public class Employment_Details extends Employment_DetailsHelper
{
	/**
	 * Script Name   : <b>Employment_Details</b>
	 * Generated     : <b>1 Jul 2015 13:17:51</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/07/01
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
//		//-----------------------------------------------------------------------------------------
//		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
//		//-----------------------------------------------------------------------------------------
//		String sEmploymentStatus = "Employed";
//		String sEmploymentRole = "Accountant";
//		String sEmploymentType = "Accountancy";	
//		//-----------------------------------------------------------------------------------------
//		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
//		//-----------------------------------------------------------------------------------------
		String sEmploymentStatus = Common_Variables.proposerOccupationStatus;
		String sEmploymentRole =  Common_Variables.proposerOccupation;
		String sEmploymentType = Common_Variables.proposerBusiness;
		String sSecondaryEmploymentRole =  Common_Variables.proposerOtherOccupation;
		String sSecondaryEmploymentType = Common_Variables.proposerOtherBusiness;
		//--------------------------------------------------------------------
		// Employment Details
		// Employment Status
		//----------------------------------------------------------------------------
		switch (sEmploymentStatus){
		//--------------------------------------------------------------------
			case "Employed or self-employed":
				label_employedOrSelfEmployed(ANY, READY).click();
				break;
				//--------------------------------------------------------------------
			case "Housewife":
				label_housewife(ANY, READY).click();
				break;
				//--------------------------------------------------------------------
			case "Student":
				label_student(ANY, READY).click();
				break;
				//--------------------------------------------------------------------
			case "Retired":
				label_retired(ANY, READY).click();
				break;								
				//--------------------------------------------------------------------
			case "Unemployed":
				label_unemployed(ANY, READY).click();
				break;								
				//--------------------------------------------------------------------
			case "Registered Disabled (not employed)":
				label_registeredDisabledNotEmp(ANY, READY).click();
				break;								
		}
		//----------------------------------------------------------------------------
		// Employment Title		
		//----------------------------------------------------------------------------
		// Primary Job
		text_aaMotorDrivers0Occupation().waitForExistence(20,  0.25);
		text_aaMotorDrivers0Occupation(ANY, READY).click(atPoint(215,36));
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputKeys(sEmploymentRole);
		// 2 tabs to next editable field
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputKeys("{TAB 2}");
		//----------------------------------------------------------------------------
		// Primary Job Industry/Type
		//----------------------------------------------------------------------------
		text_aaMotorDrivers0Fulltimebu().waitForExistence(20,  0.25);
		text_aaMotorDrivers0Fulltimebu(ANY, READY).click(atPoint(72,29));
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputKeys(sEmploymentType);
		// 2 tabs to next editable field
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputKeys("{TAB 2}");
		//----------------------------------------------------------------------------
		// Secondary Job
		//----------------------------------------------------------------------------
		// Temporarily Suspend Log To Hide The Following Erroneous Tool Error!!!
 		//--------------------------------------------------------------------
 		setCurrentLogFilter(DISABLE_LOGGING);
 	 	//--------------------------------------------------------------------
		try {			
	 		//--------------------------------------------------------------------
			text_aaMotorDrivers0Parttimeoc().waitForExistence(20,  0.25);
			text_aaMotorDrivers0Parttimeoc(ANY, READY).click(atPoint(276,31));
			iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputKeys(sSecondaryEmploymentRole);
			iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputKeys("{TAB 2}");
			//----------------------------------------------------------------------------
			// Secondary Job Industry/Type
			//----------------------------------------------------------------------------
			text_aaMotorDrivers0Parttimebu().waitForExistence(20,  0.25);
			text_aaMotorDrivers0Parttimebu(ANY, READY).click(atPoint(94,27));
			iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputKeys(sSecondaryEmploymentType);
			iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputKeys("{TAB 2}");
			//----------------------------------------------------------------------------		
		} catch (Exception e) {
			// None
			// e.printStackTrace();
		}
	 	//--------------------------------------------------------------------
		// RESUME Temporarily Suspended Log To Hide The Previous Erroneous Tool Error!!!
	 	//--------------------------------------------------------------------
		setCurrentLogFilter(ENABLE_LOGGING);
	 	//--------------------------------------------------------------------
	}
}

