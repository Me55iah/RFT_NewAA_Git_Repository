package BreakDown_Cover_MK2;
import resources.BreakDown_Cover_MK2.Vehicle_DetailsHelper;
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
public class Vehicle_Details extends Vehicle_DetailsHelper
{
	/**
	 * Script Name   : <b>Vehicle_Details</b>
	 * Generated     : <b>5 Jun 2015 12:24:22</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/05
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		
		BrowserSync();
		
		
		// MORE TODO
		// stop();
//		try {
//			text_vehicles0VehRegYear().waitForExistence(10,  0.25);
//			text_vehicles0VehRegYear(ANY, READY).click(atPoint(327,19));
//			
//			button_continuesubmit().waitForExistence(10,  0.25);
//			button_continuesubmit(ANY, READY).click();
//		} catch (ObjectNotFoundException e) {
//			
//			// TODO
//		}
		//-------------------------------------------------------------
		// Motor Path Presents This Button, Other Options Doe Not
//		if (button_continuesubmit2().exists()){
//			button_continuesubmit2().waitForExistence(10,  0.25);
//			button_continuesubmit2(ANY, READY).click();
//			BrowserSync();
//
//		}
		BrowserSync();
		
		try {
			sleep(2);
			if (button_continuesubmit2().isEnabled()){
				button_continuesubmit2(ANY, READY).click();
				System.out.println("button_continuesubmit2 FOUND");
				}
		} catch (ObjectNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("button_continuesubmit2 NOT FOUND");
		}
		
		try {
			sleep(2);
			if (button_continuesubmit().isEnabled()){
				button_continuesubmit(ANY, READY).click();
				System.out.println("button_continuesubmit FOUND");
				}
		} catch (ObjectNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("button_continuesubmit NOT FOUND");
		}

		

	}
}

