// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Utilities;
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
 * Script Name   : <b>Get_Page_Data</b><br>
 * Generated     : <b>2015/09/29 10:28:41</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  September 29, 2015
 * @author horned
 */
public abstract class Get_Page_DataHelper extends Utilities.AA_SuperHelper
{
	/**
	 * CarInsuranceYourQuoteTheAA: with default state.
	 *		.title : RegularExpression(Your quote)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(car-insurance)
	 */
	protected DocumentTestObject document_carInsuranceYourQuote() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceYourQuote"));
	}
	/**
	 * CarInsuranceYourQuoteTheAA: with specific test context and state.
	 *		.title : RegularExpression(Your quote)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(car-insurance)
	 */
	protected DocumentTestObject document_carInsuranceYourQuote(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceYourQuote"), anchor, flags);
	}
	
	/**
	 * quoteForm: with default state.
	 *		.id : quoteForm
	 * 		.title : 
	 * 		.class : Html.FORM
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject form_quoteForm() 
	{
		return new GuiTestObject(
                        getMappedTestObject("form_quoteForm"));
	}
	/**
	 * quoteForm: with specific test context and state.
	 *		.id : quoteForm
	 * 		.title : 
	 * 		.class : Html.FORM
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject form_quoteForm(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("form_quoteForm"), anchor, flags);
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
	
	

	protected Get_Page_DataHelper()
	{
		setScriptName("Utilities.Get_Page_Data");
	}
	
}

