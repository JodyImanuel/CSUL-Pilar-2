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

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/div_Depan Kantor_osui-accordion-item__icon _8b3719'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/a_View Detail'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/select_Pilih OpsiAdaTidak Ada'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/select_Pilih OpsiBaikRusak'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/button_Unggah'))

WebUI.uploadFile(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/div_Drag  drop files orBrowseSupported form_3a2f15'), 
    Lorem1)

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/button_Simpan_1'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/div_Koridor_osui-accordion-item__icon osui-_df74cc'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/a_View Detail_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/select_Pilih OpsiAdaTidak Ada'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/select_Pilih OpsiBaikRusak'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/button_Unggah'))

WebUI.uploadFile(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/div_Drag  drop files orBrowseSupported form_3a2f15'), 
    Lorem2)

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/button_Simpan_1'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/div_Ruang Admin_osui-accordion-item__icon o_e07bf6'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/a_View Detail_2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/select_Pilih OpsiAdaTidak Ada'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/select_Pilih OpsiBaikRusak'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/button_Unggah'))

WebUI.uploadFile(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/div_Drag  drop files orBrowseSupported form_3a2f15'), 
    Lorem2)

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/button_Simpan_1'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/div_Ruang BM_osui-accordion-item__icon osui_988048'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/a_View Detail_3'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/select_Pilih OpsiAdaTidak Ada'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/select_Pilih OpsiBaikRusak'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/button_Unggah'))

WebUI.uploadFile(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/div_Drag  drop files orBrowseSupported form_3a2f15'), 
    Lorem1)

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/button_Simpan_1'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/div_Ruang Brankas_osui-accordion-item__icon_4c73a9'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/a_View Detail_4'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/select_Pilih OpsiAdaTidak Ada'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/select_Pilih OpsiBaikRusak'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/button_Unggah'))

WebUI.uploadFile(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/div_Drag  drop files orBrowseSupported form_3a2f15'), 
    Lorem2)

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/Staff-CBU-Assign-Task/Page_MonitoringReviewUtilityFacilityDetail/button_Simpan_1'))

WebUI.delay(3)

