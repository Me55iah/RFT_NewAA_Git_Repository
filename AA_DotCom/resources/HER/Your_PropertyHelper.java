// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.HER;

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
 * Script Name   : <b>Your_Property</b><br>
 * Generated     : <b>2013/04/11 10:16:12</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows XP x86 5.1 <br>
 * 
 * @since  April 11, 2013
 * @author courtl
 */
public abstract class Your_PropertyHelper extends RationalTestScript
{
	/**
	 * Next: with default state.
	 *		.id : next-home
	 * 		.type : image
	 * 		.value : 
	 * 		.title : 
	 * 		.class : Html.INPUT.image
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_next() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_next"));
	}
	/**
	 * Next: with specific test context and state.
	 *		.id : next-home
	 * 		.type : image
	 * 		.value : 
	 * 		.title : 
	 * 		.class : Html.INPUT.image
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_next(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_next"), anchor, flags);
	}
	
	/**
	 * boilerAge: with default state.
	 *		.text : Please select Up to 10 years old Between 10 and 15 years old Over 15 years old
	 * 		.id : boilerAge
	 * 		.class : Html.SELECT
	 * 		.title : 
	 * 		.name : boilerAge
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_boilerAge() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_boilerAge"));
	}
	/**
	 * boilerAge: with specific test context and state.
	 *		.text : Please select Up to 10 years old Between 10 and 15 years old Over 15 years old
	 * 		.id : boilerAge
	 * 		.class : Html.SELECT
	 * 		.title : 
	 * 		.name : boilerAge
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_boilerAge(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_boilerAge"), anchor, flags);
	}
	
	/**
	 * boilerFuel: with default state.
	 *		.text : Please select Gas/LPG Other
	 * 		.id : boilerFuel
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : boilerFuel
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_boilerFuel() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_boilerFuel"));
	}
	/**
	 * boilerFuel: with specific test context and state.
	 *		.text : Please select Gas/LPG Other
	 * 		.id : boilerFuel
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : boilerFuel
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_boilerFuel(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_boilerFuel"), anchor, flags);
	}
	
	/**
	 * boilerType: with default state.
	 *		.text : Please select Condensing Combination Conventional Other
	 * 		.id : boilerType
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : boilerType
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_boilerType() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_boilerType"));
	}
	/**
	 * boilerType: with specific test context and state.
	 *		.text : Please select Condensing Combination Conventional Other
	 * 		.id : boilerType
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : boilerType
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_boilerType(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_boilerType"), anchor, flags);
	}
	
	/**
	 * propertyBedrooms: with default state.
	 *		.text : Please select 1 bedroom 2 bedrooms 3 bedrooms 4 bedrooms 5 bedrooms 6 or more be ...
	 * 		.id : propertyBedrooms
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : propertyBedrooms
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_propertyBedrooms() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_propertyBedrooms"));
	}
	/**
	 * propertyBedrooms: with specific test context and state.
	 *		.text : Please select 1 bedroom 2 bedrooms 3 bedrooms 4 bedrooms 5 bedrooms 6 or more be ...
	 * 		.id : propertyBedrooms
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : propertyBedrooms
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_propertyBedrooms(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_propertyBedrooms"), anchor, flags);
	}
	
	/**
	 * propertyType: with default state.
	 *		.text : Please select Flat/Maisonette Bungalow Detached Semi-detached Terraced Mobile or ...
	 * 		.id : propertyType
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : propertyType
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_propertyType() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_propertyType"));
	}
	/**
	 * propertyType: with specific test context and state.
	 *		.text : Please select Flat/Maisonette Bungalow Detached Semi-detached Terraced Mobile or ...
	 * 		.id : propertyType
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : propertyType
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_propertyType(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_propertyType"), anchor, flags);
	}
	
	/**
	 * policyStartDate: with default state.
	 *		.id : datepicker
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : policyStartDate
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_policyStartDate() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_policyStartDate"));
	}
	/**
	 * policyStartDate: with specific test context and state.
	 *		.id : datepicker
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : policyStartDate
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_policyStartDate(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_policyStartDate"), anchor, flags);
	}
	
	

	protected Your_PropertyHelper()
	{
		setScriptName("HER.Your_Property");
	}
	
}

