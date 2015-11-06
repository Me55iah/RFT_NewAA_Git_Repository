package Aggregators.XML;
import resources.Common_Variables;
import resources.Aggregators.XML.Get_XML_Home_Policy_DataHelper;
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
public class Get_XML_Home_Policy_Data extends Get_XML_Home_Policy_DataHelper
{
	/**
	 * Script Name   : <b>Get_XML_Home_Policy_Data</b>
	 * Generated     : <b>30 Mar 2015 14:24:53</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/03/30
	 * @author horned
	 */
	public void testMain(Object[] args) 
	{
 		String sAffinity =  Common_Variables.xmlAffinity;		
		String sReturned_XML = Common_Variables.xmlString;
// 		String sDOBDate_DD = Common_Variables.dob_Day;
// 		String sDOBDate_MM = Common_Variables.dob_Month;
//		String sDOBDate_YYYY = Common_Variables.dob_Year;
// 		Common_Variables.proposerDOB = sDOBDate_DD+"/"+sDOBDate_MM+"/"+sDOBDate_YYYY;
  		//-----------------------------------------------------------------------------------------------------------------------------------
		// Each Affinity has the XML Variation and the Actual Web Site Name Variation
		Affinity_Transform(); // Detects XML Definition and Transforms to Actual Rendering of Affinity on Target Webpage
  		//-----------------------------------------------------------------------------------------------------------------------------------
		
//		//sAffinity = "COMPARETHEMARKETP";
//		System.out.println(" Primary NodeCount =  For Affinity "+sAffinity);		
//		// Standard Motor XML Primary Node Count = 4 - CTM DIfferent From Other Affinity Formats
//		int iNodeCount = 4;
//		if (sAffinity.trim() == "COMPARETHEMARKETP"){
//			iNodeCount = 2;
//		}

		// callScript("Aggregators.XML.Get_XML_Motor_Policy_Data");
		
		// Method for 1 pass on CTM, and 2 Passes For Other Affinities - (protected and unprotected)
		int iXMLNode = Common_Variables.xml_Primary_Node_Count;
		
		
		
		System.out.println(" Primary NodeCount = "+iXMLNode+" For Affinity "+sAffinity);
		// ORDER IN APPEARANCE and AFFINITY
		
		//-----------------------------------------------------------------------------------------------------------------------------------
		// ORDER BY APPEARANCE IN XML - MOTOR FIRST PARENT NODE, ELEMENTS INTERROGATED _ THERE ARE GENERALY 4, 2 FOR CTM
		//-----------------------------------------------------------------------------------------------------------------------------------
		// NON Fixed Length XML Element Value Extraction (QUOTEREF is 12 CHARS - But Processed Here)
		//-----------------------------------------------------------------------------------------------------------------------------------
		// 
		String sXMLNodeName = ""; String sDelimiter = "[ ]"; int iPositioninString = iXMLNode; String sXMLNodeValue = "";
		//-----------------------------------------------------------------------------------------------------------------------------------
		// XML Affinity - Grabs All The String From Starting Char		
		//-----------------------------------------------------------------------------------------------------------------------------------
		sXMLNodeName = "affinity=";
		// Parameters for AFFINITY to PARSE
		extractXMLElement (sReturned_XML, sXMLNodeName, sDelimiter, 1 ); // Always 1 for this node
		// Call to Action (DO IT!)
		Common_Variables.xmlAffinity = Common_Variables.xmlNodeValue;
		//-----------------------------------------------------------------------------------------------------------------------------------
		// XML Request Type - Grabs All The String From Starting Char		
		//-----------------------------------------------------------------------------------------------------------------------------------
		sXMLNodeName = "requesttype=";
		// Parameters for REQUEST TYPE to PARSE
		extractXMLElement (sReturned_XML, sXMLNodeName, sDelimiter, 1 );  // Always 1 for this node
		// Call to Action (DO IT!)
		Common_Variables.xmlRequestType = Common_Variables.xmlNodeValue;
		//-----------------------------------------------------------------------------------------------------------------------------------
		// XML Quote Type - Grabs All The String From Starting Char		
		//-----------------------------------------------------------------------------------------------------------------------------------
		sXMLNodeName = "type=";  //  quote type - for home TYPE specified only
		// Parameters for QUOTE TYPE to PARSE
		extractXMLElement (sReturned_XML, sXMLNodeName, sDelimiter, iPositioninString );
		// Call to Action (DO IT!)
		Common_Variables.xmlQuoteType = Common_Variables.xmlNodeValue;
 		//-----------------------------------------------------------------------------------------------------------------------------------
		// XML HAS - Grabs All The String From Starting Char		
		//-----------------------------------------------------------------------------------------------------------------------------------
		sXMLNodeName = "HAS="; // Home Adjustment Surcharge (Accidental Damage)
		Common_Variables.xmlHAS = "";
		// Parameters for Voluntary Excess to PARSE
		extractXMLElement (sReturned_XML, sXMLNodeName, sDelimiter, iPositioninString );
		// Call to Action (DO IT!)
		Common_Variables.xmlHAS = Common_Variables.xmlNodeValue;
 		//-----------------------------------------------------------------------------------------------------------------------------------
		// XML Buildings Accidental Damage - Grabs All The String From Starting Char		
		//-----------------------------------------------------------------------------------------------------------------------------------
		sXMLNodeName = "buildingaccdamage="; 
		Common_Variables.xmlbuildingaccdamage = "";
		// Parameters for Voluntary Excess to PARSE
		extractXMLElement (sReturned_XML, sXMLNodeName, sDelimiter, iPositioninString );
		// Call to Action (DO IT!)
		Common_Variables.xmlbuildingaccdamage = Common_Variables.xmlNodeValue;
 		//-----------------------------------------------------------------------------------------------------------------------------------
		// XML HLE - Grabs All The String From Starting Char		
		//-----------------------------------------------------------------------------------------------------------------------------------
		sXMLNodeName = "HLE="; // Home Legal Excess
		Common_Variables.xmlHLE = "";
		// Parameters for Voluntary Excess to PARSE
		extractXMLElement (sReturned_XML, sXMLNodeName, sDelimiter, iPositioninString );
		// Call to Action (DO IT!)
		Common_Variables.xmlHLE = Common_Variables.xmlNodeValue;
 		//-----------------------------------------------------------------------------------------------------------------------------------
		// XML Voluntary Excess - Grabs All The String From Starting Char		
		//-----------------------------------------------------------------------------------------------------------------------------------
		sXMLNodeName = "volexcess="; sDelimiter = "[>]";  
		Common_Variables.xmlVoluntaryExcess = "";
		// Parameters for Voluntary Excess to PARSE
		extractXMLElement (sReturned_XML, sXMLNodeName, sDelimiter, iPositioninString );
		// Call to Action (DO IT!)
		Common_Variables.xmlVoluntaryExcess = Common_Variables.xmlNodeValue;
		// Need To Remove Space Within Insurer Name
		//-----------------------------------------------------------------------------------------------------------------------------------
		// XML QuoteReference - Grabs All The String From Starting Char		
		//-----------------------------------------------------------------------------------------------------------------------------------
		sXMLNodeName = "quoteref="; sDelimiter = "[ ]";     // 3 x Reference 1,2,3 - Using 1
		// Parameters for QUOTE REFERENCE to PARSE
		extractXMLElement (sReturned_XML, sXMLNodeName, sDelimiter, 1 ); /// iPositioninString  (1st Quote Recurring x 3)
		// Call to Action (DO IT!)
		Common_Variables.xmlQuoteReference = Common_Variables.xmlNodeValue;  // xmlStandardQuoteReference
		// Need To Remove Space Within Insurer Name
		
		// Second Quote Number Generation                   // 3 x Reference 4,5,6 - Using 4
		extractXMLElement (sReturned_XML, sXMLNodeName, sDelimiter, 4 ); /// iPositioninString  (1st Quote Recurring x 3)
		// Call to Action (DO IT!)
		Common_Variables.xmlQuoteReference_Lower = Common_Variables.xmlNodeValue;  // xmlStandardQuoteReference
		// Need To Remove Space Within Insurer Name

		
//		extractXMLElement (sReturned_XML, sXMLNodeName, sDelimiter, 4 ); /// iPositioninString  (2nd Quote Recurring x 3)
//		// Call to Action (DO IT!)
//		Common_Variables.xmlPlusQuoteReference = Common_Variables.xmlNodeValue;
//		// Need To Remove Space Within Insurer Name

		
		
		
		
		
		//-----------------------------------------------------------------------------------------------------------------------------------
		// XML Price - Grabs All The String From Starting Char		
		//-----------------------------------------------------------------------------------------------------------------------------------
		sXMLNodeName = "price=";       // 6 Variable Price Nodes
		// Parameters for PRICE to PARSE
		extractXMLElement (sReturned_XML, sXMLNodeName, sDelimiter, 1 ); // iPositioninString
		// Call to Action (DO IT!)
		Common_Variables.xmlBuildingPrice = Common_Variables.xmlNodeValue;
		
		extractXMLElement (sReturned_XML, sXMLNodeName, sDelimiter, 2 ); // iPositioninString
		// Call to Action (DO IT!)
		Common_Variables.xmlContentsPrice = Common_Variables.xmlNodeValue;

		extractXMLElement (sReturned_XML, sXMLNodeName, sDelimiter, 3 ); // iPositioninString
		// Call to Action (DO IT!)
		Common_Variables.xmlJointPrice = Common_Variables.xmlNodeValue;

		
		extractXMLElement (sReturned_XML, sXMLNodeName, sDelimiter, 4 ); // iPositioninString
		// Call to Action (DO IT!)
		Common_Variables.xmlBuildingPrice_P = Common_Variables.xmlNodeValue;
		
		extractXMLElement (sReturned_XML, sXMLNodeName, sDelimiter, 5 ); // iPositioninString
		// Call to Action (DO IT!)
		Common_Variables.xmlContentsPrice_P = Common_Variables.xmlNodeValue;

		extractXMLElement (sReturned_XML, sXMLNodeName, sDelimiter, 6 ); // iPositioninString
		// Call to Action (DO IT!)
		Common_Variables.xmlJointPrice_P = Common_Variables.xmlNodeValue;

		
		
		
		
		// Need To Remove Space Within Insurer Name
		//-----------------------------------------------------------------------------------------------------------------------------------
		// XML Compulsory Excess - Grabs All The String From Starting Char		
		//-----------------------------------------------------------------------------------------------------------------------------------
		sXMLNodeName = "comexcess=";    
		Common_Variables.xmlCompulsoryExcess = "";
		// Parameters for COMPULSORY EXCESS to PARSE
		extractXMLElement (sReturned_XML, sXMLNodeName, sDelimiter, iPositioninString );
		// Call to Action (DO IT!)
		Common_Variables.xmlCompulsoryExcess = Common_Variables.xmlNodeValue;
		// Need To Remove Space Within Insurer Name
//		//-----------------------------------------------------------------------------------------------------------------------------------
//		// XML Bundle - Grabs All The String From Starting Char		
//		//-----------------------------------------------------------------------------------------------------------------------------------
//		sXMLNodeName = "bundle=";    
//		// Parameters for BUNDLE to PARSE
//		extractXMLElement (sReturned_XML, sXMLNodeName, sDelimiter, iPositioninString );
//		// Call to Action (DO IT!)
//		Common_Variables.xmlBundle = Common_Variables.xmlNodeValue;
//		// Need To Remove Space Within Insurer Name
//		//-----------------------------------------------------------------------------------------------------------------------------------
//		// XML CAS - Grabs All The String From Starting Char		
//		//-----------------------------------------------------------------------------------------------------------------------------------
//		sXMLNodeName = "CAS="; sDelimiter = "[>]";    
//		// Parameters for CAS to PARSE
//		extractXMLElement (sReturned_XML, sXMLNodeName, sDelimiter, 1 ); // Always 1 for this node (Could be 2 in this case too, but same data returned
//		// Call to Action (DO IT!)
//		Common_Variables.xmlCAS = Common_Variables.xmlNodeValue;
//		// Need To Remove Space Within Insurer Name
//		//-----------------------------------------------------------------------------------------------------------------------------------
		// XML Total Amount - Grabs All The String From Starting Char		
		//-----------------------------------------------------------------------------------------------------------------------------------
		sXMLNodeName = "totalamount="; sDelimiter = "[/>]";    
		// Parameters for CAS to PARSE
		extractXMLElement (sReturned_XML, sXMLNodeName, sDelimiter, iPositioninString );
		// Call to Action (DO IT!)
		Common_Variables.xmlTotalAmount = Common_Variables.xmlNodeValue;
		// Need To Remove Space Within Insurer Name
		//-----------------------------------------------------------------------------------------------------------------------------------
		// XML Number of Installments - Grabs All The String From Starting Char		
		//-----------------------------------------------------------------------------------------------------------------------------------
		sXMLNodeName = "noinstalments="; sDelimiter = "[ ]";     
		// Parameters for CAS to PARSE
		extractXMLElement (sReturned_XML, sXMLNodeName, sDelimiter, iPositioninString );
		// Call to Action (DO IT!)
		Common_Variables.xmlNumberofInstalments = Common_Variables.xmlNodeValue;
		//-----------------------------------------------------------------------------------------------------------------------------------
		// XML Installment Amount - Grabs All The String From Starting Char		
		//-----------------------------------------------------------------------------------------------------------------------------------
		sXMLNodeName = "instalmentamount=";    
		// Parameters for CAS to PARSE
		extractXMLElement (sReturned_XML, sXMLNodeName, sDelimiter, iPositioninString );
		// Call to Action (DO IT!)
		Common_Variables.xmlInstalmentAmount = Common_Variables.xmlNodeValue;
		//-----------------------------------------------------------------------------------------------------------------------------------
		// XML Deposit - Grabs All The String From Starting Char		
		//-----------------------------------------------------------------------------------------------------------------------------------
		sXMLNodeName = "deposit=";    
		// Parameters for CAS to PARSE
		extractXMLElement (sReturned_XML, sXMLNodeName, sDelimiter, iPositioninString );
		// Call to Action (DO IT!)
		Common_Variables.xmlDeposit = Common_Variables.xmlNodeValue;
		//-----------------------------------------------------------------------------------------------------------------------------------
		// XML APR - Grabs All The String From Starting Char		
		//-----------------------------------------------------------------------------------------------------------------------------------
		sXMLNodeName = "apr=";  sDelimiter = "[ ]";    
		// Parameters for APR to PARSE
		extractXMLElement (sReturned_XML, sXMLNodeName, sDelimiter, iPositioninString );
		// Call to Action (DO IT!)
		Common_Variables.xmlAPR = Common_Variables.xmlNodeValue;
		//-----------------------------------------------------------------------------------------------------------------------------------
		// Calculation of Total Credit Figure for Later HMI Comparison		
		// Doubles
		double dXMLInstalmentAmount = Double.parseDouble(Common_Variables.xmlInstalmentAmount);
		double dXMLNumberofInstalments = Double.parseDouble(Common_Variables.xmlNumberofInstalments);
		double dXMLCalculatedCredit = (dXMLInstalmentAmount * dXMLNumberofInstalments);
		
		System.out.println(" Calculated Credit Value = "+dXMLCalculatedCredit);
		Common_Variables.xmlCalculatedCredit = Double.toString(dXMLCalculatedCredit);

	}
}