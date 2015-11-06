package Motor_MK2.Please_Call_Us;
import javax.swing.text.StyledEditorKit.BoldAction;

import resources.Common_Variables;
import resources.Motor_MK2.Please_Call_Us.Quote_FailureHelper;
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
public class Quote_Failure extends Quote_FailureHelper
{
	/**
	 * Script Name   : <b>Quote_Failure</b>
	 * Generated     : <b>14 Sep 2015 09:59:43</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/09/14
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
//		// Test Data
//		String sSurname = "Bloggs";
//		String sPostCode = "SO14 1SD";
//		String sDateofBirth = "26/11/1908";
//		// Test Data
		//--------------------------------------------------------------------------------	
		String sSurname = Common_Variables.proposerLastname;
		String sPostCode = Common_Variables.proposer_PostCode;
		String sDateofBirth = Common_Variables.proposerDOB;
		//Boolean bQuoteFailure = false; 
		//--------------------------------------------------------------------------------	
		try {
			html_mainContent().waitForExistence(5, 0.25);
			String sPleaseCallUs = (String)html_mainContent().getProperty(".text");
			//--------------------
			Common_Variables.quoteRetrieveSuccess = false;
			//--------------------------------------------------------------------------------	
			if (sPleaseCallUs.contains("Please call us") && (sPleaseCallUs.contains("Sorry, this service is unavailable") || (sPleaseCallUs.contains("we're unable to complete your transaction online")))){
				
				// QUOTE REFERENCE RETRIEVAL DETAILS
				System.out.println(" * * * QUOTE REFERENCE RETRIEVAL DETAILS * * *");
				logInfo("* * * QUOTE REFERENCE RETRIEVAL DETAILS * * *");
				//--------------------------------------------------------------------------------	
				String sStartName  = "details you've given us so far: "; // quoting reference 
				String sEndName  = " "; // (HIDDEN HMI STRING TEXT)
				int iIndex = 1;
				String sReport = "Quote Failed";
				String sStartNameContent  = "";
				//--------------------------------------------------------------------------------		
				// Grab Value Off Of DONE Screen
				//--------------------------------------------------------------------------------		
				try {
					subString(sPleaseCallUs, sStartName, sEndName, iIndex, sStartNameContent);
				} catch (ArrayIndexOutOfBoundsException e) {
					
					sStartName  = "quoting reference ";  
					subString(sPleaseCallUs, sStartName, sEndName, iIndex, sStartNameContent);
					// Test Data
				}
				//--------------------------------------------------------------------------------	
				String sActualQuoteReference = Common_Variables.sActual;
				String svTitle = "Quote_Reference_Number"; sReport = sStartName;
				//--------------------------------------------------------------------------------		
				// Compare DONE Value With Initial QUOTE Page Value
				//--------------------------------------------------------------------------------		
				//                      |------- Actual -------|------- Expected -------|      
				VerifyandReport(svTitle, sActualQuoteReference, sActualQuoteReference, sReport);                      //    OK   // 1 off ok, multis fail  OK  //
				//--------------------------------------------------------------------------------		Insurance policy number: Result Was WW3MT215911D But Expected
				//Surname
				System.out.println("Surname = "+sSurname);
				logInfo("Surname = "+sSurname);
				//--------------------------------------------------------------------------------		Insurance policy number: Result Was WW3MT215911D But Expected
				// PostCode
				System.out.println("Postcode = "+sPostCode);
				logInfo("Surname = "+sPostCode);
				//--------------------------------------------------------------------------------		Insurance policy number: Result Was WW3MT215911D But Expected
				// Date of Birth
				System.out.println("Date of Birth = "+sDateofBirth);
				logInfo("Surname = "+sDateofBirth);
				//--------------------------------------------------------------------------------		Insurance policy number: Result Was WW3MT215911D But Expected			
				// SET RETRIEVE FAIL THEN GO TO NEXT JOURNEY
				//bQuoteFailure = true;
				System.out.println("Quote Retrieval Failed For Quote Reference = "+sActualQuoteReference);
				//Common_Variables.quoteRetrieveFailure = bQuoteFailure;
				//System.out.println(" Quote Retrieval Status = "+Common_Variables.quoteRetrieveFailure);
				//--------------------------------------------------------------------------------		Insurance policy number: Result Was WW3MT215911D But Expected			
			}
		} catch (ObjectNotFoundException e) {
			Common_Variables.quoteRetrieveSuccess = true;
			System.out.println("Quote Retrieval Successful");
		}
	}
}

