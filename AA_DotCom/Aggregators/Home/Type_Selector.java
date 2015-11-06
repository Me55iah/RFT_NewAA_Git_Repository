package Aggregators.Home;
import resources.Common_Variables;
import resources.Aggregators.Home.Type_SelectorHelper;
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
public class Type_Selector extends Type_SelectorHelper
{
	/**
	 * Script Name   : <b>Type_Selector</b>
	 * Generated     : <b>22 Jun 2015 16:27:57</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/22
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		//---------------------------------------------------------------------		
		String sRequestType = Common_Variables.xmlRequestType;
		//---------------------------------------------------------------------
		
		switch (sRequestType){
				//---------------------------------------------------------------------
			case "building":  
				//------------------------------------------------------------------------------------------				
				// Select BUILDING
				radioButton_insurancetypeBuild2().waitForExistence(10, 0.25);
				radioButton_insurancetypeBuild2(ANY, READY).click();
				sleep(2);
				//------------------------------------------------------------------------------------------				
				break;
				//---------------------------------------------------------------------		
			case "contents":  
				//---------------------------------------------------------------------
				// Select CONTENTS
				radioButton_insurancetypeConte().waitForExistence(10, 0.25);
				radioButton_insurancetypeConte(ANY, READY).click();
				sleep(2);
				//------------------------------------------------------------------------------------------		
				break;
				//---------------------------------------------------------------------		
			case "joint":  
				
				// Default - No Action Required
				//---------------------------------------------------------------------			
				break;

		}

	}
}

