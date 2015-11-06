// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Travel;

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
 * Script Name   : <b>Declaration</b><br>
 * Generated     : <b>2013/12/03 12:28:18</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows XP x86 5.1 <br>
 * 
 * @since  December 03, 2013
 * @author courtl
 */
public abstract class DeclarationHelper extends RationalTestScript
{
	/**
	 * htmlBrowser: with default state.
	 *		.class : Html.HtmlBrowser
	 * 		.browserName : MS Internet Explorer
	 */
	protected BrowserTestObject browser_htmlBrowser() 
	{
		return new BrowserTestObject(
                        getMappedTestObject("browser_htmlBrowser"));
	}
	/**
	 * htmlBrowser: with specific test context and state.
	 *		.class : Html.HtmlBrowser
	 * 		.browserName : MS Internet Explorer
	 */
	protected BrowserTestObject browser_htmlBrowser(TestObject anchor, long flags) 
	{
		return new BrowserTestObject(
                        getMappedTestObject("browser_htmlBrowser"), anchor, flags);
	}
	
	/**
	 * Paymentsubmit: with default state.
	 *		.id : 
	 * 		.type : submit
	 * 		.value : Payment
	 * 		.title : Payment
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_paymentsubmit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_paymentsubmit"));
	}
	/**
	 * Paymentsubmit: with specific test context and state.
	 *		.id : 
	 * 		.type : submit
	 * 		.value : Payment
	 * 		.title : Payment
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_paymentsubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_paymentsubmit"), anchor, flags);
	}
	
	/**
	 * Paymentsubmit: with default state.
	 *		.id : 
	 * 		.type : submit
	 * 		.value : Payment
	 * 		.title : Payment
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_paymentsubmit2() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_paymentsubmit2"));
	}
	/**
	 * Paymentsubmit: with specific test context and state.
	 *		.id : 
	 * 		.type : submit
	 * 		.value : Payment
	 * 		.title : Payment
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_paymentsubmit2(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_paymentsubmit2"), anchor, flags);
	}
	
	/**
	 * aaCustomerMedicallyScreenedtrue: with default state.
	 *		.id : screened
	 * 		.type : checkbox
	 * 		.value : true
	 * 		.title : 
	 * 		.class : Html.INPUT.checkbox
	 * 		.name : aa.customer.medicallyScreened
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject checkBox_aaCustomerMedicallySc() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("checkBox_aaCustomerMedicallySc"));
	}
	/**
	 * aaCustomerMedicallyScreenedtrue: with specific test context and state.
	 *		.id : screened
	 * 		.type : checkbox
	 * 		.value : true
	 * 		.title : 
	 * 		.class : Html.INPUT.checkbox
	 * 		.name : aa.customer.medicallyScreened
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject checkBox_aaCustomerMedicallySc(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("checkBox_aaCustomerMedicallySc"), anchor, flags);
	}
	
	/**
	 * aaCustomerMedicallyScreenedtrue: with default state.
	 *		.id : screened
	 * 		.type : checkbox
	 * 		.value : true
	 * 		.title : 
	 * 		.class : Html.INPUT.checkbox
	 * 		.name : aa.customer.medicallyScreened
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject checkBox_aaCustomerMedicallySc2() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("checkBox_aaCustomerMedicallySc2"));
	}
	/**
	 * aaCustomerMedicallyScreenedtrue: with specific test context and state.
	 *		.id : screened
	 * 		.type : checkbox
	 * 		.value : true
	 * 		.title : 
	 * 		.class : Html.INPUT.checkbox
	 * 		.name : aa.customer.medicallyScreened
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject checkBox_aaCustomerMedicallySc2(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("checkBox_aaCustomerMedicallySc2"), anchor, flags);
	}
	
	/**
	 * aaCustomerUkResidenttrue: with default state.
	 *		.id : ukResident
	 * 		.type : checkbox
	 * 		.value : true
	 * 		.title : 
	 * 		.class : Html.INPUT.checkbox
	 * 		.name : aa.customer.ukResident
	 * 		.classIndex : 1
	 */
	protected ToggleGUITestObject checkBox_aaCustomerUkResidentt() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("checkBox_aaCustomerUkResidentt"));
	}
	/**
	 * aaCustomerUkResidenttrue: with specific test context and state.
	 *		.id : ukResident
	 * 		.type : checkbox
	 * 		.value : true
	 * 		.title : 
	 * 		.class : Html.INPUT.checkbox
	 * 		.name : aa.customer.ukResident
	 * 		.classIndex : 1
	 */
	protected ToggleGUITestObject checkBox_aaCustomerUkResidentt(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("checkBox_aaCustomerUkResidentt"), anchor, flags);
	}
	
	/**
	 * AATravelInsurance: with default state.
	 *		.title : RegularExpression(.*)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(.*)
	 */
	protected DocumentTestObject document_aaTravelInsurance() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_aaTravelInsurance"));
	}
	/**
	 * AATravelInsurance: with specific test context and state.
	 *		.title : RegularExpression(.*)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(.*)
	 */
	protected DocumentTestObject document_aaTravelInsurance(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_aaTravelInsurance"), anchor, flags);
	}
	
	/**
	 * divHeader: with default state.
	 *		.id : div-header
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_divHeader() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_divHeader"));
	}
	/**
	 * divHeader: with specific test context and state.
	 *		.id : div-header
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_divHeader(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_divHeader"), anchor, flags);
	}
	
	

	protected DeclarationHelper()
	{
		setScriptName("Travel.Declaration");
	}
	
}

