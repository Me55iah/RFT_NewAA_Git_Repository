package resources;

import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.Months;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.Seconds;


// THESE NEED TO BE REVIEWED - THERE ARE VARS THAT ARE COMMON TO FUNCTION,
// SOME ARE SPECIFIC TO FUNCTION - NEED TO BE SEPERATED AND MARKED AS SUCH  //homeInsType  card

public class Common_Variables {
	
	public static boolean timeout;
	public static boolean initialIteration;
	
	// Home
	public static boolean PCI;
	public static String browserTestEnvironment;   // BrowserName
	public static String selectedEnvironment;
	public static boolean bulkTest = false;
	public static boolean liveTest;	
	public static int startRow;
	public static int currentRow;
	public static int endRow;      // Added by DH

	public static String functionalArea;
	
	public static boolean referal;
	public static boolean viewA;
	public static String environment;
	public static String todaysDate;
	public static String newCustomerForename;
	public static String newCustomerSurname;
	public static String Payment_Bank_Account_Name;
	public static String Payment_CardName;
	public static String Payment_CardNumber;
	public static String Payment_StartDate;
	public static String Payment_ExpiryDate;
	public static String Payment_SecCode;
	public static String Payment_Bank_Account_Number;
	public static String Payment_Bank_Sortcode;
	public static String startMonth;
	public static String startYear;
	public static String endMonth;
	public static String endYear;
	public static String A2000_New_Customer_Number;
	public static boolean membership;
	public static String propertyType;
	public static boolean firstHome;
	public static String coverType;
	public static boolean buildingsAD;
	public static boolean contentsAD;
	public static String contentsSI;
	public static String buildingsMarketValue;
	public static String buildingsVolXS;
	public static String contentsVolXS;
	public static String yearBuilt;
	public static boolean HLE;
	public static boolean HAP;
	public static boolean HEC;
	public static boolean section3;
	public static boolean section3a;
	public static String section3Amount;
	public static String section3aAmount;
	public static String specItemValue;
	public static boolean separateQuotes;
	public static boolean previousClaims;
	public static String buildingsAnnualPremium;
	public static String buildingsDepositPrice;
	public static String buildingsMonthlyPrice;
	public static String buildingsTotalAnnualPrice;
	public static String contentsAnnualPremium;
	public static String contentsDepositPrice;
	public static String contentsMonthlyPrice;
	public static String contentsTotalAnnualPrice;
	public static String combinedAnnualPremium;
	public static String combinedDepositPrice;
	public static String combinedMonthlyPrice;
	public static String combinedTotalAnnualPrice;
	public static String numOffers;
	public static String TIA_Policy_Number_2;
	public static String paymentType;
	public static String quoteReference;
	public static String Payment_CardType;
	public static String TIA_Policy_Number;
	public static String medicalScreening;
	public static boolean homeInsPlus;
	public static String receive_Policy_Documents;
	public static String policy_Excess;
	public static Integer insCoverStartDay;

	// Motor Regression Test (Start)
	public static boolean protectedNCD;
	public static boolean retrieveQuote;
	// Proposer Details
	public static String proposerTitle;
	public static String proposerForename;
	public static String proposerLastname;
	public static String qrProposerLastname;
	public static String proposerDOB;
	public static String proposerOccupation;
	public static String proposerBusiness;
	public static String proposer_PostCode;
	public static String proposer_HouseNumber;
	public static String proposer_Address_Line2;
	public static String proposer_Address_Town;
	public static String proposer_Address_County;

	public static String occupationCode;
	public static String proposerOccupationStatus;
	public static String proposerOtherBusiness;
	public static String proposerOtherOccupation;
	
	// Vehicle Details
	public static String vehicleValue;
	public static String vehicleReg;
	public static String vehicleModel;
	public static String vehicleExactModel;
	public static String vehicleManufacturer;
	public static boolean regNumberKnown;
	public static boolean vehicleRightHandDrive;
	public static String fuelType;
	public static String transMissionType;
	public static String numberSeats;
	public static String VehicleKeptLocation;
	public static String vehicleRegYear;
	public static String vehicleMileage;
	public static String vehicleSecurityDevice;
	public static String vehicleSecurityModel;
	public static String vehicleSecurityFitter;
	public static String vehiclePurchaseMonth;
	public static String vehiclePurchaseYear;

