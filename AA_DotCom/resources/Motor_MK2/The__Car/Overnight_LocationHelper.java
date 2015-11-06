// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Motor_MK2.The__Car;
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
 * Script Name   : <b>Overnight_Location</b><br>
 * Generated     : <b>2015/06/26 12:58:37</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  June 26, 2015
 * @author horned
 */
public abstract class Overnight_LocationHelper extends Utilities.AA_SuperHelper
{
	/**
	 * CarInsuranceTheCarTheAA: with default state.
	 *		.title : Car Insurance: The car - The AA
	 * 		.class : Html.HtmlDocument
	 * 		.url : https://prelive9.theaa.com/car-insurance/buy/car-details
	 */
	protected DocumentTestObject document_carInsuranceTheCarThe() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceTheCarThe"));
	}
	/**
	 * CarInsuranceTheCarTheAA: with specific test context and state.
	 *		.title : Car Insurance: The car - The AA
	 * 		.class : Html.HtmlDocument
	 * 		.url : https://prelive9.theaa.com/car-insurance/buy/car-details
	 */
	protected DocumentTestObject document_carInsuranceTheCarThe(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceTheCarThe"), anchor, flags);
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
	 * No: with default state.
	 *		.id : 
	 * 		.value : No 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 40
	 */
	protected GuiTestObject label_no() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_no"));
	}
	/**
	 * No: with specific test context and state.
	 *		.id : 
	 * 		.value : No 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 40
	 */
	protected GuiTestObject label_no(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_no"), anchor, flags);
	}
	
	/**
	 * Yes: with default state.
	 *		.id : 
	 * 		.value : Yes 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 39
	 */
	protected GuiTestObject label_yes() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_yes"));
	}
	/**
	 * Yes: with specific test context and state.
	 *		.id : 
	 * 		.value : Yes 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 39
	 */
	protected GuiTestObject label_yes(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_yes"), anchor, flags);
	}
	
	/**
	 * AboutYourCar1: with default state.
	 *		.text : Please select Locked Garage Driveway or Carport Street Public Place Unlocked Gar ...
	 * 		.id : kept-overnight
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : AboutYourCar1
	 * 		.classIndex : 8
	 */
	protected SelectGuiSubitemTestObject list_aboutYourCar() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aboutYourCar"));
	}
	/**
	 * AboutYourCar1: with specific test context and state.
	 *		.text : Please select Locked Garage Driveway or Carport Street Public Place Unlocked Gar ...
	 * 		.id : kept-overnight
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : AboutYourCar1
	 * 		.classIndex : 8
	 */
	protected SelectGuiSubitemTestObject list_aboutYourCar(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aboutYourCar"), anchor, flags);
	}
	
	/**
	 * aaVehicleGaragedpostcode: with default state.
	 *		.id : kept-postcode
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : aa.vehicle.garagedpostcode
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_aaVehicleGaragedpostcode() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_aaVehicleGaragedpostcode"));
	}
	/**
	 * aaVehicleGaragedpostcode: with specific test context and state.
	 *		.id : kept-postcode
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : aa.vehicle.garagedpostcode
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_aaVehicleGaragedpostcode(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_aaVehicleGaragedpostcode"), anchor, flags);
	}
	
	

	protected Overnight_LocationHelper()
	{
		setScriptName("Motor_MK2.The__Car.Overnight_Location");
	}
	
}

