package Utilities;
import java.awt.Point;
import java.awt.Rectangle;

import resources.Utilities.Stay_AwakeHelper;
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
@SuppressWarnings("unused")
public class Stay_Awake extends Stay_AwakeHelper
{
	/**
	 * Script Name   : <b>Stay_Awake</b>
	 * Generated     : <b>25 Nov 2014 15:27:03</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/11/25
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//////////////////////////////////////////////////////////////////////
		// AA Computers Hibernate(screensave) after 15 minutes by default   //
		// This action breaks test automation execution                     //
		//////////////////////////////////////////////////////////////////////
		
		//-------------------------------------------------------------------------------------------
		// Maximum Resolution of Delay
		String sHibernateButton = "# ";
		String sHibernateOffFor = "48 h";
		String sHibernationType = "7";
			// 1) Exit and stop blocking
			// 2) Exit and Shutdown
			// 3) Exit and aggressive Shutdown
			// 4) Exit and Standby/Hibernation
			// 5) Disable Blocking
			// 6) Disable Blocking + Stand&by
			// 7) Disable Blocking + &Hibernation
		boolean bUseTimer = true; // false = continual disablement
		//-------------------------------------------------------------------------------------------
		// Start Application
		startApp("DontSleep");		
		//-------------------------------------------------------------------------------------------
		// Synchronise
		sysDateTimePick32calendar().waitForExistence(10, 0.25);
		//-------------------------------------------------------------------------------------------
		// Move to bottom right current screen
		donTSleep377OS61window(ANY, READY).move(atPoint(1448,731));
		//-------------------------------------------------------------------------------------------
		// Capture Data And Time for Log (From This Application)
		com.rational.test.ft.value.DateWrapper sStartDate_Hibernation_On = 
		   (com.rational.test.ft.value.DateWrapper)sysDateTimePick32calendar().getProperty(".date");		
		//-------------------------------------------------------------------------------------------
		logTestResult("Date on DontSleep at StartUp = "+sStartDate_Hibernation_On, true);
		System.out.println("Date on DontSleep at StartUp = "+sStartDate_Hibernation_On);
		//-------------------------------------------------------------------------------------------
		// Set Timer CheckBox - Setting Not Remembered after close		
		if (bUseTimer == true){
			useTimercheckBox(ANY, READY).click();
		}
		//-------------------------------------------------------------------------------------------
		// Set Time To Disable Hibernate Button
		toolbarWindow32toolBar(ANY, READY).click(atText(sHibernateButton));		
		//-------------------------------------------------------------------------------------------
		// Set Hours To Disable Hibernate
		contextpopupMenu(ANY, READY).click(atPath(sHibernateOffFor));		
		//-------------------------------------------------------------------------------------------
		// DontSleep_This Remembers The Last Setting (As Per Hibernation Type (Above))
		comboBoxcomboBox(ANY, READY).click(ARROW);	
		//-------------------------------------------------------------------------------------------
		// Ensure Enabled Radio Selected
		enabledradioButton(ANY, READY).click();		
		//-------------------------------------------------------------------------------------------
		// Capture Data And Time for Log (From This Application)
		com.rational.test.ft.value.DateWrapper sStartDate_Hibernation_Off = 
		   (com.rational.test.ft.value.DateWrapper)sysDateTimePick32calendar().getProperty(".date");		
		//-------------------------------------------------------------------------------------------
		logTestResult("Date on DontSleep After Setting = "+sStartDate_Hibernation_Off, true);
		System.out.println("Date on DontSleep After Setting = "+sStartDate_Hibernation_Off);
		//-------------------------------------------------------------------------------------------
		// Minimize DontSleep to Tray
		toolbarWindow32toolBar2(ANY, READY).click(atText("&To-Tray"));		
		//-------------------------------------------------------------------------------------------
		logTestResult("Hibernation on this Client PC is Postponend Until "+sStartDate_Hibernation_Off+" - Hibernation Delayed By "+sHibernateOffFor+"ours", true);
		System.out.println("Hibernation on this Client PC is Postponend Until "+sStartDate_Hibernation_Off+" - Hibernation Delayed By "+sHibernateOffFor+"ours");
		//-------------------------------------------------------------------------------------------		
	}
}

