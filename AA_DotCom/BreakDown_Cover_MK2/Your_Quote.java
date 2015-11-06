package BreakDown_Cover_MK2;
import resources.BreakDown_Cover_MK2.Your_QuoteHelper;
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
public class Your_Quote extends Your_QuoteHelper
{
	/**
	 * Script Name   : <b>Your_Quote</b>
	 * Generated     : <b>6 Oct 2015 11:20:28</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/10/06
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		// Return Specific Quote Text Prior to Purchase (From Bottom of Personal Details Screen)
		String sQuote_Returned = (String)html_submitAppFormDiv().getProperty(".text");
		
		System.out.println(sQuote_Returned);
		
		// returned text
		// £  var allOptions = {"roadside":"Roadside Assistance","relay":"National Recovery","homeStart":"At Home","stayMobile":"Onward Travel","breakdownRepairCover":"Parts and Garage Cover"}; var allCoverTypes = {"single":"Cover for you","joint":"Cover for two people","joint3":"Family cover","vehicle":"Vehicle cover"}; var isVehicleProcessed = true; var jointNotSelectedErrorMessage = "Please select number of people to cover"; var isCardPayment = false; Your quote £5 Monthly £50 First year introductory price Cover for you Get 3 months' extra cover free if you choose at least one option and annual payment* You'll get 3 months' extra cover free as you've added an option and are paying annually Your introductory price is £12 less than the average paid by members between 1 October 2014 and 31 March 2015. The price includes fees for arranging and administering your cover.1 Continue

		
		
	}
}

