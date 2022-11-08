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

Mobile.startApplication('cloud:com.experitest.ExperiBank/.LoginActivity', true)

Mobile.setText(findTestObject('Object Repository/Experibank Demo Application/android.widget.EditText - Username'), 'Bhagyesh Nanwani', 
    0)

Mobile.setText(findTestObject('Object Repository/Experibank Demo Application/android.widget.EditText - Password'), 'ThisIsNotMyPassword', 
    0)

Mobile.tap(findTestObject('Object Repository/Experibank Demo Application/android.widget.Button - Login'), 0)

Mobile.tap(findTestObject('Object Repository/Experibank Demo Application/android.widget.Button - Close'), 0)

Mobile.clearText(findTestObject('Object Repository/Experibank Demo Application/android.widget.EditText - Bhagyesh Nanwani'), 
    0)

Mobile.setText(findTestObject('Experibank Demo Application/android.widget.EditText - Username'), 'company', 0)

Mobile.clearText(findTestObject('Object Repository/Experibank Demo Application/android.widget.EditText -'), 0)

Mobile.setText(findTestObject('Experibank Demo Application/android.widget.EditText - Password'), 'company', 0)

Mobile.tap(findTestObject('Experibank Demo Application/android.widget.Button - Login'), 0)

Mobile.tap(findTestObject('Object Repository/Experibank Demo Application/android.widget.Button - Make Payment'), 0)

Mobile.setText(findTestObject('Object Repository/Experibank Demo Application/android.widget.EditText - Phone'), '9029134768', 
    0)

Mobile.setText(findTestObject('Object Repository/Experibank Demo Application/android.widget.EditText - Name'), 'Bhagyesh', 
    0)

Mobile.setText(findTestObject('Object Repository/Experibank Demo Application/android.widget.EditText - Amount'), '100000', 
    0)

Mobile.setText(findTestObject('Object Repository/Experibank Demo Application/android.widget.EditText - Country'), 'INDIA', 
    0)

Mobile.tap(findTestObject('Object Repository/Experibank Demo Application/android.widget.Button - Cancel'), 0)

Mobile.tap(findTestObject('Object Repository/Experibank Demo Application/android.widget.Button - Logout'), 0)

Mobile.closeApplication()

