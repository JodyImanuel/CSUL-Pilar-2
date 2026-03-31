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

WebUI.doubleClick(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Persetujuan/Page_ApplicationsCatalog/div_Risk Control Unit ApplicationRCU Apps c_31ac98'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Persetujuan/Page_Dashboard/div_Persetujuan'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Persetujuan/Page_Dashboard/div_Operasional Cabang'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Persetujuan/Page_Dashboard/a_Utilitas  Fasilitas Kantor'))

WebUI.setText(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Persetujuan/Page_PersetujuanUtilityFacility/input_Tanggal Penugasan_b3-b1-b1-StartDate'), 
    '23-02-2026')

WebUI.setText(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Persetujuan/Page_PersetujuanUtilityFacility/input__b3-b1-b1-EndDate'), 
    '23-02-2026')

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Persetujuan/Page_PersetujuanUtilityFacility/select_Pilih OpsiBALIKPAPANBANJARMASINJAKAR_8fa0d7'), 
    '14', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Persetujuan/Page_PersetujuanUtilityFacility/select_Pilih OpsiMENUNGGU PERSETUJUANDISETU_7743d1'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Persetujuan/Page_PersetujuanUtilityFacility/button_Cari'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Persetujuan/Page_PersetujuanUtilityFacility/button_Persetujuan'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Persetujuan/Page_PersetujuanUtilityFacilityDetail/select_Pilih OpsiDISETUJUIDIKEMBALIKAN'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Persetujuan/Page_PersetujuanUtilityFacilityDetail/textarea_Catatan_b3-b1-b4-TextArea_Remarks'), 
    'Done, Approve')

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Persetujuan/Page_PersetujuanUtilityFacilityDetail/button_Submit'))

