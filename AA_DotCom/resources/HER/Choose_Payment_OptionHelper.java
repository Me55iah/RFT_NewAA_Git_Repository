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
 * Script Name   : <b>Choose_Payment_Option</b><br>
 * Generated     : <b>2013/04/09 14:00:40</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows XP x86 5.1 <br>
 * 
 * @since  April 09, 2013
 * @author courtl
 */
public abstract class Choose_Payment_OptionHelper extends RationalTestScript
{
	/**
	 * Next: with default state.
	 *		.id : next-pay
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
	 *		.id : next-pay
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
	 * assumptionsConfirmtrue: with default state.
	 *		.id : assumptionsConfirm
	 * 		.type : checkbox
	 * 		.value : true
	 * 		.title : 
	 * 		.class : Html.INPUT.checkbox
	 * 		.name : assumptionsConfirm
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject checkBox_assumptionsConfirmtru() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("checkBox_assumptionsConfirmtru"));
	}
	/**
	 * assumptionsConfirmtrue: with specific test context and state.
	 *		.id : assumptionsConfirm
	 * 		.type : checkbox
	 * 		.value : true
	 * 		.title : 
	 * 		.class : Html.INPUT.checkbox
	 * 		.name : assumptionsConfirm
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject checkBox_assumptionsConfirmtru(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("checkBox_assumptionsConfirmtru"), anchor, flags);
	}
	
	/**
	 * paymentBycardInstalments: with default state.
	 *		.id : paymentMethodMonthly
	 * 		.type : radio
	 * 		.value : cardInstalments
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : paymentBy
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_Card_Instalments() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_Card_Instalments"));
	}
	/**
	 * paymentBycardInstalments: with specific test context and state.
	 *		.id : paymentMethodMonthly
	 * 		.type : radio
	 * 		.value : cardInstalments
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : paymentBy
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_Card_Instalments(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_Card_Instalments"), anchor, flags);
	}
	
	/**
	 * paymentByinstallments: with default state.
	 *		.id : paymentMethodDD
	 * 		.type : radio
	 * 		.value : installments
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : paymentBy
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_Monthly_Direct_Debit() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_Monthly_Direct_Debit"));
	}
	/**
	 * paymentByinstallments: with specific test context and state.
	 *		.id : paymentMethodDD
	 * 		.type : radio
	 * 		.value : installments
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : paymentBy
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_Monthly_Direct_Debit(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_Monthly_Direct_Debit"), anchor, flags);
	}
	
	/**
	 * paymentByonePayment: with default state.
	 *		.id : paymentMethodCard
	 * 		.type : radio
	 * 		.value : onePayment
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : paymentBy
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_Single_Payment() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_Single_Payment"));
	}
	/**
	 * paymentByonePayment: with specific test context and state.
	 *		.id : paymentMethodCard
	 * 		.type : radio
	 * 		.value : onePayment
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : paymentBy
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_Single_Payment(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_Single_Payment"), anchor, flags);
	}
	
	

	protected Choose_Payment_OptionHelper()
	{
		setScriptName("HER.Choose_Payment_Option");
	}
	
}

