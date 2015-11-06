package Utilities;
import resources.Utilities.IE11_Page_LoadedHelper;
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
public class IE11_Page_Loaded extends IE11_Page_LoadedHelper
{
	/**
	 * Script Name   : <b>IE11_Page_Loaded</b>
	 * Generated     : <b>6 May 2015 11:09:18</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/05/06
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//----------------------------------------------------------
		// Reads Text From Second IE11 Tab Label - Loading or Completed
		//----------------------------------------------------------
		String sWaitingForPage = "";
		boolean bPageReturned = false;
		
		do {
			sleep(3);
			sWaitingForPage = (String) Tab1().getProperty(".title"); // 2 browsers at iteration 5?
			if (sWaitingForPage.contains("Waiting")){
				bPageReturned = false;
				System.out.println(sWaitingForPage+" Page Loading");
			}else{
				bPageReturned = true;
				System.out.println(sWaitingForPage+" Page Arrived");
			}
		} while (!bPageReturned);

	}
}

