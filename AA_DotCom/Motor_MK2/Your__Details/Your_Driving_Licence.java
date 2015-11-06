package Motor_MK2.Your__Details;
import resources.Common_Variables;
import resources.Motor_MK2.Your__Details.Your_Driving_LicenceHelper;
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
public class Your_Driving_Licence extends Your_Driving_LicenceHelper
{
	/**
	 * Script Name   : <b>Your_Driving_Licence</b>
	 * Generated     : <b>1 Jul 2015 13:19:42</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/07/01
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
// 		//-----------------------------------------------------------------------------------------
// 		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
//		String sLicenceQualificationYear = "2014";
//		String sLicenceQualificationMonth = "February";
//		String sDrivingLicenceType = "EU";
//		boolean bUKDrivingLicence = false;
// 		// Test Data   -  COMMENT OUT FOR OPERATIONALE USAGE
// 		//-----------------------------------------------------------------------------------------
		String sLicenceQualificationYear = Common_Variables.proposer_Licence_Year;
		String sLicenceQualificationMonth = Common_Variables.proposer_Licence_Month;
		boolean bUKDrivingLicence = Common_Variables.proposer_uk_Licence_Held;
		String sDrivingLicenceType = Common_Variables.proposer_Licence_Type;
		//--------------------------------------------------------------------
		BrowserSync();
		//--------------------------------------------------------------------	
		// FULL UK Driving Licence     
		if (bUKDrivingLicence == true){
			label_DrivingLicence_yes().waitForExistence(20,  0.25);
			label_DrivingLicence_yes(ANY, READY).click();
		}
		//--------------------------------------------------------
		// If No UK FULL Licence
		else {
			label_DrivingLicence_no().waitForExistence(20,  0.25);
			label_DrivingLicence_no(ANY, READY).click();
			
			switch (sDrivingLicenceType){ // If FULL UK Non Existing
			//--------------------------------------------------------------------
				case "Provisional":
					label_provisionalUKLicence(ANY, READY).click();
					break;
					//--------------------------------------------------------------------
				case "EU":
					label_euLicence(ANY, READY).click();
					break;
					//--------------------------------------------------------------------
				case "NON EU":
					label_nonEULicence(ANY, READY).click();
					break;
					//--------------------------------------------------------------------
				}
		}
		//--------------------------------------------------------------------
		// When Did You Qualify?
		//--------------------------------------------------------------------
		// Year?
		list_aaMotorDrivers0Licence_Year().waitForExistence(20,  0.25);
		list_aaMotorDrivers0Licence_Year(ANY, READY).click();
		sleep(0.25);
		list_aaMotorDrivers0Licence_Year(ANY, READY).click(atText(sLicenceQualificationYear));
		sleep(0.25);
		iE(document_carInsuranceYourDetai(),DEFAULT_FLAGS).inputKeys("{TAB}");
		//--------------------------------------------------------------------
		// Month?                     // Displays Dependent On Business Logic and TimesScales
		//--------------------------------------------------------------------
		if (list_aaMotorDrivers0Licence_Month().isEnabled()){  // isShowing
	 		//--------------------------------------------------------------------
			// Temporarily Suspend Log To Hide The Following Erroneous Tool Error!!!
	 		//--------------------------------------------------------------------
	 		setCurrentLogFilter(DISABLE_LOGGING);
	 		//--------------------------------------------------------------------	
			try {
		 	 	//--------------------------------------------------------------------
				// list_aaMotorDrivers0Licence_Month().waitForExistence(20,  0.25);
				sleep(0.25);
				list_aaMotorDrivers0Licence_Month(ANY, READY).click();
				sleep(0.25);
				list_aaMotorDrivers0Licence_Month(ANY, READY).click(atText(sLicenceQualificationMonth));
				sleep(0.25);
				
		 	 	//--------------------------------------------------------------------
			} catch (SubitemNotFoundException e) {
				System.out.println("Driving Licence 'MONTH' Not Relevant In This Case");
			}
		 	//--------------------------------------------------------------------
			// RESUME Temporarily Suspended Log To Hide The Previous Erroneous Tool Error!!!
		 	//--------------------------------------------------------------------
			setCurrentLogFilter(ENABLE_LOGGING);
			//----------------------------------------------------------------------------		
		}
		//--------------------------------------------------------------------
		// Bring HMI Components into View
		// callScript("Utilities.pageDown");
		//--------------------------------------------------------------------

	}
}

