// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Motor_MK2.The__Car;

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
 * Script Name   : <b>Vehicle_Ownership_Usage</b><br>
 * Generated     : <b>2015/06/26 11:31:16</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  June 26, 2015
 * @author horned
 */
public abstract class Vehicle_Ownership_UsageHelper extends RationalTestScript
{
	/**
	 * htmlBrowser: with default state.
	 *		.class : Html.HtmlBrowser
	 * 		.browserName : MS Internet Explorer
	 * 		.processName : iexplore.exe
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
	 * 		.processName : iexplore.exe
	 */
	protected BrowserTestObject browser_htmlBrowser(TestObject anchor, long flags) 
	{
		return new BrowserTestObject(
                        getMappedTestObject("browser_htmlBrowser"), anchor, flags);
	}
	
	/**
	 * CarInsuranceTheCarTheAA: with default state.
	 *		.class : Html.HtmlDocument
	 * 		.title : RegularExpression(Car Insurance)
	 * 		.url : RegularExpression(car-insurance)
	 */
	protected DocumentTestObject document_carInsuranceTheCarThe() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceTheCarThe"));
	}
	/**
	 * CarInsuranceTheCarTheAA: with specific test context and state.
	 *		.class : Html.HtmlDocument
	 * 		.title : RegularExpression(Car Insurance)
	 * 		.url : RegularExpression(car-insurance)
	 */
	protected DocumentTestObject document_carInsuranceTheCarThe(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_carInsuranceTheCarThe"), anchor, flags);
	}
	
	/**
	 * IDonTHaveTheCarYet: with default state.
	 *		.id : bought-it-label
	 * 		.value : I don't have the car yet
	 * 		.class : Html.LABEL
	 * 		.title : 
	 * 		.classIndex : 32
	 */
	protected GuiTestObject label_iDonTHaveTheCarYet() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_iDonTHaveTheCarYet"));
	}
	/**
	 * IDonTHaveTheCarYet: with specific test context and state.
	 *		.id : bought-it-label
	 * 		.value : I don't have the car yet
	 * 		.class : Html.LABEL
	 * 		.title : 
	 * 		.classIndex : 32
	 */
	protected GuiTestObject label_iDonTHaveTheCarYet(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_iDonTHaveTheCarYet"), anchor, flags);
	}
	
	/**
	 * aaMotorVehicleRegisteredTo: with default state.
	 *		.text : Please select Policyholder Spouse/Civil Partner Parent Leased (private) Leased ( ...
	 * 		.id : VEHICLE_KEEPER
	 * 		.class : Html.SELECT
	 * 		.title : 
	 * 		.name : aa.motor.vehicle.registeredTo
	 * 		.classIndex : 6
	 */
	protected SelectGuiSubitemTestObject list_aaMotorVehicleRegisteredT() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aaMotorVehicleRegisteredT"));
	}
	/**
	 * aaMotorVehicleRegisteredTo: with specific test context and state.
	 *		.text : Please select Policyholder Spouse/Civil Partner Parent Leased (private) Leased ( ...
	 * 		.id : VEHICLE_KEEPER
	 * 		.class : Html.SELECT
	 * 		.title : 
	 * 		.name : aa.motor.vehicle.registeredTo
	 * 		.classIndex : 6
	 */
	protected SelectGuiSubitemTestObject list_aaMotorVehicleRegisteredT(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aaMotorVehicleRegisteredT"), anchor, flags);
	}
	
	/**
	 * aaMotorVehicleVehicleOwner: with default state.
	 *		.text : Please select Policyholder Spouse/Civil Partner Parent Leased (private) Leased ( ...
	 * 		.id : VEHICLE_OWNER
	 * 		.class : Html.SELECT
	 * 		.title : 
	 * 		.name : aa.motor.vehicle.vehicleOwner
	 * 		.classIndex : 5
	 */
	protected SelectGuiSubitemTestObject list_aaMotorVehicleVehicleOwne() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aaMotorVehicleVehicleOwne"));
	}
	/**
	 * aaMotorVehicleVehicleOwner: with specific test context and state.
	 *		.text : Please select Policyholder Spouse/Civil Partner Parent Leased (private) Leased ( ...
	 * 		.id : VEHICLE_OWNER
	 * 		.class : Html.SELECT
	 * 		.title : 
	 * 		.name : aa.motor.vehicle.vehicleOwner
	 * 		.classIndex : 5
	 */
	protected SelectGuiSubitemTestObject list_aaMotorVehicleVehicleOwne(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aaMotorVehicleVehicleOwne"), anchor, flags);
	}
	
	/**
	 * aaVehicleUsage: with default state.
	 *		.text : Please select Social, Domestic, Pleasure & Commuting (No Business Use) Social, D ...
	 * 		.id : VEHICLE_USE
	 * 		.class : Html.SELECT
	 * 		.title : 
	 * 		.name : aa.vehicle.usage
	 * 		.classIndex : 7
	 */
	protected SelectGuiSubitemTestObject list_aaVehicleUsage() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aaVehicleUsage"));
	}
	/**
	 * aaVehicleUsage: with specific test context and state.
	 *		.text : Please select Social, Domestic, Pleasure & Commuting (No Business Use) Social, D ...
	 * 		.id : VEHICLE_USE
	 * 		.class : Html.SELECT
	 * 		.title : 
	 * 		.name : aa.vehicle.usage
	 * 		.classIndex : 7
	 */
	protected SelectGuiSubitemTestObject list_aaVehicleUsage(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_aaVehicleUsage"), anchor, flags);
	}
	
	

	protected Vehicle_Ownership_UsageHelper()
	{
		setScriptName("Motor_MK2.The__Car.Vehicle_Ownership_Usage");
	}
	
}

