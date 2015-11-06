
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;

import org.joda.time.DateTime;

import resources.Common_Variables;
import resources.Overnight_Regression_TestingHelper;
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
public class Overnight_Regression_Testing extends Overnight_Regression_TestingHelper
{
	/**
	 * Script Name   : <b>Overnight_Regression_Testing</b>
	 * Generated     : <b>15 Oct 2015 15:37:26</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/10/15
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		// Execution Time for 1 Set = 68 Minutes
		
		// Stamp Generation fo Unattended Executions
		DateTime dt = new DateTime();	
		dt.toString("dd-MM-yyyy");
		//String sUnattended_Start_Time = dt;
				
		// Unattended Regression Test Executions
		Common_Variables.unettended_Executions = true;
		//--------------------------------------------------------------------
		// CONSOLE REDIRECTION (Unattended Executions
		//String sConsoleOutputString;
		//System.setOut(new PrintStream(new FileOutputStream(sConsoleOutputString)));
		try {
//			File file = new File("C:\\RFT\\AA_DotCom_logs\\unattended_Full_Road_BreakDown_Cover_Regression_Test_MK2_"+CurrTime()+".txt");
//			File file = new File("C:\\unattended_Regression_Testing_"+dt+".txt");
			File file = new File("C:\\unattended.txt");
			FileOutputStream fos = new FileOutputStream(file);
			PrintStream ps = new PrintStream(fos);
			System.setOut(ps);
			
			} catch (FileNotFoundException e) {
			 System.out.println(" File unattended_Regression_Testing_"+dt+".txt Could Not Be Created");
			e.printStackTrace();
		}
		
		// CONSOLE REDIRECTION (Unattended Executions
		//--------------------------------------------------------------------
		int iCount = 0;
		
	    do
	    {
		   callScript("Full_Road_BreakDown_Cover_Regression_Test_MK2");
		   System.gc();
		   iCount++;

			//--------------------------------------------------------------------
		    // Duration of test = iCount x Execution time for single execution 
		    // Execution Time for 1 Set = 68 Minutes for Road Breakdown)
			//--------------------------------------------------------------------
	    } while(iCount < 1);
	
	}
}

