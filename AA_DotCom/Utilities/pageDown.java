package Utilities;
import resources.Utilities.pageDownHelper;
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
public class pageDown extends pageDownHelper
{
	/**
	 * Script Name   : <b>pageDown</b>
	 * Generated     : <b>2 Jun 2015 13:31:30</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/02
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//--------------------------------------------------------------------------------		
		// DETAIL OFF SCREEN _ SCROLL INTO VIEW
		// Page Down (Model Selection Dialog OFF Screen)
		//--------------------------------------------------------------------
		// BrowserSync();		
		//--------------------------------------------------------------------
		//iE().activate();
		iE().click(atPoint(1320,376));
		iE().inputKeys("{ExtPgDn 1}");		
		//--------------------------------------------------------------------
		//BrowserSync();		
		//--------------------------------------------------------------------
		unregisterAll();
		//--------------------------------------------------------------------

	}
}

