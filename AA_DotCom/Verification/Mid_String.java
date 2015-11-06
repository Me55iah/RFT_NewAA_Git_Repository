package Verification;
import resources.Verification.Mid_StringHelper;
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
public class Mid_String extends Mid_StringHelper
{
	/**
	 * Script Name   : <b>Mid_String</b>
	 * Generated     : <b>12 Jun 2015 13:58:49</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/12
	 * @author horned
	 */
	public void testMain(Object[] args, String sVarName, String sVarContent, String sFrom, String sTo ) 
	{
		
		// From New Breakdown Cove, Confirmation Page
		
		
		//------------------------------------------------------------
		// DATUM For Following Verification
		// Grab ALL Text (String From html - Container
		String sContainer_Text = (String)html_container().getProperty(".text");
		//------------------------------------------------------------

 		// DESTRUCTIVE TO UNDERLYING STRING
		// FIND FROM "Additional members ">
		String[] sStringMain = sContainer_Text.split(sFrom);
		// Assign Above Sub String To String sCustomer              
		
		
 		sVarName = sStringMain[1];
 		// Grab SubString From Index 0 to Occurance Of "Cover" In String 		
 		
 		// FIND TO <"Cover"
 		int i = (sVarName.indexOf(sTo));
 		
 		// Truncate End Pre-Marker 1 ("Additional members ") and Start Post_Marker 2 ("Cover")
 		//------------------------------------------------------------
 		sVarName = sVarName.substring(0, i);
 		//------------------------------------------------------------

 		//String sAdditionalMembers = sFromThanks[1];
		System.out.println(sVarName+" = "+sVarContent); 
		//System.out.println("Additional Members Length = "+ i);

		
		
		
		
		
		
	}
}

