// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Basics_Road;
import Utilities.AA_SuperHelper;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.vp.IFtVerificationPoint;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Script Name   : <b>Confirmation_4</b><br>
 * Generated     : <b>2015/10/27 15:23:50</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows x86 6.3 <br>
 * 
 * @since  October 27, 2015
 * @author horned
 */
public abstract class Confirmation_4Helper extends Utilities.AA_SuperHelper
{
	/**
	 * container: with default state.
	 *		.id : container
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_container() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_container"));
	}
	/**
	 * container: with specific test context and state.
	 *		.id : container
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_container(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_container"), anchor, flags);
	}
	
	/**
	 * Locate and return the verification point Journey_Complete object in the SUT.
	 */
	protected IFtVerificationPoint Journey_CompleteVP() 
	{
		return vp("Journey_Complete");
	}
	protected IFtVerificationPoint Journey_CompleteVP(TestObject anchor)
	{
		return vp("Journey_Complete", anchor);
	}
	
	

	protected Confirmation_4Helper()
	{
		setScriptName("Basics_Road.Confirmation_4");
	}
	
}

