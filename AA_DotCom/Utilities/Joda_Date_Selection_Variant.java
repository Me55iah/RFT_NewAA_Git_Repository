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
import resources.Utilities.Joda_Date_Selection_VariantHelper;
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
public class Joda_Date_Selection_Variant extends Joda_Date_Selection_VariantHelper
{
	/**
	 * Script Name   : <b>Joda_Date_Selection_Variant</b>
	 * Generated     : <b>9 Feb 2015 13:41:39</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/02/09
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//----------------------------------------------------------------------
		// Abgular.js Date Picker - Annual One Date (Derived From JDS)
		//----------------------------------------------------------------------		
		// ----------------------- DEBUG ------------------------
		//(Common_Variables.EBC_tripDuration) = 365;        // Active For Annual Only
		//(Common_Variables.EBC_tripFutureStartDay) = 8;   //Active for Single OR Annual

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
			//DateTime dt2 = new DateTime(d2);  // Ending Day/Date
			//-----------------------------------------------------------------
			// ADD Days to Starting Date
			dt1 = dt1.plusDays(0); // Today
			dtSD = dt1.plusDays(Common_Variables.EBC_tripFutureStartDay);// offset from today :-) - 0 = today
//			dt2 = dtSD.plusDays(Common_Variables.EBC_tripDuration);		 // total number of days Covered By Single Trip
			//-----------------------------------------------------------------
			// Get Actual DAY and MONTH For Start Policy and End Policy Dates 
			int iC_Month = dt1.getMonthOfYear();   // Today as Datum (Month)
			int iS_Month = dtSD.getMonthOfYear();  // Starting Month (Including any Offset)
			//int iE_Month = dt2.getMonthOfYear();   // Ending Month
			// Resolve Actual Day (INT) In Month
			int iS_Day = dtSD.getDayOfMonth();	 	// Start Day to Select Within Target Month (Including any Offset)
			//int iE_Day = dt2.getDayOfMonth();	 	// End Day to Select Within Target Month
			//----------------------------------------------------------------------------------
			// SINGLE JOURNEY RETURN DATE START
			//	System.out.println(" Current Month = iC_Month " + iC_Month + " Starting Day = iS_Day "+ iS_Day  + " Ending Day - iE_Day "+ iE_Day);
			//	System.out.println(" Starting Month -iS_Month " + iS_Month + " Ending Month - iE_Month "+ iE_Month);
			//----------------------------------------------------------------------			
			// Click OTHER on Top (EndDate) Calender To Expose the FULL Monty :-)
 			label_other().waitForExistence(20.0,  0.25);
			// EXPAND START/TOP CALENDER
 			label_other(ANY, READY).click();
			//----------------------------------------------------------------------
 			if (iC_Month != iS_Month){
 				// Navigate To Following Months If Required
  				//int Incrementor = (iS_Month - iC_Month);   // (Math.abs(-1));
 				int Incrementor = iC_Month;
  				while( Incrementor < iS_Month ) {
  	 				System.out.println(" Increment Month " + Incrementor);

 					link_next().waitForExistence(2,  0.25);
 					link_next(ANY, READY).click();
 					Incrementor++;
 				}
  			}
 			//=========================================================
 			// SELECT START DAY
  			DatePicker(iS_Day,0); // Select Start Day at Index 0 (Only Calender)
			//=========================================================
		} catch (Exception e) {
			e.printStackTrace();		 
		} 		
	}
}