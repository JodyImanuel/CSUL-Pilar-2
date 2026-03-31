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

WebUI.doubleClick(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Assign-PIC/Page_ApplicationsCatalog/div_Risk Control Unit ApplicationRCU Apps c_31ac98'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Assign-PIC/Page_Dashboard/div_Tindak Lanjut'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Assign-PIC/Page_Dashboard/div_Operasional Cabang'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Assign-PIC/Page_Dashboard/a_Utilitas  Fasilitas Kantor'))

WebUI.setText(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Assign-PIC/Page_TindakLanjutUtilityFacility/input_Tanggal Penugasan_b3-b1-b1-StartDate'), 
    '23-02-2026')

WebUI.setText(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Assign-PIC/Page_TindakLanjutUtilityFacility/input__b3-b1-b1-EndDate'), 
    '23-02-2026')

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Assign-PIC/Page_TindakLanjutUtilityFacility/select_Pilih OpsiBALIKPAPANBANJARMASINJAKAR_8fa0d7'), 
    '14', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Assign-PIC/Page_TindakLanjutUtilityFacility/select_Pilih OpsiMenunggu PersetujuanDikemb_1812a2'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Assign-PIC/Page_TindakLanjutUtilityFacility/button_Cari'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Assign-PIC/Page_TindakLanjutUtilityFacility/button_Tindak Lanjut'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Assign-PIC/Page_TindakLanjutUtilityFacilityDetail/div_Ruang Admin_osui-accordion-item__icon o_e07bf6'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Assign-PIC/Page_TindakLanjutUtilityFacilityDetail/input_Action_b3-b2-l2-532_0-l2_0-534_0-Chec_658f34'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Assign-PIC/Page_TindakLanjutUtilityFacilityDetail/button_Kirim Tindak lanjut'))

WebUI.setText(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Assign-PIC/Page_TindakLanjutUtilityFacilityDetail/input_Nama Karyawan_b3-b2-b13-b2-NamaKaryawan'), 
    'Fatimah AZ')

WebUI.setText(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Assign-PIC/Page_TindakLanjutUtilityFacilityDetail/input_Jabatan Karyawan_b3-b2-b13-b2-NamaKaryawan2'), 
    'IT Business Partner')

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Assign-PIC/Page_TindakLanjutUtilityFacilityDetail/button_Cari'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Assign-PIC/Page_TindakLanjutUtilityFacilityDetail/input_Tambah_b3-b2-b13-l1_0-562_0-IsPICUtama'))

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Assign-PIC/Page_TindakLanjutUtilityFacilityDetail/button_Kirim Tindak Lanjut (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Assign-PIC/Page_TindakLanjutUtilityFacilityDetail/div_Apakah Anda yakin ingin mengirimkan tin_b488dd'), 
    5)

WebUI.click(findTestObject('Object Repository/Sprint2/CBU/SPV-CBU-Assign-PIC/Page_TindakLanjutUtilityFacilityDetail/button_Kirim Tindak Lanjut_1'))

