package Offers;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import resources.Common;
import resources.Common_Variables;
import resources.Offers.Winter_OffersHelper;
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
@SuppressWarnings("unused")
public class Winter_Offers extends Winter_OffersHelper
{
	/**
	 * Script Name   : <b>Offers</b>
	 * Generated     : <b>8 Dec 2014 14:21:08</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/12/08
	 * @author horned
	 */
	
	public static boolean liveTest;
	public static String[] environmentURL = new String[1];
	public static String sPriceValue = "";
	public static String sLastName = "";
	public static String sPostCode = "";
	public static String sDateofBirth = "";
	public static Integer iLT95;			// 95 or less
	public static Integer iGT95LT11499;		// 95  - 114.99
	public static Integer iGT115LT14499;	// 115 - 144.99
	public static Integer iGT145;			// 145 or more
	public static Integer iActual;


	public void testMain(Object[] args) 
	{
		/////////////////////////////////////////////////////////////////
		// DH - Script to verify OFFERS - This is stand alone currently
		// (Road - Breakdown Cover)
		//
		// No Data Pool Dependants
		//
		// THIS SCRIPT IS TUNED TO OFFERS ENDING IN FEB 2015, OBVIOUS 
		// SCRIPT MAINTENANCE WILL BE REQUIRED AFTER THIS POINT IN TIME
		//
		// CURRENTLY HARD WIRED FOR PL3
		/////////////////////////////////////////////////////////////////

		String timeStamp = new SimpleDateFormat("HH:mm:ss").format(Calendar
				.getInstance().getTime());

		Common_Variables.todaysDate = new SimpleDateFormat("dd/MM/yyyy")
				.format(Calendar.getInstance().getTime());

		System.out.println("Start time = " + timeStamp);
		
		//------------------------------------------------------------------
		// Environment Start
		environmentURL[0] = "http://prelive2.theaa.com/breakdown-cover"; 	// was init  3	
		startApp("IE", environmentURL);
		//------------------------------------------------------------------
		// Synchronise (On personalise your cover button)
		getGiftCard(ANY, READY).waitForExistence(25.0,  0.25);
		
		// 1)
		//------------------------------------------------------------------
		// Verify TOP Level - Landing Page - Detail Under Banner
		//------------------------------------------------------------------
		String sVoucherOffer_ContentText = (String)voucherOffer().getProperty(".contentText");
		
		logInfo(" ***************** Test Step 1 *******************");
		//------------------------------------------------------------------
		// GIFT CARD Text Present
		if (sVoucherOffer_ContentText.contains("gift card")){
			logTestResult("Gift Card Text is present under banner image", true);
		}
		else {
			logTestResult("Gift Card Text is NOT present under banner image", false);
		}
		//------------------------------------------------------------------
		// Sub Text Love2Shop + Present
		if (sVoucherOffer_ContentText.contains("Get a Love2shop gift card when you " +
				"spend over £95 on personal-based cover and pay annually")){
			logTestResult("Love2shop + £95 on personal-based cover", true);
		}
		else {
			logTestResult("Text 'Love2shop + £95 on personal-based cover' IS NOT PRESENT", false);
		}
		//------------------------------------------------------------------
		// Sub Text 30 Leading Retailers + Present
		if (sVoucherOffer_ContentText.contains("You can spend it at over 30 leading " +
				"retailers including Argos, Boots and Halfords")){
			logTestResult("Gift Card Text is present under banner image", true);
		}
		else {
			logTestResult("Text '30 leading retailers including Argos' is NOT PRESENT", false);
		}
		//------------------------------------------------------------------
		// 2)
		logInfo(" ***************** Test Step 2 *******************");
		//------------------------------------------------------------------
		// Verify <Personalise your Cover> Button Exists
		//------------------------------------------------------------------
		String sPersonalise_Your_Cover = (String)getGiftCard().getProperty(".contentText");
		
		if (sPersonalise_Your_Cover.contains("Personalise your cover")){
			logTestResult("Personalise Your Cover Button Exists", true);
		}
		else {
			logTestResult("Personalise Your Cover Button is NOT PRESENT", false);
		}
		//------------------------------------------------------------------
		// Navigate <Personalise your Cover> Button 
		getGiftCard(ANY, READY).click();
		
		// Synchronise to following <CHOOSE COVER> page
		Choose_Cover_Page().waitForExistence(25.0,  0.25);
		
		// Verify Navigation Correct		
		String sChoose_Cover = (String)Choose_Cover_Page().getProperty(".contentText");
		//------------------------------------------------------------------
		// 
		if (sChoose_Cover.contains("Choose cover")){
			logTestResult("Navigation to 'Choose your Cover' Page was Successful", true);
		}
		else {
			logTestResult("Navigation to 'Choose your Cover' Page WAS NOT SUCCESSFUL", false);
		}
		//------------------------------------------------------------------
		// Return to Personalise your cover page
		back_button(iE(breakdownCoverView(),DEFAULT_FLAGS),DEFAULT_FLAGS).click();
		
		//------------------------------------------------------------------
		// Synchronise (On personalise your cover button)
		getGiftCard(ANY, READY).waitForExistence(25.0,  0.25);
			
		// 3)
		logInfo(" ***************** Test Step 3 *******************");
		//------------------------------------------------------------------
		////////////////////////////////////////////////////////////////////////
		//------------------------------------------------------------------
		// Navigate £20 Gift Card (Bundle 1 Offer Landing Page)
		//------------------------------------------------------------------
		////////////////////////////////////////////////////////////////////////
		// Verify Portlet Detail Before Navigation
		link_£20GiftCardRoadsideAssist().performTest(£20GiftCardVP(), 0.25, 20.0);
		//------------------------------------------------------------------
		// Navigate £20
		link_£20GiftCardRoadsideAssist(ANY, READY).click();
		// Synchronise to following <CHOOSE COVER> page
		Choose_Cover_Page().waitForExistence(25.0,  0.25);
		//------------------------------------------------------------------
		// Verify Pre-Selected Options
		boolean bCoverForYou_Checked = ((Boolean)coverForYou().getProperty(".checked")).booleanValue();
		//------------------------------------------------------------------
		// £20 Pre-Selections        COVER FOR YOU
		if (bCoverForYou_Checked==(true)){
			logTestResult("Navigating £20 Gift Card - 'Cover for You' is Correctly Pre-Selected ", true);
		}
		else {
			logTestResult("Navigating £20 Gift Card - 'Cover for You' is NOT Correctly Pre-Selected", false);
		}
		//------------------------------------------------------------------
		// £20 Pre-Selections        NATIONAL RECOVERY (RELAY)
		boolean selectedOptionsrelay_CHECKED = 
		   ((Boolean)selectedOptionsrelay().getProperty("CHECKED")).booleanValue();
		//------------------------------------------------------------------
		if (selectedOptionsrelay_CHECKED==(true)){
			logTestResult("Navigating £20 Gift Card - 'National Recovery' is Correctly Pre-Selected ", true);
		}
		else {
			logTestResult("Navigating £20 Gift Card - 'National Recovery' is NOT Correctly Pre-Selected", false);
		}
		//------------------------------------------------------------------
		// £20 Pre-Selections        ROADSIDE ASSISTANCE - INCLUDED
		roadsideAssistance().performTest(RoadsideAssistanceIncludedVP(), 0.25, 20.0);
		//------------------------------------------------------------------
		// CHECK REMAINDER (Radio Button and Check Boxes)DE-SELECTED
		boolean coverFor2People = ((Boolean)coverForTwo().getProperty(".checked")).booleanValue();
		boolean familyCover = ((Boolean)familyCover().getProperty(".checked")).booleanValue();
		boolean vehicleCover = ((Boolean)vehicleCover().getProperty(".checked")).booleanValue();
		boolean atHome = ((Boolean)atHome().getProperty(".checked")).booleanValue();
		boolean partsGarage = ((Boolean)partsGarage().getProperty(".checked")).booleanValue();
		boolean onwardTravel = ((Boolean)onwardTravelOption().getProperty(".checked")).booleanValue();
		
		//------------------------------------------------------------------
		if (coverFor2People && familyCover && vehicleCover && atHome && partsGarage && onwardTravel == (false)){
			logTestResult(onwardTravel+" "+partsGarage+" "+atHome+" "+vehicleCover+" "+familyCover+" "+coverFor2People+  "Navigating £20 Gift Card - There are extra selections checked that are incorrect", false);
		}
		else {
			logTestResult("Navigating £20 Gift Card - ALL REMAINING RADIO BUTTONS AND CHECK BOXES ARE De-Selected ", true);
		}
		//------------------------------------------------------------------		
		//------------------------------------------------------------------
		// Return to Personalise your cover page
		back_button(iE(breakdownCoverView(),DEFAULT_FLAGS),DEFAULT_FLAGS).click();		
		//------------------------------------------------------------------
		// £20 COMPLETED
			
		// 4)
		logInfo(" ***************** Test Step 4 *******************");
		//------------------------------------------------------------------
		////////////////////////////////////////////////////////////////////////
		//------------------------------------------------------------------
		// Navigate £30 Gift Card (Bundle 2 Offer Landing Page)
		//------------------------------------------------------------------
		////////////////////////////////////////////////////////////////////////
		// Verify Portlet Detail Before Navigation
		link_£30GiftCardRoadsideAssist().performTest(£30GiftCardVP(), 0.25, 20.0);
		//------------------------------------------------------------------
		// Navigate £30
		link_£30GiftCardRoadsideAssist(ANY, READY).click();
		// Synchronise to following <CHOOSE COVER> page
		Choose_Cover_Page().waitForExistence(25.0,  0.25);
		//------------------------------------------------------------------
		// Verify Pre-Selected Options
		bCoverForYou_Checked = ((Boolean)coverForYou().getProperty(".checked")).booleanValue();
		//------------------------------------------------------------------
		// £20 Pre-Selections        COVER FOR YOU
		if (bCoverForYou_Checked==(true)){
			logTestResult("Navigating £30 Gift Card - 'Cover for You' is Correctly Pre-Selected ", true);
		}
		else {
			logTestResult("Navigating £30 Gift Card - 'Cover for You' is NOT Correctly Pre-Selected", false);
		}
		//------------------------------------------------------------------
		// £30 Pre-Selections        NATIONAL RECOVERY (RELAY)
		selectedOptionsrelay_CHECKED = 
		   ((Boolean)selectedOptionsrelay().getProperty("CHECKED")).booleanValue();
		//------------------------------------------------------------------
		if (selectedOptionsrelay_CHECKED==(true)){
			logTestResult("Navigating £30 Gift Card - 'National Recovery' is Correctly Pre-Selected ", true);
		}
		else {
			logTestResult("Navigating £30 Gift Card - 'National Recovery' is NOT Correctly Pre-Selected", false);
		}
		//------------------------------------------------------------------
		atHome = ((Boolean)selectedOptionsrelay().getProperty(".checked")).booleanValue();
		
		if (atHome ==(true)){   ///////////
			logTestResult("Navigating £30 Gift Card - 'At Home' is Correctly Pre-Selected ", true);
		}
		else {
			logTestResult("Navigating £30 Gift Card - 'At Home' is NOT Correctly Pre-Selected", false);
		}
		//------------------------------------------------------------------
		// £20 Pre-Selections        ROADSIDE ASSISTANCE - INCLUDED
		roadsideAssistance().performTest(RoadsideAssistanceIncludedVP(), 0.25, 20.0);
		//------------------------------------------------------------------
		// CHECK REMAINDER (Radio Button and Check Boxes)DE-SELECTED
		coverFor2People = ((Boolean)coverForTwo().getProperty(".checked")).booleanValue();
		familyCover = ((Boolean)familyCover().getProperty(".checked")).booleanValue();
		vehicleCover = ((Boolean)vehicleCover().getProperty(".checked")).booleanValue();
		partsGarage = ((Boolean)partsGarage().getProperty(".checked")).booleanValue();
		onwardTravel = ((Boolean)onwardTravelOption().getProperty(".checked")).booleanValue();
		
		//------------------------------------------------------------------
		if (coverFor2People && familyCover && vehicleCover && atHome && partsGarage && onwardTravel == (false)){
			logTestResult(onwardTravel+" "+partsGarage+" "+atHome+" "+vehicleCover+" "+familyCover+" "+coverFor2People+  "Navigating £20 Gift Card - There are extra selections checked that are incorrect", false);
		}
		else {
			logTestResult("Navigating £30 Gift Card - ALL REMAINING RADIO BUTTONS AND CHECK BOXES ARE De-Selected ", true);
		}
		//------------------------------------------------------------------		
		//------------------------------------------------------------------
		// Return to Personalise your cover page
		back_button(iE(breakdownCoverView(),DEFAULT_FLAGS),DEFAULT_FLAGS).click();		
		//------------------------------------------------------------------
		// £30 COMPLETED Step 30 
		
		// 5)
		logInfo(" ***************** Test Step 5 *******************");
		//------------------------------------------------------------------
		////////////////////////////////////////////////////////////////////////
		//------------------------------------------------------------------
		// Navigate £50 Gift Card (Bundle 3 Offer Landing Page)
		//------------------------------------------------------------------
		////////////////////////////////////////////////////////////////////////
		// Verify Portlet Detail Before Navigation
		link_£50GiftCardRoadsideAssist().performTest(£50GiftCardVP(), 0.25, 20.0);
		//------------------------------------------------------------------
		// Navigate £50
		link_£50GiftCardRoadsideAssist(ANY, READY).click();
		// Synchronise to following <CHOOSE COVER> page
		Choose_Cover_Page().waitForExistence(25.0,  0.25);
		//------------------------------------------------------------------
		// Verify Pre-Selected Options
		bCoverForYou_Checked = ((Boolean)coverForYou().getProperty(".checked")).booleanValue();
		//------------------------------------------------------------------
		// £20 Pre-Selections        COVER FOR YOU
		if (bCoverForYou_Checked==(true)){
			logTestResult("Navigating £50 Gift Card - 'Cover for You' is Correctly Pre-Selected ", true);
		}
		else {
			logTestResult("Navigating £50 Gift Card - 'Cover for You' is NOT Correctly Pre-Selected", false);
		}
		//------------------------------------------------------------------
		// £20 Pre-Selections        NATIONAL RECOVERY (RELAY)
		selectedOptionsrelay_CHECKED = 
		   ((Boolean)selectedOptionsrelay().getProperty("CHECKED")).booleanValue();
		//------------------------------------------------------------------
		if (selectedOptionsrelay_CHECKED==(true)){
			logTestResult("Navigating £50 Gift Card - 'National Recovery' is Correctly Pre-Selected ", true);
		}
		else {
			logTestResult("Navigating £50 Gift Card - 'National Recovery' is NOT Correctly Pre-Selected", false);
		}
		//------------------------------------------------------------------
		atHome = ((Boolean)selectedOptionsrelay().getProperty(".checked")).booleanValue();
		
		if (atHome ==(true)){   ///////////
			logTestResult("Navigating £50 Gift Card - 'At Home' is Correctly Pre-Selected ", true);
		}
		else {
			logTestResult("Navigating £50 Gift Card - 'At Home' is NOT Correctly Pre-Selected", false);
		}
		//------------------------------------------------------------------
		onwardTravel = ((Boolean)selectedOptionsrelay().getProperty(".checked")).booleanValue();
		
		if (onwardTravel ==(true)){   ///////////
			logTestResult("Navigating £50 Gift Card - 'Onward Travel' is Correctly Pre-Selected ", true);
		}
		else {
			logTestResult("Navigating £50 Gift Card - 'Onward Travel' is NOT Correctly Pre-Selected", false);
		}
		//------------------------------------------------------------------
		// £50 Pre-Selections        ROADSIDE ASSISTANCE - INCLUDED
		roadsideAssistance().performTest(RoadsideAssistanceIncludedVP(), 0.25, 20.0);
		//------------------------------------------------------------------
		// CHECK REMAINDER (Radio Button and Check Boxes)DE-SELECTED
		coverFor2People = ((Boolean)coverForTwo().getProperty(".checked")).booleanValue();
		familyCover = ((Boolean)familyCover().getProperty(".checked")).booleanValue();
		vehicleCover = ((Boolean)vehicleCover().getProperty(".checked")).booleanValue();
		partsGarage = ((Boolean)partsGarage().getProperty(".checked")).booleanValue();
		
		//------------------------------------------------------------------
		if (coverFor2People && familyCover && vehicleCover && atHome && partsGarage && onwardTravel == (false)){
			logTestResult(onwardTravel+" "+partsGarage+" "+atHome+" "+vehicleCover+" "+familyCover+" "+coverFor2People+  "Navigating £20 Gift Card - There are extra selections checked that are incorrect", false);
		}
		else {
			logTestResult("Navigating £50 Gift Card - ALL REMAINING RADIO BUTTONS AND CHECK BOXES ARE De-Selected ", true);
		}
		//------------------------------------------------------------------		
		//------------------------------------------------------------------
		// Return to Personalise your cover page
		back_button(iE(breakdownCoverView(),DEFAULT_FLAGS),DEFAULT_FLAGS).click();		
		//------------------------------------------------------------------
		// £50 COMPLETED
		
		logInfo(" ***************** Test Step 6 *******************");
		//------------------------------------------------------------------
		////////////////////////////////////////////////////////////////////
		// 6)
		// Caveat in Terms and Conditions page
		////////////////////////////////////////////////////////////////////
		
		tabContent1().performTest(Caveat_Landing_MessageVP(), 0.25, 20.0);
		
		//------------------------------------------------------------------
		// Cover for You
		// Navigate - Get/Choose Cover
		link_getCover(ANY, READY).click();
		
		// 7)
		logInfo(" ***************** Test Step 7 *******************");
		//------------------------------------------------------------------

		// <£95
		//------------------------------------------------------------------
		// Select Cover for You and 1 Year <£95 (54.99)
		//------------------------------------------------------------------
		coverForYouWhen().waitForExistence(25.0,  0.25);
		coverForYouWhen(ANY, READY).click();
		//atHome(ANY, READY).click();
		//nationalRecoveryTransport().click();
		
		label_1Year().waitForExistence(25.0,  0.25);

		label_1Year(ANY, READY).click();
		
		//------------------------------------------------------------------
		// Verify Annual Gift Cards (20,30 and 50 cards displayed on RH side of portal)
		annualOffer_GiftCard_Message().performTest(annualOfferMessage_aVP(), 0.25, 20.0);
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		// Synch
		pricevalue().waitForExistence(20.0,  0.25);		
		// Scrape PRICE VALUE - main Numeric Indicator on screen
		
		sleep(2);

		//------------------------------------------------------------------
		// Choose Cover for You >£95   String sAddress1 = (String)Address_1().getProperty("value");
		sPriceValue = (String)pricevalue().getProperty(".text");
		//logInfo("  -------- "+sPriceValue+" --------");
		
		String[] value = sPriceValue.split("£"); // £54.99				
		String sPriceValue = value[1]; // 54.99	
		value = sPriceValue.split("\\."); // 54.99
		sPriceValue = value[0];		// 54	
		
		iLT95 = 95; iActual = Integer.parseInt(sPriceValue);
		
		//------------------------------------------------------------------
		if (iActual<iLT95){
			logTestResult("The Price Selected = £"+sPriceValue+" And Was Less Than £95 As Expected" , true);
		}
		else {
			logTestResult("The Price Selected Was EQUAL Or MORE THAN £95 - Actual Was £"+sPriceValue, false);
		}
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
			//------------------------------------------------------------------
			// 25 - makes sense to put it here, as we have already done the selection/navigation
			logInfo(" ***************** Test Step 25 *******************");
			//------------------------------------------------------------------			
			continuesubmit(ANY, READY).click();
			// Document: Breakdown Cover : Your details - The AA: https://prelive3.theaa.com/breakdown-cover/uk-breakdown/view-customerdetails.do?comingFrom=quote&newJourney=true&optMshp=scon100HS
			annualOfferMessage().performTest(annualOfferMessage_eVP(), 0.25, 20.0);
			//------------------------------------------------------------------
			// Populate Details Page to enable - Further Navigation
			//------------------------------------------------------------------
				callScript("Utilities.Populate_Policy_Holder");
				//------------------------------------------------------------------
				// 33 - makes sense to put it here, as we have already done the selection/navigation
				logInfo(" ***************** Test Step 33 *******************");
				//------------------------------------------------------------------				
				// Hit Continue
				button_continuesubmit(ANY, READY).click();
				// verify 20 offer
				annualOfferMessage().performTest(annualOffer_20pound_giftVP(), 0.25, 20.0);
				
				//------------------------------------------------------------------
		
		// Close It
		iE(breakdownCoverView(),DEFAULT_FLAGS).close();
				
		// Re Start
		startApp("IE", environmentURL);	
			
		//------------------------------------------------------------------
		// Select Cover for You and 1 Year 
		//------------------------------------------------------------------
		// Navigate - Get/Choose Cover
		link_getCover(ANY, READY).click();
		coverForYouWhen(ANY, READY).click();
		atHome(ANY, READY).click();
		
		label_1Year().waitForExistence(25.0,  0.25);

		label_1Year(ANY, READY).click();
		
		//------------------------------------------------------------------
		// Verify Annual Gift Cards (20,30 and 50 cards displayed on RH side of portal)
		annualOffer_GiftCard_Message().performTest(annualOfferMessage_aVP(), 0.25, 20.0);
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		// Synch
		pricevalue().waitForExistence(20.0,  0.25);		
		// Scrape PRICE VALUE - main Numeric Indicator on screen
		
		//------------------------------------------------------------------
		// Choose Cover for You >£95   String sAddress1 = (String)Address_1().getProperty("value");
		sPriceValue = (String)pricevalue().getProperty(".text");
		//logInfo("  -------- "+sPriceValue+" --------");
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		
		//------------------------------------------------------------------		
		// Select Cover for You and 1 Month
		//------------------------------------------------------------------
		// 8)
		logInfo(" ***************** Test Step 8 *******************");
		//------------------------------------------------------------------
		label_monthly().waitForExistence(20.0,  0.25);
		label_monthly(ANY, READY).click();
		//------------------------------------------------------------------
		// Verify Monthly Gift Cards (Choose Annual Payment for Cards)
		monthlyOfferMessage().performTest(monthlyOfferMessage_bVP(), 0.25, 20.0);
			//------------------------------------------------------------------
			// 26 - makes sense to put it here, as we have already done the selection/navigation
			logInfo(" ***************** Test Step 26 *******************");

			//------------------------------------------------------------------			
			continuesubmit(ANY, READY).click();
			// Document: Breakdown Cover : Your details - The AA: https://prelive3.theaa.com/breakdown-cover/uk-breakdown/view-customerdetails.do?comingFrom=quote&newJourney=true&optMshp=scon100HS
			monthlyOfferMessage().performTest(monthlyOfferMessage_bVP(), 0.25, 20.0);
			//------------------------------------------------------------------
			
			//------------------------------------------------------------------
			callScript("Utilities.Populate_Policy_Holder");
			//------------------------------------------------------------------
			// 33 - makes sense to put it here, as we have already done the selection/navigation
			logInfo(" ***************** Test Step 34 *******************");
			//------------------------------------------------------------------				
			// Hit Continue
			button_continuesubmit(ANY, READY).click();
			// verify 20 offer
			annualOfferMessage().performTest(annualOffer_20pound_giftVP(), 0.25, 20.0);
			
			// Return to Personalise your cover page
		
		// Close It
		iE(breakdownCoverView(),DEFAULT_FLAGS).close();
				
		// Re Start
		startApp("IE", environmentURL);	
			
		//------------------------------------------------------------------
		// Select Cover for You and 1 Year 
		//------------------------------------------------------------------
		// Navigate - Get/Choose Cover
		link_getCover(ANY, READY).click();
		coverForYouWhen().waitForExistence(25.0,  0.25);
		coverForYouWhen(ANY, READY).click();
		atHome(ANY, READY).click();
		label_1Year(ANY, READY).click();
			
			// 9)
		logInfo(" ***************** Test Step 9 *******************");
		//------------------------------------------------------------------
		//------------------------------------------------------------------
		// Choose Vehicle >£95
		// Select Cover for You and 1 Year
		//------------------------------------------------------------------
		// Select Vehicle Cover
		vehicleCoverForOneVehicl().waitForExistence(20.0,  0.25);
		vehicleCoverForOneVehicl(ANY, READY).click();
		
		label_1Year().waitForExistence(25.0,  0.25);

		label_1Year(ANY, READY).click();
		//------------------------------------------------------------------
		// Verify Annual Gift Cards (
		annualOffer_GiftCard_Message().performTest(annualOfferMessage_bVP(), 0.25, 20.0);
		//------------------------------------------------------------------
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		// Synch
		pricevalue().waitForExistence(20.0,  0.25);		
		// Scrape PRICE VALUE - main Numeric Indicator on screen
		//------------------------------------------------------------------
		// Choose Cover for You >£95   String sAddress1 = (String)Address_1().getProperty("value");
		sPriceValue = (String)pricevalue().getProperty(".text");
		//logInfo("  -------- "+sPriceValue+" --------");
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		// 10)
		logInfo(" ***************** Test Step 10 *******************");
		//------------------------------------------------------------------
		label_monthly(ANY, READY).click();
		//------------------------------------------------------------------
		// Verify Monthly Gift Cards (or NOT, as the case may be)  (Choose cover for you or 2 people..)
		monthlyOfferMessage().performTest(monthlyOfferMessage_aVP(), 0.25, 20.0);
		//------------------------------------------------------------------
		// 11)
		logInfo(" ***************** Test Step 11 *******************");
		//------------------------------------------------------------------
		// £95 - £ 114.99
		coverForYouWhen().waitForExistence(25.0,  0.25);
		coverForYouWhen(ANY, READY).click();
		atHome(ANY, READY).click();
		sleep(0.5);
		atHome(ANY, READY).click();
	
		label_1Year().waitForExistence(25.0,  0.25);

		label_1Year(ANY, READY).click();
		//------------------------------------------------------------------
		// Verify Monthly Gift Cards (Choose Annual Payment for Cards)Hi Kia,		
		//------------------------------------------------------------------
		// Verify Monthly Gift Cards (Choose Annual Payment for Cards)
		annualOffer_GiftCard_Message().performTest(annualOfferMessage_cVP(), 0.25, 20.0);
		//------------------------------------------------------------------
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		// Synch
		pricevalue().waitForExistence(20.0,  0.25);		
		
		sleep(2);
		
		// Scrape PRICE VALUE - main Numeric Indicator on screen
		//------------------------------------------------------------------
		// Choose Cover for You >£95   String sAddress1 = (String)Address_1().getProperty("value");
		sPriceValue = (String)pricevalue().getProperty(".text");
		//logInfo("  -------- "+sPriceValue+" --------");
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		value = sPriceValue.split("£"); // £104.99				
		sPriceValue = value[1]; // 104.99	
		value = sPriceValue.split("\\."); // 104.99
		sPriceValue = value[0];		// 104	
		
		iGT95LT11499 = 115;
		iLT95 = 95; iActual = Integer.parseInt(sPriceValue);		

		//------------------------------------------------------------------
		if (iActual>iLT95&&iActual<iGT95LT11499){
			logTestResult("The Price Selected = £"+sPriceValue+" And Was Greater Than £95, Or Less Than £114.99 As Expected" , true);
		}
		else {
			logTestResult("The Price Selected Was Less Than £95, Or Greater Than £114.99  - Actual Was £"+sPriceValue, false);
		}
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		//////
			//------------------------------------------------------------------
			// 27 - makes sense to put it here, as we have already done the selection/navigation
			logInfo(" ***************** Test Step 27 *******************");
			//------------------------------------------------------------------			
			continuesubmit(ANY, READY).click();
			// Document: Breakdown Cover : Your details - The AA: https://prelive3.theaa.com/breakdown-cover/uk-breakdown/view-customerdetails.do?comingFrom=quote&newJourney=true&optMshp=scon100HS
			annualOfferMessage().performTest(annualOfferMessage_eVP(), 0.25, 20.0);
			//------------------------------------------------------------------
			// Return to Personalise your cover page
				
				callScript("Utilities.Populate_Policy_Holder");
				//------------------------------------------------------------------
				// 34 - makes sense to put it here, as we have already done the selection/navigation
				logInfo(" ***************** Test Step 35 *******************");
				//------------------------------------------------------------------				
				// Hit Continue
				button_continuesubmit(ANY, READY).click();
				// verify 20 offer
				annualOfferMessage().performTest(annualOffer_20pound_giftVP(), 0.25, 20.0);
				
			//------------------------------------------------------------------
		// Close It
		iE(breakdownCoverView(),DEFAULT_FLAGS).close();				
		// Re Start
		startApp("IE", environmentURL);	

		link_getCover(ANY, READY).click();		
		
		// £95 - £ 114.99
		coverForYouWhen(ANY, READY).click();
		atHome(ANY, READY).click();
		
		label_1Year().waitForExistence(25.0,  0.25);

		label_1Year(ANY, READY).click();
		//------------------------------------------------------------------
		// Verify Monthly Gift Cards (Choose Annual Payment for Cards)Hi Kia,		
		//------------------------------------------------------------------
		// Verify Monthly Gift Cards (Choose Annual Payment for Cards)
		annualOffer_GiftCard_Message().performTest(annualOfferMessage_cVP(), 0.25, 20.0);
		//------------------------------------------------------------------
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		// Synch
		pricevalue().waitForExistence(20.0,  0.25);		
		
		sleep(2);
		// Scrape PRICE VALUE - main Numeric Indicator on screen
		//------------------------------------------------------------------
		// Choose Cover for You >£95   String sAddress1 = (String)Address_1().getProperty("value");
		sPriceValue = (String)pricevalue().getProperty(".text");
		logInfo("  -------- "+sPriceValue+" --------");
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		
		// 12)
		logInfo(" ***************** Test Step 12 *******************");
		//------------------------------------------------------------------
		label_monthly().waitForExistence(20.0,  0.25);
		label_monthly(ANY, READY).click();
		//------------------------------------------------------------------
		// Verify Monthly Gift Cards (Choose Annual Payment for Cards)
		monthlyOfferMessage().performTest(monthlyOfferMessage_bVP(), 0.25, 20.0);  // VP Re-use
		
			//------------------------------------------------------------------
			// 28 - makes sense to put it here, as we have already done the selection/navigation
			logInfo(" ***************** Test Step 28 *******************");
			//------------------------------------------------------------------			
			continuesubmit(ANY, READY).click();
			monthlyOfferMessage().performTest(monthlyOfferMessage_bVP(), 0.25, 20.0);
			//------------------------------------------------------------------
			// Return to Personalise your cover page
			
			callScript("Utilities.Populate_Policy_Holder");
			//------------------------------------------------------------------
			// 34 - makes sense to put it here, as we have already done the selection/navigation
			logInfo(" ***************** Test Step 36 *******************");
			//------------------------------------------------------------------				
			// Hit Continue
			button_continuesubmit(ANY, READY).click();
			// verify 20 offer
			annualOfferMessage().performTest(annualOffer_20pound_giftVP(), 0.25, 20.0);

		// Close It
		iE(breakdownCoverView(),DEFAULT_FLAGS).close();				
		// Re Start
		startApp("IE", environmentURL);	

		link_getCover(ANY, READY).click();		
		
		// £95 - £ 114.99
		coverForYouWhen().waitForExistence(25.0,  0.25);
		coverForYouWhen(ANY, READY).click();
		atHome(ANY, READY).click();
		label_1Year(ANY, READY).click();
		
		// 13)
		logInfo(" ***************** Test Step 13 *******************");
		//------------------------------------------------------------------
		//------------------------------------------------------------------
		// Choose Vehicle >£95 - £114.99
		// Select Cover for You and 1 Year
		//------------------------------------------------------------------
		vehicleCoverForOneVehicl().waitForExistence(20.0,  0.25);
		vehicleCoverForOneVehicl(ANY, READY).click();
		
		label_1Year().waitForExistence(25.0,  0.25);

		label_1Year(ANY, READY).click();
		//------------------------------------------------------------------
		// Verify Annual Gift Cards (
		annualOffer_GiftCard_Message().performTest(annualOfferMessage_bVP(), 0.25, 20.0);  // VP Re-use
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		// Synch
		pricevalue().waitForExistence(20.0,  0.25);		
		
		sleep(2);
		// Scrape PRICE VALUE - main Numeric Indicator on screen
		//------------------------------------------------------------------
		// Choose Cover for You >£95   String sAddress1 = (String)Address_1().getProperty("value");
		sPriceValue = (String)pricevalue().getProperty(".text");
		//logInfo("  -------- "+sPriceValue+" --------");
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		//------------------------------------------------------------------
		// 14)
		logInfo(" ***************** Test Step 14 *******************");
		//------------------------------------------------------------------
		label_monthly(ANY, READY).click();
		//------------------------------------------------------------------
		// Verify Monthly Gift Cards (Choose Annual Payment for Cards)
		monthlyOfferMessage().performTest(monthlyOfferMessage_bVP(), 0.25, 20.0);  // VP Re-use
		// 
		//------------------------------------------------------------------
		// 15)
		logInfo(" ***************** Test Step 15 *******************");
		//------------------------------------------------------------------
		coverForYouWhen().waitForExistence(25.0,  0.25);
		coverForYouWhen(ANY, READY).click();
		atHome(ANY, READY).click();  // ALLReady Selected
		nationalRecoveryTransport().click();	
		
		label_1Year().waitForExistence(25.0,  0.25);

		label_1Year(ANY, READY).click();
		//------------------------------------------------------------------
		// £30 and £50
		annualOffer_GiftCard_Message().performTest(annualOffer_dVP(), 0.25, 20.0);
		// This line (below) could be flaky)
		// RootTestObject.getScreenTestObject().performTest(Annual_30_50VP(), 0.25, 20.0);
		//------------------------------------------------------------------
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		// Synch
		pricevalue().waitForExistence(20.0,  0.25);		

		sleep(2);
		
		label_1Year().waitForExistence(25.0, 0.25);
		// HTML Browser
		// Document: RegularExpression(.*View and choose your cover.*): RegularExpression(.*breakdown-cover/uk-breakdown/.*)
		label_1Year(ANY, READY).click();
		
		atHome().waitForExistence(25.0,  0.25);
		atHome(ANY, READY).click();
		
		pricevalue().waitForExistence(25.0,  0.25);
		
		sleep(2);
		
		// Scrape PRICE VALUE - main Numeric Indicator on screen
		
		//------------------------------------------------------------------
		// Choose Cover for You >£95   String sAddress1 = (String)Address_1().getProperty("value");
		sPriceValue = (String)pricevalue().getProperty(".text");
		//logInfo("  -------- "+sPriceValue+" --------");
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		sleep(0.25);
		
		value = sPriceValue.split("£"); // £124.99				
		sPriceValue = value[1]; // 124.99	
		value = sPriceValue.split("\\."); // 124.99
		sPriceValue = value[0];		// 124	
		
		iGT95LT11499 = 115;
		iGT115LT14499 = 145;
		iActual = Integer.parseInt(sPriceValue);
		
		//------------------------------------------------------------------
		if (iActual>iGT95LT11499&&iActual<iGT115LT14499){
			logTestResult("The Price Selected = £"+sPriceValue+" And Was Greater Than £115, Or Less Than £144.99 As Expected" , true);
		}
		else {
			logTestResult("The Price Selected Was Less Than £115, Or Greater Than £144.99 - Actual Was £"+sPriceValue, false);
		}		

		//------------------------------------------------------------------
			// 29 - makes sense to put it here, as we have already done the selection/navigation
			logInfo(" ***************** Test Step 29 *******************");
			//------------------------------------------------------------------			
			continuesubmit(ANY, READY).click();
			// Document: Breakdown Cover : Your details - The AA: https://prelive3.theaa.com/breakdown-cover/uk-breakdown/view-customerdetails.do?comingFrom=quote&newJourney=true&optMshp=scon100HS
			annualOfferMessage().performTest(annualOfferMessage_eVP(), 0.25, 20.0);
			//------------------------------------------------------------------

			callScript("Utilities.Populate_Policy_Holder");
			//------------------------------------------------------------------
			// 34 - makes sense to put it here, as we have already done the selection/navigation
			logInfo(" ***************** Test Step 38 *******************");
			//------------------------------------------------------------------				
			// Hit Continue
			button_continuesubmit(ANY, READY).click();
			// verify 20 offer
			annualOfferMessage().performTest(annualOffer_20pound_giftVP(), 0.25, 20.0);

		// Close It
		iE(breakdownCoverView(),DEFAULT_FLAGS).close();				
		// Re Start
		startApp("IE", environmentURL);	

		link_getCover(ANY, READY).click();		
		
		// £95 - £ 114.99
		coverForYouWhen(ANY, READY).click();
		//		atHome(ANY, READY).click();  // ALLReady Selected
		nationalRecoveryTransport().click();		
		// 16)
		logInfo(" ***************** Test Step 16 *******************");
		//------------------------------------------------------------------
		label_monthly().waitForExistence(20.0,  0.25);
		label_monthly(ANY, READY).click();
		//------------------------------------------------------------------
		// Verify Monthly Gift Cards (Choose Annual Payment for Cards)
		monthlyOfferMessage().performTest(monthlyOfferMessage_bVP(), 0.25, 20.0);  // VP Re-use
		// 
		//------------------------------------------------------------------			
		
		// Close It
		iE(breakdownCoverView(),DEFAULT_FLAGS).close();				
		// Re Start
		startApp("IE", environmentURL);	

		link_getCover(ANY, READY).click();		

		// 17)
		logInfo(" ***************** Test Step 17 *******************");
		//------------------------------------------------------------------
		//------------------------------------------------------------------
		// Choose Vehicle >£115 - £144.99
		// Select Cover for You and 1 Year
		//------------------------------------------------------------------
		vehicleCoverForOneVehicl().waitForExistence(20.0,  0.25);
		vehicleCoverForOneVehicl(ANY, READY).click();
		selectedOptionsrelay(ANY, READY).click();
		onwardTravelOption(ANY, READY).click();
		
		label_1Year().waitForExistence(25.0,  0.25);

		label_1Year(ANY, READY).click();
		//------------------------------------------------------------------
		// Verify Annual Gift Cards (
		annualOffer_GiftCard_Message().performTest(annualOfferMessage_bVP(), 0.25, 20.0);  // VP Re-use
		//------------------------------------------------------------------
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		// Synch
		pricevalue().waitForExistence(20.0,  0.25);		
		
		sleep(2);
		
		// Scrape PRICE VALUE - main Numeric Indicator on screen
		//------------------------------------------------------------------
		// Choose Cover for You >£95   String sAddress1 = (String)Address_1().getProperty("value");
		sPriceValue = (String)pricevalue().getProperty(".text");
		//logInfo("  -------- "+sPriceValue+" --------");
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		// Close It
		iE(breakdownCoverView(),DEFAULT_FLAGS).close();				
		// Re Start
		startApp("IE", environmentURL);	

		link_getCover(ANY, READY).click();		

		//------------------------------------------------------------------
		// Choose Vehicle >£145 
		// Select Cover for You and 1 Year
		//------------------------------------------------------------------
		vehicleCoverForOneVehicl().waitForExistence(20.0,  0.25);
		vehicleCoverForOneVehicl(ANY, READY).click();
		selectedOptionsrelay(ANY, READY).click();
		onwardTravelOption(ANY, READY).click();
		nationalRecoveryTransport(ANY, READY).click();
		selectedOptionsrelay(ANY, READY).click();
		
		label_1Year().waitForExistence(25.0,  0.25);
		
		label_1Year(ANY, READY).click();
		//------------------------------------------------------------------
		
		// 18)
		logInfo(" ***************** Test Step 18 *******************");
		//------------------------------------------------------------------
		label_monthly(ANY, READY).click();
		//------------------------------------------------------------------
		// Verify Monthly Gift Cards (Choose Annual Payment for Cards)
		monthlyOfferMessage().performTest(monthlyOfferMessage_bVP(), 0.25, 20.0);  // VP Re-use
		// 
		//------------------------------------------------------------------
		// 19)
		logInfo(" ***************** Test Step 19 *******************");
		//------------------------------------------------------------------
		coverForYouWhen().waitForExistence(25.0,  0.25);
		coverForYouWhen(ANY, READY).click();
		//atHome(ANY, READY).click();  // ALLReady Selected
		nationalRecoveryTransport(ANY, READY).click();		
		partsGarage(ANY, READY).click();
		
		label_1Year().waitForExistence(25.0,  0.25);
		
		label_1Year(ANY, READY).click();
		//------------------------------------------------------------------
		// £30 and £50
		annualOffer_GiftCard_Message().performTest(annualOffer_dVP(), 0.25, 20.0); // vp re-use
		//------------------------------------------------------------------
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		// Synch
		pricevalue().waitForExistence(20.0,  0.25);		
		
		sleep(2);

		// Scrape PRICE VALUE - main Numeric Indicator on screen
		//------------------------------------------------------------------
		// Choose Cover for You >£145   String sAddress1 = (String)Address_1().getProperty("value");
		sPriceValue = (String)pricevalue().getProperty(".text");
		//logInfo("  -------- "+sPriceValue+" --------");
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		value = sPriceValue.split("£"); // £144.99				
		sPriceValue = value[1]; // 144.99	
		value = sPriceValue.split("\\."); // 144.99
		sPriceValue = value[0];		// 144	
		
		iGT145 = 145;
		iActual = Integer.parseInt(sPriceValue);
		
		//------------------------------------------------------------------
		if (iActual>iGT145){
			logTestResult("The Price Selected = £"+sPriceValue+" And Was Greater Than £145, As Expected" , true);
		}
		else {
			logTestResult("The Price Selected Was Less Than £145 - Actual Was £"+sPriceValue, false);
		}		
		 
			//------------------------------------------------------------------
			// 30 - makes sense to put it here, as we have already done the selection/navigation
			logInfo(" ***************** Test Step 30 *******************");
			//------------------------------------------------------------------			
			//continuesubmit(ANY, READY).click();
			// Document: Breakdown Cover : Your details - The AA: https://prelive3.theaa.com/breakdown-cover/uk-breakdown/view-customerdetails.do?comingFrom=quote&newJourney=true&optMshp=scon100HS
			monthlyOfferMessage().performTest(monthlyOfferMessage_bVP(), 0.25, 20.0);
			//------------------------------------------------------------------			
				logInfo(" ***************** Test Step 31 *******************");
				//------------------------------------------------------------------
				label_monthly().waitForExistence(20.0,  0.25);
				label_monthly(ANY, READY).click();
				//------------------------------------------------------------------
				// html_monthlyOfferMessage().performTest(monthlyOfferMessage_textVP(), 0.25, 20.0);
				monthlyOfferMessage().performTest(monthlyOfferMessage_textVP(), 0.25, 20.0);
					//------------------------------------------------------------------
					// 32 - makes sense to put it here, as we have already done the selection/navigation
					logInfo(" ***************** Test Step 32 *******************");
					//------------------------------------------------------------------						
					// Details page, caveat verification
					important_information().performTest(important_information_caveat_textVP(), 0.25, 20.0);

		// Close It
		iE(breakdownCoverView(),DEFAULT_FLAGS).close();				
		// Re Start
		startApp("IE", environmentURL);	

		link_getCover(ANY, READY).click();		

		//------------------------------------------------------------------
		// Choose Vehicle >£145 
		// Select Cover for You and 1 Year
		//------------------------------------------------------------------
		vehicleCoverForOneVehicl().waitForExistence(20.0,  0.25);
		vehicleCoverForOneVehicl(ANY, READY).click();
		selectedOptionsrelay(ANY, READY).click();
		onwardTravelOption(ANY, READY).click();
		
		label_1Year().waitForExistence(25.0,  0.25);

		label_1Year(ANY, READY).click();

		////////////////////////////////////
		
		// 20)
		logInfo(" ***************** Test Step 20 *******************");
		//------------------------------------------------------------------
		label_monthly(ANY, READY).click();
		//------------------------------------------------------------------
		// Verify Monthly Gift Cards (Choose Annual Payment for Cards)
		monthlyOfferMessage().performTest(monthlyOfferMessage_bVP(), 0.25, 20.0);  // VP Re-use
		// 
		//------------------------------------------------------------------
		// 21)
		logInfo(" ***************** Test Step 21 *******************");
		//------------------------------------------------------------------
		// Choose Vehicle >£145 
		// Select Cover for You and 1 Year
		//------------------------------------------------------------------
		
		//vehicleCoverForOneVehicl(ANY, READY).click();
		//selectedOptionsrelay(ANY, READY).click();
		//onwardTravelOption(ANY, READY).click();
		label_1Year(ANY, READY).click();
		//------------------------------------------------------------------
		
		
		// Verify Annual Gift Cards (
		annualOffer_GiftCard_Message().performTest(annualOfferMessage_bVP(), 0.25, 20.0);  // VP Re-use
		
		//------------------------------------------------------------------ 
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		// Synch
		pricevalue().waitForExistence(20.0,  0.25);		
		// Scrape PRICE VALUE - main Numeric Indicator on screen
		//------------------------------------------------------------------
		// Choose Cover for You >£95   String sAddress1 = (String)Address_1().getProperty("value");
		sPriceValue = (String)pricevalue().getProperty(".text");
		logInfo("  -------- "+sPriceValue+" --------");
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		//------------------------------------------------------------------
		// 22 and 23)
		logInfo(" ************** Test Step 22 + 23 ****************");
		//------------------------------------------------------------------
		label_monthly(ANY, READY).click();
		//------------------------------------------------------------------
		// Verify Monthly Gift Cards (Choose Annual Payment for Cards)
		monthlyOfferMessage().performTest(monthlyOfferMessage_bVP(), 0.25, 20.0);  // VP Re-use
		// 
		//------------------------------------------------------------------
		logInfo(" ***************** Test Step 24 *******************");
		
		////////////////////////////////////////////////////////////////////
		// 24)
		// Caveat in Terms and Conditions page
		////////////////////////////////////////////////////////////////////
		
		important_information().performTest(important_information_caveat_messageVP(), 0.25, 20.0);
		
		
		//------------------------------------------------------------------
		logInfo(" ***************** Test Step 46 *******************");
		
		
//		// This is from LIVE - Check the offers, but not the actual detail (currently out of date)
//		iE(document_breakdownCoverYourDet(ANY, READY),DEFAULT_FLAGS).click(atPoint(351,46));
//		iE(document_breakdownCoverYourDet(ANY, READY),DEFAULT_FLAGS).inputKeys("www.google.co.uk{ENTER}");
//		iE(document_breakdownCoverYourDet(ANY, READY),DEFAULT_FLAGS).inputKeys("AA{ENTER}");
//		// Document: AA - Google Search: https://www.google.co.uk/search?hl=en-GB&source=hp&q=AA&gbv=2&oq=AA&gs_l=heirloom-hp.3..0l10.15015.15250.0.17515.2.2.0.0.0.0.63.125.2.2.0.msedr...0...1ac.1.34.heirloom-hp..0.2.125.r6yb7kNYy5A
//		link_breakdownCover(ANY, READY).click();
//		
//		//------------------------------------------------------------------
//		// Returned Search - Live Data Will Currently Be INCORRECT, This Test Will Fail Before Deployment To Live
//		html_bdAutumnOffer().performTest(bdAutumnOffer_textVP(), 0.25, 20.0);
//		//------------------------------------------------------------------
		
		// Close It
		iE(breakdownCoverView(),DEFAULT_FLAGS).close();				
		
		//------------------------------------------------------------------			
		//callScript ("Utilities.Pay_DD");

		// Get a Love2shop gift card when you spend over £95 on personal-based cover and pay annually. You can spend it at over 30 leading retailers including Argos, Boots and Halfords		
		
		// Set Row to end on in Datapool, don't change this unless you really

		// Time stamp the end of the test
		//------------------------------------------------------------------
		String timeStamp2 = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
		System.out.println("End time = " + timeStamp2);
		//------------------------------------------------------------------
		
		//public static int populateAddress(){
			
		
	}
}
