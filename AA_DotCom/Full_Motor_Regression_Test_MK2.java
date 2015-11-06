
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import resources.Common;
import resources.Common_Variables;
import resources.Full_Motor_Regression_Test_MK2Helper;
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
public class Full_Motor_Regression_Test_MK2 extends Full_Motor_Regression_Test_MK2Helper
{
	/**
	 * Script Name   : <b>Full_Road_Regression_Test_MK2</b>
	 * Generated     : <b>29 May 2015 11:44:05</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2015/05/29
	 * @author horned
	 */

	////////////////////////////////////////////////////////////////////////////////////////
	//
	//   Uplift of ROAD (Motor Insurance) - Dave Horne - June 2015 - Angular Journeys
	//
	////////////////////////////////////////////////////////////////////////////////////////

	public static boolean liveTest;
	public static int startRow;
	public static int endRow;
	public static int currentRow;

	public void testMain(Object[] args) {

		
		//--------------------------------------------------------------------
		int currentRow = 0;
		dpReset();
		
		// Get Datapool RowCount - Automatically Resolved Now :-)
		int iRecordCount = dpCurrent().getEquivalenceClass().getRecordCount();
		
		
		//Common_Variables.endRow=4;// 11
		Common_Variables.endRow=iRecordCount; 
		
		
		endRow = Common_Variables.endRow; // previousSupplier
		//--------------------------------------------------------------------
		// START OF SCRIPT TIMING
		CurrTime(); String sTimeStampS = CurrTime();
		System.out.println("Start time = " + sTimeStampS);
		//--------------------------------------------------------------------

		// Detect IE, and Clear before testing begins
		CloseAllBrowsers();
		
		// Sets The Function Area For Testing
		Common_Variables.functionalArea = "car-insurance";
		
		// Selection Of Environment and dP Starting Row
		callScript("Utilities.Environment_Selector");

		// Starting Row Parsed From Previous Line
		// currentRow = Common_Variables.startRow;
		//-----------------------------------------------------------------------------------------------
		// Move to the selected row to Start on if execution is interrupted from 0  IOD
		while (currentRow < Common_Variables.startRow) {
			dpNext();
			currentRow++;  // exact
		}
		//-----------------------------------------------------------------------------------------------

		System.out.println("Started Motor (New) Tests.....");  // Voluntary_Excess type

		while (!dpDone()) {
			//---------------------------------------------------------------------------------------------
			// CloseAllBrowsers();
			//---------------------------------------------------------------------------------------------
			// Launch chosen test environment			
			System.out.println(" Confirm Enviromment Selected Was "+Common_Variables.selectedEnvironment);
			logTestResult(" Confirmed, Test Enviromment Selected Was "+Common_Variables.selectedEnvironment, true);
 			StartBrowser(Common_Variables.selectedEnvironment);
			//---------------------------------------------------------------------------------------------			
			BrowserSync();
			//---------------------------------------------------------------------------------------------
			System.out.println("Executing New Motor Test - " + currentRow);
			//---------------------------------------------------------------------------------------------
			
			// Proposer Detail
			Common_Variables.proposer_PostCode = dpString("Proposer_Postcode");
			Common_Variables.proposer_HouseNumber = dpString("Proposer_House_Number");
			Common_Variables.membership = dpBoolean("Membership");
			Common_Variables.proposerTitle = dpString("Proposer_Title");
			Common_Variables.proposerForename = dpString("Proposer_Forename");
			Common_Variables.proposerLastname = dpString("Proposer_Lastname");
			Common_Variables.qrProposerLastname = dpString("Proposer_Lastname");
			Common_Variables.proposerDOB = dpString("Proposer_DOB");
			Common_Variables.proposerUKBorn = dpBoolean("UK_Birth");
			Common_Variables.proposerUKResidentSinceMonth = dpString("UK_Resident_Month");
			Common_Variables.proposerUKResidentSinceYear = dpString("UK_Resident_Year");
			//---------------------------------------------------------------------------------------------
			// Contacts
			Common_Variables.proposer_PhoneNumber = dpString("Proposer_Phone");
			Common_Variables.proposer_MobileNumber = dpString("Proposer_Mobile");
			Common_Variables.proposer_Email = dpString("Proposer_Email");
			//---------------------------------------------------------------------------------------------
			// Licence
			Common_Variables.dateTestPassed = dpString("Date_Test_Passed");
			Common_Variables.proposer_uk_Licence_Held = dpBoolean("UK_Licence");
			Common_Variables.proposer_Licence_Month = dpString("Obtained_Licence_Month");
			Common_Variables.proposer_Licence_Year = dpString("Obtained_Licence_Year");
			Common_Variables.proposer_Licence_Type = dpString("Licence_Type");
			//---------------------------------------------------------------------------------------------
			// Ownership
			Common_Variables.vehicleHaveAlready = dpBoolean("Vehicle_Already_Hold");
			Common_Variables.vehicleOwner = dpString("Vehicle_Owner");
			Common_Variables.vehicleRegisteredKeeper = dpString("Vehicle_Registered_Keeper");
			Common_Variables.vehicleUsage = dpString("Vehicle_Usage");

			Common_Variables.VehicleKeptLocation = dpString("Where_Car_Kept");
			Common_Variables.vehicleKeptPostcode = dpString("Vehicle_Kept_Postcode");;
			Common_Variables.vehicleKeptHomeAddress = dpBoolean("Vehicle_Kept_Home_Address");
			//---------------------------------------------------------------------------------------------
			// Other Vehicle(s)
			Common_Variables.otherVehicle = dpBoolean("Other_Vehicle");
			Common_Variables.otherVehicle_NCD = dpString("Other_Vehicle_NCD");
			Common_Variables.mainDriverCompanyCar = dpBoolean("Main_Driver_Company_Car");
			Common_Variables.anotherPolicy = dpBoolean("Another_Policy");
			Common_Variables.companyCarPersonalUse = dpBoolean("Company_Car_Personal_Use");
			Common_Variables.namedDriver = dpBoolean("Named_Driver");
			Common_Variables.caravanOwner = dpBoolean("Caravan_Owner");
			Common_Variables.companyCarinUse = dpBoolean("Company_Car_In_Use");
			Common_Variables.companyCarYears = dpString("Company_Car_Years");
			//---------------------------------------------------------------------------------------------
			// The Car
			Common_Variables.vehicleReg = dpString("Vehicle_Reg_No");
			Common_Variables.vehicleModel = dpString("Vehicle_Model");
			Common_Variables.vehicleExactModel = dpString("Vehicle_Exact_Model");
			Common_Variables.vehicleManufacturer = dpString("Vehicle_Manufacturer");
			Common_Variables.vehicleMileage = dpString("Vehicle_Mileage");
			Common_Variables.vehicleRegYear = dpString("Registration_Year"); 
			Common_Variables.vehicleValue = dpString("Vehicle_Value");
			Common_Variables.vehicleRightHandDrive = dpBoolean("Vehicle_Righthand_Drive");
			Common_Variables.regNumberKnown = dpBoolean("Reg_Number_Known");
			Common_Variables.transMissionType = dpString("Transmission_Type");
			Common_Variables.numberSeats = dpString("Number_Seats");
			Common_Variables.fuelType = dpString("Fuel_Type");
			Common_Variables.vehicleMods = dpString("Vehicle_Modification");
			Common_Variables.vehicleSecurityDevice = dpString("Vehicle_Security_Device");
			Common_Variables.vehicleSecurityModel = dpString("Vehicle_Security_Device_Model");
			Common_Variables.vehicleSecurityFitter = dpString("Vehicle_Security_Device_Fitter");
			Common_Variables.vehicleSecurityCertificate = dpBoolean("Vehicle_Security_Device_Certificate");
			Common_Variables.vehiclePurchaseMonth = dpString("Vehicle_Purchase_Month");
			Common_Variables.vehiclePurchaseYear = dpString("Vehicle_Purchase_Year");
			//---------------------------------------------------------------------------------------------
			// Product Info
			Common_Variables.proposerOccupation = dpString("Occupation_Code");
			Common_Variables.proposerBusiness = dpString("Occupation_Industry");
			Common_Variables.proposerOccupationStatus = dpString("Employment_Status");
			Common_Variables.proposerOtherOccupation = dpString("Other_Occupation_Code");
			Common_Variables.proposerOtherBusiness = dpString("Other_Occupation_Industry");
						
			Common_Variables.retrieveQuote = dpBoolean("Quote_and_Retrieve");
			Common_Variables.membershipYN = dpString("Membership");
			Common_Variables.membershipNum = dpString("Membership_Num");
			Common_Variables.provCode = dpString("ProvCode");
			Common_Variables.coverType = dpString("Cover_Type");
			Common_Variables.writtenConfirmation = dpString("Written_Confirmation_YN");
			Common_Variables.No_Sale = dpString("No_Sale");
			//---------------------------------------------------------------------------------------------
			// Incident
			Common_Variables.insuredClaims = dpBoolean("Insured_Claims");
			Common_Variables.motoringIncident = dpString("Motoring_Incident");
			Common_Variables.motoringClaimCost = dpString("Claim_Cost");
			Common_Variables.motoringInjuryClaim = dpBoolean("Injury_Claim");
			Common_Variables.motoringFaultClaim = dpBoolean("Fault_Claim");
			Common_Variables.motoringIncidentMonth = dpString("Motoring_Incident_Month");
			Common_Variables.motoringIncidentYear = dpString("Motoring_Incident_Year");
			//---------------------------------------------------------------------------------------------
			// Convictions
			Common_Variables.insuredConvictions = dpBoolean("Insured_Convictions");
			Common_Variables.drivingBan = dpBoolean("Driving_Ban"); 
			Common_Variables.penaltyPoints = dpString("Penalty_Points"); 
			Common_Variables.motoringOffence = dpString("Motoring_Offence"); 
			Common_Variables.motoringFineAmount = dpString("Fine_Amount");
			Common_Variables.motoringBanLength = dpString("Ban_Length"); // Months
			Common_Variables.motoringConvictionMonth = dpString("Motoring_Conviction_Month");
			Common_Variables.motoringConvictionYear = dpString("Motoring_Conviction_Year");
			//---------------------------------------------------------------------------------------------
			// Upgrades Excess/Hirecar etc.
			Common_Variables.upgrades_HireCar = dpBoolean("Upgrade_Hire_Car");
			Common_Variables.upgrades_MAP = dpBoolean("Upgrade_MAP");
			Common_Variables.upgrades_MOAHP_Single = dpBoolean("Upgrades_MOAHP_Single");
			Common_Variables.upgrades_MOAHP_Joint = dpBoolean("Upgrade_MOAHP_Joint");
			Common_Variables.upgrades_MOXIN = dpBoolean("Upgrades_MOXIN");
			Common_Variables.upgrades_MLA = dpBoolean("Upgrade_MLA");
			
			Common_Variables.volXS = dpString("Voluntary_Excess");
			
			//---------------------------------------------------------------------------------------------
			// Upgrades Breakdown Cover  
			Common_Variables.breakDownServiceUsage = dpString("Breakdown_Service_Usage");
			Common_Variables.upgrades_Breakdown_Cover = dpBoolean("Upgrade_Breakdown_Cover");
			Common_Variables.upgrades_Add_Relay = dpBoolean("Upgrade_Add_Relay");
			Common_Variables.upgrades_Add_Relay_Home_Start = dpBoolean("Upgrade_Add_Relay_Home_Start");
			Common_Variables.blue_Badge_Holder = dpBoolean("Blue_Badge_Holder");
			//---------------------------------------------------------------------------------------------
			// Persons
			Common_Variables.personsCovered = dpString("Persons_Covered");
			Common_Variables.firstDriverClaims = dpBoolean("First_Driver_Claims");
			Common_Variables.firstDriverConvictions = dpBoolean("First_Driver_Convictions");
			Common_Variables.secondDriverClaims = dpBoolean("Second_Driver_Claims");
			Common_Variables.secondDriverConvictions = dpBoolean("Second_Driver_Convictions");
			Common_Variables.businessUse = dpBoolean("Business_Use");
			Common_Variables.roadQuote = dpBoolean("Road_Quote_YN");
			Common_Variables.driverRestrictions = dpString("Driver_Restictions");
			
			Common_Variables.previousSupplier = dpString("Previous_Insurer");
			//---------------------------------------------------------------------------------------------
			// Cover Top Level Detail
			Common_Variables.NCB = dpString("NCB");
						
			Common_Variables.coverStartDate = dpString("Cover_Start_Date");
			Common_Variables.coverEndDate = dpString("Cover_End_Date");
			Common_Variables.numberFutureDays = dpInt("Future_Date_Num_Days");
			//---------------------------------------------------------------------------------------------
			// POLICY FUTURE START DATE = 0 = Today - REUSE FROM EBC
			Common_Variables.EBC_tripFutureStartDay = Integer.parseInt(dpString("Future_Cover_Start_Date"));
			// POLICY FUTURE START DATE = 0 = Today - REUSE FROM EBC
			//---------------------------------------------------------------------------------------------
			Common_Variables.policyDocuments  = dpString("Policy_Documents");
			
			Common_Variables.maritalStatus = dpString("Marital_Status");
			Common_Variables.insuredNumPrevClaims = 1;
			Common_Variables.homeTelNo = "";
			
			// MVD Updates - business use above 
			//Common_Variables.otherVehicleUsage = dpBoolean("Other_Vehicle_Usage"); 
			// Common_Variables.otherVehicleOption = dpInt("Other_Vehicle_Options");
			// Extra Verification on Driver Details/Quote Page
			Common_Variables.intermediateQuoteReference = ("");
			//---------------------------------------------------------------------------------------------
			// Payment information
			Common_Variables.cardPaymentCharge = "1.5"; // Percentage - 1.5 currently
			Common_Variables.paymentType = dpString("Payment_Type");
			Common_Variables.Payment_CardType = dpString("Payment_CardType");
			Common_Variables.Payment_CardNumber = dpString("Payment_CardNumber");
			Common_Variables.Payment_StartDate = dpString("Payment_StartDate");
			Common_Variables.Payment_ExpiryDate = dpString("Payment_ExpiryDate");
			Common_Variables.Payment_Bank_Account_Number = dpString("Bank_Account_Number");
			Common_Variables.Payment_Bank_Sortcode = dpString("Bank_Sort_Code");

			Common_Variables.startMonth = Common_Variables.Payment_StartDate
					.substring(0, 2);
			Common_Variables.startYear = Common_Variables.Payment_StartDate
					.substring(2, 4);
			Common_Variables.endMonth = Common_Variables.Payment_ExpiryDate
					.substring(0, 2);
			Common_Variables.endYear = Common_Variables.Payment_ExpiryDate
					.substring(2, 4);

			Common_Variables.Payment_SecCode = dpString("Payment_SecCode");

			setDatapool("Customer_Name", Common_Variables.proposerTitle + " "
					+ Common_Variables.proposerForename + " "
					+ Common_Variables.proposerLastname);

			storeDatapool();

			// Set the Bank Account Name to the new customer name we
			// generated.
			Common_Variables.Payment_Bank_Account_Name = dpString("Customer_Name");
			Common_Variables.Payment_CardName = dpString("Customer_Name");
			
			// Detection of Quote Failure
			//Boolean bQuoteFailure = Common_Variables.quoteRetrieveFailure;
			//---------------------------------------------------------------------------------------------
			// THE CAR			 
			System.gc();
			callScript("Motor_MK2.The__Car.The_Car");			
			//---------------------------------------------------------------------------------------------
			// YOUR DETAILS
			unregisterAll();
			System.gc();
			callScript("Motor_MK2.Your__Details.Your_Details");			
			//---------------------------------------------------------------------------------------------
			// Quote Failure Detection
			unregisterAll();
			System.gc();
			callScript("Motor_MK2.Please_Call_Us.Quote_Failure");				
			if (Common_Variables.quoteRetrieveSuccess == true){
			//---------------------------------------------------------------------------------------------			
			// YOUR QUOTE
				unregisterAll();
				System.gc();
				callScript("Motor_MK2.Your__Quote.Your_Quote");		
				//---------------------------------------------------------------------------------------------
				if (Common_Variables.liveTest == false) {
					//---------------------------------------------------------------------------------------------
					// YOUR PAYMENT
					unregisterAll();
					System.gc();
					callScript("Motor_MK2.Payment.Payment"); // Add Payment Verification Called Within
					//---------------------------------------------------------------------------------------------
					// YOUR ONE
					unregisterAll();
					System.gc();
					
					String sPaymentType = Common_Variables.paymentType;
					
					switch (sPaymentType){
					//--------------------------------------------------------------------		
						case "Instalment":
							callScript("Motor_MK2.Done.Instalments");
							break;
							//--------------------------------------------------------------------
						case "Single Payment":
							callScript("Motor_MK2.Done.Single_Payment");
							break;				
					}
					//---------------------------------------------------------------------------------------------
					CloseAllBrowsers();
				}			
			}
			
     		//---------------------------------------------------------------------------------------------

			//--------------------------------------------------------------------
			// SERVICE UNAVAILABLE RE-ENTRY POINT
			//next_Iteration:
			//--------------------------------------------------------------------
			// END OF CURRENT SCRIPT TIMING
			CurrTime(); String timeStampE = CurrTime();
			System.out.println("Scenario End time = " + timeStampE);
			setDatapool("Script_End_Time", "" + timeStampE);
			//--------------------------------------------------------------------
			sleep(2.0);
			BrowserSync();
			CloseAllBrowsers();
			dpNext();
			currentRow++;
			//--------------------------------------------------------------------
		}

		//--------------------------------------------------------------------
		// END OF SCRIPT TIMING
		CurrTime(); String timeStampE = CurrTime();
		System.out.println("End time = " + timeStampE);
		//--------------------------------------------------------------------

	}
}

