package Motor_MK2.The__Car;
import resources.Common_Variables;
import resources.Motor_MK2.The__Car.Transmission_TypeHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author horned
 */
public class Transmission_Type extends Transmission_TypeHelper
{
	/**
	 * Script Name   : <b>Transmissionl_Type</b>
	 * Generated     : <b>26 Jun 2015 09:10:31</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/26
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		//--------------------------------------------------------------------------------		
		// String sTransmissionType = "Automatic";
		//--------------------------------------------------------------------------------		
		// Transmission Type
		String sTransmissionType = Common_Variables.transMissionType;
		//--------------------------------------------------------------------
		BrowserSync();
		//--------------------------------------------------------------------
		switch (sTransmissionType){
		//--------------------------------------------------------------------		
			case "Manual":
				label_manual().waitForExistence(20,  0.25);
				label_manual(ANY, READY).click();
				break;
				//--------------------------------------------------------------------
			case "Automatic":
				label_automatic().waitForExistence(20,  0.25);
				label_automatic(ANY, READY).click();
				break;				
				//--------------------------------------------------------------------
		}
		//--------------------------------------------------------------------		

	}
}

