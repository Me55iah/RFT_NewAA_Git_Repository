package Utilities;
import resources.Common;
import resources.Common_Variables;
import resources.Utilities.Environment_SelectorHelper;
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
public class Environment_Selector extends Environment_SelectorHelper
{
	/**
	 * Script Name   : <b>Environment_Selector</b>
	 * Generated     : <b>30 Dec 2014 09:26:31</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2014/12/30
	 * @author horned
	 */	

	////////////////////////////////////////////////////////////////////////////////////////
	//
	//   ENVIRONMENT SELECTOR (Extracted From Repeating Code Across Suite (USE ONE INSTANCE) - Dave Horne - December 2014
	//
	////////////////////////////////////////////////////////////////////////////////////////	
	
	public static String[] environmentURL = new String[1];
		
	public void testMain(Object[] args) 
	{
		//int endRow = 25; // 23
		int endRow = (Common_Variables.endRow);
		int currentRow = 0;
		//-----------------------------------------------------------------------------------------------
		// PLAYBACK MONITOR MANIPULATION
		callScript("Utilities.Playback_Monitor");
		//-----------------------------------------------------------------------------------------------

		//-----------------------------------------------------------------------------------------------
		if (Common_Variables.bulkTest == false) {
			
			//-----------------------------------------------------------------------------------------------
	 		// Unattended Regression Test Executions - 
			//											Set By Running Overnight_Regression_Testing script
			//-----------------------------------------------------------------------------------------------
			boolean bUnattended_Test_Executions = Common_Variables.unettended_Executions;
	
			if (bUnattended_Test_Executions == true){
				// * * *  FIXED START ROW FOR UNATTENDED OVERNIGHT EXECUTIONS  * * *
				Common_Variables.startRow = 0;
				// * * *  FIXED ENVIRONMENT FOR UNATTENDED OVERNIGHT EXECUTIONS  * * *
	 			Common_Variables.selectedEnvironment = "prelive1";
			}
			//-----------------------------------------------------------------------------------------------
	 		// Attended Regression Test Executions
			//-----------------------------------------------------------------------------------------------
			else {
				
				// ATTENDED TESTING
				// This code triggers a question at runtime that will ask what row
				// you want to start on/		
	 			Common_Variables.startRow = Integer.parseInt(Common.startRow(endRow));
								
	 			// ATTENDED TESTING
				// This code triggers a question at runtime to specify the
				// Environment you wish to use.
	 			Common_Variables.selectedEnvironment = Common.selectedUAT();

			}			
		}
		//-----------------------------------------------------------------------------------------------
		// Decide here if this is a LIVE or PRE LIVE test, if it's LIVE or PL1
		// then we don't run payments.
		if (Common_Variables.selectedEnvironment.contains("prelive")) {
			Common_Variables.liveTest = false;
		}
		if (Common_Variables.selectedEnvironment.equals("live")) {
			Common_Variables.liveTest = true;
		}
		//-----------------------------------------------------------------------------------------------
		System.out.println("Start row = " + Common_Variables.startRow);
		System.out.println("End row = " + endRow);
		//-----------------------------------------------------------------------------------------------
		// Make Generic, For Any Functional Area
		String sFunctionArea = Common_Variables.functionalArea;
		boolean iLiveTest = Common_Variables.liveTest;
		//-----------------------------------------------------------------------------------------------
		switch (sFunctionArea){
			
			//-----------------------------------------------------------------------------------------------
			// MOTOR
			case "car-insurance":    // https://www.theaa.com/car-insurance/buy/car-details
				String sURLTaileci = "/buy/car-details?ForceSplit=na:new";    // "/buy/car-details";
				if (iLiveTest == true){
					environmentURL[0] = "https://" +
							"www.theaa.com/"+sFunctionArea+sURLTaileci;}				
				else{
					environmentURL[0] = "https://"
							+ Common_Variables.selectedEnvironment
							+ ".theaa.com/"+sFunctionArea+sURLTaileci;}
				break;
			//-----------------------------------------------------------------------------------------------
			// EBC
			case "european-breakdown-cover":
				String sURLTailebc = "/?prov=OL2&prom=ONLINE&ico=homepage&icl=european_breakdown_cover&icc=header#/";
				if (iLiveTest == true){
					environmentURL[0] = "https://" +
							"www.theaa.com/"+sFunctionArea+sURLTailebc;}				
				else{
					environmentURL[0] = "https://"
							+ Common_Variables.selectedEnvironment
							+ ".theaa.com/"+sFunctionArea+sURLTailebc;}
				break;
			//-----------------------------------------------------------------------------------------------
			// HM
			case "home-membership":				
				if (iLiveTest == true){
					environmentURL[0] = "https://" +
							"www.theaa.com/"+sFunctionArea+"/#/";}				 
				else{
					environmentURL[0] = "https://"
							+ Common_Variables.selectedEnvironment
							+ ".theaa.com/"+sFunctionArea+"/#/";}
				break;
			//-----------------------------------------------------------------------------------------------
			// HB		Breakdown Basics - Road Basics
			case "breakdown-cover":	
				String sURLTailb = "/?ico=homepage&icl=aa_breakdown_cover&icc=header"; //?ico=road_home&icl=getcover&icc=basic&prov=WE999&icc=hero&ico=homepage&prom=A1037&icl=get_breakdown_cover#/";
				if (iLiveTest == true){   // https://www.theaa.com/breakdown-cover/uk-breakdown/view-options.do?ico=road_home&icl=getcover&icc=create

					environmentURL[0] = "https://" +
							"www.theaa.com/"+sFunctionArea+sURLTailb;}		// sFunctionArea+sURLTailb		"www.theaa.com/"+sFunctionArea+"/#/";} 
				else{
					environmentURL[0] = "https://"
							+ Common_Variables.selectedEnvironment
							+ ".theaa.com/"+sFunctionArea+sURLTailb;}
				break;				
			//-----------------------------------------------------------------------------------------------
			// UK Breakdown (Road)   // 	environmentURL[0] = "https://www.theaa.com/breakdown-cover/uk-breakdown/view-options.do?ico=road_home&icl=getcover&icc=create";}
			case "breakdown-cover/uk-breakdown":	
				String sURLTailc = "/view-options.do?ico=road_home&icl=getcover&icc=create";
				if (iLiveTest == true){
					environmentURL[0] = "https://" +
							"www.theaa.com/"+sFunctionArea+sURLTailc;}				 
				else{
					environmentURL[0] = "https://"
							+ Common_Variables.selectedEnvironment
							+ ".theaa.com/"+sFunctionArea+sURLTailc;}
				break;
			//-----------------------------------------------------------------------------------------------
			// Alligators
			case "Aggregators":	
				if (iLiveTest == true){
					environmentURL[0] = "http://" +
							"www.theaa.com";}				 
				else{
					environmentURL[0] = "http://"+Common_Variables.selectedEnvironment+".theaa.com";}
				break;
			//-----------------------------------------------------------------------------------------------
			// Vehicle Inspection   // 	environmentURL[0] = "https://www.theaa.com/breakdown-cover/uk-breakdown/view-options.do?ico=road_home&icl=getcover&icc=create";}
			case "vehicle-inspection":	
				String sURLTaild = "/?ico=homepage&icl=vehicle_inspections&icc=header#/mini-details";
				if (iLiveTest == true){
					environmentURL[0] = "https://" +
							"www.theaa.com/"+sFunctionArea+sURLTaild;}				 
				else{
					environmentURL[0] = "https://"
							+ Common_Variables.selectedEnvironment
							+ ".theaa.com/"+sFunctionArea+sURLTaild;}
				break;				
			//-----------------------------------------------------------------------------------------------

		}
		
//		// Set the Test Environment you wish to use
//		if (Common_Variables.liveTest == true) {
//			environmentURL[0] = "https://www.theaa.com/"+sFunctionArea+"/?prov=OL2&prom=ONLINE&ico=homepage&icl=european_breakdown_cover&icc=header#/";
//					
////					"http://"+Common_Variables.selectedEnvironment+"www.theaa.com/"+sFunctionArea+"/?prov=OL2&prom=ONLINE&ico=homepage&icl="
////					+sFunctionArea+"&icc=header#/"; //http://www.theaa.com/"+sFunctionArea+"/viewBreakdownCoverDetails.do"; //
//		}
//		if (Common_Variables.liveTest == false) {
//                               // http
//			environmentURL[0] = "https://"
//					+ Common_Variables.selectedEnvironment
//					+ ".theaa.com/"+sFunctionArea+"/?prov=OL2&prom=ONLINE&ico=homepage&icl=european_breakdown_cover&icc=header#/";
//			// https://prelive1.theaa.com/european-breakdown-cover/?prov=OL2&prom=ONLINE&ico=homepage&icl=european_breakdown_cover&icc=header#/
//			// https://prelive2.theaa.com/"+sFunctionArea+"/#/
//			//  + ".theaa.com/"+sFunctionArea+"/viewBreakdownCoverDetails.do";  // https
//		
//		}	
			//-----------------------------------------------------------------------------------------------
			// PASS THE SELECTED URL FOR REUSE
		Common_Variables.selectedEnvironment = environmentURL[0];
		// DEBUG AID
		//System.out.println(" Enviromment Selected Was "+environmentURL[0]);
		//System.out.println(" Enviromment Area Was "+Common_Variables.selectedEnvironment);
		//System.out.println(" Function Area "+sFunctionArea);
		//System.out.println(" Start Row Count "+Common_Variables.startRow);
		//-----------------------------------------------------------------------------------------------
		
		
	}
}

