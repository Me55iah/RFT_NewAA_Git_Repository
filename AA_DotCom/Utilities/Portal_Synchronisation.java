package Utilities;
import resources.Utilities.Portal_SynchronisationHelper;
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
//- - A U T O M A T I O N -> U S E C A S E -> H I S T O R Y - Please Keep Updated ^^^^^^^^

@SuppressWarnings("unused")
public class Portal_Synchronisation extends Portal_SynchronisationHelper
{
	/**
	 * Script Name   : <b>Portal_Synchronisation</b>
	 * Generated     : <b>12 Dec 2012 11:08:56</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2012/12/12
	 * @author horned
	 */
	public void testMain(Object[] args) 
	//-------------------------------------  S T A R T  ----------------------------------------
	//                      
	//				Script Name   : <b>Portal_Synchronisation</b>
	//
	//-------------------------------------  S T A R T  ----------------------------------------
	
{
		//----------------------------------------------------------------------------------
		//          Start Portal and ...............                    -        Test Step 1
		//----------------------------------------------------------------------------------
		
		// Synchronise
		int IE_ReadyState = 1;
		logInfo("Verify Browser Is Ready For Input");
		while (IE_ReadyState!=4){ // NOT EQUAL To ReadyState (4)
//			IE(ANY, READY).minimize();
//			sleep(0.5);
			IE_ReadyState = ((Integer)IE().getProperty(".readyState")).intValue();
			sleep(1.5);
		} // Get him BIG!
		
		IE(ANY, READY).maximize();
		IE().activate();
		
		logInfo("Browser Ready For Input");

		//----------------------------------------------------------------------------------
		//          Close Portal and     T I D Y     U P        -        NOT IN THIS INSTANCE
		//----------------------------------------------------------------------------------
	
	}
	//--------------------------------------  E  N  D  -----------------------------------------
	//                      
	//				Script Name   : <b>Portal_Synchronisation</b>
	//
	//--------------------------------------  E  N  D  -----------------------------------------
}



