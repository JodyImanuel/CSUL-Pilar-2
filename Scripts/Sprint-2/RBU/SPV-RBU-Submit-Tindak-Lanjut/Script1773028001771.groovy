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

WebUI.callTestCase(findTestCase('Sprint-1/RBU/Login-RBU/Login-SPV-RBU'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('Object Repository/Sprint2/RBU/SPV-RBU-Submit-Tindak-Lanjut/Page_ApplicationsCatalog/div_Risk Control Unit ApplicationRCU Apps c_31ac98'))

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/SPV-RBU-Submit-Tindak-Lanjut/Page_Dashboard/div_Tindak Lanjut'))

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/SPV-RBU-Submit-Tindak-Lanjut/Page_Dashboard/div_Operasional Cabang'))

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/SPV-RBU-Submit-Tindak-Lanjut/Page_Dashboard/a_Utilitas  Fasilitas Kantor'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/RBU/SPV-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacility/select_Pilih OpsiBANDUNG ABU 1SURABAYA ABU _aaf35c'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/SPV-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacility/button_Cari'))

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/SPV-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacility/button_Tindak Lanjut'))

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/SPV-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/div_Ruang Server_osui-accordion-item__icon _bc4e35'))

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/SPV-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/button_Tindak Lanjut'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/RBU/SPV-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityPersetujuan/select_Select a categorySelesaiSedang Berja_127797'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Sprint2/RBU/SPV-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityPersetujuan/textarea_Catatan_b3-l1-353_0-b2-TextArea_Remarks'), 
    'Done')

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/SPV-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityPersetujuan/button_Submit'))

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/SPV-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/div_Ruang Server_osui-accordion-item__icon _bc4e35'))

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/SPV-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/button_Tindak Lanjut_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/RBU/SPV-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityPersetujuan/select_Select a categorySelesaiSedang Berja_127797_1'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Sprint2/RBU/SPV-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityPersetujuan/textarea_Catatan_b3-l1-725_0-b2-TextArea_Remarks'), 
    'Done')

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/SPV-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityPersetujuan/button_Submit'))

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/SPV-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/button_Tindak Lanjut_2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/RBU/SPV-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityPersetujuan/select_Select a categorySelesaiSedang Berja_127797_2'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Sprint2/RBU/SPV-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityPersetujuan/textarea_Catatan_b3-l1-1475_0-b2-TextArea_Remarks'), 
    'Done')

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/SPV-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityPersetujuan/button_Submit'))

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/SPV-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/div_Ruang Server_osui-accordion-item__icon _bc4e35'))

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/SPV-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/button_Tindak Lanjut'))

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/SPV-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityPersetujuan/button_Lihat Tanggapan'))

WebUI.delay(5)

