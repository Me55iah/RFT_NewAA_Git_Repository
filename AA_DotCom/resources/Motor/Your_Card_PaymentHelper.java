// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Motor;

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
 * Script Name   : <b>Your_Card_Payment</b><br>
 * Generated     : <b>2013/07/22 10:20:16</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows XP x86 5.1 <br>
 * 
 * @since  July 22, 2013
 * @author courtl
 */
public abstract class Your_Card_PaymentHelper extends RationalTestScript
{
	/**
	 * ClickTheSubmitOnceOnly: with default state.
	 *		.id : send-payment
	 * 		.type : image
	 * 		.value : 
	 * 		.title : 
	 * 		.class : Html.INPUT.image
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_clickTheSubmitOnceOnly() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_clickTheSubmitOnceOnly"));
	}
	/**
	 * ClickTheSubmitOnceOnly: with specific test context and state.
	 *		.id : send-payment
	 * 		.type : image
	 * 		.value : 
	 * 		.title : 
	 * 		.class : Html.INPUT.image
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_clickTheSubmitOnceOnly(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_clickTheSubmitOnceOnly"), anchor, flags);
	}
	
	/**
	 * Submit: with default state.
	 *		.id : 
	 * 		.type : submit
	 * 		.value : Submit
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_submit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_submit"));
	}
	/**
	 * Submit: with specific test context and state.
	 *		.id : 
	 * 		.type : submit
	 * 		.value : Submit
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_submit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_submit"), anchor, flags);
	}
	
	/**
	 * Submit: with default state.
	 *		.id : send-payment
	 * 		.type : submit
	 * 		.value : Submit
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_submit2() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_submit2"));
	}
	/**
	 * Submit: with specific test context and state.
	 *		.id : send-payment
	 * 		.type : submit
	 * 		.value : Submit
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_submit2(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_submit2"), anchor, flags);
	}
	
	/**
	 * aaMotorPaymentCardASSUMPTIONSCORRECTtrue: with default state.
	 *		.id : cardASSUMPTIONSCORRECT
	 * 		.type : checkbox
	 * 		.value : true
	 * 		.title : 
	 * 		.class : Html.INPUT.checkbox
	 * 		.name : aa.motor.payment.card.ASSUMPTIONSCORRECT
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject checkBox_aaMotorPaymentCardASS() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("checkBox_aaMotorPaymentCardASS"));
	}
	/**
	 * aaMotorPaymentCardASSUMPTIONSCORRECTtrue: with specific test context and state.
	 *		.id : cardASSUMPTIONSCORRECT
	 * 		.type : checkbox
	 * 		.value : true
	 * 		.title : 
	 * 		.class : Html.INPUT.checkbox
	 * 		.name : aa.motor.payment.card.ASSUMPTIONSCORRECT
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject checkBox_aaMotorPaymentCardASS(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("checkBox_aaMotorPaymentCardASS"), anchor, flags);
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
	 * aside: with default state.
	 *		.id : aside
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_aside() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_aside"));
	}
	/**
	 * aside: with specific test context and state.
	 *		.id : aside
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 1
	 */
	protected GuiTestObject html_aside(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_aside"), anchor, flags);
	}
	
