package Utilities;
import resources.Common_Variables;
import resources.Utilities.Playback_MonitorHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.services.IPlaybackMonitor;
import com.rational.test.ft.services.IPlaybackMonitorDisplay;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.rational.test.util.ServiceBroker;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author horned
 */
public class Playback_Monitor extends Playback_MonitorHelper
{
	/**
	 * Script Name   : <b>Playback_Monitor</b>
	 * Generated     : <b>26 Aug 2015 14:08:59</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/08/26
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//-------------------------------------------------------------------------------
		// FIre Up Only Once During Test Exections
		//-------------------------------------------------------------------------------
		
		boolean bInitial = Common_Variables.initialIteration;
		
		if (bInitial == false);{
			com.rational.test.ft.util.OptionManager.set("rt.interactive", new Boolean(false));
			// Functions call = new Functions();

			// CloseAllBrowsers();
			int currentRow = Common_Variables.currentRow;
			
			IPlaybackMonitorDisplay pbMonitorDisp = (IPlaybackMonitorDisplay)ServiceBroker.getServiceBroker().findService(IPlaybackMonitor.class.getName());
			pbMonitorDisp.getFrame().setAlwaysOnTop(true);
			pbMonitorDisp.getFrame().setLocation(1550,100);
			pbMonitorDisp.getFrame().setSize(300, 200);
			pbMonitorDisp.getFrame().setTitle("The AA DotCom - RFT Regression Test Execution(s) - DH Customisation");
			pbMonitorDisp.setVisible(true);
			IPlaybackMonitor pbMonitor = (IPlaybackMonitor)ServiceBroker.getServiceBroker().findService(IPlaybackMonitor.class.getName());
			 
			if ( pbMonitor != null )
			   pbMonitor.setDescription(IPlaybackMonitor.RUNNING, "DOT COM Regression Tests - Current Journey = "+currentRow);
				//callScript("Startup");
				//sleep(5);		
		}
		
		Common_Variables.initialIteration = true;	// It Completed
		//-------------------------------------------------------------------------------
	}
}

