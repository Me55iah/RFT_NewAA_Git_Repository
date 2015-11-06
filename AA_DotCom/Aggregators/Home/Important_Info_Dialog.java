package Aggregators.Home;
import resources.Aggregators.Home.Important_Info_DialogHelper;
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
public class Important_Info_Dialog extends Important_Info_DialogHelper
{
	/**
	 * Script Name   : <b>Important_Info_Dialog</b>
	 * Generated     : <b>24 Jun 2015 13:54:10</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/06/24
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		//------------------------------------------------------
		BrowserSync();
		//------------------------------------------------------

		try {
			String sEndorsementsOverlay_Text = (String)html_endorsementsOverlay().getProperty(".text");
			
			if (sEndorsementsOverlay_Text.contains("Important information about this policy")){
				image_close(ANY, READY).click();
			}
						
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
}

