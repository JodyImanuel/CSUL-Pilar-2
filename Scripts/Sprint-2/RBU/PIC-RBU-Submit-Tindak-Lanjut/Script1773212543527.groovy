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

WebUI.callTestCase(findTestCase('Sprint-1/RBU/Login-RBU/Login-PIC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('Object Repository/Sprint1/RBU/RBU-PIC-Submit-Tindak-Lanjut/Page_ApplicationsCatalog/div_Risk Control Unit ApplicationRCU Apps c_31ac98'))

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/PIC-RBU-Submit-Tindak-Lanjut/Page_Dashboard/div_Tindak Lanjut'))

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/PIC-RBU-Submit-Tindak-Lanjut/Page_Dashboard/div_Operasional Cabang'))

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/PIC-RBU-Submit-Tindak-Lanjut/Page_Dashboard/a_Utilitas  Fasilitas Kantor'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/RBU/PIC-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacility/select_Pilih OpsiCorporate Business UnitRet_46a7ca'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/RBU/PIC-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacility/select_Pilih OpsiBANDUNG ABU 1SURABAYA ABU _aaf35c'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/PIC-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacility/button_Cari'))

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/PIC-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacility/button_Tindak Lanjut'))

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/PIC-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/div_Ruang Server_osui-accordion-item__icon _bc4e35'))

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/PIC-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/a_View Detail'))

WebUI.setText(findTestObject('Object Repository/Sprint2/RBU/PIC-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/input_Tenggat Waktu Penyelesaian_b3-b3-b2-l_cf3a97'), 
    '15-03-2026')

WebUI.setText(findTestObject('Object Repository/Sprint2/RBU/PIC-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/input_Tindak Lanjut_b3-b3-b2-l1-122_0-b20-b_be9f00'), 
    'Done')

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/PIC-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/button_Unggah'))

WebUI.uploadFile(findTestObject('Object Repository/Sprint2/RBU/PIC-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/div_Drag  drop files orBrowseSupported form_12d9d4'), 
    Lorem1)

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/PIC-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/PIC-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/button_Simpan_1'))

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/PIC-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/a_View Detail_1'))

WebUI.setText(findTestObject('Object Repository/Sprint2/RBU/PIC-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/input_Tenggat Waktu Penyelesaian_b3-b3-b2-l_cf3a97_1'), 
    '15-03-2026')

WebUI.setText(findTestObject('Object Repository/Sprint2/RBU/PIC-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/input_Tindak Lanjut_b3-b3-b2-l1-122_0-b20-b_be9f00_1'), 
    'Done')

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/PIC-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/button_Unggah'))

WebUI.uploadFile(findTestObject('Object Repository/Sprint2/RBU/PIC-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/div_Drag  drop files orBrowseSupported form_12d9d4_1'), 
    Lorem1)

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/PIC-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/button_Simpan_2'))

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/PIC-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/button_Simpan_1'))

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/PIC-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/a_View Detail_2'))

WebUI.setText(findTestObject('Object Repository/Sprint2/RBU/PIC-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/input_Tenggat Waktu Penyelesaian_b3-b3-b3-b_9a858d'), 
    '15-03-2026')

WebUI.setText(findTestObject('Object Repository/Sprint2/RBU/PIC-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/input_Tindak Lanjut_b3-b3-b3-b4-TindakLanjut'), 
    'Done')

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/PIC-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/button_Unggah_1'))

WebUI.uploadFile(findTestObject('Object Repository/Sprint2/RBU/PIC-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/div_Drag  drop files orBrowseSupported form_12d9d4_2'), 
    Lorem1)

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/PIC-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/button_Simpan_2'))

WebUI.click(findTestObject('Object Repository/Sprint2/RBU/PIC-RBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/button_Simpan_3'))

WebUI.delay(5)

