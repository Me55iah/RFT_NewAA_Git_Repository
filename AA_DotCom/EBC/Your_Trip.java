package EBC;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import Utilities.Portal_Synchronisation;
import resources.Common;
import resources.Common_Variables;
import resources.EBC.Your_TripHelper;
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
public class Your_Trip extends Your_TripHelper {
	/**
	 * Script Name : <b>Your_Trip</b> Generated : <b>16 Apr 2013 09:24:46</b>
	 * Description : Functional Test Script Original Host : WinNT Version 5.1
	 * Build 2600 (S)
	 * 
	 * @since 2013/04/16
	 * @author courtl
	 * @throws ParseException
	 */
	public void testMain(Object[] args) throws ParseException {

		text_registration(ANY, LOADED).waitForExistence();

		sleep(2.0);

		text_registration(ANY, LOADED).setText(Common_Variables.vehicleReg);
		list_passengers(ANY, LOADED).select(Common_Variables.personsTravelling);
		list_coverType(ANY, LOADED).select(Common_Variables.EBC_Product);
		list_destination(ANY, LOADED).select(Common_Variables.EBC_Destination);

		Common_Variables.todaysDate = new SimpleDateFormat("dd/MM/yyyy")
				.format(Calendar.getInstance().getTime());

		int tripDuration = Integer.parseInt(Common_Variables.EBC_tripDuration);

		// We now have the start date of the policy, we need to now add
		// the appropriate number of days to it
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date policyEndDate = format
				.parse(Common_Variables.todaysDate);

		tripDuration = tripDuration - 1;

		// Add the required number of days to the start date to get the
		// end date
		java.util.Date policyEndDate2 = Common.DateUtil.addDays(policyEndDate,
				tripDuration);

		final String OLD_FORMAT = "dd/MM/yyyy";
		// final String NEW_FORMAT = "ddMMyy";

		SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
		sdf.applyPattern(OLD_FORMAT);
		String sPolicyEndDate2 = sdf.format(policyEndDate2);

		// System.out.println("Start Date = " + Common_Variables.todaysDate);
		// System.out.println("End Date = " + sPolicyEndDate2);

		String departDay = Common_Variables.todaysDate.substring(0, 2);
		String departMonth = Common_Variables.todaysDate.substring(3, 5);
		String departYear = Common_Variables.todaysDate.substring(6);

		int idepartDay = Integer.parseInt(departDay);
		String sDepartDay = "" + idepartDay;

		int idepartMonth = Integer.parseInt(departMonth);
		int index = 0;

		list_departDay(ANY, LOADED).select(sDepartDay);

		list_departMonth(ANY, LOADED).click();

		iE(document_europeanBreakdownCove(ANY, LOADED),
				DEFAULT_FLAGS).inputKeys("{ExtPgUp}");

		while (index < idepartMonth) {

			iE(document_europeanBreakdownCove(ANY, LOADED),
					DEFAULT_FLAGS).inputKeys("{ExtDown}");
			index++;

		}
		iE(document_europeanBreakdownCove(ANY, LOADED),
				DEFAULT_FLAGS).inputKeys("{ENTER}");

		list_departYear(ANY, LOADED).select(departYear);

		if (Common_Variables.EBC_Product.equals("Single trip")) {

			String returnDay = sPolicyEndDate2.substring(0, 2);
			String returnMonth = sPolicyEndDate2.substring(3, 5);
			String returnYear = sPolicyEndDate2.substring(6);

			int ireturnDay = Integer.parseInt(returnDay);
			String sreturnDay = "" + ireturnDay;

			int ireturnMonth = Integer.parseInt(returnMonth);
			int index2 = 0;

			list_returnDay(ANY, LOADED).select(sreturnDay);

			list_returnMonth(ANY, LOADED).click();

			iE(document_europeanBreakdownCove(ANY, LOADED),
					DEFAULT_FLAGS).inputKeys("{ExtPgUp}");

			while (index2 < ireturnMonth) {

				iE(
						document_europeanBreakdownCove(ANY, LOADED),
						DEFAULT_FLAGS).inputKeys("{ExtDown}");
				index2++;

			}

			iE(document_europeanBreakdownCove(ANY, LOADED),
					DEFAULT_FLAGS).inputKeys("{ENTER}");

			list_returnYear(ANY, LOADED).select(returnYear);
		}

		list_towType(ANY, LOADED).select(dpString("towType"));

		sleep(1.0);

		if (Common_Variables.partsAndLabour == true) {
			radioButton_partsY(ANY, LOADED).click();
		}
		if (Common_Variables.partsAndLabour == false) {
			radioButton_partsN(ANY, LOADED).click();
		}

		button_getAQuote(ANY, LOADED).click();

		// if (Common_Variables.EBC_Product.equals("Single trip")) {
		// link_amendTripDetails(ANY, LOADED).waitForExistence();
		// } else {
		// link_zone1_2(ANY, LOADED).waitForExistence();
		// }

		if (Common_Variables.EBC_Product.equals("Single trip")) {
			link_amendTripDetails(ANY, LOADED).waitForExistence();
		} else {
			link_zone1(ANY, LOADED).waitForExistence();
		}

	}
}
