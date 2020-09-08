package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class individualchat_page {

	
	public  AndroidDriver<MobileElement> driver;
	
// Enter Pin
	
	By pinenter=By.className("android.widget.EditText");
	
    By title = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView");
	
// Contacts
    
    By contab = By.xpath("//android.widget.TextView[@text='CONTACTS']");
    
    By contactslist=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[1]");
	 	
//Send Text message to the user
    
	By msgfield = By.id("com.chatapp.android:id/chat_edit_text1");

	
	By senbtn = By.id("com.chatapp.android:id/enter_chat1");
	
//Timer -- can be used for sending text, audio, video, location and camera pic
	
	By timico = By.id("com.chatapp.android:id/capture_timer");
	
	By setim= By.xpath("//android.widget.CheckedTextView[@text='30 Seconds']");
    
    By timoff= By.xpath("//android.widget.CheckedTextView[@text='Off']");
    
//Send documents to the user
    
	By imgicon = By.id("com.chatapp.android:id/attachment_icon");
	
	By docfile = By.id("com.chatapp.android:id/document_choose");
    
    By docat = By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"DOC\"]");
    
    By seldoc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout/android.widget.TextView[1]");
	
// Send Videos to the user
    
    By attachicon = By.id("com.chatapp.android:id/attachment_icon");

	By vidofile_icon = By.id("com.chatapp.android:id/video_choose");

	By vidcategory = By.xpath("//android.widget.TextView[@text='ScreenCapture']");

	By choosevideos = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView");

	By select_videos = By.id("com.chatapp.android:id/fab");

	By vconfirm = By.id("com.chatapp.android:id/fab");

	By vsendbutton = By.id("com.chatapp.android:id/enter_chat1");
    
 // Sending Images to the user
    
	By imgchoose = By.id("com.chatapp.android:id/image_choose");

	By selcategory = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.ImageView");

	By seleimage = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView");

	By confirm = By.id("com.chatapp.android:id/fab");

	By conf = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton");

	By sendbutton = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView");

// Sending audio to the user
	
    By audicon = By.id("com.chatapp.android:id/attachment_icon");
	
    By audio_choose = By.id("com.chatapp.android:id/audio_choose");
   
    By selaudios = By.id("com.chatapp.android:id/tvFileName");
    
// Sending current location to the user
    
    By locicon = By.id("com.chatapp.android:id/attachment_icon");
  
    By location_icon = By.id("com.chatapp.android:id/location_choose");
    
    By mylocation = By.xpath("//android.widget.ImageView[@content-desc=\"My Location\"]");
     
    By selclocation = By.xpath("//android.widget.TextView[@text='Select this location']");
     
    By sendlocation = By.id("com.chatapp.android:id/select");
    
//Send different location to the user
    
    By searchfield = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.TextView");
    
    By searchdifferentloc = By.id("com.google.android.gms:id/edit_text");
    
    By selectfst = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[1]");

//Send camera images to the user by taking a picture
    
    By cameraicon = By.id("com.chatapp.android:id/attachment_icon");
	
    By camera_icon = By.id("com.chatapp.android:id/camera_choose");
    
    By selphoto = By.xpath("(//GLButton[@content-desc=\"NONE\"])[2]");
    
    By okbutton = By.id("com.sec.android.app.camera:id/okay");
    
    By camsendbutton = By.id("com.chatapp.android:id/enter_chat1");
    
//Send recorded audio to the user
    
    By recordaudio = By.id("com.chatapp.android:id/record");
	 
    By sendaudio=By.id("com.chatapp.android:id/tvPositive");
    
//Reply message to the user
    
    By messagetxt = By.id("com.chatapp.android:id/relative_layout_message");
    
    By replytxt = By.id("com.chatapp.android:id/replymess");
    
    By typetxt = By.id("com.chatapp.android:id/chat_edit_text1");
    
    By sendtxt = By.id("com.chatapp.android:id/enter_chat1");
    
// Forward message to the user
    
    By fwdtxt = By.id("com.chatapp.android:id/relative_layout_message");
    
    By fwdicon = By.id("com.chatapp.android:id/forward");
    
    By fwdcont = By.id("com.chatapp.android:id/contactlist_item_relative");
    
    By contsend = By.id("com.chatapp.android:id/overlapImage");
    
