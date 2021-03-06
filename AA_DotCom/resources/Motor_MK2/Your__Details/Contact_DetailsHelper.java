// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Motor_MK2.Your__Details;
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
 * Script Name   : <b>Contact_Details</b><br>
 * Generated     : <b>2015/07/01 15:50:23</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  July 01, 2015
 * @author horned
 */
public abstract class Contact_DetailsHelper extends Utilities.AA_SuperHelper
{
	/**
	 * CarInsuranceYourDetailsTheAA: with default state.
	 *		.title : RegularExpression(Your details)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(car-insurance)
	 */
	protected DocumentTestObject document_carInsuranceYourDetai() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceYourDetai"));
	}
	/**
	 * CarInsuranceYourDetailsTheAA: with specific test context and state.
	 *		.title : RegularExpression(Your details)
	 * 		.class : Html.HtmlDocument
	 * 		.url : RegularExpression(car-insurance)
	 */
	protected DocumentTestObject document_carInsuranceYourDetai(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceYourDetai"), anchor, flags);
	}
	
	/**
	 * aaMobileNumber: with default state.
	 *		.id : mobile
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : aa.mobileNumber
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_aaMobileNumber() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_aaMobileNumber"));
	}
	/**
	 * aaMobileNumber: with specific test context and state.
	 *		.id : mobile
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : aa.mobileNumber
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_aaMobileNumber(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_aaMobileNumber"), anchor, flags);
	}
	
	/**
	 * aaTelephoneNumber: with default state.
	 *		.id : telephone
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : aa.telephoneNumber
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_aaTelephoneNumber() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_aaTelephoneNumber"));
	}
	/**
	 * aaTelephoneNumber: with specific test context and state.
	 *		.id : telephone
	 * 		.title : 
	 * 		.class : Html.INPUT.tel
	 * 		.name : aa.telephoneNumber
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_aaTelephoneNumber(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_aaTelephoneNumber"), anchor, flags);
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
	 * aaMotorDrivers0Email0: with default state.
	 *		.id : email
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : aa.motor.drivers[0].email[0]
	 * 		.classIndex : 3
	 */
	protected TextGuiTestObject text_aaMotorDrivers0Email0() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_aaMotorDrivers0Email0"));
	}
	/**
	 * aaMotorDrivers0Email0: with specific test context and state.
	 *		.id : email
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : aa.motor.drivers[0].email[0]
	 * 		.classIndex : 3
	 */
	protected TextGuiTestObject text_aaMotorDrivers0Email0(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_aaMotorDrivers0Email0"), anchor, flags);
	}
	
	

	protected Contact_DetailsHelper()
	{
		setScriptName("Motor_MK2.Your__Details.Contact_Details");
	}
	
}

