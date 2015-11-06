package BreakDown_Cover_MK2.Variations;
import resources.BreakDown_Cover_MK2.Variations.Add_FamilyHelper;
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
public class Add_Family extends Add_FamilyHelper
{
	/**
	 * Script Name   : <b>Add_Family</b>
	 * Generated     : <b>10 Jun 2015 13:59:37</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/10
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		// Second Person
		//--------------------------------------------------------------------
		callScript("BreakDown_Cover_MK2.Variations.Add_Second_Person");
		//--------------------------------------------------------------------
		BrowserSync();
		while (!label_ms4().isEnabled()){
			sleep(0.5);
		}
		//--------------------------------------------------------------------
		// Third Person
		// Title
		label_ms3().waitForExistence(20,  0.25);
		label_ms3(ANY, READY).click();
		//--------------------------------------------------------------------
		// First Name
		text_additionalMembers_3_First().waitForExistence(20,  0.25);
		text_additionalMembers_3_First(ANY, READY).doubleClick(atPoint(251,45));
		iE(document_breakdownCoverYourDet(),DEFAULT_FLAGS).inputChars("PSLAMI");
		//--------------------------------------------------------------------
		// Surname
		text_additionalMembers_3_Surname().waitForExistence(20,  0.25);
		text_additionalMembers_3_Surname(ANY, READY).doubleClick(atPoint(31,39));
		iE(document_breakdownCoverYourDet(),DEFAULT_FLAGS).inputChars("PLINKINGSPURSPUR");
		//--------------------------------------------------------------------
		// DOB
		text_additionalMembers_3_DOB().waitForExistence(20,  0.25);
		text_additionalMembers_3_DOB(ANY, READY).doubleClick(atPoint(183,56));
		iE(document_breakdownCoverYourDet(),DEFAULT_FLAGS).inputChars("09/07/1985");
		//--------------------------------------------------------------------
		BrowserSync();
		//--------------------------------------------------------------------
		// Forth Person
		// Title
		label_mr4().waitForExistence(20,  0.25);
		label_mr4(ANY, READY).click();
		//--------------------------------------------------------------------
		// First Name
		text_additionalMembers_4_First().waitForExistence(20,  0.25);
		text_additionalMembers_4_First(ANY, READY).doubleClick(atPoint(251,45));
		iE(document_breakdownCoverYourDet(),DEFAULT_FLAGS).inputChars("Ronnie");
		//--------------------------------------------------------------------
		// Surname
		text_additionalMembers_4_Surname().waitForExistence(20,  0.25);
		text_additionalMembers_4_Surname(ANY, READY).doubleClick(atPoint(31,39));
		iE(document_breakdownCoverYourDet(),DEFAULT_FLAGS).inputChars("Van Persil");
		//--------------------------------------------------------------------
		// DOB
		text_additionalMembers_4_DOB().waitForExistence(20,  0.25);
		text_additionalMembers_4_DOB(ANY, READY).doubleClick(atPoint(183,56));
		iE(document_breakdownCoverYourDet(),DEFAULT_FLAGS).inputChars("29/11/1962");
		//--------------------------------------------------------------------
		
	}
}

