// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Home;

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
 * Script Name   : <b>Your_Documents</b><br>
 * Generated     : <b>2013/02/27 12:49:51</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows XP x86 5.1 <br>
 * 
 * @since  February 27, 2013
 * @author courtl
 */
public abstract class Your_DocumentsHelper extends RationalTestScript
{
	/**
	 * Next: with default state.
	 *		.id : 
	 * 		.type : image
	 * 		.value : 
	 * 		.title : 
	 * 		.class : Html.INPUT.image
	 * 		.name : Submit
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_next() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_next"));
	}
	/**
	 * Next: with specific test context and state.
	 *		.id : 
	 * 		.type : image
	 * 		.value : 
	 * 		.title : 
	 * 		.class : Html.INPUT.image
	 * 		.name : Submit
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_next(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_next"), anchor, flags);
	}
	
	/**
	 * HelpWithSortCodeLinkOpensANewWindow: with default state.
	 *		.text : Sort code
	 * 		.href : https://prelive5.theaa.com/services/insuranceandfinance/home/help.html#payment
	 * 		.id : 
	 * 		.title : Help with sort code - link opens a new window
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_helpWithSortCodeLinkOpens() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_helpWithSortCodeLinkOpens"));
	}
	/**
	 * HelpWithSortCodeLinkOpensANewWindow: with specific test context and state.
	 *		.text : Sort code
	 * 		.href : https://prelive5.theaa.com/services/insuranceandfinance/home/help.html#payment
	 * 		.id : 
	 * 		.title : Help with sort code - link opens a new window
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_helpWithSortCodeLinkOpens(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_helpWithSortCodeLinkOpens"), anchor, flags);
	}
	
	/**
	 * cardType: with default state.
	 *		.text : -------------- AA MasterCard AA Visa Mastercard Mastercard Debit Maestro Visa Vi ...
	 * 		.id : CardType
	 * 		.class : Html.SELECT
	 * 		.title : 
	 * 		.name : cardType
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_cardType() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_cardType"));
	}
	/**
	 * cardType: with specific test context and state.
	 *		.text : -------------- AA MasterCard AA Visa Mastercard Mastercard Debit Maestro Visa Vi ...
	 * 		.id : CardType
	 * 		.class : Html.SELECT
	 * 		.title : 
	 * 		.name : cardType
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_cardType(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_cardType"), anchor, flags);
	}
	
	/**
	 * email: with default state.
	 *		.id : 
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : email
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_email() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_email"));
	}
	/**
	 * email: with specific test context and state.
	 *		.id : 
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : email
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_email(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_email"), anchor, flags);
	}
	
	

	protected Your_DocumentsHelper()
	{
		setScriptName("Home.Your_Documents");
	}
	
}

