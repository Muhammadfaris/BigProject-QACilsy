package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class CommonUtils {

    public static String tokenAuth1 = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7ImRlZmF1bHRDb21wYW55IjpudWxsLCJfaWQiOiI2MmY3MGMzZmM2ZjkxZjhhZDVkY2FhZDEiLCJnb29nbGVJZCI6IjExNzk1ODcyOTEzMzIxMTE0OTE2MSIsImVtYWlsIjoiaW1hZHVkZGluLm11aGFtbWFkZmFyaXNAZ21haWwuY29tIiwiZnVsbE5hbWUiOiJNdWhhbW1hZCBGYXJpcyAnSW1hZHVkZGluIiwicGhvdG9VcmwiOiJodHRwczovL2xoMy5nb29nbGV1c2VyY29udGVudC5jb20vYS9BSXRidm1uckxKSnYtbnJUVDREeDJfaU9UXzV0Y2RaX2dqSTZZZmlZSVlOMj1zOTYtYyIsImJpbyI6IkFsaGFtZHVsaWxsYWgiLCJzdGF0dXMiOiJTYXJqYW5hIiwiY3JlYXRlZEF0IjoiMjAyMi0wOC0xM1QwMjoyODoxNS40MjRaIiwidXBkYXRlZEF0IjoiMjAyMi0wOS0yM1QxMjowNzo1Ni4xNjdaIiwiX192IjowfSwiaWF0IjoxNjYzOTg3MzYzLCJleHAiOjE2NjY1NzkzNjN9.TVTjrDjW2ag7meVE4vUFKpX-bqqtUOOZL_uTJSd7v5s";
    public static String tokenAuth2 = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7Il9pZCI6IjYzMmRjMjQxOThhMTA2ZGIzOTVhN2I1MyIsImdvb2dsZUlkIjoiMTA5MTU1NjA2ODk1NzkwMjc1ODgzIiwiZW1haWwiOiJpbWQubXVoYW1tYWRmYXJpc0BnbWFpbC5jb20iLCJmdWxsTmFtZSI6ImZhcmlzIG11aGFtbWFkIiwicGhvdG9VcmwiOiJodHRwczovL2xoMy5nb29nbGV1c2VyY29udGVudC5jb20vYS9BTG01d3UyN3I0QW5La3B1ZGp3ZmdLZVRhZ2lRMHNaREY3cGtnQjFVMDd3PXM5Ni1jIiwiYmlvIjoiIiwic3RhdHVzIjoiIiwiZGVmYXVsdENvbXBhbnkiOnsiX2lkIjoiNjMyZTcyNzMzYzZlMTAxNzcyNjNiNWUyIn0sImNyZWF0ZWRBdCI6IjIwMjItMDktMjNUMTQ6Mjc6MTMuODg5WiIsInVwZGF0ZWRBdCI6IjIwMjItMDktMjRUMDI6NTg6NTkuNjk4WiIsIl9fdiI6MH0sImlhdCI6MTY2Mzk5MDU4NCwiZXhwIjoxNjY2NTgyNTg0fQ.U8bneFqMdXvszm0tC-eiGfqAKl8idd4es9KMcU9Iuuk";

    public static void getTokenGoogleAccount1(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("localStorage.setItem(arguments[0], arguments[1])","token",tokenAuth1);
        driver.navigate().refresh();
    }

    public static void getTokenGoogleAccount2(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("localStorage.setItem(arguments[0], arguments[1])","token",tokenAuth2);
        driver.navigate().refresh();
    }

    public static String generateRandomChar(int len) {
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk"
                +"lmnopqrstuvwxyz!@#$%&";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(chars.charAt(rnd.nextInt(chars.length())));
        return sb.toString();
    }



    
}