	// Ownership
	public static boolean vehicleHaveAlready;
	public static String vehicleRegisteredKeeper;
	public static String vehicleUsage;

	public static String vehicleKeptPostcode;
	public static boolean vehicleKeptHomeAddress;

	
	// Licence
	public static boolean proposer_uk_Licence_Held;
	public static String proposer_Licence_Month;
	public static String proposer_Licence_Year;
	public static String proposer_Licence_Type;

	// Other Vehicle
	public static boolean otherVehicle;
	public static String otherVehicle_NCD;
	public static String sActual;  // Actual Return For Verification Comparison
	public static boolean mainDriverCompanyCar;
	public static boolean anotherPolicy;
	public static boolean companyCarPersonalUse;
	public static boolean namedDriver;
	public static boolean caravanOwner;
	public static boolean companyCarinUse;
	public static String companyCarYears;

	public static boolean proposerUKBirth;
	public static String proposerUKResidentSinceMonth;
	public static String proposerUKResidentSinceYear;


	public static String annualPremium;
	public static String specificAddress;
	public static boolean upgrades_HireCar;
	public static boolean upgrades_MLA;
	public static boolean upgrades_MAP;
	public static boolean upgrades_MOAHP_Single;
	public static boolean upgrades_MOAHP_Joint;
	public static boolean upgrades_MOXIN;
	public static String personsCovered;
	public static boolean insuredClaims;
	public static boolean insuredConvictions;
	public static boolean firstDriverClaims;
	public static boolean firstDriverConvictions;
	public static boolean secondDriverClaims;
	public static boolean secondDriverConvictions;
	public static boolean businessUse;
	public static boolean roadQuote;
	public static String NCB;
	public static int numberFutureDays; //int //String
	public static String quoteRetrieve;
	public static boolean quoteOnly;
	public static String membershipYN;
	public static String membershipNum;
	public static String provCode;

	public static String writtenConfirmation;
	public static String No_Sale;
	public static String nonIPTAddress;
	public static String totalAnnualPrice;
	public static String depositAmount;
	public static String monthlyPrice;
	public static String firstDriverTitle;
	public static String firstDriverSurname;
	public static String firstDriverDOB;
	public static String firstDriverOccupation;
	public static String firstDriverEmployerBiz;
	public static String firstDriverMaritalStatus;
	public static String firstDriverRelationship;
	public static String Title;
	public static String dateTestPassed;
	public static boolean boostCover;
	public static boolean yourQuote;
	public static boolean instalments;
	public static String employerBusiness;
	public static String homeTelNo;
	public static String volXS;

	public static String maritalStatus;
	public static boolean MSM;
	public static int insuredNumPrevClaims;
	public static int prevClaimNumber;
	public static String insuredFirstClaimMonth;
	public static String insuredFirstClaimYear;
	public static String insuredFirstClaimDescription;
	public static String insuredSecondClaimMonth;
	public static String insuredSecondClaimYear;
	public static String insuredSecondClaimDescription;
	public static boolean proposerUKBorn;
	public static boolean firstDriverUKBorn;
	public static String proposerLicenseType;
	public static boolean proposerDriveOtherCars;
	public static boolean firstDriverRegOwner;
	public static boolean firstDriverMainUser;
	public static String firstDriverLicenseType;
	public static boolean firstDriverOtherCars;
	public static boolean additionalSecurity;
	public static String vehicleMods;
	public static String vehicleOwner;
	public static String registeredTo;
	public static boolean proposerUKResidentYears;
	// Motor Regression Test (End)

	// Road
	public static boolean upgrades_AtHome;
	public static boolean upgrades_Relay;	
	public static boolean upgrades_Recovery;
	public static boolean upgrades_PartsGarage;
	public static boolean upgrades_OnwardTravel;
	public static boolean upgrades_BRC;
	public static boolean upgrades_StayMobile;
	public static boolean payment_Month;
	public static boolean payment_Annual;
	public static String paymentPeriod;
	public static boolean CouncilBadge;
	public static String MLA;
	public static boolean EBCRequired;
	public static String motorRenewalMonth;
	public static boolean vehicleSecurityCertificate;
	
