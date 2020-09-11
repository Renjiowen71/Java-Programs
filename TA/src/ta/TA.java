package ta;
import java.util.Scanner;
import java.math.*;
import java.util.Random;
public class TA {

    public static void main(String[] args) {
        BigInteger keys[] = Libraries.getkey();
        byte[]ciphers;
        int big = 1000;
        int key = 100;
        byte[] text50 = new byte[big];
        long etime, dtime;
        long sume = 0, sumd = 0;
        String cipher;
        for(int j = 0;j<50;j++){
            for(int i = 0; i<big;i++){
                text50[i] = (byte)(Math.random()*(127-32)+32);
            }
            String test = new String (text50);
            cipher = test;
            etime = System.nanoTime();
            cipher = Libraries.encryptmcc(test,key);
            ciphers = Libraries.encryptrsa(cipher.getBytes(),keys[0],keys[2]);
            etime = System.nanoTime()-etime;
            dtime = System.nanoTime();
            cipher = new String (Libraries.decryptrsa(ciphers,keys[1],keys[2]));
            cipher = Libraries.decryptmcc(cipher,key);
            dtime = System.nanoTime() - dtime;
            System.out.println("etime = "+etime);
            System.out.println("dtime = "+dtime);
            sume +=etime;
            sumd +=dtime;
            System.out.println(test);
        System.out.println(Libraries.decryptmcc(Libraries.encryptmcc(test,key),key));
        }
        System.out.println("average = "+sume/50);
        System.out.println("average = "+sumd/50);
        }
    
//    
//    public static String decryptmcc(String ct, int key){
//        String txt = "";
//        int ascii ;
//        String pt="";
//        String stringascii="";
//        int position = 1;
//        
//        for(int i=0; i<ct.length(); i++){
//            txt+= (" "+ (int)ct.charAt(i));
//        }
//        for(int i=1; i<txt.length();){
//            while((int)txt.charAt(i)!=32){
//                stringascii += txt.charAt(i);
//                i+=1;
//                if(i==txt.length())
//                    break;
//            }
//            ascii = Integer.parseInt(stringascii);
//            i+=1;
//            stringascii ="";
//            pt += (char)(ascii-key*position);
//            position++;
//        }
//        return pt;
//    }
//    public static String encryptmcc(String pt, int key){
//        String txt = "";
//        int ascii ;
//        String ct="";
//        String stringascii="";
//        int position = 1;
//        
//        for(int i=0; i<pt.length(); i++){
//            txt+= (" "+ (int)pt.charAt(i));
//        }
//        for(int i=1; i<txt.length();){
//            while((int)txt.charAt(i)!=32){
//                stringascii += txt.charAt(i);
//                i+=1;
//                if(i==txt.length())
//                    break;
//            }
//            ascii = Integer.parseInt(stringascii);
//            i+=1;
//            stringascii ="";
//            ct += (char)(ascii+key*position);
//            position++;
//        }
//        return ct;
//        
//        
//    }
//    private static int gcd(int number1, int number2) {
//        if(number2 == 0){ 
//            return number1; 
//        } 
//        return gcd(number2, number1%number2); 
//    }
//    
//    public static int[] keyrsa(int prime1,int prime2){
//        Random ran = new Random();
//        int n = prime1*prime2;
//        int phin = (prime1-1)*(prime2-1);
//        int e  = ran.nextInt(phin);
//        int d = 2;
//        while(e==1||gcd(phin,e)!=1)
//            e = ran.nextInt(phin); 
//        while((d*e)%phin!=1)
//            d++;
//        int key[] = new int[3];
//        key[0]=n;
//        key[1]=e;
//        key[2]=d;
//        return key;
//    }
//    public static String encryptrsa(String pt, int e, int n){
//        String txt = "";
//        int ascii ;
//        String ct="";
//        String stringascii="";
//        int position = 1;
//        
//        for(int i=0; i<pt.length(); i++){
//            txt+= (" "+ (int)pt.charAt(i));
//        }
//        for(int i=1; i<txt.length();){
//            while((int)txt.charAt(i)!=32){
//                stringascii += txt.charAt(i);
//                i+=1;
//                if(i==txt.length())
//                    break;
//            }
//            ascii = Integer.parseInt(stringascii);
//            i+=1;
//            stringascii ="";
//            ct += (char)(Math.pow(ascii, e)%n);
//        }
//        return ct;
//    }
//    public static String decryptrsa(String ct, int d, int n){
//        String txt = "";
//        int ascii ;
//        String pt="";
//        String stringascii="";
//        int position = 1;
//        
//        for(int i=0; i<ct.length(); i++){
//            txt+= (" "+ (int)ct.charAt(i));
//        }
//        for(int i=1; i<txt.length();){
//            while((int)txt.charAt(i)!=32){
//                stringascii += txt.charAt(i);
//                i+=1;
//                if(i==txt.length())
//                    break;
//            }
//            ascii = Integer.parseInt(stringascii);
//            i+=1;
//            stringascii ="";
//            pt += (char)(Math.pow(ascii, d)%n);
//        }
//        return pt;
//    }
}
