// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Motor_MK2.Your__Quote;
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
 * Script Name   : <b>Your_Quote</b><br>
 * Generated     : <b>2015/07/24 09:04:57</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  July 24, 2015
 * @author horned
 */
public abstract class Your_QuoteHelper extends Utilities.AA_SuperHelper
{
	/**
	 * Nextsubmit: with default state.
	 *		.id : next_button
	 * 		.type : submit
	 * 		.value : Next
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 2
	 */
	protected GuiTestObject button_nextsubmit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_nextsubmit"));
	}
	/**
	 * Nextsubmit: with specific test context and state.
	 *		.id : next_button
	 * 		.type : submit
	 * 		.value : Next
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 2
	 */
	protected GuiTestObject button_nextsubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_nextsubmit"), anchor, flags);
	}
	
	/**
	 * mainForm: with default state.
	 *		.id : mainForm
	 * 		.title : 
	 * 		.class : Html.FORM
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject form_mainForm() 
	{
		return new GuiTestObject(
                        getMappedTestObject("form_mainForm"));
	}
	/**
	 * mainForm: with specific test context and state.
	 *		.id : mainForm
	 * 		.title : 
	 * 		.class : Html.FORM
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject form_mainForm(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("form_mainForm"), anchor, flags);
	}
	
	/**
	 * main: with default state.
	 *		.id : main
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_main() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_main"));
	}
	/**
	 * main: with specific test context and state.
	 *		.id : main
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_main(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_main"), anchor, flags);
	}
	
	/**
	 * main: with default state.
	 *		.id : main
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_main_DD() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_main_DD"));
	}
	/**
	 * main: with specific test context and state.
	 *		.id : main
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_main_DD(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_main_DD"), anchor, flags);
	}
	
	/**
	 * htmlBrowser: with default state.
	 *		.class : Html.HtmlBrowser
	 * 		.browserName : MS Internet Explorer
	 * 		.processName : iexplore.exe
	 */
	protected BrowserTestObject iE() 
	{
		return new BrowserTestObject(
                        getMappedTestObject("iE"));
	}
	/**
	 * htmlBrowser: with specific test context and state.
	 *		.class : Html.HtmlBrowser
	 * 		.browserName : MS Internet Explorer
	 * 		.processName : iexplore.exe
	 */
	protected BrowserTestObject iE(TestObject anchor, long flags) 
	{
		return new BrowserTestObject(
                        getMappedTestObject("iE"), anchor, flags);
	}
	
	/**
	 * IConfirmThatYouHaveBroughtToMyAttentionTheImportanceO: with default state.
	 *		.id : 
	 * 		.value : I confirm that you have brought to my attention the importance of reading these  ...
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 6
	 */
	protected GuiTestObject label_iConfirmThatYouHaveBroug() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_iConfirmThatYouHaveBroug"));
	}
	/**
	 * IConfirmThatYouHaveBroughtToMyAttentionTheImportanceO: with specific test context and state.
	 *		.id : 
	 * 		.value : I confirm that you have brought to my attention the importance of reading these  ...
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 6
	 */
	protected GuiTestObject label_iConfirmThatYouHaveBroug(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_iConfirmThatYouHaveBroug"), anchor, flags);
	}
	
	/**
	 * bankAccountName: with default state.
	 *		.id : ACCOUNTNAME
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : bank.accountName
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_bankAccountName() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_bankAccountName"));
	}
	/**
	 * bankAccountName: with specific test context and state.
	 *		.id : ACCOUNTNAME
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : bank.accountName
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_bankAccountName(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_bankAccountName"), anchor, flags);
	}
	
	

	protected Your_QuoteHelper()
	{
		setScriptName("Motor_MK2.Your__Quote.Your_Quote");
	}
	
}