	// HER
	public static boolean herYN;
	public static String centralHeatingInsType;
	public static String homeInsType;
	public static boolean excessYN;
	public static String previousSupplier;
	public static String typeOfProperty;
	public static String listedProperty;
	public static String numBedrooms;
	public static String policyHolder_Status;
	public static boolean brickStoneWalls;

	// EBC
	public static String zone;
	public static String EBC_Product;
	public static String personsTravelling;
	public static int EBC_tripDuration;
	public static Integer EBC_tripFutureStartDay;
	public static String EBC_Destination;
	public static boolean partsAndLabour;
	public static boolean towingYN;
	public static String EBC_Single_Payment_Price;
	public static String EBC_Continuous_Payment_Price;
	public static String EBC_Discount;
	public static String EBC_Price_to_Pay;
	public static String EBC_Cover_Level;	
	public static String totalQuotePrice;
	public static String priceToPay;
	public static String lightQuotePrice;
	public static String fullQuotePrice;
	public static String partsLabourQuotePrice;
	public static String startDate;  // Start Date for Single Trip, and Annual Cover
	public static String endDate;    // End Date, Utilised only for Single Trip
	public static String DD_SortCode;
	public static String DD_AccountNumber;
	
	// Travel
	public static String product;
	public static String travelBrand;
	public static String travelPolicyType;
	public static String travelPolicyDestination;
	public static String Travel_tripDuration;
	public static String travel_Policy_Start_Date;
	public static String futureDatedYN;
	public static boolean winterSports;
	public static String upgradesYN;
	public static String upgrade_DatapoolRow;
	public static String Travel_Basic_Price;
	public static String Travel_IPT_Amount;
	public static String Travel_Total_Premium;
	public static String Travel_Price_to_Pay;

	// Aggregators
	public static String xmlFilePathDestination;
	public static String xmlFilePathSource;
	public static String xmlAffinity;
	public static String xmlRequestType;
	public static String coverStartDate;
	public static String coverEndDate;
	public static String xmlQuoteReference;
	public static String xmlQuoteReferenceAddons;
	public static String xmlConfusedFlag;	
	public static String xmlPrice;	
	public static String xmlPriceAddons;
	public static String xmlTotalAmount;
	public static String xmlTotalAmountAddons;
	public static String xmlInstalmentAmount;
	public static String xmlInstallmentAmountAddons;
	public static String xmlInstallmentAmountDeposit;
	public static String xmlInsurerName;
	public static String xmlInstallmentAmountDepositAddons;
	public static String xmlNumberofInstalments;
	public static String xmlVoluntaryExcess;
	public static String xmlCompulsoryExcess;
	public static String testEnvironment;
	public static String policyTotalExcess;
	public static String policyVoluntaryExcess;
	public static String policyCompulsoryExcess;
	public static String intermediateQuoteReference;
	public static int otherVehicleOption;
	public static String intialDeposit;
	public static String elevenPayments;
	public static String totalCredit;
	public static String totalPayable;
	public static String carInsuranceAnnual;
	public static String carInsuranceMonth;
	public static String dob_Day;
	public static String dob_Month;
	public static String dob_Year;
	public static String Cover_Start_Day;
	public static String Cover_Start_Month;
	public static String Cover_Start_Year;
	public static int xml_Primary_Node_Count;
	public static String xmlNodeValue;
	public static String xmlQuoteType;
	public static String xmlBundle;
	public static String xmlCAS;
	public static String xmlDeposit;
	public static String xmlAPR;
	public static String xmlString;
	public static String xmlCalculatedCredit;
	public static String xmlContents_Vol_XS;
	public static String xmlBuildings_Vol_XS;
	public static String xmlPropertyType;
	public static String xmlPropertyYearBuilt;
	public static String xmlNumberofBedrooms;
	public static String xmlMarketValue;
	public static String xmlContentsSumInsured;
	public static String xmlEmployerBusiness;
	public static String xmlOccupation;
	public static String xmlInsuranceType;
	public static String xmlPaymentOption;
	public static boolean otherVehicleUsage;
	public static String sMLA;
	public static String xmlHAS;

