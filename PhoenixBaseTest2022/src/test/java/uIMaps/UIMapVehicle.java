package uIMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.Playback;

public class UIMapVehicle {

	public VehicleBoatSearch vehicleBoatSearch;
	public FleetSearch fleetSearch;
	public VehicleBoatSearchHelpWindow vehicleBoatSearchHelpWindow;
	public FleetEntry fleetEntry;
	public VehicleBoatEntry vehicleBoatEntry;
	public EquipmentService equipmentService;
	public FuelLogEntry fuelLogEntry;
	public MileageLogEntry mileageLogEntry;
	public VehicleMakeModel vehicleMakeModel;
	public TowRotation towRotation;
	public TowVendor towVendor;
	public VehicleFlagDetailsScreen vehicleFlagDetailsScreen;

	public UIMapVehicle() {
		if (this.vehicleBoatSearchHelpWindow == null)
			this.vehicleBoatSearchHelpWindow = new VehicleBoatSearchHelpWindow();

		if (this.vehicleBoatSearch == null)
			this.vehicleBoatSearch = new VehicleBoatSearch();

		if (this.fleetSearch == null)
			this.fleetSearch = new FleetSearch();

		if (this.fleetEntry == null)
			this.fleetEntry = new FleetEntry();

		if (this.vehicleBoatEntry == null)
			this.vehicleBoatEntry = new VehicleBoatEntry();

		if (this.equipmentService == null)
			this.equipmentService = new EquipmentService();

		if (this.fuelLogEntry == null)
			this.fuelLogEntry = new FuelLogEntry();

		if (this.mileageLogEntry == null)
			this.mileageLogEntry = new MileageLogEntry();

		if (this.vehicleMakeModel == null)
			this.vehicleMakeModel = new VehicleMakeModel();

		if (this.towRotation == null)
			this.towRotation = new TowRotation();

		if (this.towVendor == null)
			this.towVendor = new TowVendor();

		if (this.vehicleFlagDetailsScreen == null)
			this.vehicleFlagDetailsScreen = new VehicleFlagDetailsScreen();

	}

	public class VehicleBoatSearch {
		public WebDriver driver;

		public VehicleBoatSearch() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			// Properties

			if ((this.vehicleTab == null)) {
				this.vehicleTab = new VehicleTab();
			}

			if ((this.boatTab == null)) {
				this.boatTab = new BoatTab();
			}

		}

