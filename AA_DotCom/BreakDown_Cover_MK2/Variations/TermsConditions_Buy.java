package BreakDown_Cover_MK2.Variations;
import resources.BreakDown_Cover_MK2.Variations.TermsConditions_BuyHelper;
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
public class TermsConditions_Buy extends TermsConditions_BuyHelper
{
	/**
	 * Script Name   : <b>TwoPerson_TermsConditions</b>
	 * Generated     : <b>10 Jun 2015 11:09:47</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/10
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//----------------------------------------------
		BrowserSync();
		//--------------------------------------------------------------------	
		// TC Detection
		try {
			if (label_iConfirmThatYouHaveInfor().exists()){
				//----------------------------------------------
				label_iConfirmThatYouHaveInfor().waitForExistence(20,  0.25);
				label_iConfirmThatYouHaveInfor(ANY, READY).click();					
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//--------------------------------------------------------------------	
		//		// Buy Breakdown Cover
		try {
			if (button_buyBreakdownCoverbutton().exists()){
				//----------------------------------------------
				button_buyBreakdownCoverbutton().waitForExistence(20,  0.25);
				button_buyBreakdownCoverbutton(ANY, READY).click();					
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//----------------------------------------------
		BrowserSync();
		//--------------------------------------------------------------------			
	}
}

