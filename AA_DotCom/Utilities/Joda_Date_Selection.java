package Utilities;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.Months;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.Seconds;

import resources.Common_Variables;
import resources.Utilities.Joda_Date_SelectionHelper;
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
public class Joda_Date_Selection extends Joda_Date_SelectionHelper
{
	/**
1	 * Script Name   : <b>Joda_Date_Selection</b>
	 * Generated     : <b>5 Jan 2015 12:34:29</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/01/05
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//----------------------------------------------------------------------
		// Abgular.js Date Picker - Short Trip Between Two Dates or Annual One Date
		//----------------------------------------------------------------------		
		// ----------------------- DEBUG ------------------------
//		(Common_Variables.EBC_tripDuration) = 60;        // Active For Annual Only
//		(Common_Variables.EBC_tripFutureStartDay) = 30;   //Active for Single OR Annual
////		(Common_Variables.EBC_Product) = "Annual cover";		
//		(Common_Variables.EBC_Product) = "Single trip";		
		// ----------------------- DEBUG ------------------------		
		//----------------------------------------------------------------------
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		//----------------------------------------------------------------------
		// Get the date today using Calendar object.
		//----------------------------------------------------------------------
		Date today = Calendar.getInstance().getTime();    
		String reportDate = format.format(today);
		//----------------------------------------------------------------------		
		// Define Vars	
		String dateStart = reportDate;
		String dateStop = reportDate;
		Date d1 = null;
		Date d2 = null;
		//----------------------------------------------------------------------
		// System.out.println("Output/Test Date: " + reportDate);
		//----------------------------------------------------------------------
		try {
			d1 = format.parse(dateStart);
			d2 = format.parse(dateStop);
			//-----------------------------------------------------------------
			DateTime dtSD = new DateTime(d1); // Difference Between Today and Actual Starting Day
			DateTime dt1 = new DateTime(d1);  // Starting Day/Date
			DateTime dt2 = new DateTime(d2);  // Ending Day/Date
			//-----------------------------------------------------------------
			// ADD Days to Starting Date
			dt1 = dt1.plusDays(0); // Today
			dtSD = dt1.plusDays(Common_Variables.EBC_tripFutureStartDay);// offset from today :-) - 0 = today
			dt2 = dtSD.plusDays(Common_Variables.EBC_tripDuration);		 // total number of days Covered By Single Trip
			//-----------------------------------------------------------------
			// Get Actual DAY and MONTH For Start Policy and End Policy Dates 
			int iC_Month = dt1.getMonthOfYear();   // Today as Datum (Month)
			int iS_Month = dtSD.getMonthOfYear();  // Starting Month (Including any Offset)
			int iE_Month = dt2.getMonthOfYear();   // Ending Month
			// Resolve Actual Day (INT) In Month
			int iS_Day = dtSD.getDayOfMonth();	 // Start Day to Select Within Target Month (Including any Offset)
			int iE_Day = dt2.getDayOfMonth();	 // End Day to Select Within Target Month
			//----------------------------------------------------------------------
			// Start Day/Date Selection
//---------------------------------------------------------------------------------------												
			// Click OTHER on Top (StartDate) Calender To Expose the FULL Monty :-)
 			label_other_Start().waitForExistence(20.0,  0.25);
			// EXPAND START/TOP CALENDER
 			label_other_Start(ANY, READY).click();
			//----------------------------------------------------------------------
 			// Start Date Selection For BOTH Annual Cover and Single Trip
 			// Detect If Policy Start IS Beyond The Current End Month
 			if (iC_Month != iS_Month){
 				// Navigate To Following Months If Required
 				int Incrementor = iS_Month - iC_Month;
  				while( Incrementor < iS_Month ) {
 					link_start_Next().waitForExistence(2,  0.25);
 					link_start_Next(ANY, READY).click();
 					Incrementor++;
 				}
  			}
			//=========================================================
 			// SELECT START DAY
 			DatePicker(iS_Day,0); // Select Start Day at Index 0 (Top Calender)
			//=========================================================
			// ANNUAL COVER? - ESCAPE HERE BACK TO CALLING SCRIPT - Only Set Start Date!
			if (Common_Variables.EBC_Product.equalsIgnoreCase("Annual Cover")){
				return;
			}
			//----------------------------------------------------------------------
			// END of Annual Policy (1) Date Setting
//----------------------------------------------------------------------------------
			// SINGLE JOURNEY RETURN DATE START
			//----------------------------------------------------------------------			
			// Click OTHER on Top (EndDate) Calender To Expose the FULL Monty :-)
 			label_other_End().waitForExistence(20.0,  0.25);
			// EXPAND START/TOP CALENDER
 			label_other_End(ANY, READY).click();
			//----------------------------------------------------------------------
 			if (iS_Month != iE_Month){
 				// Navigate To Following Months If Required
 				int Incrementor = iC_Month; // iS_Month - iE_Month;
  				while( Incrementor < iE_Month ) {
 					link_end_Next().waitForExistence(2,  0.25);
 					link_end_Next(ANY, READY).click();
 					Incrementor++;
 				}
  			}
 			//=========================================================
 			// SELECT END DAY
  			DatePicker(iE_Day,1); // Select End Day at Index 1 (Bottom Calender)
			//=========================================================
		} catch (Exception e) {
			e.printStackTrace();		 
		} 		
	}
}

