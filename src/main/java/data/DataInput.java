package data;

import utils.CommonUtils;

import java.sql.Time;

public class DataInput {

    public static String randomChar = CommonUtils.generateRandomChar(4);
    public static String randomChar2 = CommonUtils.generateRandomChar(6);
    public static String exampleLinkChat = "https://medium.com/@rizqifauzan/custom-xpath-fefc8747878a";
    public static String exampleLinkChatWithSpace = "https://medium.com/@rizqifauzan/custom-xpath-fefc8747878a ";

    public static String pictureAddress = "F:\\QA Cilsy\\Big Project\\BigProjectCilsy\\src\\main\\java\\data\\mountain.jpg";
    public static String fileDocumentAddress = "F:\\QA Cilsy\\Big Project\\BigProjectCilsy\\src\\main\\java\\data\\24._Performance_Testing_using_JMeter.pdf";
    public static String dueDateManual = "12-November-2022";
    public static String dueDateTime = "10:30";
    public static String afterMidNight = "AM";
    public static String postMidNight = "PM";
    public static String dueDateTimeOnCard = dueDateTime+" "+afterMidNight;

    public static String emailFrom = "imaduddin.muhammadfaris@gmail.com"; //can change
    public static String pswdFrom = "J490anFaris__213";
    public static String toEmail = "imd.muhammadfaris@gmail.com";
}
