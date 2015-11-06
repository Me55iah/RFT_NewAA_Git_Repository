package Verification;
import resources.Verification.MAF_Road_TextualHelper;
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
public class MAF_Road_Textual extends MAF_Road_TextualHelper
{
	/**
	 * Script Name   : <b>MAF_Road_Textual</b>
	 * Generated     : <b>2 Jun 2015 09:53:59</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/02
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		// Verification of MAF Textual Changes on ROAD
		
		
		String sMAFText = "Prices shown include fees payable under a separate contract between you and Automobile Association Insurance Services Limited (AAIS) for arranging and administering your cover. The fees are £24 for vehicle cover and cover for you, £33 for cover for two people and £42 for family cover. There is a fee of £9 each for National Recovery, At Home and Onward Travel. If paying monthly, these fees will be split across your monthly instalments. By paying these amounts you will enter into the contract with AAIS. Please see the terms and conditions for more information.";
		
		// MAIN BODY TEXT
		String sMAF_MainText = (String)html_bd_important_information().getProperty(".text");
		
		
		if (sMAF_MainText.contains("The fees are £24 for vehicle cover and cover for you, £33 for cover for two people and £42 for family cover")){
			logTestResult(" Textual MAF MAIN Detail Is Correct", true);
		}
		else {
			logTestResult(" Textual MAF MAIN Detail Is INCORRECT", false);

		}
	
//		// RH SUMMARY TEXT
//		String sMAF_SubText = (String)html_scrollSummary().getProperty(".text");
//		
//		if (sMAF_SubText.contains("The price includes fees for arranging and administering your cover")){
//			logTestResult(" Textual MAF SUB Detail Is Correct", true);
//		}
//		else {
//			logTestResult(" Textual MAF SUB Detail Is INCORRECT", false);
//
//		}
		
		
	}
}

