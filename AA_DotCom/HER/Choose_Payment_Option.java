package HER;

import resources.Common_Variables;
import resources.HER.Choose_Payment_OptionHelper;
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
public class Choose_Payment_Option extends Choose_Payment_OptionHelper {
	/**
	 * Script Name : <b>Choose_Payment_Option</b> Generated : <b>9 Apr 2013
	 * 13:57:07</b> Description : Functional Test Script Original Host : WinNT
	 * Version 5.1 Build 2600 (S)
	 * 
	 * @since 2013/04/09
	 * @author courtl
	 */
	public void testMain(Object[] args) {

		if (Common_Variables.paymentType.equals("Credit Card Instalments")) {
			radioButton_Card_Instalments(ANY, LOADED).click();
		}

		if (Common_Variables.paymentType.equals("Single Payment")) {
			radioButton_Single_Payment(ANY, LOADED).click();
		}

		if (Common_Variables.paymentType.equals("AA Instalment Account (TIA)")) {
//			radioButton_Monthly_Direct_Debit().click();
		}
		
		sleep(3.0);
		
		button_next(ANY, LOADED).click();
		
		sleep(3.0);
		checkBox_assumptionsConfirmtru(ANY, LOADED).waitForExistence();
	}
}
