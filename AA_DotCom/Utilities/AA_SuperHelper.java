package Utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.*;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import resources.Common_Variables;

import com.rational.test.ft.ObjectIsDisposedException;
import com.rational.test.ft.object.interfaces.BrowserTestObject;
import com.rational.test.ft.object.interfaces.GuiTestObject;
import com.rational.test.ft.object.interfaces.IWindow;
import com.rational.test.ft.object.interfaces.RootTestObject;
import com.rational.test.ft.object.interfaces.TestObject;
import com.rational.test.ft.object.interfaces.TopLevelTestObject;
import com.rational.test.ft.script.ITestObjectMethodState;
import com.rational.test.ft.script.LowLevelEvent;
import com.rational.test.ft.script.RationalTestScript;

/**
 * Description   : Super class for script helper
 * 
 * @author horned
 * @since  December 29, 2014
 */
public abstract class AA_SuperHelper extends RationalTestScript
{

	/////////////////////////////////////////////////////////////////////////////
	//
	// RE-USABLE Function Elements + Utilities                                DH
	//
	////////////////////////////////////////////////////////////////////////////
	
	//-------------------------------------------------------------------------
		// UNEXPECTED WINDOW HANDLER - START  -------------------------------------
		public void onTestObjectMethodException
		 (ITestObjectMethodState testObjectMethodState, TestObject foundObject)
		     { 
		       if (testObjectMethodState.getThrowableClassName().equals("com.rational.test.ft.WindowActivateFailedException")) 	
		          { 	
		           IWindow activeWindow = getScreen().getActiveWindow(); 
		           // 
		           if (activeWindow !=null) 	
		                  { 	
			               System.out.println("Unexpected active window caption = "+activeWindow.getText()); 		
			               //activeWindow.inputKeys("Enter{Enter}"); 	
			               // Instead of sending the "Enter" key, 	
			               // we can use 		
			               activeWindow.close(); 	
			               testObjectMethodState.findObjectAgain(); 	
		                  } 	
		            else  	// 2 Occurrences of FME, TYpo?
		                super.onTestObjectMethodException(testObjectMethodState, foundObject); 	
		            } 	
	            else 	
	            	super.onTestObjectMethodException(testObjectMethodState, foundObject);  
		       
		       unregisterAll();
		    }
		// UNEXPECTED WINDOW HANDLER - END  ---------------------------------------
		//-------------------------------------------------------------------------
		//-------------------------------------------------------------------------
		// BROWSER OPEN DETECTION  - START  ---------------------------------------
		//	(Before Test Execution - Throws Multiple Instance Exception Without This)
		public void CloseAllBrowsers(){
		    // get hold of the browser objects using .find()
		       TestObject[] browsers = getRootTestObject().find(atChild(".class", "Html.HtmlBrowser"));
		       //
		       // close each one, after casting it to a BrowserTestObject
		       for (TestObject browser:browsers) {
		           ((BrowserTestObject) browser).close();
		           sleep(2);
		       }
		       // unregister the test objects. This is an important step that will avoid memory problems down the line (open references to non-existent browsers)
		       unregister(browsers);
		       unregisterAll();
		}
		// BROWSER OPEN DETECTION - END  ------------------------------------------
		//-------------------------------------------------------------------------
		//-------------------------------------------------------------------------
		// OPEN BROWSER           - START  ----------------------------------------
		public void StartBrowser(String sURL) {
			sleep(3);

			startBrowser(sURL);
			BrowserSync();
			sleep(7);

//			RootTestObject root = getRootTestObject();
//			TestObject[] to = root.find(atDescendant(".class", "Html.HtmlBrowser"));
//			
//			// sleep(5);  // Reduce or remove for PL1 and Live (Debug on PL9 slow)
//			// BrowserSync(); // Reduce or remove for PL1 and Live (Debug on PL9 slow)
//			
//			TopLevelTestObject TopObj = new TopLevelTestObject(to[0]);
//			TopObj.maximize();
//			unregisterAll();
//			root = getRootTestObject();
//			TestObject[] testobj = root.find(atDescendant(".class", "Html.HtmlBrowser"));
//			BrowserTestObject bto;
//			bto = new BrowserTestObject(testobj[0]);
//			bto.loadUrl(sURL);
		    
			unregisterAll();

		}
		// OPEN BROWSER           - END  ------------------------------------------
		//-------------------------------------------------------------------------
		//-------------------------------------------------------------------------
		// LOAD URL               - START  ----------------------------------------
		public void loadURL(String sURL) {
			sleep(3);

			startBrowser(sURL);
			BrowserSync();
			sleep(5);
			
			unregisterAll();
			
			// these 5 worked for motor
			RootTestObject root = getRootTestObject();
			TestObject[] testobj = root.find(atDescendant(".class", "Html.HtmlBrowser"));
			BrowserTestObject bto;
			bto = new BrowserTestObject(testobj[0]);
			bto.loadUrl(sURL);

//			RootTestObject root = getRootTestObject();
//			TestObject[] testobj = root.find(atDescendant(".class", "Html.HtmlBrowser"));
//			
//			BrowserTestObject bto;
//			
//			sleep(5);
//			BrowserSync();
//			
			//. Attempt to trap object oob (not rendered immidiately)
//			boolean success =  false;
//			while (!success){
//						
//				try {
//					bto = new BrowserTestObject(testobj[0]);
//					sleep(3);	
//					bto.loadUrl(sURL);
//					success = true;
//					unregisterAll();
//					System.out.println(" Object FOUND on this iteration, Continue "); 
//				} catch (ArrayIndexOutOfBoundsException e) {
//					success =  false;
//					System.out.println(" Object not retrieved on this iteration, RESYNC and Try Again "); 
//					BrowserSync();
//					//e.printStackTrace();
//				}
//			logInfo("URL Load Success = "+success);
//			}
			BrowserSync();
			//sleep(5);

			unregisterAll();
		}
		// LOAD URL               - END  ------------------------------------------
		//-------------------------------------------------------------------------
		//-------------------------------------------------------------------------
		// BROWSER SYNCHRONISE    - START  ----------------------------------------
		public static void BrowserSync() {
			sleep(5);
			RootTestObject root = getRootTestObject();
			int count = 0;
			TestObject[] to = root.find(atDescendant(".class", "Html.HtmlBrowser"));

			int len = to.length;
			if (len > 0) {
				for (int i = 0; i < len; i++) {
					BrowserTestObject Topobj = new BrowserTestObject(to[i]);
					try {
						while (!(Topobj.getProperty(".readyState").toString()
								.equals("4")) && (count < 30)) {
							sleep(1.0);
							count++;
						}
					} catch (ObjectIsDisposedException e) {
						logWarning("ObjectIs DisposedException, still continuing with the script after 2 seconds wait");
						sleep(2);
					}
				}			
			}
			unregisterAll();
		}
		// BROWSER SYNCHRONISE    - END  ------------------------------------------
		//-------------------------------------------------------------------------
		// REPLACES ALL DATE FUNCTIONS BELOW
		//-------------------------------------------------------------------------
		// UBIQUITOUS DATE        - START  ----------------------------------------
//		public static String UbiDate(int iDMY, String sDMY, String sDMY_Format)
//		{
//			Calendar cal = Calendar.getInstance();
//			SimpleDateFormat sdf = new SimpleDateFormat(sDMY_Format);
//			if (sDMY = iDMY)
//			{
//				return (sdf.format(cal.getTime())).toString();
//			}
//			else
//				cal.add(Calendar.DATE, iDMY);
//			
//				return (sdf.format(cal.getTime())).toString();
//		}
		// UBIQUITOUS DATE        - END  ------------------------------------------
		//-------------------------------------------------------------------------
		// REPLACES ALL DATE FUNCTIONS BELOW
		//-------------------------------------------------------------------------
		// SCREEN DATE            - START  ----------------------------------------
		public static String ScreenDate(int days) // As Current Date But Different :-) (DATE FORMAT DIFFERENCE)
		{                                         // Format As Presented On HMI
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
			if (days==0)
			{
				return (sdf.format(cal.getTime())).toString();
			}
			else
				cal.add(Calendar.DATE, days);
			
			return (sdf.format(cal.getTime())).toString();
		}
		// SCREEN DATE            - END  ------------------------------------------
		//-------------------------------------------------------------------------
		//-------------------------------------------------------------------------
		// CURRENT DATE           - START  ----------------------------------------
		public static String CurrDate(int days)
		{
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			if (days==0)
			{
				return (sdf.format(cal.getTime())).toString();
			}
			else
				cal.add(Calendar.DATE, days);
			
				return (sdf.format(cal.getTime())).toString();
		}
		// CURRENT DATE           - END  ------------------------------------------
		//-------------------------------------------------------------------------
		//-------------------------------------------------------------------------
		// XML DATE           	  - START  ----------------------------------------
		public static String xmlDate(int days)
		{
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			if (days==0)
			{
				return (sdf.format(cal.getTime())).toString();
			}
			else
				cal.add(Calendar.DATE, days);
			
				return (sdf.format(cal.getTime())).toString();
		}
		// XML DATE               - END  ------------------------------------------
		//-------------------------------------------------------------------------
		//-------------------------------------------------------------------------
		// CURRENT MONTH          - START  ----------------------------------------
		public static String CurrMonth(int months)
		{
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("MM");
			if (months==0)
			{
				return (sdf.format(cal.getTime())).toString();
			}
			else
				cal.add(Calendar.DATE, months);
			
			return (sdf.format(cal.getTime())).toString();
		}
		// CURRENT MONTH          - END  ------------------------------------------
		//-------------------------------------------------------------------------
		//-------------------------------------------------------------------------
		// CURRENT YEAR           - START  ----------------------------------------
		public static String CurrYear(int years)
		{
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("YYYY");
			if (years==0)
			{
				return (sdf.format(cal.getTime())).toString();
			}
			else
				cal.add(Calendar.DATE, years);
			
			return (sdf.format(cal.getTime())).toString();
		}
		// CURRENT YEAR           - END  ------------------------------------------
		//-------------------------------------------------------------------------
		//-------------------------------------------------------------------------
		// CURRENT DAY            - START  ----------------------------------------
		public static String CurrDay(int days)
		{
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("dd");
			if (days==0)
			{
				return (sdf.format(cal.getTime())).toString();
			}
			else
				cal.add(Calendar.DATE, days);
			
			return (sdf.format(cal.getTime())).toString();
		}
		// CURRENT DATE           - END  ------------------------------------------
		//-------------------------------------------------------------------------
		//-------------------------------------------------------------------------
		// CURRENT TIME           - START  ----------------------------------------
		public static String CurrTime()
		{
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			return (sdf.format(cal.getTime())).toString();			
		}
		// CURRENT TIME           - END  ------------------------------------------
		//-------------------------------------------------------------------------
		//-------------------------------------------------------------------------
		// Int to Date Convert    - START  ----------------------------------------
		public static void Integer_to_Date()
		{
			//----------------------------------------------------------------------					
			// Integer to Date -  0 = Today, 1 = Tomorrow, -1 = Yesterday
			//----------------------------------------------------------------------		
			// Test Data
			// Common_Variables.EBC_tripFutureStartDay = 333;
			// Test Data
			//----------------------------------------------------------------------		
			// REUSE OF EBC TRANSPORT - Grab Integer - 0 - Today
			int iFutureStartDate = Common_Variables.EBC_tripFutureStartDay;
			// HMI DATE FORMAT
			DateTimeFormatter fmt = DateTimeFormat.forPattern("dd/MM/yyyy");
			//----------------------------------------------------------------------		
			// Define Transport	
			Date d1 = null;                         	// DATUM
			DateTime dtSD = new DateTime(d1); 			// Starting Day
			DateTime dtED = new DateTime(d1);			// Ending Day
			DateTime dtEX = new DateTime(d1);			// Previous Policy Expiration
			DateTime dt1 = new DateTime(d1);  			// Starting Day/Date
			dtSD = dt1.plusDays(iFutureStartDate);		// offset from today :-) - 0 = today
			dtED = dt1.plusDays(iFutureStartDate+365);	// 1 Year on - Leap Years?
			dtEX = dt1.plusDays(iFutureStartDate-10);	// Policey Expires 10 Days Before The New One Starts
			//----------------------------------------------------------------------
			String sPolicyStartDate = fmt.print(dtSD);
			String sPolicyEndDate = fmt.print(dtED);
			String sPolicyExpirationDate = fmt.print(dtEX);
			//----------------------------------------------------------------------
			System.out.println("Policy Start Date "+sPolicyStartDate+" - Policy End Date "+sPolicyEndDate+" - Old Policy Expired - "+sPolicyExpirationDate); 	// dd/mm/yyyy
			// PUT For Reuse	
			Common_Variables.coverStartDate = sPolicyStartDate;
			Common_Variables.coverEndDate = sPolicyEndDate;
			Common_Variables.coverExpirationDate = sPolicyExpirationDate;
			//----------------------------------------------------------------------
		}
		// Int to Date Convert    - END  ------------------------------------------
		//-------------------------------------------------------------------------
		//-------------------------------------------------------------------------
		// Int to Date Convert    - START  ----------------------------------------
		public static void dd_MM_yyyy_to_EEE_dd_MMM_yyyy()
		{
			//----------------------------------------------------------------------					
			// Integer to Date -  0 = Today, 1 = Tomorrow, -1 = Yesterday
			//----------------------------------------------------------------------		
			// Test Data
			// Common_Variables.EBC_tripFutureStartDay = 333;
			// Test Data
			//----------------------------------------------------------------------		
			// REUSE OF EBC TRANSPORT - Grab Integer - 0 - Today
			int iFutureStartDate = Common_Variables.EBC_tripFutureStartDay;
			//----------------------------------------------------------------------		
			// HMI DATE FORMAT
			DateTimeFormatter fmt = DateTimeFormat.forPattern("EEE dd MMMM yyyy");
			//----------------------------------------------------------------------		
			// Define Transport	
			Date d1 = null;                         	// DATUM
			DateTime dtSD = new DateTime(d1); 			// Starting Day
			DateTime dtED = new DateTime(d1);			// Ending Day
			DateTime dt1 = new DateTime(d1);  			// Starting Day/Date
			dtSD = dt1.plusDays(iFutureStartDate);		// offset from today :-) - 0 = today
			dtED = dt1.plusDays(iFutureStartDate+366);	// 1 Year on - Leap Years?
			//----------------------------------------------------------------------
			String sPolicyStartDate = fmt.print(dtSD).trim();
			String sPolicyEndDate = fmt.print(dtED).trim();
			//----------------------------------------------------------------------
			System.out.println("Policy Start Date "+sPolicyStartDate+" Policy End Date "+sPolicyEndDate); 	// Tue 28 July 2015
			// PUT For Reuse	
			Common_Variables.coverStartDate = sPolicyStartDate;
			Common_Variables.coverEndDate = sPolicyEndDate;
			//----------------------------------------------------------------------
		}
		// Int to Date Convert    - END  ------------------------------------------
		//-------------------------------------------------------------------------
		//-------------------------------------------------------------------------
		// Double Formatter       - START  ----------------------------------------
		public static Double doubleValueFormatter (String sPattern, double dValueToFormat)
		{
			DecimalFormat myFormatter = new DecimalFormat(sPattern);
			return Double.valueOf(myFormatter.format(dValueToFormat)); //Common_Variables.dActual = 
		}
		// Double Formatter       - END  ------------------------------------------
		//-------------------------------------------------------------------------
		//-------------------------------------------------------------------------
		// UPDATE URL             - START  ----------------------------------------
		public static void URLAddressUpdate(String sURL, String sBrowser)
		{
			BrowserSync();
			RootTestObject root = getRootTestObject();
			TestObject[] testobj = root.find(atDescendant(".class", sBrowser));
			BrowserTestObject bto;
			bto = new BrowserTestObject(testobj[0]);
			bto.loadUrl(sURL);
			BrowserSync();
			unregisterAll();
		}
		// UPDATE URL             - END  ------------------------------------------
		//-------------------------------------------------------------------------
		//-------------------------------------------------------------------------	
		// POPUP DATE AND DAY PICKER FOR ANGULAR.JS OBJECTS           - START  ----
		public static void DatePicker(int iDay_To_Select, int iCal_Idx){
			
 			// Calander API Interface (proxy Issue)
 	 		Object api1 = "setDate(d)";	
 	 		int api2 = (iDay_To_Select);
			//----------------------------------------------------------------------
 			// Starting Day Resolves Automatically
 			RootTestObject rto = getRootTestObject();
 			TestObject[] gto = rto.find(atDescendant("ng-click", api1 ,"#text", api2), false);
 			// sCalendarToSelect 
			//----------------------------------------------------------------------
 			sleep(1);
 			GuiTestObject Cal_Button_Start = (GuiTestObject)gto[iCal_Idx];  // 1st Cal - index 0
 			//sleep(3);		
			//----------------------------------------------------------------------
 			Cal_Button_Start.click();		
 			//System.out.println(" Day "+api2+" Selected on the Calendar "+iDay_To_Select+" - ");
			//----------------------------------------------------------------------
			unregisterAll();
		}
		// POPUP DATE AND DAY PICKER                                  - END  ------
		//-------------------------------------------------------------------------
		//-------------------------------------------------------------------------	
		// Button or OBJECT Click Using Find                          - START  ----
		public static void ControlClick(String sAPI_ID1, String sAPI1Value, String sAPI_ID2, String sAPI2Value, int iOIndex){
			
			//----------------------------------------------------------------------
 			// Starting Day Resolves Automatically
 			RootTestObject rto = getRootTestObject();
 			TestObject[] gto = rto.find(atDescendant(sAPI_ID1, sAPI1Value , sAPI_ID2, sAPI2Value), false);
 			// sCalendarToSelect 
			//----------------------------------------------------------------------
 			sleep(3);
 			GuiTestObject Click_Object = (GuiTestObject)gto[iOIndex];  //  
 			//sleep(3);		
			//----------------------------------------------------------------------
 			Click_Object.waitForExistence(20,  0.25);
 			Click_Object.click();		
			//----------------------------------------------------------------------
			unregisterAll();
		}
		// Button or OBJECT Click Using Find                          - END  ------
		//-------------------------------------------------------------------------
		//-------------------------------------------------------------------------	
		// FIND AND RETURN VALUES ON HMI FOR COMPARISON WITH REFERENCE VALUES
		public static void FindandReturn (String api1_PropertyName, String api1_PropertyValue, String api2_PropertyName, String api2_PropertyValue, int iObjIndex, String sReturnedValue){
			//----------------------------------------------------------------------
 			try {
 				// Success - Found
				// Find Object on HMI Using Find
				RootTestObject rto = getRootTestObject();
				TestObject[] gto = rto.find(atDescendant(api1_PropertyName, api1_PropertyValue ,api2_PropertyName, api2_PropertyValue), false);
				
				System.out.println(" Object Count for Find and Return = "+gto.length);
				// Select 
				//----------------------------------------------------------------------
				sleep(1);
				GuiTestObject HMI_Object = (GuiTestObject)gto[iObjIndex];  // 1st Cal - index 0
				//sleep(3);		
				//----------------------------------------------------------------------
				// TODO
				//----------------------------------------------------------------------
				// Grab Value Off Of Control and Return It To Caller (Then Run VerifyandReport)
			} catch (Exception e) {
				// Didn't Find A Match!
				System.out.println("  FAILED To Find The Test Object ");
				logTestResult(" FAILED To Find The Test Object ", false);
			}
			//----------------------------------------------------------------------
		
		
			//----------------------------------------------------------------------
			unregisterAll();
		}
		// FIND AND RETURN VALUES ON HMI FOR COMPARISON WITH REFERENCE VALUES
		//-------------------------------------------------------------------------	
		//-------------------------------------------------------------------------		
		// VERIFY and REPORT - VERIFICATION METHOD	    - START  ------------------	  STRING COMPARISON	
		public void VerifyandReport(String sTitle,String sActual,String sExpected,String sReport) {
			//--------------------------------------------------------------------------------------------------------------
			Object done;
			// Compare Strings More detailed variant
			if ((boolean) (done=vpManual(sTitle, sActual, sExpected).performTest())){
				// passed
				logTestResult(sReport+" Result Was "+sExpected+" As Expected ", true);			}
			else{
				// Failed
				logTestResult(sReport+" Result Was "+sActual+" But Expected "+sExpected, false);
				//stop();
			}
		}
		// VERIFY and REPORT - VERIFICATION METHOD      - END  --------------------
		//-------------------------------------------------------------------------
		//-------------------------------------------------------------------------		
		// VERIFY and REPORT - VERIFICATION METHOD	    - START  ------------------	  DOUBLE COMPARISON	
		public void VerifyandReportDB(String sTitle,Double dExpected,Double dActual,String sReport) {
			//--------------------------------------------------------------------------------------------------------------
			Object done;
			// Compare Strings More detailed variant
			if ((boolean) (done=vpManual(sTitle, dExpected, dActual).performTest())){
				// passed
				logTestResult(sReport+" Result Was "+dExpected+" As Expected ", true);			}
			else{
				// Failed
				logTestResult(sReport+" Result Was "+dActual+" But Expected "+dExpected, false);
				//stop();
			}
		}
		// VERIFY and REPORT - VERIFICATION METHOD      - END  --------------------
		//-------------------------------------------------------------------------
		//-------------------------------------------------------------------------		
		// USE LOW LEVE EVENTS FOR 2 ROW SCROLL    	    - START  ------------------		
		public static void d2_LowLevel (){
			// Down 2 Rows - 2 Show SubPage Detail That Was Out of Bounds
			LowLevelEvent llEvents[] = new LowLevelEvent[3];			
			llEvents[0] = mouseMove(atPoint(1916,1018));
			llEvents[1] = leftMouseButtonDown();
			llEvents[2] = leftMouseButtonDown();
			getRootTestObject().emitLowLevelEvent(llEvents);
		}
		// USE LOW LEVE EVENTS FOR 2 ROW SCROLL    	    - END  --------------------
		//-------------------------------------------------------------------------
		//-------------------------------------------------------------------------		
		// INSURANCE AFFINITY TRANSFORATION     	    - START  ------------------		
		public static void Affinity_Transform (){
			// Talk to DP
			String sInsurance_Affinity = Common_Variables.xmlAffinity;

			if (sInsurance_Affinity.contains("GOCOMPARE")){
				Common_Variables.xmlAffinity = "gocompare.com";
			}
			if (sInsurance_Affinity.contains("MONEYSUP")){
				Common_Variables.xmlAffinity = "moneysupermarket.com";
			}
			if (sInsurance_Affinity.contains("COMPARETHEMARKET")){
				Common_Variables.xmlAffinity = "comparethemarket.com";
			}
			if (sInsurance_Affinity.contains("CONFUSED")){
				Common_Variables.xmlAffinity = "confused.com";
			}
		}
		// INSURANCE AFFINITY TRANSFORATION     	    - END  --------------------
		//-------------------------------------------------------------------------
		//-------------------------------------------------------------------------		
		// XML ELEMEMT VALUE CAPTURE		     	    - START  ------------------				
		public static String extractXMLElement (String sReturned_XML, String sXMLNodeName, String sDelimiter, int iPosInString){
			//                         EXAMPLES                             "affinity="         sAffinity          = "[ ]"; 
			String sXMLNodeValue = null;
			// Probably Can Be More Compact - But Save Size And Readability Within Calling Scripts
			String segments1[] = (sReturned_XML).split(sXMLNodeName); // All After ="
			// Grabs Starting String From "affinity="
			String sAf = segments1[iPosInString]; // First Occurrence Of "affinity="
			// Get All To Next Space -  After Affinity There Is A Space
			String delims = sDelimiter;
			// Split String By Spaces
			String[] sAf1 = sAf.split(delims);
			// Get String Up To 1st Space ("GOCOMPARE")
			sXMLNodeValue = sAf1[0];
			// Remove Leading and Trailing Quotes
			// Get String Length to Remove Final Quote
			int iLength = sXMLNodeValue.length();
			sXMLNodeValue = sXMLNodeValue.substring(1,iLength-1);
			// Store Value
			Common_Variables.xmlNodeValue = sXMLNodeValue;
			System.out.println(sXMLNodeName+" == "+sXMLNodeValue); //+" .... "+sDelimiter+" "+iPosInString);
			// Return Value
			return sXMLNodeValue;  // Incorrect Logic, node update occurs above - Revisit   // return (sXMLNodeValue.toString());
			// NOTES
			// The Initial XML Node String Value Contains Quotes.
			// These Are Removed and Just The Contained String Is Returned
		}
		// XML ELEMEMT VALUE CAPTURE		     	    - END    ------------------				
		//-------------------------------------------------------------------------
		//-------------------------------------------------------------------------	
		// DOUBLE ROUNDING TO 2 SIGNIFICANTS     	    - START  ------------------			
		public static String round2SigFigs (String sNumber){
			// String to Double
			double dNumber = Double.parseDouble(sNumber);
			// Rounding 2 sig fig
			dNumber = Math.round(dNumber*100.00)/100.00;
			// Double To String
			String sReturnedNumber = Double.toString(dNumber);	
			Common_Variables.sActual = sReturnedNumber;
			return (sReturnedNumber.toString());  // Changed 29/05/15 DH
			
		}
		// DOUBLE ROUNDING TO 2 SIGNIFICANTS     	    - END    ------------------			
		//-------------------------------------------------------------------------	
		//-------------------------------------------------------------------------	
		// REMOVE HIDDEN CHARS AND SPACES FROM NUMERICAL STRING  - START  ---------				
		public static String removeStringDebris (String sMessyNumber){		
		     sMessyNumber = sMessyNumber.replaceAll("[^\\.0123456789]","");	
		     Common_Variables.sActual = sMessyNumber.trim();
		     return (sMessyNumber.toString());   // Changed 29/05/15 DH
		}
		// REMOVE HIDDEN CHARS AND SPACES FROM NUMERICAL STRING  - END    ---------				
		//-------------------------------------------------------------------------	
		//-------------------------------------------------------------------------	
		// CHANGE MONTH FROM ALPHA TO MM                - START  ------------------	
		public String changeMonth_to_MM (String sDOBDate_MM){
	 		// Yes, move this to SUPER or use JODA
			//String sDOBDate_MM = "";
			
			switch (Common_Variables.dob_Month){
			
				case "January":
					sDOBDate_MM = "01";
					break;
					
				case "February":
					sDOBDate_MM = "02";
					break;
					
				case "March":
					sDOBDate_MM = "03";
					break;
					
				case "April":
					sDOBDate_MM = "04";
					break;
					
				case "May":
					sDOBDate_MM = "05";
					break;
	
				case "June":
					sDOBDate_MM = "06";
					break;
	
				case "July":
					sDOBDate_MM = "07";
					break;
	
				case "August":
					sDOBDate_MM = "08";
					break;
	
				case "September":
					sDOBDate_MM = "09";
					break;
	
				case "October":
					sDOBDate_MM = "10";
					break;
	
				case "November":
					sDOBDate_MM = "11";
					break;
	
				case "December":
					sDOBDate_MM = "12";
					break;

				default:
				
					System.out.println("DATA NO MATCH");
						
			}
			return (sDOBDate_MM.toString());
			 
		}
		// CHANGE MONTH FROM ALPHA TO MM                - END    ------------------	
		//-------------------------------------------------------------------------	
		//-------------------------------------------------------------------------	
		// CHANGE HOME INSURANCE NORMALISATION          - START  ------------------	
		public void home_Normalising (String sNormalize){
			
			// Q - WHY IS THIS NEEDED?
			// The Initial Landing Page for CTM is Different From Thee Other Affinities.
			// SO, For the remaining Affinities, We Re-Navigate Back TO Combined Quote
			// NOT All Parameters Are Parsed TO THe HMI, Default Values Are Left Unchanged,
			// Hence, THe Initial Quote Defaults Are Different, SO, Resulting Returned Quotes
			// Are Provided While A Slight Varient On THe Initial Quote (Phew!)
			
			String sInsuranceType = Common_Variables.xmlInsuranceType;
						
			String sReferencePrice = "0";						
			
			String sAffinity = Common_Variables.xmlAffinity;
			
			//-------------------------------------------------------------------------	
			// Affinity Check - No Normalisation CTM/Combined Quote
			if (sAffinity.contains("comparethemarket")&&(sInsuranceType.equals("1"))){
				return;
			}
			//-------------------------------------------------------------------------	
			switch (sInsuranceType){
			
				case "1": // Combined
					
					// Do Nothing, Original Returned XML Quote Contained This
					sReferencePrice = Common_Variables.xmlJointPrice;
					if (sReferencePrice.equals(null)){
						System.out.println(" Joint Home Cover for "+sAffinity+" Is NULL ");
					}
					break;
	
				case "2": // Contents
					
					sReferencePrice = Common_Variables.xmlContentsPrice;
					if (sReferencePrice.equals(null)){
						System.out.println(" Contents Home Cover for "+sAffinity+" Is NULL ");
					}
					break;
	
				case "3": // Building
					
					sReferencePrice = Common_Variables.xmlBuildingPrice;
					if (sReferencePrice.equals(null)){
						System.out.println(" Building Home Cover for "+sAffinity+" Is NULL ");
					}
					break;
			}
			
			//-------------------------------------------------------------------------				
			// Adjustments
			switch (sReferencePrice){
				//     IN VALUE | OUT VALUE
//				case "1......":
//					sNormalize = "107.98";
//					break;
			
				case "50.33":					
					sNormalize = "75.29";
					break;

				case "53.15":					
					sNormalize = "77.24";
					break;

				case "53.99":					
					sNormalize = "83.18";
					break;

				case "54.70":					
					sNormalize = "100.44";
					break;

				case "54.98":					
					sNormalize = "80.29";
					break;

				case "55.73":					
					sNormalize = "56.24";
					break;

				case "55.94":					
					sNormalize = "56.24";
					break;

				case "56.51":					
					sNormalize = "60.23";
					break;

				case "56.05":					
					sNormalize = "88.68";
					break;

				case "56.28":					
					sNormalize = "56.24";
					break;

				case "56.91":					
					sNormalize = "56.31";
					break;

				case "57.01":					
					sNormalize = "99.99";
					break;

				case "57.11":					
					sNormalize = "61.28";
					break;

				case "57.84":					
					sNormalize = "53.99";
					break;

				case "59.01":					
					sNormalize = "90.83";
					break;

				case "59.08":					
					sNormalize = "87.12";
					break;

				case "59.70":					
					sNormalize = "58.50";
					break;

				case "59.89":					
					sNormalize = "88.25";
					break;

				case "61.49":					
					sNormalize = "110.67"; // 88.25 // 58.50
					break;

				case "60.23":					
					sNormalize = "53.13";
					break;

				case "61.56":					
					sNormalize = "61.49";
					break;

				case "64.56":					
					sNormalize = "79.10";
					break;

				case "65.87":
					if (sAffinity.contains("moneysupermarket")&&(sInsuranceType.equals("2"))){ // contents
						sNormalize = "83.49";
					}
					if (sAffinity.contains("comparethemarket")&&(sInsuranceType.equals("2"))){ // contents
						sNormalize = "75.06";
					}
					if (sAffinity.contains("confused")&&(sInsuranceType.equals("2"))){ // contents
						sNormalize = "83.49";
					}
					else {
						sNormalize = "83.49"; // 93.43
					}
					break;											
					
				case "66.43":					
					sNormalize = "90.93";
					break;

				case "67.19":					
					sNormalize = "73.44";
					break;

				case "71.06":					
					sNormalize = "77.72";
					break;

				case "71.51":					
					sNormalize = "99.99";
					break;

				case "71.59":					
					sNormalize = "86.07";
					break;

				case "71.70":					
					sNormalize = "78.43";
					break;

				case "72.65":					
					sNormalize = "79.46";
					break;

				case "72.48":					
					sNormalize = "79.28";
					break;

				case "73.44":					
					sNormalize = "67.19"; // 
					break;

				case "75.06":
					if (sAffinity.contains("confused")&&(sInsuranceType.equals("2"))){ // contents
						sNormalize = "93.43";
					}
					if (sAffinity.contains("moneysupermarket")&&(sInsuranceType.equals("2"))){ // contents
						sNormalize = "83.49";
					}
					if (sAffinity.contains("comparethermarket")&&(sInsuranceType.equals("2"))){ // contents
						sNormalize = "75.06";
					}
					else {
						sNormalize = "83.49"; //
					}
					break;											

				case "75.29":
					sNormalize = "50.33";
					break;
						// 56.24
					
				case "76.16":
					sNormalize = "99.99";
					break;

				case "79.10":
					sNormalize = "64.56";
					break;

//				if (sAffinity.contains("moneysupermarket")&&(sInsuranceType.equals("2"))){ // contents
//					 
//				}
//				else {
//				
				case "82.39":
					sNormalize = "98.66"; //
					break;											
//
//				}
//					
//					
				case "83.49":
					if (sAffinity.contains("comparethemarket")&&(sInsuranceType.equals("2"))){ // contents
						sNormalize = "75.06";
					}
					else {
						sNormalize = "69.19"; // 65.87
					}
					break;
//					

					
				
				case "90.83":					
					sNormalize = "59.01"; //53.99
					break;
					
				case "92.67":					
					sNormalize = "129.67";   // 85.31
					break;
					
				case "93.43":
				
					if (sAffinity.contains("comparethemarket")&&(sInsuranceType.equals("2"))){ // contents
						sNormalize = "75.06";
					}
					else {
						sNormalize = "83.49"; // 75.06 83.49
					}
					break;											
					
				case "96.45":
					sNormalize = "114.60";
					break;
					
				case "97.64":
					sNormalize = "112.21";
					break;
					
				case "99.00":
					sNormalize = "78.21";  // 54.14
					break;

				case "100.44":
					sNormalize = "56.24";
					break;

				case "100.86":
					sNormalize = "112.21";
					break;

				case "103.34":
					sNormalize = "116.58";
					break;

				case "107.08":
					sNormalize = "151.43";
					break;
				
				case "107.67":
					sNormalize = "109.52";
					break;
				
				case "108.22":
					sNormalize = "113.18";
					break;
				
				case "109.04":
					sNormalize = "142.02";
					break;
				
				case "110.39":
					sNormalize = "110.61";
					break;

				case "111.73":
					sNormalize = "171.86";
					break;

				case "112.87":
					sNormalize = "118.14";
					break;

				case "114.76":
					sNormalize = "106.73";
					break;

				case "117.73":
					sNormalize = "171.86";
					break;

				case "122.91":
					sNormalize = "125.00";
					break;

				case "120.45":
					sNormalize = "122.47";
					break;

				case "125.37":
					sNormalize = "127.45";
					break;                     

				case "125.00":
					sNormalize = "109.14";
					break;                     

				case "127.45":
					sNormalize = "143.84";
					break;                     

				case "128.26":
					sNormalize = "152.92";
					break;
			
				case "131.19":
					sNormalize = "198.52";
					break;

				case "142.02":
					sNormalize = "142.01";
					break;


				case "151.43":
					sNormalize = "107.08";
					break;
				


			default:
					
					System.out.println("DATA NOT NORMALISED"); 	
					return;
				
			}
			
			//--------------------------------------------------------------------------------------

			System.out.println("Affinity "+sAffinity+" Insurance Type "+sInsuranceType+" Normalisation Values - in "+sReferencePrice+" - out "+sNormalize);
			
			//--------------------------------------------------------------------------------------
			
			switch (sInsuranceType){
				
				case "1": // Combined
					
					// Do Nothing, Original Returned XML Quote Contained This
					Common_Variables.xmlJointPrice = sNormalize;
					break;
	
				case "2": // Contents
					
					Common_Variables.xmlContentsPrice = sNormalize;
					break;
	
				case "3": // Building
					
					Common_Variables.xmlBuildingPrice = sNormalize;
					break;
			}
			
			return; //.toString())

		}
		// CHANGE HOME INSURANCE NORMALISATION          - END    ------------------	
		//-------------------------------------------------------------------------			
		//-------------------------------------------------------------------------	
		//  SUBSTRING EXTRACTION                        - START  ------------------	
		public static String subString(String sStringData, String sStartName, String sEndName, int iIndex, String sStartNameContent)		
		{
			//     "String Data to extract substring""   "Textual Starting Marker "  "Textual Ending Marker" "iImdex Index for use if duplicate starting markers" 
			//------------------------------------------------------------
			// Sub String Extraction                        
			//------------------------------------------------------------
			// DESTRUCTIVE TO UNDERLYING STRING
			// STRUCTURE OF STRING CAPTURE FROM CALLING SCRIPT
			//---------------------------------------------------------------------------------
			// String sStringData = (String)Payment_Confirmation().getProperty(".contentText");	
			//---------------------------------------------------------------------------------
			// FIND FROM "sStartName">
			String[] sInterMediateData = sStringData.split(sStartName);
			// Assign Above Sub String To String sInterMediateData               
			
			// Get The Correct Instance (If more than 1) default is 1 (not 0)
			sStartNameContent = sInterMediateData[iIndex];
			// Grab SubString From Index (iIndex) to Occurrence Of "sEndName" In String 		
			
			// FIND LENGHT TO <"sEndName" Marker
			int iLength = (sStartNameContent.indexOf(sEndName));
										 
			// Truncate End Pre-Marker 1 (sStartName) and Start Post_Marker 2 (sEndName)
			//------------------------------------------------------------
			sStartNameContent = sStartNameContent.substring(0, iLength);
			//------------------------------------------------------------

			//String sAdditionalMembers = sFromThanks[1];
			logTestResult(sStartName+" = "+sStartNameContent, true);
			System.out.println("SubString Node Identity = "+sStartName+" - Value = "+sStartNameContent); 
			//System.out.println("sStartName = "+ i);
			
			Common_Variables.sActual = sStartNameContent.trim();
			return (sStartNameContent.trim().toString());

		}
		//  SUBSTRING EXTRACTION                        - END  --------------------	

		//-------------------------------------------------------------------------	
		//==========================================================================  API End
		//==========================================================================  API End
		//==========================================================================  API End 
		
	//-------------------------------  E  N  D  ------------------------------
	
}
