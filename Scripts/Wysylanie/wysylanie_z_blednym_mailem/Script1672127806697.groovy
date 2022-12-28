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

WebUI.openBrowser(GlobalVariable.url1)

WebUI.maximizeWindow()

/* wprowadzenie danych do formularza */

WebUI.setText(findTestObject('Object Repository/MESSAGE_PAGE/inp_name'), name)

WebUI.setText(findTestObject('Object Repository/MESSAGE_PAGE/inp_mail'), mail)

WebUI.setText(findTestObject('Object Repository/MESSAGE_PAGE/inp_phone'), phone)

WebUI.setText(findTestObject('Object Repository/MESSAGE_PAGE/inp_subject'), subject)

WebUI.setText(findTestObject('Object Repository/MESSAGE_PAGE/inp_message'), message)

/* Wyslanie wiadomosci formularzem */

WebUI.click(findTestObject('Object Repository/MESSAGE_PAGE/btn_submit'))

/* Weryfikacja błędu */

String site_error_msg = WebUI.getText(findTestObject('Object Repository/MESSAGE_PAGE/str_errorline'))

assert error_msg == site_error_msg

/* zamkniecie przeglądarki */
WebUI.closeBrowser()