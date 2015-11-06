package BreakDown_Cover_MK2.Variations;
import resources.BreakDown_Cover_MK2.Variations.Add_Second_PersonHelper;
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
public class Add_Second_Person extends Add_Second_PersonHelper
{
	/**
	 * Script Name   : <b>Add_Second_Person</b>
	 * Generated     : <b>10 Jun 2015 13:59:24</b>
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
		// Title
		label_miss().waitForExistence(20,  0.25);
		label_miss(ANY, READY).click();
		//--------------------------------------------------------------------
		// First Name
		text_additionalMembers0FirstNa().waitForExistence(20,  0.25);
		text_additionalMembers0FirstNa(ANY, READY).doubleClick(atPoint(251,45));
		iE(document_breakdownCoverYourDet(),DEFAULT_FLAGS).inputChars("Pauline");
		//--------------------------------------------------------------------
		// Surname
		text_additionalMembers0Surname().waitForExistence(20,  0.25);
		text_additionalMembers0Surname(ANY, READY).doubleClick(atPoint(31,39));
		iE(document_breakdownCoverYourDet(),DEFAULT_FLAGS).inputChars("Plunkett");
		//--------------------------------------------------------------------
		// DOB
		text_additionalMembers0DateOfB().waitForExistence(20,  0.25);
		text_additionalMembers0DateOfB(ANY, READY).doubleClick(atPoint(183,56));
		iE(document_breakdownCoverYourDet(),DEFAULT_FLAGS).inputChars("19/04/1999");
		//--------------------------------------------------------------------
		
	}
}

