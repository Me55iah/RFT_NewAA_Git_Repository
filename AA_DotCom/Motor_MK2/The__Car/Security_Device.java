package Motor_MK2.The__Car;
import resources.Common_Variables;
import resources.Motor_MK2.The__Car.Security_DeviceHelper;
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
public class Security_Device extends Security_DeviceHelper
{
	/**
	 * Script Name   : <b>Security_Device</b>
	 * Generated     : <b>25 Jun 2015 16:28:41</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/25
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
//		//-----------------------------------------------------------------------------------------
//		// Test Data
//		Boolean bSecurityDeviceCertificate = false;
//		String sSecurityDevice = "Additional device";
//		String sSecurityDeviceModel = "Waso UT2"; //AA Immobiliser"; // Cobra NU1";
//		String sSecurityDeviceFitter = "Franchised Dealer";
//		// Test Data
//		//-----------------------------------------------------------------------------------------
		// Vehicle Security Device
		//--------------------------------------------------------------------
		String sSecurityDevice = Common_Variables.vehicleSecurityDevice; //"Additional Device";  // Security Device Fitted?
		String sSecurityDeviceModel = Common_Variables.vehicleSecurityModel;
		String sSecurityDeviceFitter = Common_Variables.vehicleSecurityFitter;
		boolean bSecurityDeviceCertificate = Common_Variables.vehicleSecurityCertificate;		
		//--------------------------------------------------------------------				
		switch (sSecurityDevice){
		//--------------------------------------------------------------------		
			case "No":
				label_SecurityDevice_no().waitForExistence(20,  0.25);			
				label_SecurityDevice_no(ANY, READY).click();
				break;
				//--------------------------------------------------------------------
			case "Manufacturer standard-fit":
				label_manufacturerStandardFit().waitForExistence(20,  0.25);			
				label_manufacturerStandardFit(ANY, READY).click();
				break;
				//--------------------------------------------------------------------
			case "Manufacturer optional extra":  // EXTENDED ENTRY
				label_manufacturerOptionalExtr().waitForExistence(20,  0.25);			
				label_manufacturerOptionalExtr(ANY, READY).click();
				break;
				//--------------------------------------------------------------------
			case "Additional device":          // EXTENDED ENTRY
				label_additionalDevice().waitForExistence(20,  0.25);			
				label_additionalDevice(ANY, READY).click();
				break;
				//--------------------------------------------------------------------
		}
		// EXTENDED ENTRY
		sleep(1);
		//--------------------------------------------------------------------
		callScript("Utilities.pageDown");
		//--------------------------------------------------------------------
		// Detect Security Device Customisation and Set Accordingly	- NO and MANUFACTURER STANDARD FIT - No Action Required 	
		//if (!sSecurityDevice.equals("No")||(!sSecurityDevice.equals("Manufacturer standard-fit"))){
		if (list_aaMotorSecuritydevice_Model().isShowing()){	
			try {
				//--------------------------------------------------------------------
				//BrowserSync();
				//--------------------------------------------------------------------	
				// Select Security Device
				//--------------------------------------------------------------------	
				list_aaMotorSecuritydevice_Model().waitForExistence(2,  0.25);			
				list_aaMotorSecuritydevice_Model(ANY, READY).click();
				sleep(0.2);
				list_aaMotorSecuritydevice_Model(ANY, READY).click(atText(sSecurityDeviceModel));
				//--------------------------------------------------------------------
				//BrowserSync();
				sleep(2);
				//--------------------------------------------------------------------
				// Who Fitted The Device?
				// Vehicle Security Device
				//--------------------------------------------------------------------	
				list_aaMotorSecuritydevice_Fitter(ANY, READY).click();
				sleep(0.2);
				list_aaMotorSecuritydevice_Fitter(ANY, READY).click(atText(sSecurityDeviceFitter));
				//--------------------------------------------------------------------
				// Security Device Certificated
				//--------------------------------------------------------------------
				if (bSecurityDeviceCertificate == true){
					label_yes().waitForExistence(20,  0.25);			
					label_yes(ANY, READY).click();
				}		
				else{
					label_no().waitForExistence(20,  0.25);			
					label_no(ANY, READY).click();
	 			}
			} catch (Exception e) {
				// Nothing To Do
				// e.printStackTrace();
			}
		}
		//--------------------------------------------------------------------------------		

	}
}

