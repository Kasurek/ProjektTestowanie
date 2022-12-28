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


/* uruchomienie przeglądarki */

WebUI.openBrowser(GlobalVariable.url2)

WebUI.maximizeWindow()

/* przejscie do strony rejestracji */

WebUI.waitForElementClickable(findTestObject('Object Repository/REGISTRATION/MAIN_PAGE/btn_register'), 200)

WebUI.click(findTestObject('Object Repository/REGISTRATION/MAIN_PAGE/btn_register'))

/* wypelnienie formularza rejestracji */

WebUI.setText(findTestObject('Object Repository/REGISTRATION/REGISTRATION_PAGE/inp_fname'), fname)

WebUI.setText(findTestObject('Object Repository/REGISTRATION/REGISTRATION_PAGE/inp_lname'), lname)

WebUI.setText(findTestObject('Object Repository/REGISTRATION/REGISTRATION_PAGE/inp_address'), address)

WebUI.setText(findTestObject('Object Repository/REGISTRATION/REGISTRATION_PAGE/inp_city'), city)

WebUI.setText(findTestObject('Object Repository/REGISTRATION/REGISTRATION_PAGE/inp_state'), state)

WebUI.setText(findTestObject('Object Repository/REGISTRATION/REGISTRATION_PAGE/inp_zip'), zip)

WebUI.setText(findTestObject('Object Repository/REGISTRATION/REGISTRATION_PAGE/inp_phone'), phone)

WebUI.setText(findTestObject('Object Repository/REGISTRATION/REGISTRATION_PAGE/inp_ssn'), ssn)

WebUI.setText(findTestObject('Object Repository/REGISTRATION/REGISTRATION_PAGE/inp_username'), username)

WebUI.setText(findTestObject('Object Repository/REGISTRATION/REGISTRATION_PAGE/inp_password'), password)

WebUI.setText(findTestObject('Object Repository/REGISTRATION/REGISTRATION_PAGE/inp_confirm_password'), password_confirmation)

/* zatwierdzenie formularza */

WebUI.click(findTestObject('Object Repository/REGISTRATION/REGISTRATION_PAGE/btn_register'))

/* sprawdzenie zwroconego komunikatu bledu */

String register_error_msg = WebUI.getText(findTestObject('Object Repository/REGISTRATION/REGISTRATION_PAGE/str_errorline'))

assert error_message == register_error_msg

/* zamkniecie przegladarki */

WebUI.closeBrowser()