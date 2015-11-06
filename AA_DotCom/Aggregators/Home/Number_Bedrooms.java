package Aggregators.Home;
import resources.Common_Variables;
import resources.Aggregators.Home.Number_BedroomsHelper;
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
public class Number_Bedrooms extends Number_BedroomsHelper
{
	/**
	 * Script Name   : <b>Number_Bedrooms</b>
	 * Generated     : <b>23 Jun 2015 09:49:31</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/23
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		//---------------------------------------------------------------------		
		String sNumBeds = Common_Variables.xmlNumberofBedrooms;
		//---------------------------------------------------------------------
		BrowserSync();
		//---------------------------------------------------------------------
		switch (sNumBeds){
				//---------------------------------------------------------------------
			case "One":  
				//------------------------------------------------------------------------------------------				
				// Select BUILDING
				radioButton_noofbedroomS1().waitForExistence(10, 0.25);
				radioButton_noofbedroomS1(ANY, READY).click();
				//------------------------------------------------------------------------------------------				
				break;
				//---------------------------------------------------------------------		
			case "Two":  
				//---------------------------------------------------------------------
				// Select CONTENTS
				radioButton_noofbedroomS2().waitForExistence(10, 0.25);
				radioButton_noofbedroomS2(ANY, READY).click();
				//------------------------------------------------------------------------------------------		
				break;
				//---------------------------------------------------------------------		
				//---------------------------------------------------------------------		
			case "Three":  
				//---------------------------------------------------------------------
				// Select CONTENTS
				radioButton_noofbedroomS3().waitForExistence(10, 0.25);
				radioButton_noofbedroomS3(ANY, READY).click();
				//------------------------------------------------------------------------------------------		
				break;
				//---------------------------------------------------------------------		
			case "Four":  
				//---------------------------------------------------------------------
				// Select CONTENTS
				radioButton_noofbedroomS4().waitForExistence(10, 0.25);
				radioButton_noofbedroomS4(ANY, READY).click();
				//------------------------------------------------------------------------------------------		
				break;
				//---------------------------------------------------------------------		
				//---------------------------------------------------------------------		
			case "Five":  
				//---------------------------------------------------------------------
				// Select CONTENTS
				radioButton_noofbedroomS5().waitForExistence(10, 0.25);
				radioButton_noofbedroomS5(ANY, READY).click();
				//------------------------------------------------------------------------------------------		
				break;
				//---------------------------------------------------------------------				}
		}
	}
}

