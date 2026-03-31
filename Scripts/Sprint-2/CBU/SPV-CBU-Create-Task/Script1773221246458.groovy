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

WebUI.callTestCase(findTestCase('Sprint-1/Login-CBU/Login-SPV-CBU'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('Object Repository/Sprint1/RBU/SPV-Create-Task/Page_ApplicationsCatalog/div_Risk Control Unit ApplicationRCU Apps c_31ac98'))

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/SPV-RBU-Create-Task/Page_Dashboard/div_Monitoring  Review'))

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/SPV-RBU-Create-Task/Page_Dashboard/div_Operasional Cabang'))

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/SPV-RBU-Create-Task/Page_Dashboard/a_Utilitas  Fasilitas Kantor'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Create-Task/Page_MonitoringReviewUtilityFacility/button_Assign'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Create-Task/Page_MonitoringReviewUtilityFacility/select_Pilih OpsiSEMARANGSURABAYAJAKARTA GR_05f5b9'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Create-Task/Page_MonitoringReviewUtilityFacility/select_Pilih OpsiIQBAL PUTRA TAWAKALGIANDI _5675aa'), 
    '0', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Create-Task/Page_MonitoringReviewUtilityFacility/select_Tugas HarianTugas Khusus'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Create-Task/Page_MonitoringReviewUtilityFacility/button_Assign_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Create-Task/Page_MonitoringReviewUtilityFacility/select_Pilih OpsiSEMARANGSURABAYAJAKARTA GR_05f5b9_1'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Create-Task/Page_MonitoringReviewUtilityFacility/button_Cari'))

