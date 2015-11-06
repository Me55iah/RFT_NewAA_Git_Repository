package Basics_Road;

import java.io.Console;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import resources.Common_Variables;
import resources.Basics_Road.Confirmation_4Helper;
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
public class Confirmation_4 extends Confirmation_4Helper{

	/**
	 * Script Name   : <b>Confirmation</b>
	 * Generated     : <b>11 Feb 2015 15:23:41</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/02/11
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		//------------------------------------------------------------------------------------------
		// Synchronise
		html_container(ANY, LOADED).waitForExistence(50, 0.25);
		sleep(2);
		//------------------------------------------------------------------------------------------
		// Grab Textual Content From Screen
		String sContainer_Confirmation = (String)html_container().getProperty(".contentText");		
		//------------------------------------------------------------------------------------------
        // VP Thanks for buying Basic Breakdown Insurance 
        //html_container().performTest( Journey_CompleteVP() );          //***************
		//------------------------------------------------------------------------------------------
		//------------------------------------------------------------
		// QUOTE REFERENCE	
		String sStartName = "Your customer number is ";
		String sEndName = " – please ";
		int iIndex = 1;
		String sStartNameContent = null;
		//------------------------------------------------------------
		// Contains Customer Number
		logInfo(" - - - - -  C U S T O M E R    N U M B E R  - - - - -");
		subString(sContainer_Confirmation, sStartName, sEndName, iIndex, sStartNameContent);
		//------------------------------------------------------------
		Common_Variables.customerNumber = Common_Variables.sActual;
		//------------------------------------------------------------
		String sCustomer_Number = Common_Variables.sActual;
		
		//------------------------------------------------------------------------------------------
		// Separate All Number Groups (As Tokens) From Above Textual Content
		//int i = 0;
       // String delims = "[^.0-9]+";
       // String[] tokens = sContainer_Confirmation.split(delims);
		//------------------------------------------------------------------------------------------
        // Report On The 15th Token (Contains Customer Number)     
        System.out.println(" Reported Customer Number Is "+sCustomer_Number);
        logTestResult(" Reported Customer Number Is "+sCustomer_Number, true);
        vpManual("Journey_Complete", "Journey_Complete", "Journey_Complete").performTest(); 
        logTestResult(" Journey Complete ", true);
		//------------------------------------------------------------------------------------------
        
	}
}

