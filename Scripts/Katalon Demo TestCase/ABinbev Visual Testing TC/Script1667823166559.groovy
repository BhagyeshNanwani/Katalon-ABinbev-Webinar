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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.ab-inbev.com/investors/document-search/')

WebUI.click(findTestObject('null'))

WebUI.selectOptionByValue(findTestObject('null'), 
    'IN', true)

WebUI.selectOptionByValue(findTestObject('null'), 
    '11', true)

WebUI.selectOptionByValue(findTestObject('null'), 
    '22', true)

WebUI.selectOptionByValue(findTestObject('null'), 
    '1998', true)

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 
    '2021')

WebUI.delay(5)

WebUI.click(findTestObject('null'))

WebUI.delay(5)

WebUI.takeFullPageScreenshotAsCheckpoint('DocumentPage')

WebUI.closeBrowser()