		// Fields
		public VehicleTab vehicleTab;
		public BoatTab boatTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Refresh')])")
		public WebElement uIRefreshButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add Vehicle')])")
		public WebElement uIAddVehicleButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add Boat')])")
		public WebElement uIAddBoatButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Reset')])")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Back')])")
		public WebElement uIBackButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Vehicle')])")
		public WebElement uIVehicleTab;

		@FindBy(how = How.XPATH, using = "(//div[@ID='tabVehBoat']//span[contains(text(),'Boat')])")
		public WebElement uIBoatTab;

		@FindBy(how = How.ID, using = "grdVehBoatSrch")
		public WebElement uIVehicleBoatSearchResultTable;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Select IncIDent Vehicle')])")
		public WebElement uISelectIncidentVehicle;

		@FindBy(how = How.ID, using = "grdRPTPropVeh")
		public WebElement uIVehicleBoatSearchGrIDTable;

		@FindBy(how = How.ID, using = "tabVehBoat_tmpl0_UsrVeh1_txtPlateNbr")
		public WebElement uIPlateEdit;

		@FindBy(how = How.ID, using = "tabVehBoat_tmpl0_UsrVeh1_cddState_DropDown")
		public WebElement uIStateComboBox;

		@FindBy(how = How.ID, using = "tabVehBoat_tmpl0_UsrVeh1_txtVehNbr")
		public WebElement uIVehicleNumberEdit;

		@FindBy(how = How.ID, using = "radIncidenActivity_Input")
		public WebElement uIIncidentActivityInput;

		@FindBy(how = How.ID, using = "radIncidenActivity_DropDown")
		public WebElement uIIncidentActivityDropdown;

		@FindBy(how = How.ID, using = "tabVehBoat_tmpl1_UsrBoat1_txtBoatNbr")
		public WebElement uIBoatNoEdit;
	}

	public class VehicleTab {
		public WebDriver driver;

		public VehicleTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabVehBoat_tmpl0_UsrVeh1_txtPlateNbr")
		public WebElement uIPlateNumberEdit;

		@FindBy(how = How.ID, using = "tabVehBoat_tmpl0_UsrVeh1_cddState_DropDown")
		public WebElement uIStateComboBox;

		@FindBy(how = How.ID, using = "tabVehBoat_tmpl0_UsrVeh1_txtVehicleYearFrom")
		public WebElement uIYearFromEdit;

		@FindBy(how = How.ID, using = "tabVehBoat_tmpl0_UsrVeh1_txtVehicleYearTo")
		public WebElement uIYearToEdit;

		@FindBy(how = How.ID, using = "tabVehBoat_tmpl0_UsrVeh1_txtVin")
		public WebElement uIVinEdit;

		@FindBy(how = How.ID, using = "tabVehBoat_tmpl0_UsrVeh1_txtVehNbr")
		public WebElement uIVehicleNumberEdit;

		@FindBy(how = How.ID, using = "tabVehBoat_tmpl0_UsrVeh1_chkShowAll")
		public WebElement uIShowAllCheckBox;

		@FindBy(how = How.ID, using = "tabVehBoat_tmpl0_UsrVeh1_txtWTVNo")
		public WebElement uIWTVNumberEdit;

		@FindBy(how = How.ID, using = "nbrCallNo_Year")
		public WebElement uICallYearEdit;

		@FindBy(how = How.ID, using = "nbrCallNo_Number")
		public WebElement uICallNumberEdit;
	}

	public class BoatTab {
		public WebDriver driver;

		public BoatTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabVehBoat_tmpl1_UsrBoat1_txtReg")
		public WebElement uIRegistrationNumberEdit;

		@FindBy(how = How.ID, using = "tabVehBoat_tmpl1_UsrBoat1_cddState_DropDown")
		public WebElement uIStateComboBox;

		@FindBy(how = How.ID, using = "tabVehBoat_tmpl1_UsrBoat1_txtBoatYearFrom")
		public WebElement uIBoatYearFromEdit;

		@FindBy(how = How.ID, using = "tabVehBoat_tmpl1_UsrBoat1_txtBoatYearTo")
		public WebElement uIBoatYearToEdit;

		@FindBy(how = How.ID, using = "tabVehBoat_tmpl1_UsrBoat1_txtBoatHul")
		public WebElement uIBoatHullNumberEdit;
	}

	public class VehicleBoatSearchHelpWindow {

		public WebDriver driver;

		public VehicleBoatSearchHelpWindow() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New Vehicle')])")
		public WebElement uIAddNewVehicleButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New Boat')])")
		public WebElement uIAddNewBoatButton;

		@FindBy(how = How.XPATH, using = "(//div[@ID='grdVehBoatSrch'] //img[@title= 'Unchecked'])")
		public WebElement uIUncheckedCheckBox;

		@FindBy(how = How.ID, using = "grdVehBoatSrch")
		public WebElement uIResultTable;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Select Vehicle')])")
		public WebElement uISelectVehicleButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Select Boat')])")
		public WebElement uISelectBoatButton;

		@FindBy(how = How.XPATH, using = "//span[text()='Reset']")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "//span[text()='Refresh']")
		public WebElement uIRefreshButton;

		@FindBy(how = How.XPATH, using = "//span[text()='Back']")
		public WebElement uIBackButton;

		@FindBy(how = How.ID, using = "grdRPTPropVeh")
		public WebElement uIVehicleBoatSearchGrIDTable;

	}

	// Fleet Search UI Collections
	public class FleetSearch {
		public WebDriver driver;

		public FleetSearch() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Search')])")
		public WebElement uISearchButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Add New')])")
		public WebElement uIAddNewButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Reset')])")
		public WebElement uIResetButton;

		@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Back')])")
		public WebElement uIBackButton;

		@FindBy(how = How.ID, using = "DDLFleet_DropDown")
		public WebElement uIFleetIDComboBox;

		@FindBy(how = How.ID, using = "lupMake_CodeValue")
		public WebElement uIMakeEdit;

		@FindBy(how = How.ID, using = "chkIsMarked")
		public WebElement uIMarkedCheckbox;

		@FindBy(how = How.ID, using = "txtModel")
		public WebElement uIModelEdit;

		@FindBy(how = How.ID, using = "lupModel_CodeValue")
		public WebElement uILupModelEdit;

		@FindBy(how = How.ID, using = "txtVehYear")
		public WebElement uIYearEdit;

		@FindBy(how = How.ID, using = "txtVIN")
		public WebElement uIVinEdit;

		@FindBy(how = How.ID, using = "txtPONumber")
		public WebElement uIPOEdit;

		@FindBy(how = How.ID, using = "txtTag")
		public WebElement uITagEdit;

		@FindBy(how = How.ID, using = "cddvendor")
		public WebElement uIVendorComboBox;

		@FindBy(how = How.ID, using = "txtvendorref")
		public WebElement uIVendorReference;

		@FindBy(how = How.ID, using = "grdVehicleSrch")
		public WebElement uIResultTable;

		@FindBy(how = How.ID, using = "DDLFleet_CodeValue")
		public WebElement uIFleetCodeEdit;
	}

	// Fleet Entry UI Collections
	public class FleetEntry {
		public WebDriver driver;
		public FleetEntryMainTab fleetEntryMainTab;
		public MaintenanceScheduleTab maintenanceScheduleTab;
		public EquipmentSuppliesTab equipmentSuppliesTab;
		public AssignmentsTab assignmentsTab;
		public FleetEntryNotesTab fleetEntryNotesTab;
		public ActivityLogTab activityLogTab;

		public FleetEntry() {

			if ((this.fleetEntryMainTab == null)) {
				this.fleetEntryMainTab = new FleetEntryMainTab();
			}

			if ((this.maintenanceScheduleTab == null)) {
				this.maintenanceScheduleTab = new MaintenanceScheduleTab();
			}

			if ((this.equipmentSuppliesTab == null)) {
				this.equipmentSuppliesTab = new EquipmentSuppliesTab();
			}

			if ((this.assignmentsTab == null)) {
				this.assignmentsTab = new AssignmentsTab();
			}

			if ((this.activityLogTab == null)) {
				this.activityLogTab = new ActivityLogTab();
			}

			// if (Playback.driverNotExist)
			// ObjectIDentification.WindowHandle.SwitchToFrame("frmFleetNotes");

			if ((this.fleetEntryNotesTab == null)) {
				this.fleetEntryNotesTab = new FleetEntryNotesTab();
			}

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtFleetID")
		public WebElement uIFleetIDEdit;

		@FindBy(how = How.ID, using = "txtDesc")
		public WebElement uIDescribtionEdit;

		@FindBy(how = How.ID, using = "lupMake_CodeValue")
		public WebElement uIMakeEdit;

		@FindBy(how = How.ID, using = "lupMake_CodeDescription")
		public WebElement uIMakeDescriptionEdit;

		@FindBy(how = How.ID, using = "lupModel_CodeValue")
		public WebElement uIModelEdit;

		@FindBy(how = How.ID, using = "lupMake_imgBtn")
		public WebElement uIMakeLookupButton;

		@FindBy(how = How.ID, using = "lupModel_imgBtn")
		public WebElement uIModelLookupButton;

		@FindBy(how = How.ID, using = "txtVehYear")
		public WebElement uIYearEdit;

		@FindBy(how = How.ID, using = "txtVIN")
		public WebElement uIVinNumberEdit;

		@FindBy(how = How.ID, using = "cddColor1_DropDown")
		public WebElement uIColor1ComboBox;

		@FindBy(how = How.ID, using = "cddColor2_DropDown")
		public WebElement uIColor2ComboBox;

		@FindBy(how = How.ID, using = "chkIsActive")
		public WebElement uIInactiveCheckBox;

		@FindBy(how = How.ID, using = "chkIsFire")
		public WebElement uIIsFireCheckBox;

		@FindBy(how = How.ID, using = "txtInActiveDttm")
		public WebElement uIInactiveDateTime;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Main')]")
		public WebElement uIMainTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Equipment & Supplies')]")
		public WebElement uIEquipmentSuppliesTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Maintenance Schedule')]")
		public WebElement uIMaintenanceScheduleTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Activity Log')]")
		public WebElement uIActivityLogTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Assignments')]")
		public WebElement uIAssignmentsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Notes')]")
		public WebElement uINotesTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Attachments')]")
		public WebElement uIAttachmentsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Triggers')]")
		public WebElement uITriggersTab;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;
		
		@FindBy(how = How.ID, using = "imgNameFrontView")
		public WebElement uIPictureImage;
		

	}

	public class FleetEntryMainTab {
		public WebDriver driver;

		public FleetEntryMainTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabVehicle_tmpl0_CtrlusrMain_txtComments")
		public WebElement uICommentsEdit;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl0_CtrlusrMain_chkLockable")
		public WebElement uILockableCheckBox;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl0_CtrlusrMain_txtTag")
		public WebElement uITagNumberEdit;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl0_CtrlusrMain_lupStoreLoc_CodeValue")
		public WebElement uIStorageLocationEdit;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl0_CtrlusrMain_lupStoreLoc_imgBtn")
		public WebElement uIStorageLocationLookupButton;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl0_CtrlusrMain_lupStoreLoc")
		public WebElement uIStorageLocationComboBox;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl0_CtrlusrMain_cddUsageType_DropDown")
		public WebElement uIUsageTypeComboBox;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl0_CtrlusrMain_cddFuelType_DropDown")
		public WebElement uIFuelTypeComboBox;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl0_CtrlusrMain_lupVName_CodeValue")
		public WebElement uIVendorNameEdit;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl0_CtrlusrMain_txtVendorRef")
		public WebElement uIVendorReferenceEdit;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl0_CtrlusrMain_txtPONumber")
		public WebElement uIPOEdit;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl0_CtrlusrMain_lupVName_imgBtn")
		public WebElement uIVendorNameLookupButton;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl0_CtrlusrMain_chkMarked")
		public WebElement uIMarkedCheckBox;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl0_CtrlusrMain_chkTrack")
		public WebElement uITrackHourCheckbox;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl0_CtrlusrMain_imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl0_CtrlusrMain_chkLockable")
		public WebElement uILockableCheckbox;

	}

	public class MaintenanceScheduleTab {

		public WebDriver driver;

		public MaintenanceScheduleTab() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabVehicle_tmpl2_CtrlusrusrMaintenance_cddServiceType_DropDown")
		public WebElement uIServiceTypeComboBox;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl2_CtrlusrusrMaintenance_btnPrfSrv")
		public WebElement uIPerformServiceButton;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl2_CtrlusrusrMaintenance_cddPeriod_DropDown")
		public WebElement uIPeriodComboBox;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl2_CtrlusrusrMaintenance_txtMiles")
		public WebElement uIMilesEdit;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl2_CtrlusrusrMaintenance_txtHour")
		public WebElement uIHoursEdit;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl2_CtrlusrusrMaintenance_dtLastMainDt_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl2_CtrlusrusrMaintenance_txtLastMiles")
		public WebElement uIAtMilesEdit;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl2_CtrlusrusrMaintenance_txtLastHour")
		public WebElement uIAtHoursEdit;

		@FindBy(how = How.ID, using = "lupModel_CodeValue")
		public WebElement uIPropulsionEdit;

		@FindBy(how = How.XPATH, using = "//b[text()='1003 - Update Successful']")
		public WebElement uIUpdateSuccessfulLable;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl2_CtrlusrusrMaintenance_btnView")
		public WebElement uIViewMillageLogButton;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl2_CtrlusrusrMaintenance_imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl2_CtrlusrusrMaintenance_imgClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl2_CtrlusrusrMaintenance_grdMaintenace")
		public WebElement uIMaintainenceScheduleTable;

	}

	public class EquipmentSuppliesTab {

		public WebDriver driver;

		public EquipmentSuppliesTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabVehicle_tmpl1_CtrlusrEquipmentSupplies_cmdaddnewequipment")
		public WebElement uIAddNewEquipmentOrSupplyItemButton;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl1_CtrlusrEquipmentSupplies_cmdperform")
		public WebElement uIPerformEquipmentServicesButton;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl1_CtrlusrEquipmentSupplies_grdequipment_ctl00")
		public WebElement uIEquipmentSuppliesTable;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl1_CtrlusrEquipmentSupplies_chkExpandAll")
		public WebElement uIExpandCheckbox;

		@FindBy(how = How.XPATH, using = "//div[@class = 'ig_HGrIDControl igg_HGrIDControl']")
		public WebElement uIEquipmentSuppliesInnerGridTable;

		@FindBy(how = How.ID, using = "txtlength")
		public WebElement uILengthEdit;
		@FindBy(how = How.ID, using = "txtPlateST")
		public WebElement uIPlateNumberEdit;

	}

	public class AssignmentsTab {
		public WebDriver driver;

		public AssignmentsTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabVehicle_tmpl5_CtrlusrAssigned_grdAssignments")
		public WebElement uIAssignmentTable;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl5_CtrlusrAssigned_cddAction")
		public WebElement uIActionComboBox;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl5_CtrlusrAssigned_dttmStatus_Date_KPIDttmCtrl")
		public WebElement uIAssignedDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@id ='tabVehicle_tmpl5_CtrlusrAssigned_dttmStatus_Time']//input")
		public WebElement uIAssignedTimeEdit;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl5_CtrlusrAssigned_lupASGMTPFCode_CodeValue")
		public WebElement uIByCodeEdit;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl5_CtrlusrAssigned_radPersonal")
		public WebElement uIPersonnelRadioButton;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl5_CtrlusrAssigned_radDivision")
		public WebElement uIDivisionRadioButton;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl5_CtrlusrAssigned_radStation")
		public WebElement uIStationRadioButton;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl5_CtrlusrAssigned_lupEMPCode_CodeValue")
		public WebElement uIPfEdit;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl5_CtrlusrAssigned_cddDivision_DropDown")
		public WebElement uIDivisionComboBox;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl5_CtrlusrAssigned_cddSection_DropDown")
		public WebElement uISectionComboBox;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl5_CtrlusrAssigned_cddStation_DropDown")
		public WebElement uIStationComboBox;

		@FindBy(how = How.ID, using = "tabVehicle_tmpl5_CtrlusrAssigned_cddSLocation")
		public WebElement uILocationComboBox;

		@FindBy(how = How.XPATH, using = "//div[@id='tabVehicle_tmpl5_CtrlusrAssigned_grdAssignments']//td[@class='Delete_Icon_Style']")
		public WebElement uIDeleteIconGridButton;

	}

	public class FleetEntryNotesTab {
		public WebDriver driver;

		public FleetEntryNotesTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "dttmDate_Date_KPIDttmCtrl")
		public WebElement uIUpdateDateEdit;

		@FindBy(how = How.XPATH, using = "//table[@ID ='dttmDate_Time']//input")
		public WebElement uIUpdateTimeEdit;

		@FindBy(how = How.ID, using = "lupBy_CodeValue")
		public WebElement uIUpdatedByCodeEdit;

		@FindBy(how = How.ID, using = "txtNotes")
		public WebElement uICommentsTextView;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.XPATH, using = "//div[@class ='HistoryComments']")
		public WebElement uINotesTable;

	}

	public class ActivityLogTab {
		public WebDriver driver;

		public ActivityLogTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabVehicle_tmpl3_CtrlusrDamageReports_cmdaddnew")
		public WebElement uIAddNewActivityButton;

	}

	// Vehicle/Boat Entry Screen UI Collections
	public class VehicleBoatEntry {
		public WebDriver driver;

		public VehicleBoatEntry() {

			driver = Playback.driver;
			PageFactory.initElements(driver, this);

			// Properties

			if ((this.vehicleBoatEntryMainTab == null)) {
				this.vehicleBoatEntryMainTab = new VehicleBoatEntryMainTab();
			}

			if ((this.vehicleBoatEntryFlagTab == null)) {
				this.vehicleBoatEntryFlagTab = new VehicleBoatEntryFlagTab();
			}

		}

		// Fields
		public VehicleBoatEntryMainTab vehicleBoatEntryMainTab;
		public VehicleBoatEntryFlagTab vehicleBoatEntryFlagTab;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveCloseButton;

		@FindBy(how = How.ID, using = "cmdRefresh")
		public WebElement uIResetButton;

		@FindBy(how = How.ID, using = "btnAddBoat")
		public WebElement uIAddNewBoatButton;

		@FindBy(how = How.ID, using = "txtVinNbr")
		public WebElement uIVinNumberEdit;

		@FindBy(how = How.ID, using = "txtVehYear")
		public WebElement uIYearEdit;

		@FindBy(how = How.ID, using = "lupMake_CodeValue")
		public WebElement uIMakeEdit;

		@FindBy(how = How.ID, using = "lupMake_imgBtn")
		public WebElement uIMakeLookupButton;

		@FindBy(how = How.ID, using = "lupModel_CodeValue")
		public WebElement uIModelEdit;

		@FindBy(how = How.ID, using = "lupModel_imgBtn")
		public WebElement uIModelLookupButton;

		@FindBy(how = How.ID, using = "lupStyle_CodeValue")
		public WebElement uIStyleEdit;

		@FindBy(how = How.ID, using = "lupStyle_imgBtn")
		public WebElement uIStyleLookupButton;

		@FindBy(how = How.ID, using = "cddVOD_DropDown")
		public WebElement uIVODComboBox;

		@FindBy(how = How.ID, using = "txtDescription")
		public WebElement uIDescriptionEdit;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Main')]")
		public WebElement uIMainTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Flags')]")
		public WebElement uIFlagsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Notes')]")
		public WebElement uINotesTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Attachments')]")
		public WebElement uIAttachmentsTab;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Select')]")
		public WebElement uISelectButton;

		@FindBy(how = How.ID, using = "txtVehNo")
		public WebElement uIBoatEdit;

		@FindBy(how = How.ID, using = "cddInsuranceCode_DropDown")
		public WebElement uIInsuranceCompanyComboBox;

		@FindBy(how = How.ID, using = "txtInsPolicyNo")
		public WebElement uIInsurancePolicyNumberEdit;

		@FindBy(how = How.ID, using = "txtVinNbr")
		public WebElement uIBoatHullEdit;

		@FindBy(how = How.ID, using = "lupModel_CodeValue")
		public WebElement uIPropulsionEdit;

		@FindBy(how = How.ID, using = "lupModel_imgBtn")
		public WebElement uIPropulsionLookupButton;

		@FindBy(how = How.ID, using = "lupStyle_CodeValue")
		public WebElement uIMaterialEdit;

		@FindBy(how = How.ID, using = "lupStyle_imgBtn")
		public WebElement uIMaterialLookupButton;

		@FindBy(how = How.ID, using = "txtlength")
		public WebElement uILengthEdit;

		@FindBy(how = How.ID, using = "txtPlateST")
		public WebElement uIPlateNumberEdit;
		@FindBy(how = How.XPATH, using = "//td[@class = 'statusBar']/b")
		public WebElement uIBottomLeftSideStatusBar;

		@FindBy(how = How.ID, using = "lupMake_CodeDescription")
		public WebElement uIMakeDescription;

		@FindBy(how = How.ID, using = "lupModel_CodeDescription")
		public WebElement uIModelDescription;

	}

	public class VehicleBoatEntryMainTab {
		public WebDriver driver;

		public VehicleBoatEntryMainTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabPropVeh_tmpl0_UsrHistory1_txtPlateNbr")
		public WebElement uIPlateNumberEdit;

		@FindBy(how = How.ID, using = "tabPropVeh_tmpl0_UsrHistory1_cddState_DropDown")
		public WebElement uIStateComboBox;

		@FindBy(how = How.ID, using = "tabPropVeh_tmpl0_UsrHistory1_chkPlateOnly")
		public WebElement uIPlateOnlyCheckBox;

		@FindBy(how = How.ID, using = "tabPropVeh_tmpl0_UsrHistory1_txtPlateExpMonth")
		public WebElement uIPlateExpMonthEdit;

		@FindBy(how = How.ID, using = "tabPropVeh_tmpl0_UsrHistory1_txtPlateExpyear")
		public WebElement uIPlateExpYearEdit;

		@FindBy(how = How.ID, using = "tabPropVeh_tmpl0_UsrHistory1_cddPlateStatus_DropDown")
		public WebElement uIStatusComboBox;

		@FindBy(how = How.ID, using = "tabPropVeh_tmpl0_UsrHistory1_cddColor1_DropDown")
		public WebElement uIColor1ComboBox;

		@FindBy(how = How.ID, using = "tabPropVeh_tmpl0_UsrHistory1_cddColor2_DropDown")
		public WebElement uIColor2ComboBox;

		@FindBy(how = How.ID, using = "tabPropVeh_tmpl0_UsrHistory1_cddPlateType_DropDown")
		public WebElement uIPlateTypeComboBox;

		@FindBy(how = How.ID, using = "tabPropVeh_tmpl0_UsrHistory1_nmcIncident_LastName")
		public WebElement uILastNameEdit;

		@FindBy(how = How.ID, using = "tabPropVeh_tmpl0_UsrHistory1_nmcIncident_FirstName")
		public WebElement uIFirstNameEdit;

		@FindBy(how = How.ID, using = "tabPropVeh_tmpl0_UsrHistory1_nmcIncIDent_NameType")
		public WebElement uINameTypeEdit;

		@FindBy(how = How.ID, using = "tabPropVeh_tmpl0_UsrHistory1_nmcIncIDent_NameTypeID")
		public WebElement uINameTypeIDEdit;

		@FindBy(how = How.ID, using = "tabPropVeh_tmpl0_UsrHistory1_imgAddName")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabPropVeh$tmpl0$UsrHistory1$imgClearName")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "tabPropVeh_tmpl0_UsrHistory1_grdHistory")
		public WebElement uIMainTabResultTable;

		@FindBy(how = How.ID, using = "tabPropVeh_tmpl0_UsrHistory1_txtPlateNbr")
		public WebElement uIRegistrationNumberEdit;

		@FindBy(how = How.ID, using = "tabPropVeh_tmpl0_UsrHistory1_cddNameActivity_DropDown")
		public WebElement uINameActivityComboBox;

		@FindBy(how = How.ID, using = "tabPropVeh_tmpl0_UsrHistory1_nmcIncIDent_imgSrch")
		public WebElement uINameInfoIcon;
	}

	public class VehicleBoatEntryFlagTab {
		public WebDriver driver;

		public VehicleBoatEntryFlagTab() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "tabPropVeh_tmpl1_UsrFlags1_dtmEntered_Date_KPIDttmCtrl")
		public WebElement uIEnterDateEdit;

		@FindBy(how = How.ID, using = "tabPropVeh_tmpl1_UsrFlags1_dtmExpire_Date_KPIDttmCtrl")
		public WebElement uIExpiredDateEdit;

		@FindBy(how = How.ID, using = "tabPropVeh_tmpl1_UsrFlags1_lupOff_CodeValue")
		public WebElement uIEnteredByEdit;

		@FindBy(how = How.ID, using = "tabPropVeh_tmpl1_UsrFlags1_cddFlag_DropDown")
		public WebElement uIFlagComboBox;

		@FindBy(how = How.ID, using = "tabPropVeh_tmpl1_UsrFlags1_txtFlagDesc")
		public WebElement uICommentsEdit;

		@FindBy(how = How.ID, using = "tabPropVeh_tmpl1_UsrFlags1_cmdAddFlag")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "tabPropVeh_tmpl1_UsrFlags1_cmdClearFlag")
		public WebElement uIClerButton;

		@FindBy(how = How.ID, using = "tabPropVeh_tmpl1_UsrFlags1_grdFlag")
		public WebElement uIFlagTabResultTable;

	}

	// Equipment service UI Classes
	public class EquipmentService {

		public WebDriver driver;

		public EquipmentService() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(how = How.ID, using = "lupEMPCode_CodeValue")
		public WebElement uISelectedTestedByEdit;

		@FindBy(how = How.ID, using = "dtdate_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.ID, using = "txtNotes")
		public WebElement uINotesTextView;

		@FindBy(how = How.ID, using = "chkExpandAll")
		public WebElement uIExpandAllCheckbox;

		@FindBy(how = How.ID, using = "chkSelectAll")
		public WebElement uISelectAllCheckbox;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

		@FindBy(how = How.ID, using = "grdequipment_div")
		public WebElement uIEquipmentServiceTable;

		@FindBy(how = How.ID, using = "grdInvSrch")
		public WebElement uIEquipmentServiceScreenInvenSearchTable;

	}

	// Fuel Log Entry UI Classes
	public class FuelLogEntry {
		public WebDriver driver;

		public FuelLogEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddFleetID_DropDown")
		public WebElement uIFleetIDComboBox;

		@FindBy(how = How.ID, using = "GasDttmfrom_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "cmdUpdate")
		public WebElement uIUpdateMileageButton;

		@FindBy(how = How.ID, using = "PGasDttm_Date_KPIDttmCtrl")
		public WebElement uIPopupDateEdit;

		@FindBy(how = How.ID, using = "//span[@ID ='PGasDttm_divDateTime'//table[@ID ='PGasDttm_Time'//input")
		public WebElement uIPopupTimeEdit;

		@FindBy(how = How.ID, using = "txtQuan")
		public WebElement uIPopupQuantityEdit;

		@FindBy(how = How.ID, using = "txtMileage")
		public WebElement uIPopupCurrentMileageEdit;

		@FindBy(how = How.ID, using = "cmdSavePanel")
		public WebElement uIPopupSaveButton;

		@FindBy(how = How.ID, using = "cmdSavePanel")
		public WebElement uIPopupCancelButton;

		@FindBy(how = How.ID, using = "lblmilVM")
		public WebElement uIMileageText;

		@FindBy(how = How.ID, using = "cmdSaveNClose")
		public WebElement uISaveNCloseButton;

		@FindBy(how = How.ID, using = "txtOil")
		public WebElement uIOilEdit;

		@FindBy(how = How.ID, using = "txtHours")
		public WebElement uIHoursEdit;

	}

	// Mileage Log Entry
	public class MileageLogEntry {

		public WebDriver driver;

		public MileageLogEntry() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "cddFleetID_DropDown")
		public WebElement uIFleetIDComboBox;

		@FindBy(how = How.ID, using = "cmdSearch")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "grdGasUsage")
		public WebElement uIMileageLogEntryTable;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

	}

	// Vehicle Make Model UI Classes
	public class VehicleMakeModel {
		public WebDriver driver;

		public VehicleMakeModel() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "lupMake_CodeValue")
		public WebElement uIMakeEdit;

		@FindBy(how = How.ID, using = "txtModel")
		public WebElement uIModelCodeEdit;

		@FindBy(how = How.ID, using = "txtModelDesc")
		public WebElement uIModelDescriptionEdit;

		@FindBy(how = How.ID, using = "imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "grdVehicleMM")
		public WebElement uIVehicleMakeModelTable;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

	}

	// Tow Classes
	public class TowRotation {
		public WebDriver driver;

		public TowRotation() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "txtNoOfPeriods")
		public WebElement uINoOfPeriodsEdit;

		@FindBy(how = How.ID, using = "chkRotnOrder")
		public WebElement uIRotationCycleCheckBox;

		@FindBy(how = How.ID, using = "cddRotationPeriod_DropDown")
		public WebElement uIRotationPeriodComboBox;

		@FindBy(how = How.ID, using = "dtOrderStartDate_KPIDttmCtrl")
		public WebElement uIDateEdit;

		@FindBy(how = How.ID, using = "cddPatrolArea_DropDown")
		public WebElement uIPatrolAreaComboBox;

		@FindBy(how = How.ID, using = "cddEquipType")
		public WebElement uIEquipmentTypeComboBox;

		@FindBy(how = How.ID, using = "cddWrecker")
		public WebElement uIVendorComboBox;

		@FindBy(how = How.ID, using = "cddPosition_DropDown")
		public WebElement uIPositionComboBox;

		@FindBy(how = How.ID, using = "chkRotnOrder")
		public WebElement uIRotationCheckBox;

		@FindBy(how = How.ID, using = "imgAdd")
		public WebElement uIAddButton;

		@FindBy(how = How.ID, using = "imgClear")
		public WebElement uIClearButton;

		@FindBy(how = How.ID, using = "grdPosition")
		public WebElement uITowRotationTable;

		@FindBy(how = How.ID, using = "cmdSave")
		public WebElement uISaveButton;

		@FindBy(how = How.ID, using = "cmdPrint")
		public WebElement uIPrintButton;
	}

	public class TowVendor {
		public TowVendor() {
			PageFactory.initElements(Playback.driver, this);
		}

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search')]")
		public WebElement uISearchButton;

		@FindBy(how = How.ID, using = "tabVendorSrch_tmpl0_ctrlUsrVendor_txtVenCode")
		public WebElement uIVendorCodeEdit;

		@FindBy(how = How.ID, using = "grdEquipments")
		public WebElement uITowVendorResultTable;

	}

	// Vehicle Flag Detail Class
	public class VehicleFlagDetailsScreen {
		public WebDriver driver;

		public VehicleFlagDetailsScreen() {
			driver = Playback.driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.ID, using = "grdFlag")
		public WebElement uIVehicleFlagDetailTable;

	}

}
