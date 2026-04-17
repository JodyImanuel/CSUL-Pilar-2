import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Sprint-1/Login-CBU/Login-Staff-CBU'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_ApplicationsCatalog/div_Risk Control Unit ApplicationRCU Apps c_31ac98'), 
    20)

WebUI.doubleClick(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_ApplicationsCatalog/div_Risk Control Unit ApplicationRCU Apps c_31ac98'))

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/Staff-RBU-Assign/Page_Dashboard/div_Monitoring  Review'))

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/Staff-RBU-Assign/Page_Dashboard/div_Operasional Cabang'))

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/Staff-RBU-Assign/Page_Dashboard/a_Utilitas  Fasilitas Kantor'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacility/select_Pilih OpsiSEMARANGSURABAYAJAKARTA GR_05f5b9'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Sprint2/Another-Object/Page_MonitoringReviewUtilityFacility/select_Pilih OpsiBaruDalam ProsesMenunggu PersetujuanDisetujuiDikembalikanTidak Selesai'), 
    '1', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacility/select_Pilih OpsiBaruDalam ProsesMenunggu P_427f57_1'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacility/button_Cari_1'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacility/button_Pemeriksaan'))

WebUI.click(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/a_View Detail_13'))

WebUI.selectOptionByValue(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/select_Pilih OpsiAdaTidak Ada'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/select_Status Perizinan'), 
    '0', false)

WebUI.click(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/button_Unggah'))

WebUI.uploadFile(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/div_Drag  drop files orBrowseSupported form_3a2f15'), 
    Lorem1)

WebUI.click(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/button_Simpan'))

WebUI.click(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/button_Simpan_1'))

WebUI.click(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/a_View Detail_14'))

WebUI.selectOptionByValue(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/select_Pilih OpsiAdaTidak Ada'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/select_Status Perizinan'), 
    '0', false)

WebUI.click(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/button_Unggah'))

WebUI.uploadFile(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/div_Drag  drop files orBrowseSupported form_3a2f15'), 
    Lorem1)

WebUI.click(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/button_Simpan'))

WebUI.click(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/button_Simpan_1'))

WebUI.click(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/a_View Detail_16'))

WebUI.selectOptionByValue(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/select_Pilih OpsiAdaTidak Ada'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/select_Status Perizinan'), 
    '0', false)

WebUI.click(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/button_Unggah'))

WebUI.uploadFile(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/div_Drag  drop files orBrowseSupported form_3a2f15'), 
    Lorem1)

WebUI.click(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/button_Simpan'))

WebUI.click(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/button_Simpan_1'))

WebUI.click(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/a_View Detail_17'))

WebUI.selectOptionByValue(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/select_Pilih OpsiAdaTidak Ada'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/select_Status Perizinan'), 
    '0', false)

WebUI.click(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/button_Unggah'))

WebUI.uploadFile(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/div_Drag  drop files orBrowseSupported form_3a2f15'), 
    Lorem1)

WebUI.click(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/button_Simpan'))

WebUI.click(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/button_Simpan_1'))

WebUI.click(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/button_Submit'))

WebUI.click(findTestObject('Sprint2/CBU/ENV-DEV/Staff-CBU-Assign-And-Submit/Page_MonitoringReviewUtilityFacilityDetail/button_Submit_1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

