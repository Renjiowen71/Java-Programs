package tugas.pbo;
import java.util.Scanner;

public class TugasPBO {

    public static void main(String[] args) {
        
        int f = 1;
        
        while (f == 1){
            
            System.out.println("bentuk apa yang anda inginkan? \n 1. Bujursangkar \n 2. Segitiga");
            Scanner input = new Scanner(System.in);
            int a = input.nextInt();
            
            if (a == 1){
                
                bujursangkar bj1 = new bujursangkar();
                System.out.println("Masukan warna yang anda inginkan");
                String b = input.next();
                bj1.setwarna(b);
                System.out.println("Masukan sisi bujursangkar");
                double c = input.nextDouble();
                bj1.setsisi(c);
                bj1.printinfo();
                System.out.println("");
            }
        
            else if (a == 2) {
                
                segitiga s1 = new segitiga();
                System.out.println("Masukan warna ayng anda inginkan");
                String b = input.next();
                s1.setwarna(b);
                System.out.println("Masukan alas segitiga");
                double c = input.nextDouble();
                s1.setalas(c);
                System.out.println("Masukan tinggi segitiga");
                double d = input.nextDouble();
                s1.settinggi(d);
                s1.printinfo();
                System.out.println("Luasnya " +s1.hitungluas());
                System.out.println("Jenisnya " +s1.jenissegitiga());
           }
            
            else 
                
                System.out.println("Pilihannya hanya 1 atau 2");
            
            do {
                
                System.out.println("Apakah anda ingin maengulang? \n 1 intuk ya dan 0 untuk tidak");
                f = input.nextInt();
                
                if (f != 1 && f != 0){
                    
                    System.out.println("Hanya 1 atau 0");
                }
            }
            
            while (f!= 1 && f!= 0);
        
    
        }
    }
}
