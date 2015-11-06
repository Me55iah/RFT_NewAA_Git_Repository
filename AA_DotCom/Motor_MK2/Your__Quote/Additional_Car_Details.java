package Motor_MK2.Your__Quote;
import resources.Common_Variables;
import resources.Motor_MK2.Your__Quote.Additional_Car_DetailsHelper;
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
public class Additional_Car_Details extends Additional_Car_DetailsHelper
{
	/**
	 * Script Name   : <b>Additional_Car_Details</b>
	 * Generated     : <b>13 Jul 2015 11:41:43</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/07/13
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//String sRegNumber = "NKD 305M";
		//-----------------------------------------------------------------------------------------
		// Presents When initial Vehicle Search Is BLANK - REG Seems To Be Re-Iterated For Some Reason? Expect Changes :-)
		//-----------------------------------------------------------------------------------------
		sleep(5);
		String sRegNumber = Common_Variables.vehicleReg;
		
		if (text_aaAdditionalRegistration().exists()){
			
			try {
				//-----------------------------------------------------------------------------------------
				//String sRegNumber = Common_Variables.vehicleReg;
				//-----------------------------------------------------------------------------------------
				// Grab QUOTE Reference For Later Comparison On DONE Page
				
				String sStringData = (String)html_mainContent().getProperty(".text");
				
				//--------------------------------------------------------------------------------		
				// Grab Insurance policy number: (and store)
				//--------------------------------------------------------------------------------		
				String sStartName  = "quote reference:"; 
				String sEndName  = "Call us"; 
				int iIndex = 1;
				String sStartNameContent  = ""; 
				//--------------------------------------------------------------------------------		
				// Grab Value Off Of Quote/Additional Car Details Screen Screen
				//--------------------------------------------------------------------------------
				// sStartNameContent = Common_Variables.sActual;
				subString(sStringData, sStartName, sEndName, iIndex, sStartNameContent);
				//--------------------------------------------------------------------------------	
				Common_Variables.intermediateQuoteReference = Common_Variables.sActual; //sStartNameContent;
				//--------------------------------------------------------------------------------			
				// Set Registration (Again) On Vehicle Extra Details - I think This Is Returned When Initial Search Fails To Return (The Car)
				sleep(2);
				text_aaAdditionalRegistration(ANY, READY).click(atPoint(124,32));
				browser_htmlBrowser(document_carInsuranceAdditiona(),DEFAULT_FLAGS).inputChars(sRegNumber);
				//-----------------------------------------------------------------------------------------
				// Click Next After Reg Entry
				button_nextsubmit().waitForExistence(5,  0.25);
				button_nextsubmit(ANY, READY).click();
				//-----------------------------------------------------------------------------------------
				// Extra Detail Returned Regarding Validity Of Reg, Select Correct Reg
				form_registrationNotFoundWeWer().waitForExistence(5,  0.25);
				form_registrationNotFoundWeWer(ANY, READY).click();
				//-----------------------------------------------------------------------------------------
				// Submit Again
				form_registrationNotFoundWeWer().waitForExistence(5,  0.25);
				button_nextsubmit2(ANY, READY).click();
				
			} catch (Exception e) {
				// Nothing
				e.printStackTrace();
			}
		}		
	}
}