	/**
	 * AACreditCardApplyToday: with default state.
	 *		.alt : AA Credit Card. Apply today
	 * 		.id : 
	 * 		.src : https://prelive5.theaa.com/images/ads/financial-services/credit-card/earnmoney4. ...
	 * 		.title : 
	 * 		.class : Html.IMG
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected StatelessGuiSubitemTestObject image_aaCreditCardApplyToday() 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("image_aaCreditCardApplyToday"));
	}
	/**
	 * AACreditCardApplyToday: with specific test context and state.
	 *		.alt : AA Credit Card. Apply today
	 * 		.id : 
	 * 		.src : https://prelive5.theaa.com/images/ads/financial-services/credit-card/earnmoney4. ...
	 * 		.title : 
	 * 		.class : Html.IMG
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected StatelessGuiSubitemTestObject image_aaCreditCardApplyToday(TestObject anchor, long flags) 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("image_aaCreditCardApplyToday"), anchor, flags);
	}
	
	/**
	 * carInsuranceCarkey: with default state.
	 *		.alt : 
	 * 		.id : 
	 * 		.src : https://prelive10.theaa.com/images/insurance/car-insurance-carkey.jpg
	 * 		.class : Html.IMG
	 * 		.title : 
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected StatelessGuiSubitemTestObject image_carInsuranceCarkey() 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("image_carInsuranceCarkey"));
	}
	/**
	 * carInsuranceCarkey: with specific test context and state.
	 *		.alt : 
	 * 		.id : 
	 * 		.src : https://prelive10.theaa.com/images/insurance/car-insurance-carkey.jpg
	 * 		.class : Html.IMG
	 * 		.title : 
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected StatelessGuiSubitemTestObject image_carInsuranceCarkey(TestObject anchor, long flags) 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("image_carInsuranceCarkey"), anchor, flags);
	}
	
	/**
	 * cardExpiryMonth: with default state.
	 *		.text : -- 01 02 03 04 05 06 07 08 09 10 11 12
	 * 		.id : cardExpiryMonth
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : card.expiry.month
	 * 		.classIndex : 3
	 */
	protected SelectGuiSubitemTestObject list_cardExpiryMonth() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_cardExpiryMonth"));
	}
	/**
	 * cardExpiryMonth: with specific test context and state.
	 *		.text : -- 01 02 03 04 05 06 07 08 09 10 11 12
	 * 		.id : cardExpiryMonth
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : card.expiry.month
	 * 		.classIndex : 3
	 */
	protected SelectGuiSubitemTestObject list_cardExpiryMonth(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_cardExpiryMonth"), anchor, flags);
	}
	
	/**
	 * cardExpiryYear: with default state.
	 *		.text : -- 13 14 15 16 17 18 19 20 21
	 * 		.id : cardExpiryYear
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : card.expiry.year
	 * 		.classIndex : 4
	 */
	protected SelectGuiSubitemTestObject list_cardExpiryYear() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_cardExpiryYear"));
	}
	/**
	 * cardExpiryYear: with specific test context and state.
	 *		.text : -- 13 14 15 16 17 18 19 20 21
	 * 		.id : cardExpiryYear
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : card.expiry.year
	 * 		.classIndex : 4
	 */
	protected SelectGuiSubitemTestObject list_cardExpiryYear(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_cardExpiryYear"), anchor, flags);
	}
	
	/**
	 * cardStartMonth: with default state.
	 *		.text : -- 01 02 03 04 05 06 07 08 09 10 11 12
	 * 		.id : cardStartMonth
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : card.start.month
	 * 		.classIndex : 1
	 */
	protected SelectGuiSubitemTestObject list_cardStartMonth() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_cardStartMonth"));
	}
	/**
	 * cardStartMonth: with specific test context and state.
	 *		.text : -- 01 02 03 04 05 06 07 08 09 10 11 12
	 * 		.id : cardStartMonth
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : card.start.month
	 * 		.classIndex : 1
	 */
	protected SelectGuiSubitemTestObject list_cardStartMonth(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_cardStartMonth"), anchor, flags);
	}
	
	/**
	 * cardStartYear: with default state.
	 *		.text : -- 05 06 07 08 09 10 11 12 13
	 * 		.id : cardStartYear
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : card.start.year
	 * 		.classIndex : 2
	 */
	protected SelectGuiSubitemTestObject list_cardStartYear() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_cardStartYear"));
	}
	/**
	 * cardStartYear: with specific test context and state.
	 *		.text : -- 05 06 07 08 09 10 11 12 13
	 * 		.id : cardStartYear
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : card.start.year
	 * 		.classIndex : 2
	 */
	protected SelectGuiSubitemTestObject list_cardStartYear(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_cardStartYear"), anchor, flags);
	}
	
	/**
	 * cardType: with default state.
	 *		.text : --------------- Visa Visa Debit AA Visa Mastercard Mastercard Debit AA Mastercar ...
	 * 		.id : cardType
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : card.type
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_cardType() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_cardType"));
	}
	/**
	 * cardType: with specific test context and state.
	 *		.text : --------------- Visa Visa Debit AA Visa Mastercard Mastercard Debit AA Mastercar ...
	 * 		.id : cardType
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : card.type
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_cardType(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_cardType"), anchor, flags);
	}
	
	/**
	 * cardCvcNumber: with default state.
	 *		.id : cardCvcNumber
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : card.cvc.number
	 * 		.classIndex : 2
	 */
	protected TextGuiTestObject text_cardCvcNumber() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_cardCvcNumber"));
	}
	/**
	 * cardCvcNumber: with specific test context and state.
	 *		.id : cardCvcNumber
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : card.cvc.number
	 * 		.classIndex : 2
	 */
	protected TextGuiTestObject text_cardCvcNumber(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_cardCvcNumber"), anchor, flags);
	}
	
	/**
	 * cardName: with default state.
	 *		.id : cardName
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : card.name
	 * 		.classIndex : 1
	 */
	protected TextGuiTestObject text_cardName() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_cardName"));
	}
	/**
	 * cardName: with specific test context and state.
	 *		.id : cardName
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : card.name
	 * 		.classIndex : 1
	 */
	protected TextGuiTestObject text_cardName(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_cardName"), anchor, flags);
	}
	
	/**
	 * cardNumber: with default state.
	 *		.id : cardNumber
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : card.number
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_cardNumber() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_cardNumber"));
	}
	/**
	 * cardNumber: with specific test context and state.
	 *		.id : cardNumber
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : card.number
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_cardNumber(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_cardNumber"), anchor, flags);
	}
	
	

	protected Your_Card_PaymentHelper()
	{
		setScriptName("Motor.Your_Card_Payment");
	}
	
}
