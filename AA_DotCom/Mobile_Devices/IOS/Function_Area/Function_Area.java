package Mobile_Devices.IOS.Function_Area;
import resources.Mobile_Devices.IOS.Function_Area.Function_AreaHelper;
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
public class Function_Area extends Function_AreaHelper
{
	/**
	 * Script Name   : <b>Function_Area</b>
	 * Generated     : <b>30 Oct 2015 13:54:26</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/10/30
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		
		//--------------------------------
		// Start Address to Function in Emulator URL and Trigger
		text_url(ANY, READY).click();
		iE(document_iPadPeekIPhonePeek(),DEFAULT_FLAGS).inputKeys("https://prelive1.theaa.com/breakdown-cover/?ico=uk-breakdown&icl=buy_breakdown_cover&icc=herobanner{ENTER}");
		//--------------------------------
		 
		
		
	}
}

