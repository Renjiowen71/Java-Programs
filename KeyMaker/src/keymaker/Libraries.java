
package keymaker;

import java.math.BigInteger;
import java.util.Random;

public class Libraries {
    private static BigInteger P;
    private static BigInteger Q;
    private static BigInteger N;
    private static BigInteger PHI;
    private static BigInteger e;
    private static BigInteger d;
    private static int maxLength = 1024;
    private static Random R;
    
    public static BigInteger[] getkey(){
        BigInteger key[] = new BigInteger[3];
        R = new Random();
        P = new BigInteger("7901");
        Q = new BigInteger("7883");
        N = P.multiply(Q);
        PHI = P.subtract(BigInteger.ONE).multiply(  Q.subtract(BigInteger.ONE));
        e = new BigInteger("7127");
        while (PHI.gcd(e).compareTo(BigInteger.ONE) > 0 && e.compareTo(PHI) < 0)
        {
            e.add(BigInteger.ONE);
        }
        d = e.modInverse(PHI);
        key[0] = e;
        key[1] = d;
        key[2] = N;
        return key;
    }
    private static String bToS(byte[] cipher)
    {
        String temp = "";
        for (byte b : cipher)
        {
            temp += Byte.toString(b);
        }
        return temp;
    }
 
    public static byte[] encryptrsa(byte[] message,BigInteger e,BigInteger N)
    {
        return (new BigInteger(message)).modPow(e, N).toByteArray();
    }
 
    public static byte[] decryptrsa(byte[] message, BigInteger d,BigInteger N)
    {
        return (new BigInteger(message)).modPow(d, N).toByteArray();
    }
    
    public static String decryptmcc(String ct, int key){
        String txt = "";
        int ascii ;
        String pt="";
        String stringascii="";
        int position = 1;
        
        for(int i=0; i<ct.length(); i++){
            txt+= (" "+ (int)ct.charAt(i));
        }
        for(int i=1; i<txt.length();){
            while((int)txt.charAt(i)!=32){
                stringascii += txt.charAt(i);
                i+=1;
                if(i==txt.length())
                    break;
            }
            ascii = Integer.parseInt(stringascii);
            i+=1;
            stringascii ="";
            pt += (char)(ascii-key*position);
            position++;
        }
        return pt;
    }
    public static String encryptmcc(String pt, int key){
        String txt = "";
        int ascii ;
        String ct="";
        String stringascii="";
        int position = 1;
        
        for(int i=0; i<pt.length(); i++){
            txt+= (" "+ (int)pt.charAt(i));
        }
        for(int i=1; i<txt.length();){
            while((int)txt.charAt(i)!=32){
                stringascii += txt.charAt(i);
                i+=1;
                if(i==txt.length())
                    break;
            }
            ascii = Integer.parseInt(stringascii);
            i+=1;
            stringascii ="";
            ct += (char)(ascii+key*position);
            position++;
        }
        return ct;
    }
}
