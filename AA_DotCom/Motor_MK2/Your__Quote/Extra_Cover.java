package Motor_MK2.Your__Quote;
import resources.Common_Variables;
import resources.Motor_MK2.Your__Quote.Extra_CoverHelper;
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
public class Extra_Cover extends Extra_CoverHelper
{
	/**
	 * Script Name   : <b>Extra_Cover</b>
	 * Generated     : <b>3 Jul 2015 13:39:04</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/07/03
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		//-----------------------------------------------------------------------------------------
//		// Test Data
//		Boolean bRegNumberKnown = false;
//		String sRegNumber = "NKD305M";
//		String sRegYear = "1970";
//		String sVehicleMake = "FORD";
//		String sVehicleModel = "CORTINA";
//		
		String sAdjustVoluntaryExcess = "";
		String sAddonLegalAssistanceCost = "";
		String sAddonPersonalAccidentCost = "";
		String sAddonCourtesyCarCost = "";
		String sAddonExcessProtectionCost = "";
//		Boolean bLegalAssistance = true; 	// Legal Assistance
//		Boolean bPersonalAccident = true; 	// Personal Accident
//		Boolean bCourtesyCar = true; 		// Courtesy Car
//		Boolean bExcessClawBack = true; 	// Excess	
		
		// Test Data
		//-----------------------------------------------------------------------------------------
		// Do You Know The Car Registration Number
		Boolean bLegalAssistance = Common_Variables.upgrades_MLA; 	// Legal Assistance
		Boolean bPersonalAccident = Common_Variables.upgrades_MAP; 	// Personal Accident
		Boolean bCourtesyCar = Common_Variables.upgrades_HireCar; 	// Courtesy Car
		Boolean bExcessClawBack = Common_Variables.upgrades_MOXIN; 	// Excess	
		
		//String sAdjustVoluntaryExcess = Common_Variables.volXS;
		//-----------------------------------------------------------
		// Adjust Voluntary Excess
		if (!sAdjustVoluntaryExcess.equals("")){ // NOT EQUAL NULL!!!!
			callScript("Utilities.pageDown");
			list_aaMotorVoluntaryExcessCod(ANY, READY).click();
			sleep(0.5);
			list_aaMotorVoluntaryExcessCod(ANY, READY).click(atText(sAdjustVoluntaryExcess));
			//-----------------------------------------------------------
			logTestResult("Voluntary Excess Changed To "+sAdjustVoluntaryExcess, true);
			System.out.println("Voluntary Excess Changed To "+sAdjustVoluntaryExcess);
			//-----------------------------------------------------------
			Common_Variables.volXS = sAdjustVoluntaryExcess;
			//-----------------------------------------------------------
			// Recalculate Afer Change
			button_recalculatesubmit().waitForExistence(10,  0.25);
			button_recalculatesubmit(ANY, READY).click();
			//-----------------------------------------------------------
			// Synchronisation
			list_aaMotorVoluntaryExcessCod().waitForExistence(30,  0.25);
			//-----------------------------------------------------------
		}
		// Scrape String Data From Page	
		// String sContainer_Text = (String)html_mainContent().getProperty(".text"); // html_main // form_quoteForm
		// System.out.println(sContainer_Text);
		//-----------------------------------------------------------
		// MLA - Motor Legal Assistance Addition
		if (bLegalAssistance == true){
//			//---------------
//			// Mini Scroll
//			d2_LowLevel();
			sleep(0.5);
			//---------------
			label_addLegalAssistance().waitForExistence(5, 0.25);
			label_addLegalAssistance(ANY, READY).click();
			sleep(0.5);
//			//-----------------------------------------------------------
//			// Scrape LA Value For Later Comparison and Summation of Totals
//			//------------------------------------------------------------
//			// MLA	
//			String sStartName = "a month"; // Motor Legal Assistance";
//			String sEndName = "Find out more";
//			int iIndex = 1;
//			String sStartNameContent = null;
//			//------------------------------------------------------------
//			// MLA
//			subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);
//			//------------------------------------------------------------
//			Common_Variables.addonsLegalAssistanceCost = sAddonLegalAssistanceCost;
//			//-----------------------------------------------------------
			logTestResult("Personal Legal Assistance Cover Upgrade Added", true);
			// System.out.println("Personal Legal Assistance Cover Upgrade Added = "+sAddonLegalAssistanceCost);
			//-----------------------------------------------------------
		}		
		//-----------------------------------------------------------------------------------------
		// Personal Accident Cover Addition
		if (bPersonalAccident == true){
//			//---------------
//			// Mini Scroll
//			d2_LowLevel();
 			sleep(0.5);
			//---------------
			label_addPersonalAccidentCover().waitForExistence(5, 0.25);			
			label_addPersonalAccidentCover(ANY, READY).click();
			sleep(0.5);
			//-----------------------------------------------------------
//			// Scrape PAC Value For Later Comparison and Summation of Totals
//			//------------------------------------------------------------
//			// MAP	
//			String sStartName = "paid work again."; //Motor Accident Plan";
//			String sEndName = "a month"; //Motor Legal";
//			int iIndex = 1;
//			String sStartNameContent = null;
//			//------------------------------------------------------------
//			// MAP
//			subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);
//			//------------------------------------------------------------
//			Common_Variables.addonsPersonalAccidentCost = sAddonPersonalAccidentCost;
//			//-----------------------------------------------------------
			logTestResult("Personal Accident Cover Upgrade Added", true);
			// System.out.println("Personal Accident Cover Upgrade Added = "+sAddonPersonalAccidentCost);
			//-----------------------------------------------------------
			
		}
		//-----------------------------------------------------------------------------------------
		// Hirecar/Courtesy Car Addition
		if (bCourtesyCar == true){			
			//---------------
//			// Mini Scroll
//			d2_LowLevel();
			sleep(0.5);
			//---------------
			// NOT ALWAYS AN OPTION
			//---------------
			try {
				label_addCourtesyCarUpgrade().waitForExistence(5, 0.25);
				label_addCourtesyCarUpgrade(ANY, READY).click();
				sleep(0.5);
			} catch (AmbiguousRecognitionException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
			//-----------------------------------------------------------
//			// Scrape Hirecar Value For Later Comparison and Summation of Totals
//			//------------------------------------------------------------
//			// CCU	
//			String sStartName = "a month";
//			String sEndName = "Find out more";
//			int iIndex = 1;
//			String sStartNameContent = null;
//			//------------------------------------------------------------
//			// CCU
//			subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);
//			//------------------------------------------------------------
//			Common_Variables.addonsCourtesyCarCost = sAddonCourtesyCarCost;
//			//-----------------------------------------------------------
			logTestResult("Courtesy Care (Hire Car) Upgrade Added", true);
			// System.out.println("Courtesy Care (Hire Car) Upgrade Added = "+sAddonCourtesyCarCost);
			//-----------------------------------------------------------			
		}
		//-----------------------------------------------------------------------------------------
		//	Excess Protection Addition
		if (bExcessClawBack == true){
//			//---------------
//			// Mini Scroll
//			d2_LowLevel();
			sleep(0.5);
			//---------------
			label_addPolicyExcessProtectio().waitForExistence(5, 0.25);
			label_addPolicyExcessProtectio(ANY, READY).click();
			sleep(0.5);
//			//-----------------------------------------------------------
//			// Scrape Excess Protection Value For Later Comparison and Summation of Totals
//			//------------------------------------------------------------
//			// EPE	
//			String sStartName = "Excess Protection";
//			String sEndName = "Motor Accident Plan";
//			int iIndex = 1;
//			String sStartNameContent = null;
//			//------------------------------------------------------------
//			// EPE
//			subString(sContainer_Text, sStartName, sEndName, iIndex, sStartNameContent);
//			//------------------------------------------------------------
//			Common_Variables.addonsPolicyExcessProtectionCost = sAddonExcessProtectionCost;
//			//-----------------------------------------------------------
			logTestResult("Police Excess Protection Upgrade Added", true);
			// System.out.println("Police Excess Protection Upgrade Added = "+sAddonExcessProtectionCost);
			//-----------------------------------------------------------
				
		}
		//-----------------------------------------------------------------------------------------	
		 
	}
}