// Mark user as a favorite contact and also uncheck the favorite contact
    
    By chatfrm = By.id("com.chatapp.android:id/usernamechatsceen");
    
    By favchat = By.id("com.chatapp.android:id/iv_fav");
    
    By favok = By.id("com.chatapp.android:id/tvPositive");
    
    By favcancel =By.id("com.chatapp.android:id/tvPositive");
    
    By navigate = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
    
// Block and unblock the contact 
    
    By block = By.id("com.chatapp.android:id/tv_block");
    
    By blockok = By.id("com.chatapp.android:id/tvPositive");
    
    By unblock = By.xpath("//android.widget.TextView[@text='Unblock']");
    
// voice calling the person and declining the call intentionally    
    
    By voicecall = By.id("com.chatapp.android:id/ivVoiceCall");
    
    By disconnect = By.xpath("//android.widget.ImageView[@content-desc=\"Disconnect Call\"]");
    
// video calling the person and declining the call intentionally   
    
    By videocall = By.id("com.chatapp.android:id/ivVideoCall");
    
    By vdisconnect = By.xpath("//android.widget.ImageView[@content-desc=\"Disconnect Call\"]");
    
    
// Clicking on More options to mute the chat
    
    By moreopt = By.xpath("//android.widget.ImageView[@content-desc='More options']");
    
    By muteopt = By.xpath("//android.widget.TextView[@text='Mute']");
    
    By mutechat = By.id("com.chatapp.android:id/rb1");
    
    By muteok = By.id("com.chatapp.android:id/ok");
    
    By pagebck = By.id("com.chatapp.android:id/iBtnBack");
    
    By chatsopt = By.xpath("//android.widget.TextView[@text='CHATS']");
    
// Chat List Page-unmute
    
    //By muteicon = By.id("com.chatapp.android:id/mute_chatlist");
    
    By mutecont = By.id("com.chatapp.android:id/rlChat");
    
    By unmute = By.xpath("//android.widget.TextView[@text='UnMute']");
    
// Clearing the user data in the chat list  
    
    By clearcont = By.id("com.chatapp.android:id/rlChat");
    
    By clearchat = By.xpath("//android.widget.TextView[@text='Clear Chat']");
    
    By clear = By.xpath("//android.widget.TextView[@text='CLEAR']");
    
// Deleting the user name after clearing the data 
    
    By deletechats = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[1]");
    
    By delete = By.xpath("//android.widget.TextView[@text='Delete']");
    
    By deleteok = By.xpath("//android.widget.TextView[@text='DELETE']");
    
