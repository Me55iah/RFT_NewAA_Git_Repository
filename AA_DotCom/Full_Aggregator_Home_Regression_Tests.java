
import resources.Common_Variables;
import resources.Full_Aggregator_Home_Regression_TestsHelper;
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
public class Full_Aggregator_Home_Regression_Tests extends Full_Aggregator_Home_Regression_TestsHelper
{
	/**
	 * Script Name   : <b>Full_Aggregator_Home_Regression_Tests</b>
	 * Generated     : <b>30 Mar 2015 13:52:58</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/03/30
	 * @author horned
	 */
	
	
	////////////////////////////////////////////////////////////////////////////////////////
	//
	//   Porting of HOME Aggregator Test(s) TO RFT - Dave Horne - February 2015
	//
	////////////////////////////////////////////////////////////////////////////////////////
	
	// NOTE - URL Length For IE11 Is Limited to 1034 Chars - We Are Towards This Figure For HOME
	
	public static boolean liveTest;
	public static int startRow;
	public static int endRow;
	public static int currentRow;
	//public static String[] environmentURL = new String[1];
	
	public void testMain(Object[] args) 
	{
		
		int currentRow = 0;
		dpReset();
		Common_Variables.endRow=23;
		endRow = Common_Variables.endRow; // Specific to this test function

		//--------------------------------------------------------------------
		// START OF SCRIPT TIMING
		CurrTime(); String sTimeStampS = CurrTime();
		System.out.println("Start time = " + sTimeStampS);
		//--------------------------------------------------------------------

		// Detect IE, and Clear before testing begins
		CloseAllBrowsers();
		
		// Sets The Function Area For Testing
		Common_Variables.functionalArea = "Aggregators";
		
		// Selection Of Environment and dP Starting Row
		callScript("Utilities.Environment_Selector");
		
		// Starting Row Parsed From Previous Line
		// currentRow = Common_Variables.startRow;
		
		//-----------------------------------------------------------------------------------------------
		// Set Starting Row On Data Pool From Above Selection
		while (currentRow < Common_Variables.startRow) {
			dpNext();
			currentRow++;
		}
		//-----------------------------------------------------------------------------------------------
		// Work through the list of data, creating the appropriate new quotes or
		// a policy, according to the value entered in the product column of the
		// datapool.

		System.out.println("Started HOME AGGREGATORS (NEW) Tests.....");

//		IDatapool dp = (IDatapool) getDatapool();
//		this.dpInitialization(dp, Common_Variables.startRow);
		
		// Detect End of Year for Quote Handling
		String sCurrentMonth = CurrMonth(0);
		String sCurrentYear = CurrYear(0);
		if (sCurrentMonth == "12"){
			sCurrentYear =  CurrYear(1); // (+1)
		}

		Common_Variables.personsCovered = "IOD"; // or IOD / IAS
		//while (currentRow <= endRow) {
		while (!dpDone()) {
			//---------------------------------------------------------------------------------------------
			// Launch chosen test environment			
			//System.out.println(" Confirm Enviromment Selected Was "+Common_Variables.selectedEnvironment);
			//logTestResult(" Confirmed, Test Enviromment Selected Was "+Common_Variables.selectedEnvironment, true);
			//StartBrowser(Common_Variables.selectedEnvironment);
			//---------------------------------------------------------------------------------------------			
			//BrowserSync();
			//---------------------------------------------------------------------------------------------
			System.out.println("---------------------------------------------------");

			System.out.println("Executing Home Aggregator Test Number - " + currentRow);
			
			System.out.println("---------------------------------------------------");
			//---------------------------------------------------------------------------------------------

			// Do variables assignments
			Common_Variables.proposer_PostCode = dpString("PostCode"); // Separated By XML Marker
			Common_Variables.proposer_HouseNumber = dpString("House_Number"); //House_Number

			Common_Variables.proposerTitle = dpString("Title");
			Common_Variables.proposerForename = dpString("Firstname");
			Common_Variables.proposerLastname = dpString("Lastname");
			Common_Variables.dob_Day = dpString("DOB_Day");
			Common_Variables.dob_Month = dpString("DOB_Month");
			Common_Variables.dob_Year = dpString("DOB_Year");
			
			// Common_Variables.totalQuotePrice = dpString("totalQuotePrice");
			// Common_Variables.priceToPay = dpString("Price_to_Pay");
			
			//Common_Variables.vehicleReg = dpString("Registration");
			Common_Variables.xmlAffinity = dpString("Affinity");
			Common_Variables.xmlConfusedFlag = dpString("CTM_Flag");
			Common_Variables.xmlBuildings_Vol_XS = dpString("Buildings_Vol_XS"); // (values 01 through 13)
			Common_Variables.xmlContents_Vol_XS = dpString("Contents_Vol_XS"); // (values 01 through 13)
			Common_Variables.xmlPropertyType = dpString("Property_Type"); // 
			Common_Variables.xmlPropertyYearBuilt = dpString("Year_Built"); // 
			Common_Variables.xmlNumberofBedrooms = dpString("Num_Bedrooms"); // (values 01 through 13)
			Common_Variables.xmlMarketValue = dpString("Buildings_Market_Value");
			Common_Variables.xmlContentsSumInsured = dpString("Contents_Sum_Insured");
			Common_Variables.xmlEmployerBusiness = dpString("Employer_Business");
			Common_Variables.xmlOccupation = dpString("Occupation");
		
			
			// Resolve Duplication
			Common_Variables.product = dpString("Product");
			Common_Variables.coverType = dpString("Product");
			
			// Resolve Duplication
			Common_Variables.Cover_Start_Day = CurrDay(dpInt("Future_Start_Day")); // CurrDay or Date
			Common_Variables.numberFutureDays = (dpInt("Future_Start_Day"));

			Common_Variables.Cover_Start_Month = CurrMonth(1);
			Common_Variables.Cover_Start_Year = sCurrentYear;
			
	
			Common_Variables.xmlRequestType = dpString("Request_Type"); 
			String sRequestType = Common_Variables.xmlRequestType;
			Common_Variables.xml_Primary_Node_Count = dpInt("XML_Primary_Node_Count");

			if (Common_Variables.selectedEnvironment.equals("prelive4")) {
				// Save the policy number to the datapool
				setDatapool("TIA_Policy_Number",
						resources.Common_Variables.TIA_Policy_Number);

				storeDatapool();
			}
			//----------------------------------------------------------------
			//sleep(3.0);
			// Close Browser Prior to Next Increment/Journey
			//iE(EBC(), DEFAULT_FLAGS).close();			
	
			//sleep(2.0);
			//----------------------------------------------------------------

		
			// Update XML FIle to Valid (Date) Status and Affinity
			// callScript("Update_XML");
			
			//----------------------------------------------------------------
			
			// Generate Quote
			unregisterAll();
			System.gc();
			callScript("Aggregators.Home.Generate_Home_Quote");			
			
			// Retrieve Combi Quote (ALL DATA FOR LATER REUSE)
			unregisterAll();
			System.gc();
			callScript("Aggregators.Home.Retrieve_Home_Combination_Quote");

			//------------------------------------------------------------------
			if (sRequestType.equals("joint")){
							
				// Verify Combi Retrieval
				unregisterAll();
				System.gc();
				callScript("Aggregators.Home.Verify_Home_Combination_Quote");			
			}
			//------------------------------------------------------------------
			if (sRequestType.equals("contents")){
				// Retrieve Contents Only Quote
				unregisterAll();
				System.gc();
				callScript("Aggregators.Home.Retrieve_Home_Contents");		
				
				// Verify Retrieval Contents
				unregisterAll();
				System.gc();
				callScript("Aggregators.Home.Verify_Home_Contents_Quote");			
			}
			//------------------------------------------------------------------
			if (sRequestType.equals("building")){
				// Retrieve Building Only Quote
				unregisterAll();
				System.gc();
				callScript("Aggregators.Home.Retrieve_Home_Building");
				
				// Verify Retrieval Building
				unregisterAll();
				System.gc();
				callScript("Aggregators.Home.Verify_Home_Building_Quote");
			}			
			//--------------------------------------------------------------------
			// END OF SCRIPT TIMING
			CurrTime(); String timeStampE = CurrTime();
			System.out.println("Start time = " + timeStampE);
			//--------------------------------------------------------------------
			dpNext();
			System.out.println(" Test Iteration = " + currentRow + " Completed");
			currentRow++;
			//stop();
		}
		//--------------------------------------------------------------------
		// END OF SCRIPT TIMING
		CurrTime(); String timeStampE = CurrTime();
		System.out.println("End time = " + timeStampE);
		//--------------------------------------------------------------------		

	}
}

