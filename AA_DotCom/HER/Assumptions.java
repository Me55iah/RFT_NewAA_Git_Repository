package HER;

import resources.HER.AssumptionsHelper;
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
public class Assumptions extends AssumptionsHelper {
	/**
	 * Script Name : <b>Assumptions</b> Generated : <b>9 Apr 2013 14:04:59</b>
	 * Description : Functional Test Script Original Host : WinNT Version 5.1
	 * Build 2600 (S)
	 * 
	 * @since 2013/04/09
	 * @author courtl
	 */
	public void testMain(Object[] args) {

		checkBox_assumptionsConfirmtru(ANY, LOADED).click();

		button_submit(ANY, LOADED).click();
	}
}
