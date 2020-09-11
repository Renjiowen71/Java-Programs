package tgsmobil;
import java.util.Scanner;
public class Tgsmobil {
    public static void main(String[] args) {
        String merek, warna, tipe;
        int jumlah, tahun;
        TesMobil mobil1 = new TesMobil();
        TesMobil mobil2 = new TesMobil();
        TesMobil mobil3 = new TesMobil();
        TesMobil mobil4 = new TesMobil();
        Scanner input = new Scanner(System.in);
        
        //Meminta data objek
        for(int i=1;i<5;i++){
            System.out.println("Masukkan Data Mobil " + i); 
            System.out.print("Merek       : ");
            merek = input.next();
            System.out.print("Warna       : ");
            warna = input.next();
            System.out.print("Jenis       : ");
            tipe = input.next();
            System.out.print("Tahun       : ");
            tahun = input.nextInt();
            System.out.print("Jumlah      : ");
            jumlah = input.nextInt();
            System.out.println("");
            System.out.println("=============================================================");
               
            switch (i){
                case 1 : 
                    mobil1.setmerek(merek);
                    mobil1.setwarna(warna);
                    mobil1.settipe(tipe);
                    mobil1.settahun(tahun);
                    mobil1.setjumlah(jumlah);
                
                case 2 : 
                    mobil2.setmerek(merek);
                    mobil2.setwarna(warna);
                    mobil2.settipe(tipe);
                    mobil2.settahun(tahun);
                    mobil2.setjumlah(jumlah);
                    
                case 3 : 
                    mobil3.setmerek(merek);
                    mobil3.setwarna(warna);
                    mobil3.settipe(tipe);
                    mobil3.settahun(tahun);
                    mobil3.setjumlah(jumlah);
                    
                case 4 : 
                    mobil4.setmerek(merek);
                    mobil4.setwarna(warna);
                    mobil4.settipe(tipe);
                    mobil4.settahun(tahun);
                    mobil4.setjumlah(jumlah);
            }
        }
        System.out.println("Mobil1 :" ); mobil1.info();
        System.out.println("Mobil2 :" ); mobil2.info();
        System.out.println("Mobil3 :" ); mobil3.info();
        System.out.println("Mobil4 :" ); mobil4.info();
    }
}

    
    

