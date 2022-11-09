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

Mobile.startApplication('C:\\Users\\HUAWEI\\Desktop\\ColorNote Notepad Notes_4.4.1_Apkpure.apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - SKIP (8)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.FrameLayout (8)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Checklist (4)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (15)'), 'Routine', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (7)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (16)'), 'EAT', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK (5)'), 5)

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

