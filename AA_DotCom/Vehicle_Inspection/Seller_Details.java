package Vehicle_Inspection;
import resources.Common_Variables;
import resources.Vehicle_Inspection.Seller_DetailsHelper;
import com.rational.test.ft.*;

import Utilities.Portal_Synchronisation;
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


////////////////////////////////////////////////////////////////////////////////////////
//
// Robbed From EBC - Dave Horne - September 2015 - SELLER DETAILS SCREEN (Step ?)
//
////////////////////////////////////////////////////////////////////////////////////////

public class Seller_Details extends Seller_DetailsHelper
{
	/**
	 * Script Name   : <b>Your_Details</b>
	 * Generated     : <b>5 Dec 2014 09:52:05</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/12/05
	 * @author horned
	 */
		
	public void testMain(Object[] args) 
	{
		// Debug Test Data Start   ************ COMMENT I AND OUT AS REQUIRED **********		
//		String sTitle = "Miss";
//		String sForename = "Donald";
//		String sSurname = "MacRonald";
//		String sHouseNumber = "1";
//		String sPostcode = "PO12 1LQ";		
//		String sPhoneNumber = "02392112233";
//		String sEmail = "donmacr@macdonalds.com";		
//		String sVendorName = "BAE";
//		String sVendorPhone = "0717234567";
//		String sVendorPostcode = "PO1 1DF"; // Used in Vehicle Details
		// Debug Test Data Start   ************ COMMENT I AND OUT AS REQUIRED **********		
		
		// ********************      Debug Test Data End     ***************************	
		String sTitle = (Common_Variables.title);
		String sForename = (Common_Variables.foreName);
		String sSurname = (Common_Variables.surName);
		String sHouseNumber = (Common_Variables.houseNumber);
		String sPostcode = (Common_Variables.postCode);
		String sPhoneNumber = (Common_Variables.phoneNumber);
		String sEmail = (Common_Variables.eMail);
		String sVendorName = (Common_Variables.vendorName);
		String sVendorPhone = (Common_Variables.vendorPhone);
		
		//--------------------------------------------------------------------
		// Synchronisation
		form_sellerDetails(ANY, LOADED).waitForExistence(5.0, 0.25);		
		//--------------------------------------------------------------------
		
		
		// Customer Title
		switch (sTitle){
		
			case "Mr":
				label_mr(ANY, READY).click();
				break;
				
			case "Mrs":
				label_mrs(ANY, READY).click();
				break;
				
			case "Miss":
				label_miss(ANY, READY).click();
				break;
				
			case "Ms":
				label_ms(ANY, READY).click();
				break;
		}
		//--------------------------------------------------------------------
		// Customer First Name
		text_customer_first_name().waitForExistence(10.0,  0.25);
		text_customer_first_name(ANY, READY).click();
		iE(ngApp(ANY, LOADED),DEFAULT_FLAGS).inputChars(sForename);		
		//--------------------------------------------------------------------
		// Customer Last Name
		text_customer_surname().waitForExistence(10.0,  0.25);
		text_customer_surname(ANY, READY).click();
		iE(ngApp(ANY, LOADED),DEFAULT_FLAGS).inputChars(sSurname);	
		//--------------------------------------------------------------------
		// Customer Address Number
		address_lineOne().waitForExistence(10.0,  0.25);
		address_lineOne(ANY, READY).click(atPoint(79,21));
		iE(inspection(),DEFAULT_FLAGS).inputChars(sHouseNumber);
		//--------------------------------------------------------------------
		// Customer Address Postcode
		text_postcode().waitForExistence(10.0,  0.25);
		text_postcode(ANY, READY).click(atPoint(41,28));
		iE(inspection(),DEFAULT_FLAGS).inputChars(sPostcode);
		//--------------------------------------------------------------------
		// Search Address
		find_Address_submit().waitForExistence(25.0,  0.25);
		find_Address_submit(ANY, READY).click();
		//--------------------------------------------------------------------
		// Synch
		address_county().waitForExistence(25.0,  0.25);
		sleep(2.0);
		
		// Address Selector
		callScript("Utilities.Address_Selector");
/*		// Pre-Populated; by Lookup                     Left Here For Reference
		//--------------------------------------------------------------------
		 * 
		 * 
		// Address Road/Street
		address_lineTwo(ANY, READY).click(atPoint(77,22));
		iE(inspection(),DEFAULT_FLAGS).inputChars("Belvedere Gardens");
		//--------------------------------------------------------------------
		// Address Town/City
		address_townOrCity(ANY, READY).click(atPoint(49,13));
		iE(inspection(),DEFAULT_FLAGS).inputChars("Basingstoke");
		//--------------------------------------------------------------------
		// Address County
		address_county(ANY, READY).click(atPoint(44,19));
		iE(inspection(),DEFAULT_FLAGS).inputChars("Hampshire");
		// Pre-Populated                         Left Here For Reference
		//--------------------------------------------------------------------
*/		
		//--------------------------------------------------------------------	
		// Customer Email
		text_email().waitForExistence(10.0,  0.25);
		text_email(ANY, READY).click(atPoint(139,17));
		iE(inspection(),DEFAULT_FLAGS).inputChars(sEmail);
		//--------------------------------------------------------------------
		// Customer Telephone		
		html_customer_phone().waitForExistence(10.0,  0.25);
		html_customer_phone(ANY, READY).click(atPoint(100,19));
		iE(inspection(),DEFAULT_FLAGS).inputChars(sPhoneNumber);
		//--------------------------------------------------------------------
		// Vendor Name
		text_vendor_name().waitForExistence(10.0,  0.25);
		text_vendor_name(ANY, READY).click();
		iE(ngApp(ANY, LOADED),DEFAULT_FLAGS).inputChars(sVendorName);		
		//--------------------------------------------------------------------
		// Vendor Phone
		html_vendor_phone().waitForExistence(10.0,  0.25);
		html_vendor_phone(ANY, READY).click();
		iE(ngApp(ANY, LOADED),DEFAULT_FLAGS).inputChars(sVendorPhone);	
		//--------------------------------------------------------------------
		// Commit		
		continue_submit(ANY, LOADED).waitForExistence(25.0, 0.25);
		continue_submit(ANY, LOADED).click();		
		//--------------------------------------------------------------------		
	}
}


