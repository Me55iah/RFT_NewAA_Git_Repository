
import java.io.FileNotFoundException;
import java.io.IOException;

import resources.Master_DriverHelper;
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
public class Master_Driver extends Master_DriverHelper
{
	/**
	 * Script Name   : <b>Master_Driver</b>
	 * Generated     : <b>25 Nov 2014 14:22:12</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/11/25
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		try{			
		
			callScript("Full_Motor_Regression_Test");
			callScript("Full_Home_Regression_Test");
			callScript("Full_EBC_Regression_Test");
			callScript("Full_Road_Regression_Test");
			
				
		} catch (Exception e) {
			e.printStackTrace();
		}	
//		} catch (FileNotFoundException e) {
//			// File Not Found
//			e.printStackTrace();
//		} catch (IOException e) {
//			// File Read Error
//			e.printStackTrace();
	}
}	


