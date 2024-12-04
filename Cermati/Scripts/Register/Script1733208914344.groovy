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

WebUI.navigateToUrl('https://www.cermati.com/app/gabung')

WebUI.setText(findTestObject('Object Repository/Page_Daftar/input_No. Handphone_mobilePhone'), '0895403317373')

WebUI.setText(findTestObject('Object Repository/Page_Daftar/input_Email_email'), 'fajarsputra06@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Daftar/input_Nama Depan_firstName'), 'Fajar')

WebUI.setText(findTestObject('Object Repository/Page_Daftar/input_Nama Belakang_lastName'), 'Sepdiannicha Putra')

WebUI.click(findTestObject('Object Repository/Page_Daftar/button_Daftar'))


//WebUI.setText(findTestObject('Object Repository/Page_Verifikasi No. Handphone/input_ke_otp'), '')
//
//WebUI.setText(findTestObject('Object Repository/Page_Verifikasi No. Handphone/input_ke_otp_1'), '')
//
//WebUI.setText(findTestObject('Object Repository/Page_Verifikasi No. Handphone/input_ke_otp_1_2'), '')
//
//WebUI.setText(findTestObject('Object Repository/Page_Verifikasi No. Handphone/input_ke_otp_1_2_3'), '')
//
//WebUI.setText(findTestObject('Object Repository/Page_Verifikasi No. Handphone/input_ke_otp_1_2_3_4'), '')
//
//WebUI.setText(findTestObject('Object Repository/Page_Verifikasi No. Handphone/input_ke_otp_1_2_3_4_5'), '')
//
//WebUI.click(findTestObject('Object Repository/Page_Verifikasi No. Handphone/button_Buat PIN'))
//
//WebUI.setText(findTestObject('Object Repository/Page_Buat PIN Baru/input_Masukkan 6 digit PIN baru Anda_newPin'), '')
//
//WebUI.setText(findTestObject('Object Repository/Page_Buat PIN Baru/input_Masukkan 6 digit PIN baru Anda_newPin_1'), '')
//
//WebUI.setText(findTestObject('Object Repository/Page_Buat PIN Baru/input_Masukkan 6 digit PIN baru Anda_newPin_1_2'), '')
//
//WebUI.setText(findTestObject('Object Repository/Page_Buat PIN Baru/input_Masukkan 6 digit PIN baru Anda_newPin_1_2_3'), 
//    '')
//
//WebUI.setText(findTestObject('Object Repository/Page_Buat PIN Baru/input_Masukkan 6 digit PIN baru Anda_newPin_1_2_3_4'), 
//    '')
//
//WebUI.setText(findTestObject('Object Repository/Page_Buat PIN Baru/input_Masukkan 6 digit PIN baru Anda_newPin_1_2_3_4_5'), 
//    '')
//
//WebUI.setText(findTestObject('Object Repository/Page_Ulangi PIN Baru/input_Ulangi 6 digit PIN baru Anda_confirmNewPin'), 
//    '')
//
//WebUI.setText(findTestObject('Object Repository/Page_Ulangi PIN Baru/input_Ulangi 6 digit PIN baru Anda_confirmNewPin_1'), 
//    '')
//
//WebUI.setText(findTestObject('Object Repository/Page_Ulangi PIN Baru/input_Ulangi 6 digit PIN baru Anda_confirmNewPin_1_2'), 
//    '')
//
//WebUI.setText(findTestObject('Object Repository/Page_Ulangi PIN Baru/input_Ulangi 6 digit PIN baru Anda_confirmNewPin_1_2_3'), 
//    '')
//
//WebUI.setText(findTestObject('Object Repository/Page_Ulangi PIN Baru/input_Ulangi 6 digit PIN baru Anda_confirmNewPin_1_2_3_4'), 
//    '')
//
//WebUI.setText(findTestObject('Object Repository/Page_Ulangi PIN Baru/input_Ulangi 6 digit PIN baru Anda_confirmNewPin_1_2_3_4_5'), 
//    '')

WebUI.closeBrowser()

