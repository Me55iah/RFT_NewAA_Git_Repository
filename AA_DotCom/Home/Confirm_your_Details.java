package Home;

import resources.Home.Confirm_your_DetailsHelper;
import Utilities.Portal_Synchronisation;
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
 * Description : Functional Test Script
 * 
 * @author courtl
 */
@SuppressWarnings("unused")
public class Confirm_your_Details extends Confirm_your_DetailsHelper {
	/**
	 * Script Name : <b>Confirm_your_Details</b> Generated : <b>27 Feb 2013
	 * 11:50:12</b> Description : Functional Test Script Original Host : WinNT
	 * Version 5.1 Build 2600 (S)
	 * 
	 * @since 2013/02/27
	 * @author courtl
	 */
	public void testMain(Object[] args) {

		button_yessubmit2(ANY, READY).click();

	}
}
