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
import static org.assertj.core.api.Assertions.*
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.webservice.verification.WSResponseManager as WSResponseManager
import groovy.json.JsonSlurper as JsonSlurper

def response = WS.sendRequest(findTestObject('REST User Operations/Post User'))

JsonSlurper slurper = new JsonSlurper()

//String idValue = WS.getElementPropertyValue(response, 'id' )

Map parsedJson = slurper.parseText(response.getResponseText())

String idValue = parsedJson.get('id')

System.out.println('<<<<' + idValue)

response = WS.sendRequest(findTestObject('REST User Operations/PUT update request', [('id') : idValue]))

assertThat(response.getResponseText()).contains('updatedAt')

response = WS.sendRequest(findTestObject('REST User Operations/Post User'))

assertThat(response.getResponseText()).contains('id')

assertThat(response.getResponseText()).contains('createdAt')

response = WS.sendRequest(findTestObject('REST User Operations/DELETE User'))

WS.verifyResponseStatusCode(response, 204)

assertThat(response.getStatusCode()).isEqualTo(204)

