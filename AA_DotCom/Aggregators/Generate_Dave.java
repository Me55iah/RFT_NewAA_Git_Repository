		//-------------------------------------
		// Test Data Start
		//-------------------------------------
		// Insurance
		String sAffinity = "COMPARTHETHEMARKETP";
		String sQuoteRetrievalType = "motor-retrievequote";
		String sTestEnvironment = "";
		String sCoverStartDate_YYYY = "";
		String sCoverStartDate_MM = "";
		String sCoverStartDate_DD = "";
		String sExpiryDate_YYYY = "";
		String sExpiryDate_MM = "";
		String sExpiryDate_DD = "";
		String sYearsnoClaims = "";
		String sLevelofCover_Code = "";
		String sLevelofCover_Text = "";
		String sVehicleUsage_Code = "";
		String sVehicleUsage_Text = "";
		String sQuoteType_Code = "";
		String sQuoteType_Text = "";
		String sClaims = "";
		String sConvictions = "";
		String sPreviousInsurer ="";
		String sPreviousInsurerExpiryDate = "";
		String sNewCoverStartDate = "";
		String sInsuranceLevelofCover = "";
		//-------------------------------------
		// Quote Retrieval
		String sQuoteReference = "";
		String sExcessType = "";
		String sExcessAmount = "";
		String sExcessTotalAmount = "";
		String sPaymentFrequency = "";
		String sPaymentAmount = "";
		//-------------------------------------
		// Person
		String sTitle = "";
		String sFirstname = "";
		String sSurname = "";
		String sAddressLine1 = "";
		String sAddressLine2 = "";
		String sAddressLine3 = "";
		String sAddressLine4 = "";
		String sPostcode = "";
		String sDOBDate_YYYY = "";
		String sDOBDate_MM = "";
		String sDOBDate_DD = "";
		String sEmail = "";
		String sTelephone = "";
		String sMobile = "";
		String sMaritalStatus = "";
		String sEmploymentStatus = "";
		String sJobTitle = "";
		String sBusinessType = "";
		String sUKResidenceSince = "";
		String sAAMembership = "";
		String sFullUKLicence = "";
		String sFullUKLicenceDate = "";
		//-------------------------------------	
		// Vehicle Details
		String sVehicleRegistration = "";
		String sVehicleRegisterYear = "";
		String sVehicleManufacturer = "";
		String sVehicleModel = "";
		String sFuel = "";
		String sTransmission "";
		String sEngineCapacity = "";
		String sAnnualMileage = "";
		String sNumberofDoors = "";
		String sVehicleValue = "";
		String sNumberofSeats = "";
		String sVehicleRightHandDrive = "";
		String sVehicleModifications = "";
		String sVehicleSecurityDevice = "";
		String sPurchaseDate = "";
		String sPresentValue = "";
		String sVehicleOwner = "";
		String sRegisteredKeeper = "";
		String sVehicleUseage = "";
		String sVehicleOvernightLocation = "";
		String sVehicleOvernightAddress = "";
		//-------------------------------------
		// Test Data End
		//-------------------------------------
		// 		
		// Send Quote Data Via URL
		String sXML = "http://"+sTestEnvironment+"/aaservlet/InsuranceXMLQuote?xmlString=%3C%3Fxml%20version%3D%221.0%22%20encoding" +
				"%3D%22utf-8%22%3F%3E%3CAAInsurance%20xsi%3AnoNamespaceSchemaLocation%3D%22http%3A//10.192.51.16%3A80/schemas/" +
				"AAInsurance.xsd%22%20coverstartdate%3D%22${"+sCoverStartDate_YYYY+"}-${"+sCoverStartDate_MM+"}-${"+sCoverStartDate_DD+"}" +
				"%22%20coverperiod%3D%220%22%20suppressmailings%3D%22N%22%20affinity%3D%22${"+sAffinity+"}" +
				"%22%20volexcess%3D%2204X%22%20xmlns%3Axsi%3D%22http%3A//www.w3.org/2001/XMLSchema-instance" +
				"%22%20xmlns%3Aref%3D%22http%3A//callconnection.co.uk/referencedata%22%20xmlns%3Ahelper%3D%22urn" +
				"%3AXsltHelper%22%20xmlns%3AabiManager%3D%22urn%3AAbiCodeManager%22%3E%3Cmotor%3E%3Cquotetype%20code%3D%22$" +
				"{"+sQuoteType_Code+"}%22%3E${"+sQuoteType_Text+"}%3C/quotetype%3E%3Clevelofcover%20code%3D%22${"+sLevelofCover_Code+"}" +
				"%22%3E${"+sLevelofCover_Text+"}%3C/levelofcover%3E%3Cresponse%20code%3D%2209%22%3EPrice%20comparison%20website" +
				"%3C/response%3E%3Cpreviousinsurer%20code%3D%22500%22%20expiry%3D%22${"+sExpiryDate_YYYY+"}-${"+sExpiryDate_MM+"}-${"+sExpiryDate_DD+"}" +
				"%22%20yearsnoclaims%3D%22${"+sYearsnoClaims+"}%22%3EUnknown/Other%3C/previousinsurer%3E%3Cproposer%3E%3Cvehicleusage" +
				"%20code%3D%22${"+sVehicleUsage_Code+"}%22%3E${"+sVehicleUsage_Text+"}%3C/vehicleusage%3E%3Caddress%20line1%3D%22${"+sAddressLine1+"}" +
				"%22%20line2%3D%22${"+sAddressLine2+"}%22%20line3%3D%22${"+sAddressLine3+"}%22%20line4%3D%22${"+sAddressLine4+"}" +
				"%22%20postcode%3D%22${"+sPostcode+"}%22%20/%3E%3Ccontact%3E%3Ctelephone%20type%3D%22home%22%3E0"+sTelephone+"%3C/telephone" +
				"%3E%3Cemail%20type%3D%22home%22%3E${"+sEmail+"}%3C/email%3E%3C/contact%3E%3Cdriver%20dob%3D%22$" +
				"{"+sDOBDate_YYYY+"}-${"+sDOBDate_MM+"}-${"+sDOBDate_DD+"}%22%20othervehicle%3D%22N%22%3E%3Cname%20firstname%3D%22${"+sFirstname+"}" +
				"%22%20lastname%3D%22${"+sSurname+"}%22%20title%3D%22${"+sTitle+"}%22%20/%3E%3Cmaritalstatus%20code%3D%222%22%3E"+sMaritalStatus+""+
				"%3C/maritalstatus%3E%3Coccupation%3E%3Cfulltimeocc%20code%3D%22264%22%3EAccounts%20Clerk%3C/fulltimeocc%" +
				"3E%3Cfulltimebus%20code%3D%22304%22%3ECourier%20Services%3C/fulltimebus%3E%3C/occupation%3E%3Clicence%20code" +
				"%3D%221%22%20held%3D%229%22%20unit%3D%22Y%22%20/%3E%3C/driver%3E%3C/proposer%3E%3Cvehicle%20purchasedate%3D" +
				"%22"+sPurchaseDate+"%22%20value%3D%22"+sPresentValue+"%22%20annualmileage%3D%22"+sAnnualMileage+"%22%20registration%3D%22"+sVehicleRegistration+"%22%20regyear%3D" +
				"%22"+sVehicleRegisterYear+"%22%3E%3Cwherekept%20code%3D%222%22%20/%3E%3Cabi%20code%3D%2253536402%22%3E"+sVehicleRegisterYear+"%2C%20"+sVehicleManufacturer+"%20"+sVehicleModel+"%2C" +
				"%20"+sEngineCapacity+"%2C%205%20"+sNumberofDoors+"%2C%20"+sFuel+"%2C%20"+sTransmission+"%3C/abi%3E%3C/vehicle%3E%3C/motor%3E%3C/AAInsurance%3E";
				
				
				
				
				
				
				
				
