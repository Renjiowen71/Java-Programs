package ta;
import java.util.Scanner;
public class TextMaker {

    public static void main(String[] args) {
        byte[] text50 = new byte[50];
        for(int i = 0; i<50;i++){
            text50[i] = (byte)(Math.random()*(127-32)+32);
        }
        String texts50 = new String (text50);
        System.out.println(texts50);
        byte[] text100 = new byte[100];
        for(int i = 0; i<100;i++){
            text100[i] = (byte)(Math.random()*(127-32)+32);
        }
        String texts100 = new String (text100);
        System.out.println(texts100);
        byte[] text150 = new byte[150];
        for(int i = 0; i<150;i++){
            text150[i] = (byte)(Math.random()*(127-32)+32);
        }
        String texts150 = new String (text150);
        System.out.println(texts150);
    }
    
}
