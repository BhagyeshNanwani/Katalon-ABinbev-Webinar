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

def response = WS.sendRequest(findTestObject('Calculator SOAP service/SOAP Addition'))

//WS.verifyResponseStatusCode(response, 200)

def num1 = WS.getElementPropertyValue(response, 'AddResponse.AddResult' )

System.out.println("Result of Addition Is: "+num1);

response = WS.sendRequest(findTestObject('Calculator SOAP service/SOAP Divison'))

def num2 = WS.getElementPropertyValue(response, 'DivideResponse.DivideResult' )

System.out.println("Result of Division Is: " +num2);

//WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Calculator SOAP service/SOAP Multiplication', [num1 : num1 , num2 : num2]))

//WS.verifyResponseStatusCode(response, 200)

def multiplyResult = WS.getElementPropertyValue(response, 'MultiplyResponse.MultiplyResult' )

System.out.println("Result of Multiplication Is :"+multiplyResult);

response = WS.sendRequest(findTestObject('Calculator SOAP service/SOAP Subtraction'))

WS.verifyResponseStatusCode(response, 200)

