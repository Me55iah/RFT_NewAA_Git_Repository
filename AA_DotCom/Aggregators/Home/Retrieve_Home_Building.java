package Aggregators.Home;
import resources.Common_Variables;
import resources.Aggregators.Home.Retrieve_Home_BuildingHelper;
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
public class Retrieve_Home_Building extends Retrieve_Home_BuildingHelper
{
	/**
	 * Script Name   : <b>Retrieve_Home_Building</b>
	 * Generated     : <b>6 May 2015 14:29:18</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/05/06
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
						
		//------------------------------------------------------------------------------------------
		// Navigate Change Quote Type Link (Combined - Default, Contents or Building) BUILDING
		link__Change().waitForExistence(10, 0.25);
		link__Change(ANY, READY).click();
		//------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------
 		// Select BUILDING
		callScript("Aggregators.Home.Type_Selector");
//		//------------------------------------------------------------------------------------------				
//		// Select BUILDING
//		radioButton_insurancetypeBuild().waitForExistence(10, 0.25);
//		radioButton_insurancetypeBuild(ANY, READY).click();
//		//------------------------------------------------------------------------------------------				
		// Phone Selection
		callScript("Aggregators.Home.Phones_EMail");
 		//------------------------------------------------------------------------------------------				
		// Bedroom Selection
		callScript("Aggregators.Home.Number_Bedrooms");
 		//------------------------------------------------------------------------------------------				
		// Submit
		//button_getAQuotesubmit().waitForExistence(10, 0.25);
		//button_getAQuotesubmit(ANY, READY).click();
		//------------------------------------------------------------------------------------------				
		// Include Protection Cover (Y)                   // FLIP BETWEEN 2 - Consider DataPool Field
		radioButton_includeBuildingADY().waitForExistence(100, 0.25);
		radioButton_includeBuildingADY(ANY, READY).click();
		//------------------------------------------------------------------------------------------				
		// Include Protection Cover (N)
		radioButton_includeBuildingADN().waitForExistence(10, 0.25);
		radioButton_includeBuildingADN(ANY, READY).click();
		//------------------------------------------------------------------------------------------
		// Confirm
		button_getAQuotesubmit2().waitForExistence(10, 0.25);
		button_getAQuotesubmit2(ANY, READY).click();
		//------------------------------------------------------------------------------------------
		// Submit
		button_getQuotesubmit().waitForExistence(10, 0.25);
		button_getQuotesubmit(ANY, READY).click();
		
		//------------------------------------------------------
		callScript("Aggregators.Home.Important_Info_Dialog");
		//------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------
		// callScript("Utilities.IE11_Page_Loaded");
		
	}
}

