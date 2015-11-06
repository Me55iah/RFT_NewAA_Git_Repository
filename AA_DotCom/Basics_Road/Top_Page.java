package Basics_Road;
import resources.Common_Variables;
import resources.Basics_Road.Top_PageHelper;
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
public class Top_Page extends Top_PageHelper
{
	/**
	 * Script Name   : <b>Top_Page</b>
	 * Generated     : <b>15 Sep 2015 15:02:39</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.3  Build 9600 ()
	 * 
	 * @since  2015/09/15
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//--------------------------------------
		// 5 Basic Selection Variations
		//--------------------------------------
		switch (Common_Variables.quickPick){
		//--------------------------------------
		
			case "28":
				//link_buyNow£28(ANY, READY).click();
				link_buyNow_28(ANY, READY).click();
				logInfo("£28 Bundle Selected");
				break;
				//--------------------------------------
			case "35":
				//link_buyNow£35(ANY, READY).click();
				link_buyNow_35(ANY, READY).click();
				logInfo("£35 Bundle Selected");
				break;
				//--------------------------------------
			case "75":
				link_joinNow£75(ANY, READY).click();
				logInfo("£75 Bundle Selected");
				break;
				//--------------------------------------
			case "85":
				link_buyNow£85_2(ANY, READY).click();
				logInfo("£85 Bundle Selected");
				break;
				//--------------------------------------
			case "105":
				link_joinNow£105(ANY, READY).click();
				logInfo("£105 Bundle Selected");
				break;
				//--------------------------------------
			case "110":
				link_buyNow£110(ANY, READY).click();
				logInfo("£110 Bundle Selected");
				break;
				//--------------------------------------
			case "115":
				link_buyNow£115_2(ANY, READY).click();
				logInfo("£115 Bundle Selected");
				break;
				//--------------------------------------
			case "140":
				link_buyNow£140(ANY, READY).click();
				logInfo("£140 Bundle Selected");
				break;
				//--------------------------------------
			case "145":
				link_joinNow£145(ANY, READY).click();
				logInfo("£145 Bundle Selected");
				break;
				//--------------------------------------
			case "155":
				link_buyNow£155_2(ANY, READY).click();
				logInfo("£155 Bundle Selected");
				break;
				//--------------------------------------
		}				
	}
}

