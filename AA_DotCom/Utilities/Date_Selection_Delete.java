package Utilities;
import resources.Common_Variables;
import resources.Utilities.Date_Selection_DeleteHelper;
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
public class Date_Selection_Delete extends Date_Selection_DeleteHelper
{
	/**
	 * Script Name   : <b>Date_Selection</b>
	 * Generated     : <b>24 Dec 2014 10:46:26</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2014/12/24
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
	
		// S U P E R C E E D E D  S U P E R C E E D E D  S U P E R C E E D E D  S U P E R C E E D E D
		
		
		//-------------------------------------  S T A R T  ----------------------------------------
		//                      
		//				Script Name   : <b>Popup_Date_Picker</b>
		//
		//-------------------------------------  S T A R T  ----------------------------------------
		
	{
			
			// Debug Test Data Start   **** COMMENT I AND OUT AS REQUIRED ****
			
//			(Common_Variables.EBC_tripDuration) = "14";
//			(Common_Variables.EBC_tripFutureStartDay) = "0";
		 
			
/*			// ********************      Debug Test Data End     ***************************	

			//--------------------------------------------------------------------
			// GET DAY (Numeric) VALUE (to enable CAl Day Selection Directly (Simple)
			CurrDay(0); String sToday = CurrDay(0);
			System.out.println("Today is the = " + sToday+" st/nd/rd/th ");
			//--------------------------------------------------------------------
			// GET MONTH (Numeric) VALUE (to enable CAl Day Selection Directly (Simple)
			CurrMonth(0); String sMonth = CurrMonth(0);
			System.out.println("This Month is Number = " + sMonth+" 1 thru 12 ");
			//--------------------------------------------------------------------
			// Days existing for current month, Needed resolving to enable control selection
			String sNumberofDays = "";
			switch (CurrMonth(0)){
				                          // Bound to be a simpler way
				case "01":			
					sNumberofDays = "31"; break;	// Jan				
				case "02":					
					sNumberofDays = "28"; break;	// Feb					
				case "03":					
					sNumberofDays = "31"; break;	// Mar					
				case "04":					
					sNumberofDays = "30"; break;	// Apr					
				case "05":			
					sNumberofDays = "31"; break;	// May					
				case "06":					
					sNumberofDays = "30"; break;	// Jun				
				case "07":					
					sNumberofDays = "31"; break;	// Jul					
				case "08":					
					sNumberofDays = "31"; break;	// Aug					
				case "09":			
					sNumberofDays = "30"; break;	// Sep					
				case "10":					
					sNumberofDays = "31"; break;	// Oct					
				case "11":					
					sNumberofDays = "30"; break;	// Nov					
				case "12":					
					sNumberofDays = "31"; break;	// Dec					
			}
			//--------------------------------------------------------------------
			// Assume Start of Policy is Today (Saves time :-) MAYBE NOT?
			
			// Grab Policy Length from dP/Vars
			String sDuration = Common_Variables.EBC_tripDuration;
			// String sEndDay = ((sDuration)+(sToday));
						
			//--------------------------------------------------------------------			
			// Do the future math, across months detection
			//--------------------------------------------------------------------
			
			// If Coverage Extends Beyond The Current Month Detection
			//int iDayToSelect = Integer.parseInt(sEndDay);   		// Target Day to Select (Numeric Value)
			int iMonth = Integer.parseInt(sMonth);					// Month (Numeric Value) 1 thru 12
			int iDaysinMonth = Integer.parseInt(sNumberofDays);		// Number of Days in Current Month
			int iTripDuration = Integer.parseInt(sDuration);		// Trip Duration in Days (Numeric)
			int iToday = Integer.parseInt(sToday);					// Today (Numeric)			
			int iDayToSelect = iTripDuration+iToday;				// Total Number of Days from Today?
			int iDaysRemaining = iDaysinMonth-iToday;				// Days Left In Current Month			
			int iDay = iTripDuration - iDaysRemaining;				// Trip Duration Minus Days Remaining In Current Month
			
			System.out.println("Trip Duration is = " +iTripDuration+" Days, Month = "+iMonth+" - Number of Days in Month = " +
					""+iDaysinMonth+" - Day to Select = "+(iDayToSelect)+" Days in the Future (from first day of current month");
			
			//--------------------------------------------------------------------								
			int iMonthFlag = 0;
			// Detect if cover duration extends past end of current month
			if (iDayToSelect>iDaysinMonth){
				iMonthFlag = 1;
			}
			else if (iDayToSelect>iDaysinMonth){
				iMonthFlag = 2;
			}
			//--------------------------------------------------------------------												
			// Click OTHER on Bottom (EndDate) Calender To Expose the FULL Monty :-)
 			bottom_Other().waitForExistence(20.0,  0.25);
 			bottom_Other(ANY, READY).click();
			//---------------------------------------------------------------------------
						
			switch (iMonthFlag){
				// Beyond Current Month
				case 1:
					System.out.println("Next Month Selection");
					//------------------------------------------------------
					// Click Next Button on Bottom Calender
					next_Month().waitForExistence(20.0,  0.25);
					next_Month(ANY, READY).click();
					//------------------------------------------------------					
					break;
				// NOT Beyond Current Month
				case 2:
					// No Action Required
					break;	
			}			
			//---------------------------------------------------------------------------
			 
 			// Select the DAY on the CURRENT Calender, Whether this Month or Next.			
			RootTestObject rto = getRootTestObject();
			TestObject[] gto = rto.find(atDescendant("class","pickadate-enabled","#text", iDayToSelect), false);
				
			// sCalendarToSelect 
			System.out.println(" There are "+gto.length+" Days Displayed on the Calender Control");   // 
			GuiTestObject Cal_Button = (GuiTestObject)gto[1];  // typically returns 33 (active current month values + Inactive items of previous and future month)
			//------------------------------------------------------					
			// Finally Click The Day Required and Report			
			String sStartDay = (String)Start_Day().getProperty(".text");
			String sEndDay = (String)End_Day().getProperty(".text");
			//------------------------------------------------------					
			try {
				Cal_Button.click();		
				logTestResult(" Cover Was Selected from "+sStartDay+" TO "+sEndDay, true);
			}
			catch (Exception e){
				logTestResult(" Calendar FAILED to Select", false);
			}
			finally {
				// Clear the trash created by GuiTestObject Find Functionality above
				unregisterAll();
			}*/
			//------------------------------------------------------					


		//--------------------------------------  E  N  D  -----------------------------------------
		//                      
		//				Script Name   : <b>Popup_Date_Picker</b>
		//
		//--------------------------------------  E  N  D  -----------------------------------------
		}
	}
}

