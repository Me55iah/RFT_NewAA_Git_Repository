package Aggregators.XML;
import resources.Aggregators.XML.Copy_RAW_Browser_XMLHelper;
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
public class Copy_RAW_Browser_XML extends Copy_RAW_Browser_XMLHelper
{
	/**
	 * Script Name   : <b>Copy_RAW_Browser_XML</b>
	 * Generated     : <b>19 Mar 2015 13:55:07</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/03/19
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
		//-----------------------------------------------------------------------------------------------------------------------------------
		// Copy RAW Returned XML (Properties do not resolve to XML Content (Clipboard)
		// Should Probable Save XML to File (As Above) And Scraped From File
		BrowserSync();
		// Grab the RAM XML From Screen  // This Working Method Is Left In Place (Replaced By Following)

		// Use Menu Bar - Needs To Be Enabled
		browser_htmlBrowser(document_raw_XML(),DEFAULT_FLAGS).click(atPoint(350,66)); // ENABLE SHORTCUTS
		browser_htmlBrowser(document_raw_XML(),DEFAULT_FLAGS).inputKeys("%e"); // Menu Item - EDIT
		browser_htmlBrowser(document_raw_XML(),DEFAULT_FLAGS).inputChars("a"); // Menu Item - SELECT ALL
		sleep(1);
		browser_htmlBrowser(document_raw_XML(),DEFAULT_FLAGS).click(atPoint(289,67)); // ENABLE SHORTCUTS
		browser_htmlBrowser(document_raw_XML(),DEFAULT_FLAGS).inputKeys("%e"); // Menu Item - EDIT
		browser_htmlBrowser(document_raw_XML(),DEFAULT_FLAGS).inputChars("c"); // Menu Item - COPY		
		
	}
}

