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

WebUI.doubleClick(findTestObject('Object Repository/Sprint2/CBU/PIC-CBU-Submit-Tindak-Lanjut/Page_ApplicationsCatalog/div_Risk Control Unit ApplicationRCU Apps c_31ac98'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/PIC-CBU-Submit-Tindak-Lanjut/Page_Dashboard/div_Tindak Lanjut'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/PIC-CBU-Submit-Tindak-Lanjut/Page_Dashboard/div_Operasional Cabang'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/PIC-CBU-Submit-Tindak-Lanjut/Page_Dashboard/a_Utilitas  Fasilitas Kantor'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/CBU/PIC-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacility/select_Pilih OpsiCorporate Business UnitRet_46a7ca'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/CBU/PIC-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacility/select_Pilih OpsiBALIKPAPANBANJARMASINJAKAR_8fa0d7'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/CBU/PIC-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacility/select_Pilih OpsiMenunggu PersetujuanDikemb_1812a2'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/PIC-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacility/button_Cari'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/PIC-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacility/button_Tindak Lanjut'))

WebUI.click(findTestObject('Sprint2/CBU/ENV-DEV/PIC-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/a_View Detail'))

WebUI.setText(findTestObject('Sprint2/CBU/ENV-DEV/PIC-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/input_Tenggat Waktu Penyelesaian_b3-b3-b3-b_9a858d'), 
    '29-04-2026')

WebUI.setText(findTestObject('Sprint2/CBU/ENV-DEV/PIC-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/input_Tindak Lanjut_b3-b3-b3-b4-TindakLanjut'), 
    'Done, tolong di cek kembali')

WebUI.click(findTestObject('Sprint2/CBU/ENV-DEV/PIC-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/button_Unggah'))

WebUI.uploadFile(findTestObject('Sprint2/CBU/ENV-DEV/PIC-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/div_Drag  drop files orBrowseSupported form_12d9d4'), 
    Lorem1)

WebUI.click(findTestObject('Sprint2/CBU/ENV-DEV/PIC-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/button_Simpan'))

WebUI.click(findTestObject('Sprint2/CBU/ENV-DEV/PIC-CBU-Submit-Tindak-Lanjut/Page_TindakLanjutUtilityFacilityDetail/button_Simpan_1'))

