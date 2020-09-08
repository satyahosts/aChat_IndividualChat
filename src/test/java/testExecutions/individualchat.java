package testExecutions;

import java.io.IOException;
import java.time.Duration;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

import pageObjects.individualchat_page;
import Resources.base;

import org.testng.annotations.BeforeTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.AfterTest;

public class individualchat extends base {
	public AndroidDriver<MobileElement> driver;
	public static Logger log = LogManager.getLogger(base.class.getName());
	ExtentReports extent;
	
	@BeforeTest
	public void BeforeTest() throws IOException, InterruptedException {
		
		String path = System.getProperty("user.dir")+"\\reports\\satya.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Mobile Automation Results");
		reporter.config().setDocumentTitle("Test Results");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Satya Pavan");
		
		driver = intilizeDriver();
		log.info("Intilized Achat Application");

		individualchat_page ch = new individualchat_page(driver);
		ch.contacts().click();

		for (MobileElement we : ch.contactslist()) {
			System.out.println(we.getText());
			if (we.getText().equalsIgnoreCase("aChat Test5 ")) {

				we.click();
				log.info("Match the contacts and selected");
				break;
			}
		}
	}

	@Test(priority = 1, enabled = true)
	public void sendtxt() throws IOException, InterruptedException {
		extent.createTest("Send Text");
		try {
			
			individualchat_page st = new individualchat_page(driver);
			st.msgbox().click();
			log.info("Click text message box");
			st.msgbox().sendKeys("how are u");
			st.sendbutton().click();
			log.info("Successfully send message");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 2, enabled = true)
	public void timermsg() throws IOException, InterruptedException {

		extent.createTest("Timer Message");
		
		try {

			individualchat_page st = new individualchat_page(driver);
			st.timer().click();
			log.info("Click timer icon");
			st.settime().click();
			log.info("select timer");
			st.msgbox().click();
			log.info("Click text message box");
			st.msgbox().sendKeys("how are u");
			st.sendbutton().click();
			log.info("Successfully send message");
			st.timer().click();
			log.info("Click timer icon");
			st.timoff().click();
			log.info("Timer is off");

		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 3, enabled = true)
	public void send_imges() throws IOException, InterruptedException {
		
		extent.createTest("Send Images");

		try {
			individualchat_page st = new individualchat_page(driver);

			st.imgicon().click();
			log.info("Click image icon");

			st.imgchoose().click();
			log.info("Click image file");

			st.selcategory().click();
			log.info("Click image category");

			st.seleimage().click();
			log.info("Click images");

			st.confirm().click();
			log.info("Confirmed the image");

			st.conf().click();
			log.info("Confirm the images");

			st.sendbtn().click();
			log.info("Successfully send images");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 4, enabled = true)
	public void send_documents() throws IOException, InterruptedException {
		
		extent.createTest("Send Documents");

		try {
			individualchat_page st = new individualchat_page(driver);
			st.imgicon().click();
			log.info("Click attach icon");
			st.docfile().click();
			log.info("Select document  file");
			st.docat().click();
			log.info("Click document category");
			st.seldoc().click();
			log.info("Sucessfully send documents");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 5, enabled = true)
	public void send_videos() throws IOException, InterruptedException {
		
		extent.createTest("Send Videos");

		try {

			individualchat_page st = new individualchat_page(driver);

			st.attachicon().click();
			log.info("Click video image icon");

			st.vidofile_icon().click();
			log.info("Click video file icon");

			st.vidcategory().click();
			log.info("Click video category");

			st.choosevideos().click();
			log.info("choose videos");

			st.select_videos().click();
			log.info("Video selected");

			st.vconfirm().click();
			log.info("Confirmed the videos");

			st.vsendbutton().click();
			log.info("Successfully send videos");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 6, enabled = true)
	public void send_audios() throws IOException, InterruptedException {
		
		extent.createTest("Send Audio");

		try {

			individualchat_page st = new individualchat_page(driver);
			st.audicon().click();
			log.info("Click image icon");
			st.audio_choose().click();
			log.info("Click audio file");
			st.selaudios().click();
			log.info("Successfully send audios");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 7, enabled = true)
	public void send_currentlocation() throws IOException, InterruptedException {
		
		extent.createTest("Send CurrentLocation");

		try {

			individualchat_page st = new individualchat_page(driver);
			st.locicon().click();
			log.info("Click loc icon");
			st.location_icon().click();
			log.info("Click location file");
			st.mylocation().click();
			st.selclocation().click();
			st.sendlocation().click();
			log.info("Successfully send current location");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 8, enabled = false)
	public void send_differentlocation() throws IOException, InterruptedException {

		extent.createTest("Send DifferentLocation");
		
		try {

			individualchat_page st = new individualchat_page(driver);
			st.locicon().click();
			log.info("Click loc icon");
			st.location_icon().click();
			log.info("Click location file");
			st.searchfield().click();
			st.searchdifferentloc().click();
			st.searchdifferentloc().sendKeys(prop.getProperty("locationName"));
			log.info("Enter the location name");
			st.selectfst().click();
			st.sendlocation().click();
			log.info("Successfully send " + prop.getProperty("locationName") + " location details");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 9, enabled = true)
	public void send_cameraphoto() throws IOException, InterruptedException {
		
		extent.createTest("Camera Photo");

		try {

			individualchat_page st = new individualchat_page(driver);
			st.cameraicon().click();
			log.info("Click attach icon");
			st.camera_icon().click();
			log.info("Click image file");
			st.selphoto().click();
			log.info("Click photo");
			st.okbutton().click();

			st.camsendbutton().click();
			log.info("Successfully send camera photo");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 10, enabled = true)
	public void record_audio() throws IOException, InterruptedException {
		
		extent.createTest("Record Audio");

		try {

			individualchat_page st = new individualchat_page(driver);

			AndroidTouchAction touch = new AndroidTouchAction(driver);
			touch.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(st.recordaudio()))
					.withDuration(Duration.ofMillis(2000))).release().perform();

			st.sendaudio().click();

			log.info("Successfully send audios");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 11, enabled = true)
	public void reply_message() throws IOException, InterruptedException {
		
		extent.createTest("Reply Message");

		try {

			individualchat_page st = new individualchat_page(driver);

			AndroidTouchAction touch = new AndroidTouchAction(driver);
			touch.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(st.messagetxt()))
					.withDuration(Duration.ofMillis(3000))).release().perform();
			log.info("Successfully clicked message");

			st.replytxt().click();
			log.info("Successfully clicked on reply icon");
			st.typetxt().click();
			log.info("Successfully clicked on type text box");
			st.typetxt().sendKeys("I'm fine");
			log.info("Successfully typed the text");
			st.sendtxt().click();
			log.info("Successfully clicked on send icon");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 12, enabled = true)
	public void forward_message() throws IOException, InterruptedException {
		
		extent.createTest("Forward Message");

		try {

			individualchat_page st = new individualchat_page(driver);

			AndroidTouchAction touch = new AndroidTouchAction(driver);
			touch.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(st.fwdtxt()))
					.withDuration(Duration.ofMillis(3000))).release().perform();
			log.info("Successfully clicked on forwareded message");

			st.fwdicon().click();
			log.info("Successfully clicked on forward icon");
			st.fwdcont().click();
			log.info("Successfully clicked on forward contact");
			st.contsend().click();
			log.info("Successfully clicked on contact send icon");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 13, enabled = false)
	public void favorite_user() throws IOException, InterruptedException {

		try {

			individualchat_page st = new individualchat_page(driver);

			st.chatfrm().click();
			log.info("Clicked on the name of the user in chat screen");
			st.favchat().click();
			log.info("Clicked on the favorite icon");
			st.favok().click();
			log.info("Clicked on the favorite OK button");
			st.navigate().click();
			log.info("Navigated to chat screen");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 14, enabled = false)
	public void unfavorite_user() throws IOException, InterruptedException {

		try {

			individualchat_page st = new individualchat_page(driver);

			st.chatfrm().click();
			log.info("Clicked on the name of the user in chat screen");
			st.favchat().click();
			log.info("Clicked on the favorite icon");
			st.favcancel().click();
			log.info("Clicked on the unfavorite OK button");
			st.navigate().click();
			log.info("Navigated to chat screen");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 15, enabled = false)
	public void block_user() throws IOException, InterruptedException {

		try {

			individualchat_page st = new individualchat_page(driver);

			st.chatfrm().click();
			log.info("Clicked on the name of the user in chat screen");
			st.block().click();
			log.info("Clicked on the block icon");
			st.blockok().click();
			log.info("Clicked on the block OK button");
			st.navigate().click();
			log.info("Navigated to chat screen");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 16, enabled = false)
	public void unblock_user() throws IOException, InterruptedException {

		try {

			individualchat_page st = new individualchat_page(driver);

			st.chatfrm().click();
			log.info("Clicked on the name of the user in chat screen");
			st.unblock().click();
			log.info("Clicked on the unblock icon");
			st.blockok().click();
			log.info("Clicked on the unblock OK button");
			st.navigate().click();
			log.info("Navigated to chat screen");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 17, enabled = true)
	public void voice_call() throws IOException, InterruptedException {

		extent.createTest("Voice Call");
		
		try {

			individualchat_page st = new individualchat_page(driver);
			st.voicecall().click();
			log.info("Click voicecall");
			st.disconnect().click();
			log.info("Disconnect the call");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 18, enabled = true)
	public void video_call() throws IOException, InterruptedException {
		
		extent.createTest("Video Call");
		

		try {

			individualchat_page st = new individualchat_page(driver);
			st.videocall().click();
			log.info("Click videoccall");

			st.vdisconnect().click();
			log.info("Disconnect the call");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 19, enabled = true)
	public void mute_contact() throws IOException, InterruptedException {
		
		extent.createTest("Mute and Unmute Contact");

		try {

			individualchat_page st = new individualchat_page(driver);
			st.moreopt().click();
			log.info("Clicked on more options icon");
			st.muteopt().click();
			log.info("Clicked on mute option");
			st.mutechat().click();
			log.info("Clicked on mutechat radio button");
			st.muteok().click();
			log.info("Successfully clicked on OK text");
			st.pagebck().click();
			log.info("Successfully page navigated");
			st.chatsopt().click();
			log.info("Successfully page navigated to chats");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 20, enabled = true)
	public void clear_contact() throws IOException, InterruptedException {
		
		extent.createTest("Clear and Delete contact");

		try {

			individualchat_page st = new individualchat_page(driver);

			AndroidTouchAction touch = new AndroidTouchAction(driver);
			touch.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(st.mutecont()))
					.withDuration(Duration.ofMillis(3000))).release().perform();
			log.info("Successfully clicked on muted contact");

			st.unmute().click();
			log.info("Successfully clicked on unmute icon");

			touch.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(st.clearcont()))
					.withDuration(Duration.ofMillis(3000))).release().perform();
			log.info("Successfully clicked on muted contact");

			st.clearchat().click();
			log.info("Successfully chat has been cleared");

			st.clear().click();

			touch.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(st.clearcont()))
					.withDuration(Duration.ofMillis(3000))).release().perform();
			st.delete().click();
			
			st.deleteok().click();
			
			

		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		extent.flush();
	}

	@Test(priority = 21, enabled = false)

	public void delete_contact() throws IOException, InterruptedException {

		try {

			individualchat_page dl = new individualchat_page(driver);
			for (MobileElement we1 : dl.deletechats()) {
				System.out.println(we1.getText());

				if (we1.getText().equalsIgnoreCase("aChat Test5 ")) {

					AndroidTouchAction touch = new AndroidTouchAction(driver);
					touch.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(we1))
							.withDuration(Duration.ofMillis(300))).perform();
					log.info("Match the username to delete");
					dl.delete().click();
					log.info("The username deleted successfully");
					dl.deleteok().click();
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 22, enabled = false)

	public void change_pin() throws IOException, InterruptedException {
		
		

		try {

			individualchat_page lp = new individualchat_page(driver);

			lp.moreopt().click();
			log.info("Successfully clicked on more options");
			lp.settings().click();
			log.info("Successfully clicked on settings options");
			lp.changepin().click();
			log.info("Successfully clicked on Change pin option");
			lp.currentpin().sendKeys(prop.getProperty("pinnumber"));
			lp.newpin().sendKeys(prop.getProperty("newpinnumber", "1234"));
			log.info("Enter new pin");
			lp.newpin().sendKeys(prop.getProperty("newpinnumber", "1234"));
			log.info("Pin changed successfully");
			lp.bcknavigate().click();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@AfterTest(enabled = false)

	public void AfterTest() throws InterruptedException {

		Thread.sleep(5000);
		driver.closeApp();

	}

}
