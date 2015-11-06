// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.BreakDown_Cover_MK2.Verifications;
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
 * Script Name   : <b>Confirmation_Page</b><br>
 * Generated     : <b>2015/06/11 10:19:12</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  June 11, 2015
 * @author horned
 */
public abstract class Confirmation_PageHelper extends Utilities.AA_SuperHelper
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
	
	

	protected Confirmation_PageHelper()
	{
		setScriptName("BreakDown_Cover_MK2.Verifications.Confirmation_Page");
	}
	
}
