package EBC;

import resources.Common_Variables;
import resources.EBC.Your_QuoteHelper;
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
public class Your_Quote extends Your_QuoteHelper {
	/**
	 * Script Name : <b>Your_Quote</b> Generated : <b>16 Apr 2013 10:49:50</b>
	 * Description : Functional Test Script Original Host : WinNT Version 5.1
	 * Build 2600 (S)
	 * 
	 * @since 2013/04/16
	 * @author courtl
	 */
	public void testMain(Object[] args) {

		if (Common_Variables.EBC_Cover_Level.equals("Lite")) {
			radioButton_productSelected1(ANY, LOADED).click();
		}

		if (Common_Variables.EBC_Cover_Level.equals("Full")) {
			radioButton_productSelected2(ANY, LOADED).click();
		}

		if (Common_Variables.EBC_Cover_Level.equals("Short Break")) {
			radioButton_productSelected1(ANY, LOADED).click();
		}
		
		if (Common_Variables.EBC_Cover_Level.equals("Group")) {
			radioButton_productSelected1(ANY, LOADED).click();
		}

		sleep(3.0);

		String infoBox_Text = (String) html_infoBox(ANY, LOADED).getProperty(".text");

		int index1 = infoBox_Text.indexOf("£");
		int index2 = infoBox_Text.indexOf("Includes");
		index2 = index2 - 1;

		String annualPremium = infoBox_Text.substring(index1, index2);
		Common_Variables.annualPremium = annualPremium;

		button_continue(ANY, LOADED).click();

	}
}
