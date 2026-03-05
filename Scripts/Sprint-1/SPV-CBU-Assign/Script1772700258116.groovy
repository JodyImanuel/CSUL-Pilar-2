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

WebUI.callTestCase(findTestCase('Sprint-1/Login-SPV-CBU'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/Sprint1/Page_ApplicationsCatalog/span_Risk Control Unit Application'), 
    10)

WebUI.click(findTestObject('Object Repository/Sprint1/Page_ApplicationsCatalog/span_Risk Control Unit Application'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Sprint1/Page_Dashboard/span_Dashboard'), 10)

WebUI.click(findTestObject('Object Repository/Sprint1/Page_Dashboard/div_Monitoring  Review'))

WebUI.click(findTestObject('Object Repository/Sprint1/Page_Dashboard/div_Operasional Cabang'))

WebUI.click(findTestObject('Object Repository/Sprint1/Page_Dashboard/a_Petty Cash'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Sprint1/Page_PettyCash/span_PEMERIKSAAN PETTY CASH KANTOR CABANG'), 
    10)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Page_PettyCash/select_Pilih OpsiSEMARANGSURABAYAJAKARTA GR_05f5b9_1'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Page_PettyCash/select_Pilih OpsiBaruPenugasanDalam ProsesM_e7f10e'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Sprint1/Page_PettyCash/button_Cari'))

WebUI.click(findTestObject('Object Repository/Sprint1/Page_PettyCash/input_Action_b3-b1-l1_0-152_0-Check'))

WebUI.click(findTestObject('Object Repository/Sprint1/Page_PettyCash/button_Assign'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Sprint1/Page_PettyCash/div_Apakah anda yakin ingin melakukan penug_f3cfac'), 
    0)

WebUI.click(findTestObject('Object Repository/Sprint1/Page_PettyCash/button_Assign_1'))

WebUI.rightClick(findTestObject('Object Repository/Sprint1/Page_PettyCash/div_Penugasan berhasil di-Assign'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Sprint1/Page_PettyCash/div_Penugasan berhasil di-Assign_1'), 
    0)

