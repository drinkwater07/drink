package reports;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.testng.annotations.Test;

public class SendingMail 
{

	public MimeBodyPart mimeBodyPart;
	public static	Message message;
	public	Multipart multipart;


	public static String filePath2 = "\\\\192.168.10.216\\test-output\\reports\\ExtentReport.html";
	public static String filePath1 = "\\\\192.168.10.216\\test-output\\emailable-report.html";
	public static String filePath = "\\\\192.168.10.216\\test-output\\index.html";
	public static  String ScreenShots ="\\\\192.168.10.216\\test-output\\reports\\Screenshots";
	
	public static String msg = "HI find result of Test suite in Attached file";

	public static String filePaths = "HI Team Please find result of Test suite in Attached filePath\r\n"
	+"<br>"+"<br>"+
			"  Extent Report Path --   "+filePath2+"   "
			+ "<br>"+ 
			 "  Index Report path --  "+ "\\\\192.168.10.216\\test-output\\index.html"	 + "<br>"+ 
	 "<br>"+ 
			 "<br>"+"Please Find Failed tests Screent-shots -- "+ScreenShots+
	"<br>"+ 
	 "<br>"+ 
	"<br>"+ "Thanks"+ "<br>"+"Mahesha K S" ;
	
	
	
	public static void sessionCreate() throws Exception
	{
		System.out.println("Mail Sending Process Initiated");
		String userName = "phoenix";
		String passWord = "spSS0377";

		Properties prop = new Properties();
		prop.put("mail.smtp.auth", true);
		prop.put("mail.smtp.starttls.enable", true);
		prop.put("mail.smtp.host", "NJPNXSMTPSVR02.prophoenix.internal");
		prop.put("mail.smtp.port", 25);
		prop.put("mail.smtp.ssl.trust", "NJPNXSMTPSVR02.prophoenix.internal");

		Session session = Session.getInstance(prop, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(userName, passWord);
			}
		});

		// Mail Members
		message = new MimeMessage(session);
		message.setFrom(new InternetAddress("Mahesha@prophoenix.com"));
		message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("Rajas@prophoenix.com"));

		
		  message.setRecipients( Message.RecipientType.CC,
		  InternetAddress.parse("Mohans@prophoenix.com,Ragaranjani@prophoenix.com,Mithun@prophoenix.com,vijaykumar@prophoenix.com,stalinr@prophoenix.com"));
		 

		message.setFrom(new InternetAddress("Mahesha@Prophoenix.com", "Mahesha K S"));
		
		message.setSubject("Result of test Suite");
	}
	
	
	private static void addAttachment(Multipart multipart, String filename) throws Exception {

		MimeBodyPart mimeBodyPart = new MimeBodyPart();
		mimeBodyPart.attachFile(filename);
		multipart.addBodyPart(mimeBodyPart);
		
	}
	
	 private static void filePathAttach(Multipart multipart,Object filepath) throws MessagingException 
	 {
	  
		
		 MimeBodyPart mimeBodyPart = new MimeBodyPart();
		 mimeBodyPart.setContent(filepath, "text/html");
		 multipart.addBodyPart(mimeBodyPart);
		 message.setContent(multipart);
		
	 }
	 


	public static void mailSend() throws Exception
	{
		sessionCreate();
		Multipart multipart = new MimeMultipart(); 
		filePathAttach(multipart,filePaths);
		// attachment
		addAttachment(multipart, filePath2);
		addAttachment(multipart, filePath1);
		

		// send
		Transport.send(message);

		System.out.println("Mail Sent");
	
	}
}


