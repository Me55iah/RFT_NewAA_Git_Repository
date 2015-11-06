package Home;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import Utilities.Portal_Synchronisation;
import resources.Common_Variables;
import resources.Home.You_and_Your_HomeHelper;
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
 * Description : Functional Test Script           findMyAddress
 * 
 * @author courtl
 */


///////////////////////////////////////////////////////////////////////////////////////////
// 25//11/2014 - Previous Insurer RadioButton Not On HMI - Line 155 - COMMENTED OUT - DH //
//
//               Cover Type Selection Logic Changed - 307 thru 334 - commented as appropriate
///////////////////////////////////////////////////////////////////////////////////////////

public class You_and_Your_Home extends You_and_Your_HomeHelper {
	/**
	 * Script Name : <b>Home_Quotes</b> Generated : <b>20 Feb 2013 15:27:33</b>
	 * Description : Functional Test Script Original Host : WinNT Version 5.1
	 * Build 2600 (S)
	 * 
	 * @since 2013/02/20
	 * @author courtl
	 */
	public void testMain(Object[] args) {

		text_firstname2().waitForExistence();
		//------------------------------------------------------------------------------------------
		//callScript("Utilities.Portal_Synchronisation"); // Dave Replaced fixed delay with dynamic
		BrowserSync();
		//------------------------------------------------------------------------------------------

		radioButton_titleMR(ANY, READY).click();

		sleep(0.5);
		text_firstname2(ANY, READY).setText(Common_Variables.newCustomerForename);
		text_surname2(ANY, READY).setText(Common_Variables.newCustomerSurname);
		list_birthDay2(ANY, READY).select("1");
		list_birthMonth2(ANY, READY).select("January");
		list_birthYear2(ANY, READY).select("1950");
		
		 
		html_daytime().click(atPoint(42,6));
		browser_htmlBrowser(document_homeInsuranceYouAndYo(),DEFAULT_FLAGS).inputChars("01234567890");
		html_mobile().click(atPoint(46,5));
		browser_htmlBrowser(document_homeInsuranceYouAndYo(),DEFAULT_FLAGS).inputChars("07700900123");
		text_email3().click(atPoint(46,6));
		browser_htmlBrowser(document_homeInsuranceYouAndYo(),DEFAULT_FLAGS).inputChars("tia@tiatest.com");
		    
//		text_daytime2(ANY, READY).setText("01234567890");
//		text_mobile2(ANY, READY).setText("07700900123");
//		text_email2(ANY, READY).setText("tia@tiatest.com");

		text_fulltimeocc2(ANY, READY).click();
		browser_htmlBrowser(document_homeInsuranceYouAndYo(ANY, LOADED),
				DEFAULT_FLAGS).inputChars(Common_Variables.proposerOccupation);

		browser_htmlBrowser(document_homeInsuranceYouAndYo(ANY, LOADED),
				DEFAULT_FLAGS).inputKeys("{TAB}");

		sleep(1.0);

		text_fulltimeempbus2(ANY, LOADED).setText(
				Common_Variables.employerBusiness);

		sleep(1.0);

		// list_responsecode2(ANY, LOADED).select("TV advert");
		list_carcoverrenewmonth2(ANY, LOADED).select("December");
		
		
		custHouseNum(ANY, LOADED).setText(
				Common_Variables.proposer_HouseNumber);
		postcode(ANY, LOADED).setText(Common_Variables.proposer_PostCode);
		findMyAddressbutton(ANY, LOADED).click();

		sleep(2.0);

		//------------------------------------------------------------------------------------------
		//callScript("Utilities.Portal_Synchronisation"); // Dave Replaced fixed delay with dynamic
		BrowserSync();
		//------------------------------------------------------------------------------------------

		text_custAddressLine2_3(ANY, LOADED).waitForExistence();

		//text_marketvalue().setText(Common_Variables.buildingsMarketValue);
		 
		html_marketvalue().click(atPoint(48,8));
		browser_htmlBrowser(document_homeInsuranceYouAndYo(),DEFAULT_FLAGS).inputChars(Common_Variables.buildingsMarketValue);
		
		
		if (Common_Variables.propertyType.equals("Terraced")) {
			radioButton_propertytypeb(ANY, LOADED).setState(State.selected());
		}
		if (Common_Variables.propertyType.equals("Semi-Detached")) {
			radioButton_propertytypec(ANY, LOADED).setState(State.selected());
		}
		if (Common_Variables.propertyType.equals("Detached")) {
			radioButton_propertytyped(ANY, LOADED).setState(State.selected());
		}
		if (Common_Variables.propertyType
				.equals("Mobile/Park Home/Listed Building")) {
			radioButton_propertytypef(ANY, LOADED).setState(State.selected());
		}
		if (Common_Variables.propertyType.equals("Bungalow")) {
			radioButton_propertytypee(ANY, LOADED).setState(State.selected());
		}
		if (Common_Variables.propertyType.equals("Flat/Maisonette")) {
			radioButton_propertytypea(ANY, LOADED).setState(State.selected());
		}

		if (Common_Variables.yearBuilt.equals("Pre 1851")) {
			radioButton_propertyagE0(ANY, READY).click();
		}

		if (Common_Variables.yearBuilt.equals("1851-1899")) {
			radioButton_propertyagE1(ANY, READY).click();
		}
		if (Common_Variables.yearBuilt.equals("1900-1919")) {
			radioButton_propertyagE2(ANY, READY).click();
		}
		if (Common_Variables.yearBuilt.equals("1920-1945")) {
			radioButton_propertyagE3(ANY, READY).click();
		}
		if (Common_Variables.yearBuilt.equals("1946-1979")) {
			radioButton_propertyagE4(ANY, READY).click();
		}
		if (Common_Variables.yearBuilt.equals("1980-1989")) {
			radioButton_propertyagE6(ANY, READY).click();
		}
		if (Common_Variables.yearBuilt.equals("1990-1999")) {
			radioButton_propertyagE7(ANY, READY).click();
		}
		if (Common_Variables.yearBuilt.equals("2000 Onwards")) {
			radioButton_propertyagE8(ANY, READY).click();
		}

		if (Common_Variables.numBedrooms.equals("One")) {
			radioButton_noofbedroomS1(ANY, READY).click();
		}
		if (Common_Variables.numBedrooms.equals("Two")) {
			radioButton_noofbedroomS2(ANY, READY).click();
		}
		if (Common_Variables.numBedrooms.equals("Three")) {
			radioButton_noofbedroomS3(ANY, READY).click();
		}
		if (Common_Variables.numBedrooms.equals("Four")) {
			radioButton_noofbedroomS4(ANY, READY).click();
		}
		if (Common_Variables.numBedrooms.equals("Five")) {
			radioButton_noofbedroomS5(ANY, READY).click();
		}

//		if (Common_Variables.firstHome == true) {
//
//			radioButton_previousinsurery2(ANY, LOADED).setState(
//					State.selected());
//
//		} else {
//
//			radioButton_previousinsurern2(ANY, LOADED).setState(
//					State.selected());
//		}

		// Set Mortgage to "Yes"
		radioButton_mortgagey2(ANY, LOADED).setState(State.selected());

		// Property Occupied during the day set to "No"
		radioButton_occupieddayn2(ANY, LOADED).setState(State.selected());

		// Smoke detectors set to "Yes"
		radioButton_smokedetectorsfitt3(ANY, LOADED).setState(State.selected());

		// Neighbourhood Watch set to "Yes"
		radioButton_neighbourhoodwatch3(ANY, LOADED).click();

		// Burglar Alarm set to "No"
		radioButton_burglaralarmservic3(ANY, READY).click();

		// Set Locks to yes on all options
		sleep(0.5);
		radioButton_doorLocksY2(ANY, READY).click();
		sleep(0.5);
		radioButton_windowLocksY2(ANY, READY).click();
		sleep(0.5);
		radioButton_patioDoorLocksY2(ANY, READY).click();
		sleep(0.5);
		radioButton_frenchWindowLocksY2(ANY, READY).click();
		sleep(0.5);

		browser_htmlBrowser(document_homeInsuranceYouAndYo(ANY, LOADED),
				DEFAULT_FLAGS).inputKeys("{ExtPgDn}");

		if (Common_Variables.coverType.equals("Buildings")) {
			radioButton_insurancetypeBuild2(ANY, READY).click();
		}

		if (Common_Variables.coverType.equals("Contents")) {
			radioButton_insurancetypeConte(ANY, READY).click();
		}

		if (Common_Variables.coverType.equals("Buildings and Contents")) {
			radioButton_insurancetypeBuild(ANY, READY).click();
		}

		// Set Section 3 and/or 3a here
		if (Common_Variables.section3 == true) {

			list_worldwideCoverLimit2(ANY, LOADED).select(
					Common_Variables.section3Amount);

		}

		if (Common_Variables.section3a == true) {
			button_addItemsOver£1500submit(ANY, LOADED).click();
			//Add Item Description
			text_itemdesC0(ANY, LOADED).waitForExistence();
			text_itemdesC0(ANY, LOADED).click(atPoint(20, 10));
			browser_htmlBrowser(document_homeInsuranceYouAndYo(ANY, LOADED),
					DEFAULT_FLAGS).inputChars("3 Carat Diamond Ring");
			
			// Add Value
			//html_itemvaL0(ANY, LOADED).click(atPoint(22, 12));
			html_itemvaL0(ANY, LOADED).click(atPoint(27,15));

			
			
			browser_htmlBrowser(document_homeInsuranceYouAndYo(ANY, LOADED),
					DEFAULT_FLAGS).inputChars("1501");
			checkBox_addcoverreQ0Y(ANY, LOADED).click();
			button_nextsubmit(ANY, LOADED).click();
			sleep(2.0);

		}

		if (Common_Variables.previousClaims == true) {

			radioButton_claimsShouldExistY2().waitForExistence();
			radioButton_claimsShouldExistY2(ANY, READY).click();

			button_addClaimssubmit().waitForExistence();

			button_addClaimssubmit(ANY, READY).click();

			list_claimtypE0_2().waitForExistence();

			list_claimdatedD0_2().select("1");
			list_claimdatemM0_2().select("January");
			list_claimdateyY0_2().select("2014");

			if (Common_Variables.coverType.equals("Buildings and Contents")) {
				list_claimtypE0_2().select("Contents");
			}

			if (Common_Variables.coverType.equals("Buildings")) {
				list_claimtypE0_2().select("Buildings");
			}

			if (Common_Variables.coverType.equals("Contents")) {
				list_claimtypE0_2().select("Contents");
			}

			list_claimreasoN0_2().select("Accidental Damage");

			list_claimstatuS0_2().select("Settled");

			//text_claimcosT0_2().setText("500");
			html_claimcosT0().click(atPoint(59,7));
			browser_htmlBrowser(document_homeInsuranceYouAndYo(),DEFAULT_FLAGS).inputChars("500"); // IE11
			
			button_enterClaimssubmit(ANY, READY).click();

			sleep(3.0);

		} else {
			radioButton_claimsShouldExistN2(ANY, LOADED).click();
		}

		sleep(0.5);

		if (Common_Variables.coverType.contains("Buildings")) {

			if (Common_Variables.buildingsAD == true) {

				radioButton_includeBuildingADY2(ANY, READY).click();

			} else {
				radioButton_includeBuildingADN2(ANY, LOADED).setState(
						State.selected());
			}
		}

		if (Common_Variables.coverType.equals("Contents")) {

			// if (Common_Variables.contentsAD == true) {
			//
			// radioButton_includeBuildingADY2(ANY, LOADED).click();
			//
			// } else {
			// radioButton_includeBuildingADN2(ANY, LOADED).click();
			// }
		}

		sleep(2.0);

		browser_htmlBrowser(document_homeInsuranceYouAndYo(ANY, LOADED),
				DEFAULT_FLAGS).inputKeys("{ExtPgDn}");

		button_getAQuotesubmit(ANY, LOADED).click();

		list_mortgagecomp2(ANY, LOADED).waitForExistence();

		list_mortgagecomp2(ANY, LOADED).select("Nationwide Building Society");

		
		
//		if (Common_Variables.coverType.equals("Contents")) {
//			if (Common_Variables.firstHome == false) {
//				list_prevcontinsurer2(ANY, LOADED).select(
//						"Nationwide Building Society");
//			}
//		}
        // Block left - as is
		if (Common_Variables.coverType.equals("Buildings and Contents")) {
			if (Common_Variables.firstHome == false) {
				
				BrowserSync();
				
				list_prevcontinsurer2(ANY, LOADED).select(
						"Nationwide Building Society");
				list_prevbuildinsurer2(ANY, LOADED).select(
						"Nationwide Building Society");
			}
		}
		// This replaces top and bottom segments - NEW
		else {
			list_prevbuildinsurer2(ANY, LOADED).select(
					"Nationwide Building Society");
		}

		
		//		if (Common_Variables.coverType.equals("Buildings")) {
//			if (Common_Variables.firstHome == false) {
//				list_prevbuildinsurer2(ANY, LOADED).select(
//						"Nationwide Building Society");
//			}
//		}

		//-------------------------------------------------------------	A	
		try {
			button_getQuotesubmit().waitForExistence(2,  0.25);
			button_getQuotesubmit(ANY, READY).click();
		} catch (ObjectNotFoundException e1) {
			
		}
		
//		BrowserSync();
//		
//		try {
//		    
//			html_errorcountupper(ANY, READY).click();			
//			
//			try {
//			
//				String sErrorcountupper_Text = (String)html_errorcountupper().getProperty(".text");
//				if (sErrorcountupper_Text.contains("Please check the items indicated below")){
//					//----------------------------------------------------------
//					list_prevcontinsurer2(ANY, READY).click();
//					list_prevcontinsurer2(ANY, READY).click(atText("ABC (AA)"));
//					//----------------------------------------------------------
//					list_prevbuildinsurer2(ANY, READY).click();
//					list_prevbuildinsurer2(ANY, READY).click(atText("ABC (AA)"));
//					//----------------------------------------------------------
//					button_getQuotesubmit().waitForExistence(2,  0.25);
//					button_getQuotesubmit(ANY, READY).click();				
//					//----------------------------------------------------------				
//				
//				}
//			} catch (ObjectNotFoundException e1) {
//
//			}
//				
//		} catch (ObjectNotFoundException e2) {
//
//		}
		// Exceptions Wher Previous Building and Contents Miss
	
//		int iCurrentRow = Common_Variables.currentRow;
//		if (iCurrentRow == 6){
//			
//			try {
//				
//				String sPREVCONTINSURER_Value = (String)list_prevcontinsurer2().getProperty(".value");
//				if (sPREVCONTINSURER_Value.equalsIgnoreCase("Please select")){
//					list_prevcontinsurer2().click();
//					list_prevcontinsurer2().click(atText("ABC (AA)"));
//				}
//			
//			
//			} catch (Exception e) {
//	
//			}
//			
//			
//			
//			try {
//				String sPREVBUILDINSURER_Value = (String)list_prevbuildinsurer2().getProperty(".value");
//				if (sPREVBUILDINSURER_Value.equalsIgnoreCase("Please select")){
//					list_prevbuildinsurer2().click();
//					list_prevbuildinsurer2().click(atText("ABC (AA)"));
//				}
//			} catch (Exception e) {
//	
//			}
//			
//		}
		//-----------------------------------------------------------------			
		// callScript("Home.Important_Information_Screen");
		//-----------------------------------------------------------------				
		//stop();
//		try {
//			button_getQuotesubmit().waitForExistence(2,  0.25);
//			button_getQuotesubmit(ANY, READY).click();
//		} catch (ObjectNotFoundException e1) {
//			
//		}

		
		sleep(1.0);

	}
}
