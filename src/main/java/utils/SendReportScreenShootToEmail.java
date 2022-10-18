package utils;

import com.google.common.io.Files;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.*;

public class SendReportScreenShootToEmail {

//    public static void SendEmail() // change this to run with afterclass test runner
    public static void main(String[] args) throws IOException, InterruptedException {

        String to = "fakhri@cilsyfiolution.com"; // to address. It can be any like gmail, hotmail etc.
        final String from = "imaduddin.muhammadfaris@gmail.com"; // from address. As this is using Gmail SMTP.
        final String password = "vwvugvdicznmknqi"; // password for from mail address.
        takeReportScreenShot();

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.socketFactory.port", "465");
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject("Test Report Cicle Staging by Automation");

            String msg = "The following are the results of feature testing";

            MimeBodyPart mimeBodyPart = new MimeBodyPart();
            mimeBodyPart.setContent(msg, "text/html");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(mimeBodyPart);

            MimeBodyPart attachmentBodyPart = new MimeBodyPart();
            attachmentBodyPart.attachFile(new File("target/report.png"));
            multipart.addBodyPart(attachmentBodyPart);
            message.setContent(multipart);

            Transport.send(message);

            System.out.println("Mail successfully sent..");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    public static void takeReportScreenShot() throws IOException, InterruptedException {
        String filename1 = System.getProperty("user.dir")
                + "/target/cucumber-report-html/cucumber-html-reports/feature-overview.html";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(filename1);
        Thread.sleep(1000);

        // To zoom out 80% times
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("document.body.style.zoom='75%'");
        Thread.sleep(1000);

        // take screenshot
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Files.copy(scrFile, new File(System.getProperty("user.dir") + "/target/report.png"));
        driver.close();
    }
}
