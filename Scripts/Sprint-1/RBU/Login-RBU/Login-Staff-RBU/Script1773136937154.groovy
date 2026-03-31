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

WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://sakti-sandbox.csulfinance.com/CSUL_RCU/')

WebUI.navigateToUrl('https://sakti-test.csulfinance.com/CSULFoundation_Login/Login?RedirectURL=https%3A%2F%2Fsakti-test.csulfinance.com%2F')

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('Object Repository/Sprint1/Login/SPV-Login/Page_Login/input_Username_Input_UsernameVal'), 
    10)

WebUI.setText(findTestObject('Object Repository/Sprint1/Login/SPV-Login/Page_Login/input_Username_Input_UsernameVal'), 'pandu.sastra')

WebUI.setEncryptedText(findTestObject('Object Repository/Sprint1/Login/SPV-Login/Page_Login/input_Password_Input_PasswordVal'), 
    'DKZg8gTnVzw=')

WebUI.delay(15)

WebUI.click(findTestObject('Object Repository/Sprint1/Login/SPV-Login/Page_Login/button_Login'))

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://sakti-sandbox.csulfinance.com/CSUL_RCU/')

not_run: WebUI.maximizeWindow()

not_run: WebUI.waitForElementPresent(findTestObject('Object Repository/Sprint1/Login/SPV-Login/Page_Login/input_Username_Input_UsernameVal'), 
    10)

not_run: WebUI.setText(findTestObject('Object Repository/Sprint1/Login/SPV-Login/Page_Login/input_Username_Input_UsernameVal'), 
    'sahar.arief')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Sprint1/Login/SPV-Login/Page_Login/input_Password_Input_PasswordVal'), 
    'DKZg8gTnVzw=')

not_run: WebUI.delay(15)

not_run: WebUI.click(findTestObject('Object Repository/Sprint1/Login/SPV-Login/Page_Login/button_Login'))

