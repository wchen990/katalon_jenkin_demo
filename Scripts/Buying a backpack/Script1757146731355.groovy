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

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Swag Labs_login_credentials_wrap-inner'))

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_user-name'), 'standard_user')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_password'), '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Swag Labs_login_credentials'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Accepted usernames are_login_password'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Accepted usernames are_login_password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Swag Labs_login_wrapper-inner'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_login-button'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_29.99_add-to-cart-sauce-labs-backpack'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_Swag Labs_shopping_cart_link'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Continue Shopping_checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_first-name'), 'John')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_last-name'), 'Doe')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Checkout Your Information_checkout_info'))

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_postal-code'), '123456')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Cancel_continue'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Cancel_finish'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Your order has been dispatched, and _4011f3'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_About_react-burger-menu-btn'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_About_logout_sidebar_link'))

WebUI.closeBrowser()

