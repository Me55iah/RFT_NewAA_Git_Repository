package Aggregators.XML;
import resources.Aggregators.XML.Update_XMLHelper;
import resources.Common_Variables;

import java.io.File; 
import java.io.IOException; 
import javax.xml.parsers.DocumentBuilder;  
import javax.xml.parsers.DocumentBuilderFactory; 
import javax.xml.parsers.ParserConfigurationException; 
import javax.xml.transform.Transformer; 
import javax.xml.transform.TransformerException; 
import javax.xml.transform.TransformerFactory; 
import javax.xml.transform.dom.DOMSource; 
import javax.xml.transform.stream.StreamResult; 
import org.w3c.dom.Document; 
import org.w3c.dom.Element;  
import org.w3c.dom.NamedNodeMap;  
import org.w3c.dom.Node;  
import org.w3c.dom.NodeList;  
import org.xml.sax.SAXException; 


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
public class Update_XML extends Update_XMLHelper
{
	/**
	 * Script Name   : <b>Debug1</b>
	 * Generated     : <b>2 Mar 2015 11:57:30</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/03/02
	 * @author horned
	 */
	
    public void testMain(Object[] args) {
    	
		// ********************      Debug Test Data End     ***************************   	
 		(Common_Variables.xmlFilePathSource) = "C:\\RFT\\AA_DotCom\\Aggregators\\Motor_3.xml";
		(Common_Variables.xmlFilePathDestination) = "C:\\RFT\\AA_DotCom\\Aggregators\\active.xml";
		(Common_Variables.xmlAffinity) = "CONFUSED";
		// (Common_Variables.coverStartDate) = "2015-04-04";		// YYYY-MM-DD
		// ********************      Debug Test Data End     ***************************
		 String sxmlFilePathSource = (Common_Variables.xmlFilePathSource);
		 String sxmlFilePathDestination = (Common_Variables.xmlFilePathDestination);
		 String sAffinity = (Common_Variables.xmlAffinity);
		//  String sCoverStartDate = (Common_Variables.coverStartDate);
		 String sCoverStartDate = xmlDate(5); // Start Date of NEW Policy in Specified Days
		 // String sCoverExpiryDate  = xmlDate(4); // Expiry of OLD Policy in Specified Days
		 //=====================================================================================
        try { 
        	// Prepare the path :-)
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance(); 
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder(); 
            Document document = documentBuilder.parse(sxmlFilePathSource); 
            //==================================================================================
            //Use item(0) to get the first node with tag name "AAInsurance" (top element/tag
            Node AAInsurance = document.getElementsByTagName("AAInsurance").item(0); 
            //==================================================================================
            // Get Nodes to modify
            NamedNodeMap attribute = AAInsurance.getAttributes(); 
            //==================================================================================
            // Update affinity , set to required
            Node nodeAttr_aff = attribute.getNamedItem("affinity"); 
            nodeAttr_aff.setTextContent(sAffinity); 
            //==================================================================================
           // Update coverstartdate , set to future date
            Node nodeAttr_csd = attribute.getNamedItem("coverstartdate"); 
            nodeAttr_csd.setTextContent(sCoverStartDate); 							// YYYY-MM-DD
            //==================================================================================
/*            // Scrap for Future
            Node motor = document.getElementsByTagName("motor").item(0);
            
            NamedNodeMap attributem = motor.getAttributes();
            
            // Update coverexpirydate , set to future date - 1
            Node nodeAttr_ced = attributem.getNamedItem("expiry"); 
            nodeAttr_ced.setTextContent(sCoverExpiryDate); 							// YYYY-MM-DD
*/            //==================================================================================
            // write the DOM object to the file 
            TransformerFactory transformerFactory = TransformerFactory.newInstance(); 
            Transformer transformer = transformerFactory.newTransformer(); 
            DOMSource domSource = new DOMSource(document); 
            StreamResult streamResult = new StreamResult(new File(sxmlFilePathDestination)); 
            transformer.transform(domSource, streamResult); 
            System.out.println("The Destination XML File was SUCCESSFULLY Updated For Affinity "+sAffinity); 
            //==================================================================================
        } catch (ParserConfigurationException pce) { 
	      pce.printStackTrace(); 
        } catch (TransformerException tfe) { 
        	tfe.printStackTrace(); 
        } catch (IOException ioe) { 
           ioe.printStackTrace(); 
        } catch (SAXException sae) { 
            sae.printStackTrace(); 
        } 
    }  
} 




