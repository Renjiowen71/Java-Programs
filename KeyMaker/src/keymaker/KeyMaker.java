/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keymaker;
import java.math.BigInteger;
import java.util.Scanner;
public class KeyMaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger[]keys =new BigInteger[3];
        keys = Libraries.getkey();
        //keys[0] = e;
        //keys[1] = d;
        //keys[2] = n;
        //System.out.println(keys[0]);
        //System.out.println(keys[1]);
        //System.out.println(keys[2]);
        System.out.println("Masukan pesan");
        String spesan = input.next();
        byte[] bpesan = spesan.getBytes();
        byte[] cipesan = Libraries.encryptrsa(bpesan, keys[0], keys[2]);
        System.out.println(new BigInteger(cipesan));
        bpesan = Libraries.decryptrsa(cipesan, keys[1], keys[2]);
        spesan = new String(bpesan);
        System.out.println(spesan);
        
    }
    
}