	public static String xmlbuildingaccdamage;

	public static String xmlHLE;

	public static String xmlBuildingPrice;

	public static String xmlContentsPrice;

	public static String xmlJointPrice;

	public static String xmlBuildingPrice_P;

	public static String xmlContentsPrice_P;

	public static String xmlJointPrice_P;

	public static String xmlQuoteReference_Lower;

	public static boolean firstPass;



	public static String proposer_PhoneNumber;

	public static String proposer_MobileNumber;

	public static String proposer_Email;
	


	public static String policyRenewalDate;

	public static boolean free_HE;

	public static String full_Name;

	public static String policyHolder;

	public static String substring; // sub string extraction method

	public static String xmlTotalExcess;

	public static String policyDocuments;

	public static boolean blue_Badge_Holder;

	public static boolean upgrades_Add_Relay_Home_Start;

	public static boolean upgrades_Breakdown_Cover;

	public static boolean upgrades_Add_Relay;

	public static String paymentFrequency;

	public static String breakDownServiceUsage;

	public static String cardPaymentCharge;

	public static String policyPrice;
	public static String PolicyRemainingBalance;

	public static String driverRestrictions;

	public static String coverExpirationDate;

	public static String actual;

	public static Object initialMonthlyCost;

	public static String initialAnnualCost;

	// Motor RTA/Damage Incident
	public static String motoringIncident;
	public static String motoringClaimCost;
	public static Boolean motoringInjuryClaim;
	public static Boolean motoringFaultClaim;
	public static String motoringIncidentDate;
	public static String motoringIncidentMonth;
	public static String motoringIncidentYear;

	public static boolean drivingBan;

	public static String penaltyPoints;

	public static String motoringOffence;

	public static String motoringConvictionYear;

	public static String motoringConvictionMonth;

	public static String motoringFineAmount;

	public static String motoringBanLength;

	public static double dActual;

	public static Object addonsLegalAssistanceCost;

	public static Object addonsPersonalAccidentCost;

	public static Object addonsCourtesyCarCost;

	public static Object addonsPolicyExcessProtectionCost;
	public static Boolean quoteRetrieveSuccess;
	public static String quickPick;
	public static String vehicleType;
	public static String abicode;
	public static String vehicleNumberofDoors;
	public static String vehicleDoorPlan;
	public static String vehicleGears;
	public static String vehicleEngineSize;
	public static String quoteType;
	
	// Vehicle Inspection - Start
	
	public static String title;
	public static String foreName;
	public static String surName;
	public static String postCode;
	public static String houseNumber;
	public static String phoneNumber;
	public static String eMail;

	
	
	public static String vendorName;
	public static String vendorPhone;
	public static String vendorPostcode;
	public static String inspectionQuotePrice;
	public static String payment_Expiry_MM;
	public static String Payment_Expiry_YYYY;
	public static String function;
	public static String vehicleStatus;
	public static String expectedOutcome;

	// Vehicle Inspection - End
	
	// MOTOR ANGULAR RE_VISIT - Start
	public static String sM2_TotalMonthlyPayment;
	public static String sM2_TotalAnnualPayment;
	public static String sM2_CarInsurance;
	public static String sM2_ProtectedNoClaimsBonus;
	public static String sM2_ExcessProtection;
	public static String sM2_CarHire;
	public static String sM2_MotorAccidentPlan;
	public static String sM2_BreakdownCover;
	public static String sM2_PolicyCashPrice;
	public static String sM2_InitialCardPayment;
	public static String sM2_11MonthlyPayments;
	public static String sM2_TotalMonthlyPayments;
	public static String sM2_TotalCredit;
	public static String sM2_TotalPayable;
	public static String sM2_FixedInterestRate;
	public static String sM2_RepresentativeAPR;
	public static String sM2_MotorLegalAssistance;
	
	
	// UNATTENDED OR STANDARD OVERSEEN
	public static boolean unettended_Executions;
	public static String IOS_Device;
	public static String Mobile_Device;
	public static String Mobile_Device_Orientation;

	
	
	// MOTOR ANGULAR RE_VISIT - End
	















	





	






}
