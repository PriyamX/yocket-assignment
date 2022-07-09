package StepDefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import javax.mail.Store;

import com.testing.framework.EmailUtils;

public class TestUtilities {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		EmailUtils emailUtils = new EmailUtils();
		Properties prop = new Properties();
		prop.load(new FileInputStream("C:\\Users\\priya\\git\\yocket-assignment-script\\yocket-assgn\\src\\main\\resources\\drivers\\EmailSMTPconfig.properties"));
		Store connection=emailUtils.connectToGmail(prop);
		//emailUtils.getUnreadMessages(connection, "Inbox");
		
		List<String> emailtext=emailUtils.getUnreadMessageByFromEmail(connection, "Inbox", "hello@yocket.in", "Verify Email");
		
		if(emailtext.size()<1) {
			throw new Exception("No such Email");
		}
			
		else
		{
			String regex="[^\\d]+";
					String[] OTP=emailtext.get(0).split(regex);
			System.out.println("Otp is" + OTP[1]);
		}
		
		
		
	}

}
