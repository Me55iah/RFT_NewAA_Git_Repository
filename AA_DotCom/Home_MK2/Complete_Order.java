package Home_MK2;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.ParseException; 
import java.util.Date; 
import java.util.Locale; 

import resources.Common_Variables;
import resources.Home_MK2.Complete_OrderHelper;
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
public class Complete_Order extends Complete_OrderHelper
{
	/**
	 * Script Name   : <b>Complete_Order</b>
	 * Generated     : <b>30 Jan 2015 13:20:58</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/01/30
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
////		// // Test Data
// 		(Common_Variables.Title) = "Ms";
//		(Common_Variables.proposerDOB) = "10/03/1956";
//		(Common_Variables.propertyType) = "Bungalow";
//		(Common_Variables.numBedrooms) = "5";
//		(Common_Variables.paymentType) = "Monthly Card Payment";
//		(Common_Variables.membership) = true;
//		(Common_Variables.insCoverStartDay) = 5;
//		
////		// // Test Data

		//--------------------------------------------------------------------------------------------------
		// Synchronise on Page Start
		text_firstname().waitForExistence(10,  0.25);
		//--------------------------------------------------------------------------------------------------					
		// Title of Purchaser          (Mr/Mrs/Miss/Ms) **  DEFAULT NONE SET  **
		switch (Common_Variables.proposerTitle){
		
			case "Mr":				//		(Level 1)
				label_mr(ANY, READY).click();	
				break;

			case "Mrs":				//		(Level 2)
				label_mrs(ANY, READY).click();
				break;
	
			case "Miss":			//		(Level 2)
				label_miss(ANY, READY).click();
				break;

			case "Ms":				//		(Level 2)
				label_ms(ANY, READY).click();
				break;		
		}		
			logTestResult("Title Was Set To "+Common_Variables.Title, true);
		//--------------------------------------------------------------------------------------------------					
		// First Name
		text_firstname(ANY, READY).click(atPoint(49,20));
		iE(document_homeMembershipCover(),DEFAULT_FLAGS).inputChars("Tiatest");
		//--------------------------------------------------------------------------------------------------					
		// Last Name
		text_surname(ANY, READY).click(atPoint(28,6));
		iE(document_homeMembershipCover(),DEFAULT_FLAGS).inputChars("Tiatest");
		//--------------------------------------------------------------------------------------------------					
		// DoB          (dd/mm/yyyy) **  DEFAULT NONE SET  **
		String dobDay = Common_Variables.proposerDOB.substring(0, 2);
		String dobMonth = Common_Variables.proposerDOB.substring(2, 5);
		String dobYear = Common_Variables.proposerDOB.substring(5);
		//-------------------------------------------------------------					
		// Set DOB Day
		html_dobDay(ANY, READY).click(atPoint(40,20));
		iE(document_homeMembershipCover(),DEFAULT_FLAGS).inputKeys(dobDay);
		//-------------------------------------------------------------					
		// Set DOB Month
		html_dobMonth(ANY, READY).click(atPoint(79,20));
		iE(document_homeMembershipCover(),DEFAULT_FLAGS).inputKeys(dobMonth);
		//-------------------------------------------------------------					
		// Set DOB Year
		html_dobYear(ANY, READY).click(atPoint(75,30));
		iE(document_homeMembershipCover(),DEFAULT_FLAGS).inputKeys(dobYear);
		//--------------------------------------------------------------------------------------------------					
		// Telephone
		html_telephone(ANY, READY).click(atPoint(283,30));
		iE(document_homeMembershipCover(),DEFAULT_FLAGS).inputKeys("0123456789");
		//--------------------------------------------------------------------------------------------------					
		// EMail
		text_email(ANY, READY).click(atPoint(280,27));
		iE(document_homeMembershipCover(),DEFAULT_FLAGS).inputKeys("tiatest@theaa.com");
		//--------------------------------------------------------------------------------------------------					
//		// House Number = PRE-POPULATED Fro Quick Quote Page (Page 1)
//		text_lineOne(ANY, READY).click(atPoint(250,12));
//		iE(document_homeMembershipCover(),DEFAULT_FLAGS).inputKeys("28");
		//--------------------------------------------------------------------------------------------------					
//		// Post Code = PRE-POPULATED
//		text_postcode(ANY, READY).click(atPoint(263,23));
		//	iE(document_homeMembershipCover(),DEFAULT_FLAGS).inputKeys("RG248GB");
		//--------------------------------------------------------------------------------------------------
		// Search Address and Verify
		button_findYourFullAddresssubm(ANY, READY).click();
		sleep(1);
		BrowserSync();
		// Address Line 1 Verify
		Object done;
		text_lineOne().waitForExistence(5,  0.25);
		String sAddressLineOne_Value = (String)text_lineOne().getProperty(".value");
		if ((boolean) (done=vpManual("Address_Line_1", sAddressLineOne_Value, "5 MARIGOLD CLOSE").performTest())){
			// passed
		}
		else{
			//stop();// Failed
		}

		
//		if(done=vpManual("Address_Line_1",sAddressLineOne_Value.performTest())){ 
//			logTAFStep("Page loaded correctly:'"+ sAddressLineOne_Value+"'"); 
//			done = true; 
//		}
		
		//--------------------------------------------------------------------------------------------------
		sleep(1); // BrowserSync();
		//--------------------------------------------------------------------------------------------------
		// Address Line 2 Verify
		text_lineOne().waitForExistence(5,  0.25);
		String sAddressLineTwo_Value = (String)text_lineTwo().getProperty(".value");
		vpManual("Address_Line_2", sAddressLineTwo_Value, "").performTest();	
		//--------------------------------------------------------------------------------------------------
		sleep(1); // BrowserSync();
		//--------------------------------------------------------------------------------------------------
		// Address Line 3 Verify
		text_townOrCity2().waitForExistence(5,  0.25);
		String sTownOrCity_Value = (String)text_townOrCity2().getProperty(".value");
		vpManual("Address_Line_3", sTownOrCity_Value, "BASINGSTOKE").performTest();
		//--------------------------------------------------------------------------------------------------
		sleep(1); // BrowserSync();
		//--------------------------------------------------------------------------------------------------
		// Address Line 4 Verify
		text_county2().waitForExistence(5,  0.25);
		String sCounty_Value = (String)text_county2().getProperty(".value");
		vpManual("Address_Line_4", sCounty_Value, "HAMPSHIRE").performTest();
		//--------------------------------------------------------------------------------------------------
		sleep(1); // BrowserSync();
		//--------------------------------------------------------------------------------------------------
		// Address Line 5 Verify
		text_postcode2().waitForExistence(5,  0.25);
		String sPostcode_Value = (String)text_postcode2().getProperty(".value");
		vpManual("Address_Line_5", sPostcode_Value, "RG22 5RG").performTest(); // RG21 4EA
		
		//--------------------------------------------------------------------------------------------------
		// Property Type
		switch (Common_Variables.propertyType){
		
			case "Terraced":					//		(Level 1)
				label_terraced(ANY, READY).click();	
				break;

			case "Semi-Detached":				//		(Level 2)
				label_semiDetached(ANY, READY).click();
				break;
	
			case "Bungalow":					//		(Level 3)
				label_bungalow(ANY, READY).click();
				break;

			case "Detached":					//		(Level 4)
				label_detached(ANY, READY).click();
				break;		

			case "label_flatMaisonette":		//		(Level 5)
				label_flatMaisonette(ANY, READY).click();
				break;		
		
		}		
			logTestResult("Title Was Set To "+Common_Variables.Title, true);
		//--------------------------------------------------------------------------------------------------					
		// Number Of Bedrooms
		switch (Common_Variables.numBedrooms){
		
			case "1":							//		(Level 1)
				label_Bed_1(ANY, READY).click();	
				break;

			case "2":							//		(Level 2)
				label_Bed_2(ANY, READY).click();
				break;
	
			case "3":							//		(Level 3)
				label_Bed_3(ANY, READY).click();
				break;

			case "4":							//		(Level 4)
				label_Bed_4(ANY, READY).click();
				break;	
				
			case "5":							//		(Level 5)
				label_Bed_5(ANY, READY).click();
				break;		
		}		
			logTestResult("Number of Bedrooms in Property = "+Common_Variables.numBedrooms, true);

		//--------------------------------------------------------------------------------------------------					
		// Policy Start Date
		switch (Common_Variables.insCoverStartDay){
		
			case 0:							//		(Level 1) Starts Today
				label_today(ANY, READY).click();	
				break;
			
			case 1:							//		(Level 2) Starts Tomorrow
				label_tomorrow(ANY, READY).click();	
				break;

			default:						//		(Level 3) Starts Some Other Time
				label_other(ANY, READY).click();	
				
				CurrDate(Common_Variables.insCoverStartDay); String sFutureDay = CurrDate(Common_Variables.insCoverStartDay);
							
				String startDay = (sFutureDay.substring(0, 2));
				String startMonth = (sFutureDay.substring(2, 5));
				String startYear = (sFutureDay.substring(5));
				//-------------------------------------------------------------					
				// Set DOB Day
 				html_startDay(ANY, READY).click(atPoint(40,20));
 				iE(document_homeMembershipCover(),DEFAULT_FLAGS).inputKeys(startDay);
 				//-------------------------------------------------------------					
 				// Set DOB Month
 				html_startMonth(ANY, READY).click(atPoint(79,20));
 				iE(document_homeMembershipCover(),DEFAULT_FLAGS).inputKeys(startMonth);
 				//-------------------------------------------------------------					
 				// Set DOB Year
 				html_startYear(ANY, READY).click(atPoint(75,30));
 				iE(document_homeMembershipCover(),DEFAULT_FLAGS).inputKeys(startYear);
 				//--------------------------------------------------------------------------------------------------					 
				break;
			}
		//--------------------------------------------------------------------------------------------------									
		sleep(1);
		button_nextsubmit(ANY, READY).waitForExistence(20,  0.25);
		button_nextsubmit().click();		
		//--------------------------------------------------------------------------------------------------
		BrowserSync();
		//--------------------------------------------------------------------------------------------------
	}
}

