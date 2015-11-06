package Road;

import resources.Common;
import resources.Common_Variables;
import resources.Road.Choose_Whos_CoveredHelper;
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
public class Choose_Whos_Covered extends Choose_Whos_CoveredHelper {
	/**
	 * Script Name : <b>Choose_Whos_Covered</b> Generated : <b>8 Apr 2013
	 * 13:47:20</b> Description : Functional Test Script Original Host : WinNT
	 * Version 5.1 Build 2600 (S)
	 * 
	 * @since 2013/04/08
	 * @author courtl
	 */
	public void testMain(Object[] args) {

		if (Common_Variables.personsCovered.equals("You")) {
			radioButton_coverType_Single(ANY, LOADED).click();
		}
		if (Common_Variables.personsCovered.equals("Two People")) {
			radioButton_coverType_Joint(ANY, LOADED).click();
		}
		if (Common_Variables.personsCovered.equals("Family")) {
			radioButton_coverType_Family(ANY, LOADED).click();
		}
		if (Common_Variables.personsCovered.equals("Vehicle")) {
			radioButton_coverType_Vehicle(ANY, LOADED).click();
		}

		sleep(5.0);
		
		browser_htmlBrowser(document_breakdownCoverChooseW(), DEFAULT_FLAGS)
		.inputKeys("{ExtPgDn}");
		
		button_continuesubmit(ANY, LOADED).click();

		// button_continue5(ANY, LOADED).click();

		sleep(5.0);

		if (Common_Variables.personsCovered.equals("Vehicle")
				&& Common_Variables.upgrades_BRC == false) {

			browser_htmlBrowser(document_breakdownCoverChooseW(), DEFAULT_FLAGS)
					.inputChars(Common_Variables.vehicleReg);
			browser_htmlBrowser(document_breakdownCoverChooseW(), DEFAULT_FLAGS)
					.inputKeys("{ENTER}");

			sleep(5.0);

			button_continue(ANY, LOADED).click();

		}

		if (Common_Variables.upgrades_BRC == true
				&& !Common_Variables.personsCovered.equals("Vehicle")) {

			browser_htmlBrowser(document_breakdownCoverChooseW(), DEFAULT_FLAGS)
					.inputChars(Common_Variables.vehicleReg);

			browser_htmlBrowser(document_breakdownCoverChooseW(), DEFAULT_FLAGS)
					.inputKeys("{ENTER}");

			sleep(5.0);
			button_continue4(ANY, LOADED).click();
			sleep(5.0);

			button_continue(ANY, LOADED).click();

		}

		if (Common_Variables.upgrades_BRC == true
				&& Common_Variables.personsCovered.equals("Vehicle")) {

			browser_htmlBrowser(document_breakdownCoverChooseW(), DEFAULT_FLAGS)
					.inputChars(Common_Variables.vehicleReg);

			browser_htmlBrowser(document_breakdownCoverChooseW(), DEFAULT_FLAGS)
					.inputKeys("{TAB}");
			sleep(1.0);
			browser_htmlBrowser(document_breakdownCoverChooseW(), DEFAULT_FLAGS)
					.inputKeys("{TAB}");

			browser_htmlBrowser(document_breakdownCoverChooseW(), DEFAULT_FLAGS)
					.inputKeys("{ENTER}");

			sleep(5.0);

			html_overlay(ANY, LOADED).click(atPoint(333, 118));

			browser_htmlBrowser(document_breakdownCoverChooseW(), DEFAULT_FLAGS)
					.inputKeys("{TAB}");
			sleep(1.0);

			browser_htmlBrowser(document_breakdownCoverChooseW(), DEFAULT_FLAGS)
					.inputKeys("{TAB}");
			sleep(1.0);
			browser_htmlBrowser(document_breakdownCoverChooseW(), DEFAULT_FLAGS)
					.inputKeys("{ENTER}");

			sleep(3.0);

			button_continue(ANY, LOADED).click();

		}

	}
}