// Changing the pin after deleting the individual
    
    By settings = By.xpath("//android.widget.TextView[@text='Settings']");
    
    By changepin = By.xpath("//android.widget.TextView[@text='Change Pin']");
    
    By currentpin = By.className("android.widget.EditText");
    
    By newpin = By.className("android.widget.EditText");
    
    By bcknavigate = By.id("com.chatapp.android:id/backnavigate");
    
    
    
    
	
	
	public individualchat_page(AndroidDriver<MobileElement> driver) {
		
		this.driver = driver;
	}
	

	public void WaitForVisibility(By e) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(e));
	}

	public MobileElement enterpin() {
		WaitForVisibility(pinenter);
		return driver.findElement(pinenter);
	}

	public MobileElement contacts() {
		WaitForVisibility(contab);
		return driver.findElement(contab);
	}

	public java.util.List<MobileElement> contactslist() {
		WaitForVisibility(contactslist);
		return driver.findElements(contactslist);
	}

	public MobileElement gettitle() {
		WaitForVisibility(title);
		return driver.findElement(title);
	}

	public MobileElement msgbox() {
		WaitForVisibility(msgfield);
		return driver.findElement(msgfield);
	}

	public MobileElement sendbutton() {
		WaitForVisibility(senbtn);
		return driver.findElement(senbtn);
	}

	public MobileElement timer() {
		WaitForVisibility(timico);
		return driver.findElement(timico);
	}

	public MobileElement settime() {
		WaitForVisibility(setim);
		return driver.findElement(setim);
	}

	public MobileElement timoff() {
		WaitForVisibility(timoff);
		return driver.findElement(timoff);
	}

	public MobileElement imgicon() {
		WaitForVisibility(imgicon);
		return driver.findElement(imgicon);
	}

	public MobileElement docfile() {
		WaitForVisibility(docfile);
		return driver.findElement(docfile);
	}

	public MobileElement docat() {
		WaitForVisibility(docat);
		return driver.findElement(docat);
	}

	public MobileElement seldoc() {
		WaitForVisibility(seldoc);
		return driver.findElement(seldoc);
	}

	public MobileElement attachicon() {
		WaitForVisibility(attachicon);
		return driver.findElement(attachicon);
	}

	public MobileElement vidofile_icon() {
		WaitForVisibility(vidofile_icon);
		return driver.findElement(vidofile_icon);
	}

	public MobileElement vidcategory() {
		WaitForVisibility(vidcategory);
		return driver.findElement(vidcategory);
	}

	public MobileElement select_videos() {
		WaitForVisibility(select_videos);
		return driver.findElement(select_videos);
	}

	public MobileElement choosevideos() {
		WaitForVisibility(choosevideos);
		return driver.findElement(choosevideos);
	}

	public MobileElement vconfirm() {
		WaitForVisibility(confirm);
		return driver.findElement(confirm);
	}

	public MobileElement vsendbutton() {
		WaitForVisibility(sendbutton);
		return driver.findElement(sendbutton);
	}

	public MobileElement imgchoose() {
		WaitForVisibility(imgchoose);
		return driver.findElement(imgchoose);
	}

	public MobileElement selcategory() {
		WaitForVisibility(selcategory);
		return driver.findElement(selcategory);
	}

	public MobileElement seleimage() {
		WaitForVisibility(seleimage);
		return driver.findElement(seleimage);
	}

	public MobileElement confirm() {
		WaitForVisibility(confirm);
		return driver.findElement(confirm);
	}

	public MobileElement conf() {
		WaitForVisibility(conf);
		return driver.findElement(conf);
	}

	public MobileElement sendbtn() {
		WaitForVisibility(sendbutton);
		return driver.findElement(sendbutton);
	}

	public MobileElement audicon() {
		WaitForVisibility(audicon);
		return driver.findElement(audicon);
	}

	public MobileElement audio_choose() {
		WaitForVisibility(audio_choose);
		return driver.findElement(audio_choose);
	}

	public MobileElement selaudios() {
		WaitForVisibility(selaudios);
		return driver.findElement(selaudios);
	}

	public MobileElement locicon() {
		WaitForVisibility(locicon);
		return driver.findElement(locicon);
	}

	public MobileElement location_icon() {
		WaitForVisibility(location_icon);
		return driver.findElement(location_icon);
	}

	public MobileElement mylocation() {
		WaitForVisibility(mylocation);
		return driver.findElement(mylocation);
	}

	public MobileElement selclocation() {
		WaitForVisibility(selclocation);
		return driver.findElement(selclocation);
	}

	public MobileElement sendlocation() {
		WaitForVisibility(sendlocation);
		return driver.findElement(sendlocation);
	}

	public MobileElement searchfield() {
		WaitForVisibility(searchfield);
		return driver.findElement(searchfield);
	}

	public MobileElement searchdifferentloc() {
		WaitForVisibility(searchdifferentloc);
		return driver.findElement(searchdifferentloc);
	}

	public MobileElement selectfst() {
		WaitForVisibility(selectfst);
		return driver.findElement(selectfst);
	}

	public MobileElement cameraicon() {
		WaitForVisibility(cameraicon);
		return driver.findElement(cameraicon);
	}

	public MobileElement camera_icon() {
		WaitForVisibility(camera_icon);
		return driver.findElement(camera_icon);
	}

	public MobileElement selphoto() {
		WaitForVisibility(selphoto);
		return driver.findElement(selphoto);
	}

	public MobileElement okbutton() {
		WaitForVisibility(okbutton);
		return driver.findElement(okbutton);
	}

	public MobileElement camsendbutton() {
		WaitForVisibility(camsendbutton);
		return driver.findElement(camsendbutton);
	}

	public MobileElement recordaudio() {
		WaitForVisibility(recordaudio);
		return driver.findElement(recordaudio);
	}

	public MobileElement sendaudio() {
		WaitForVisibility(sendaudio);
		return driver.findElement(sendaudio);
	}

	public MobileElement messagetxt() {
		WaitForVisibility(messagetxt);
		return driver.findElement(messagetxt);
	}

	public MobileElement replytxt() {
		WaitForVisibility(replytxt);
		return driver.findElement(replytxt);
	}

	public MobileElement typetxt() {
		WaitForVisibility(typetxt);
		return driver.findElement(typetxt);
	}

	public MobileElement sendtxt() {
		WaitForVisibility(sendtxt);
		return driver.findElement(sendtxt);
	}

	public MobileElement fwdtxt() {
		WaitForVisibility(fwdtxt);
		return driver.findElement(fwdtxt);
	}

	public MobileElement fwdicon() {
		WaitForVisibility(fwdicon);
		return driver.findElement(fwdicon);
	}

	public MobileElement fwdcont() {
		WaitForVisibility(fwdcont);
		return driver.findElement(fwdcont);
	}

	public MobileElement contsend() {
		WaitForVisibility(contsend);
		return driver.findElement(contsend);
	}

	public MobileElement chatfrm() {
		WaitForVisibility(chatfrm);
		return driver.findElement(chatfrm);
	}

	public MobileElement favchat() {
		WaitForVisibility(favchat);
		return driver.findElement(favchat);
	}

	public MobileElement favok() {
		WaitForVisibility(favok);
		return driver.findElement(favok);
	}

	public MobileElement favcancel() {
		WaitForVisibility(favcancel);
		return driver.findElement(favcancel);
	}

	public MobileElement navigate() {
		WaitForVisibility(navigate);
		return driver.findElement(navigate);
	}

	public MobileElement block() {
		WaitForVisibility(block);
		return driver.findElement(block);
	}

	public MobileElement blockok() {
		WaitForVisibility(blockok);
		return driver.findElement(blockok);
	}

	public MobileElement unblock() {
		WaitForVisibility(unblock);
		return driver.findElement(unblock);
	}

	public MobileElement voicecall() {
		WaitForVisibility(voicecall);
		return driver.findElement(voicecall);
	}

	public MobileElement disconnect() {
		WaitForVisibility(disconnect);
		return driver.findElement(disconnect);
	}

	public MobileElement videocall() {
		WaitForVisibility(videocall);
		return driver.findElement(videocall);
	}

	public MobileElement vdisconnect() {
		WaitForVisibility(vdisconnect);
		return driver.findElement(vdisconnect);
	}

	public MobileElement moreopt() {
		WaitForVisibility(moreopt);
		return driver.findElement(moreopt);
	}

	public MobileElement muteopt() {
		WaitForVisibility(muteopt);
		return driver.findElement(muteopt);
	}

	public MobileElement mutechat() {
		WaitForVisibility(mutechat);
		return driver.findElement(mutechat);
	}

	public MobileElement muteok() {
		WaitForVisibility(muteok);
		return driver.findElement(muteok);
	}

	public MobileElement pagebck() {
		WaitForVisibility(pagebck);
		return driver.findElement(pagebck);
	}

	public MobileElement chatsopt() {
		WaitForVisibility(chatsopt);
		return driver.findElement(chatsopt);
	}

	public MobileElement mutecont() {
		WaitForVisibility(mutecont);
		return driver.findElement(mutecont);
	}

	public MobileElement unmute() {
		WaitForVisibility(unmute);
		return driver.findElement(unmute);
	}

	public MobileElement clearcont() {
		WaitForVisibility(clearcont);
		return driver.findElement(clearcont);
	}

	public MobileElement clearchat() {
		WaitForVisibility(clearchat);
		return driver.findElement(clearchat);
	}

	public MobileElement clear() {
		WaitForVisibility(clear);
		return driver.findElement(clear);
	}

	public java.util.List<MobileElement> deletechats() {
		WaitForVisibility(deletechats);
		return driver.findElements(deletechats);
	}

	public MobileElement delete() {
		WaitForVisibility(delete);
		return driver.findElement(delete);
	}

	public MobileElement deleteok() {
		WaitForVisibility(deleteok);
		return driver.findElement(deleteok);
	}

	public MobileElement settings() {
		WaitForVisibility(settings);
		return driver.findElement(settings);
	}

	public MobileElement changepin() {
		WaitForVisibility(changepin);
		return driver.findElement(changepin);
	}

	public MobileElement currentpin() {
		WaitForVisibility(currentpin);
		return driver.findElement(currentpin);
	}

	public MobileElement newpin() {
		WaitForVisibility(newpin);
		return driver.findElement(newpin);
	}

	public MobileElement bcknavigate() {
		WaitForVisibility(bcknavigate);
		return driver.findElement(bcknavigate);
	}

}
