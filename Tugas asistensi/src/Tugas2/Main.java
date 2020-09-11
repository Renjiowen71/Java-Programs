package Tugas2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("System ini untuk menghiung efektifitas mesin");
        do {
            System.out.println("Mesin apa yang anda ingin hitung:"
                    + "\n 1. Kendaraan"
                    + "\n 2. Mobil"
                    + "\n 3. Sepeda Motor");
            int a = input.nextInt();
            switch (a){
                case 1:
                
                    System.out.println("Masukan id kendaraan :");
                    int ID = input.nextInt();
                    System.out.println("Masukan jarak tempuh awal kendaraan :");
                    float JTA = input.nextFloat();
                    System.out.println("Masukan jarak tempuh kendaraan :");
                    float JT = input.nextFloat();
                    System.out.println("Masukan jumlah bahan bakar yang sudah digunakanan :");
                    float bb = input.nextFloat();
                
                    Kendaraan kendaraan1 = new Kendaraan(ID,JTA,JT,bb);
                    
                    do { //do pertama setelah pembuatan objek
                        do { //do kedua setelah pembuatan objek
                
                            System.out.println("Apakah anda mau mengganti variabel yang sudah ada?"
                                    + "\n(1 untuk ya dan 0 untuk tidak)");
                            b = input.nextInt();
                
                            switch (b){
                    
                                case 0:
                            
                                    break;
                    
                                case 1:
                        
                                    do{ //do ketiga setelah pembuatan objek
                                        System.out.println("Mana yang anda ingin ganti :"
                                                + "\n 1.  Bahan Bakar"
                                                + "\n 2. Jarak Tempuh"
                                                + "\n 3. Jarak Tempuh Awal"
                                                + "\n 4. ID");
                        
                                        a = input.nextInt();
                        
                                        switch (a){
                            
                                            case 1:
                                        
                                                System.out.println("Masukan Bahan Bakar :");
                                                bb = input.nextInt();
                                                kendaraan1.setKendaraan(ID, bb, JTA, JT);
                                                break;
                                
                                            case 2:
                                        
                                                System.out.println("Masukan Jarak Tempuh");
                                                JT = input.nextFloat();
                                                kendaraan1.setKendaraan(ID, bb, JTA, JT);
                                                break;
                                
                                            case 3:
                                    
                                                System.out.println("Masukan Jarak Tempuh Awal");
                                                JTA = input.nextFloat();
                                                kendaraan1.setKendaraan(ID, bb, JTA, JT);
                                                break;
                                
                                            case 4:
                                    
                                                System.out.println("Masukan ID");
                                                ID = input.nextInt();
                                                kendaraan1.setKendaraan(ID, bb, JTA, JT);
                                                break;
                                
                                            default :
                                    
                                                System.out.println("Hanya masukan 1 sampai 4");
                                                break;
                                        }
                                    }
                                    while (a<1 || a >4); //while untuk do ketiga
                                    break;
                        
                                default:
                                    System.out.println("Hanya masukan 1 dan 0");
                                    break;
                            }
                        } 
                        while(b!=1&&b!=0); //while untuk do ke 2
                
                        do{ //do keempat setelah pembuatan objek
                
                            System.out.println("Apakah anda sudah yakin?"
                                + "\n(0 untuk ya dan 1 untuk tidak)");
                            b = input.nextInt();
                    
                            if (b!=1&&b!=0)
                                System.out.println("Hanya masukan 1 dan 0");
                
                        } 
                        while (b!=1&&b!=0); //while untuk o keempat
                        System.out.println("==");
                        kendaraan1.getinfo();
                        System.out.println("==");
                    }
                    while (b == 1); //while untuk do pertama
        
                    break;
            
                case 2:
                    
                    System.out.println("Masukan id kendaraan :");
                    ID = input.nextInt();
                    System.out.println("Masukan jarak tempuh awal kendaraan :");
                    JTA = input.nextFloat();
                    System.out.println("Masukan jarak tempuh kendaraan :");
                    JT = input.nextFloat();
                    System.out.println("Masukan jumlah bahan bakar yang sudah digunakanan :");
                    bb = input.nextFloat();
                    System.out.println("Masukan nama kendaraan :");
                    String NK = input.next();
                    System.out.println("Masukan tipe kendaraan :");
                    String TK = input.next();
                    System.out.println("Masukan kapasitas mesin :");
                    int KM = input.nextInt();
                    
                    Mobil mobil = new Mobil(ID,NK,TK,KM,JTA,JT,bb);
                    
                    do { //do pertama setelah pembuatan objek
                        do { //do kedua setelah pembuatan objek
                
                            System.out.println("Apakah anda mau mengganti variabel yang sudah ada?"
                                    + "\n(1 untuk ya dan 0 untuk tidak)");
                            b = input.nextInt();
                
                            switch (b){
                    
                                case 0:
                            
                                    break;
                    
                                case 1:
                        
                                    do{ //do ketiga setelah pembuatan objek
                                        System.out.println("Mana yang anda ingin ganti :"
                                                + "\n 1.  Bahan Bakar"
                                                + "\n 2. Jarak Tempuh"
                                                + "\n 3. Jarak Tempuh Awal"
                                                + "\n 4. ID"
                                                + "\n 5. Nama Kendaraan"
                                                + "\n 6. Tipe Kendaraan"
                                                + "\n 7. Ka[asitasn Mesin");
                        
                                        a = input.nextInt();
                        
                                        switch (a){
                            
                                            case 1:
                                        
                                                System.out.println("Masukan Bahan Bakar :");
                                                bb = input.nextInt();
                                                mobil.setKendaraan(ID, bb, JTA, JT);
                                                break;
                                
                                            case 2:
                                        
                                                System.out.println("Masukan Jarak Tempuh");
                                                JT = input.nextFloat();
                                                mobil.setKendaraan(ID, bb, JTA, JT);
                                                break;
                                
                                            case 3:
                                    
                                                System.out.println("Masukan Jarak Tempuh Awal");
                                                JTA = input.nextFloat();
                                                mobil.setKendaraan(ID, bb, JTA, JT);
                                                break;
                                
                                            case 4:
                                    
                                                System.out.println("Masukan ID");
                                                ID = input.nextInt();
                                                mobil.setKendaraan(ID, bb, JTA, JT);
                                                break;
                                
                                            case 5:
                                                
                                                System.out.println("Masukan Nama Kendaraan");
                                                NK = input.next();
                                                mobil.setNamaKendaraan(NK);
                                                break;
                                                
                                            case 6:
                                                
                                                System.out.println("Masukan Tipe Kendaraan");
                                                TK  = input.next();
                                                mobil.setTipeKendaraan(TK);
                                                break;
                                                
                                            case 7:
                                            
                                                System.out.println("Masukan Kapasitas Mesin");
                                                KM = input.nextInt();
                                                mobil.setKapasitasMesin(KM);
                                                break;
                                            
                                            default :
                                    
                                                System.out.println("Hanya masukan 1 sampai 7");
                                                break;
                                        }
                                    }
                                    while (a<1 || a >7); //while untuk do ketiga
                                    break;
                        
                                default:
                                    System.out.println("Hanya masukan 1 dan 0");
                                    break;
                            }
                        } 
                        while(b!=1&&b!=0); //while untuk do ke 2
                
                        do{ //do keempat setelah pembuatan objek
                
                            System.out.println("Apakah anda sudah yakin?"
                                + "\n(0 untuk ya dan 1 untuk tidak)");
                            b = input.nextInt();
                    
                            if (b!=1&&b!=0)
                                System.out.println("Hanya masukan 1 dan 0");
                
                        } 
                        while (b!=1&&b!=0); //while untuk o keempat
                        
                        System.out.println("==");
                        mobil.getinfo();
                        System.out.println("==");
                    }
                    while (b == 1); //while untuk do pertama
                    break;
            
                case 3:
                    
                    System.out.println("Masukan id kendaraan :");
                    ID = input.nextInt();
                    System.out.println("Masukan jarak tempuh awal kendaraan :");
                    JTA = input.nextFloat();
                    System.out.println("Masukan jarak tempuh kendaraan :");
                    JT = input.nextFloat();
                    System.out.println("Masukan jumlah bahan bakar yang sudah digunakanan :");
                    bb = input.nextFloat();
                    System.out.println("Masukan nama kendaraan :");
                    NK = input.next();
                    System.out.println("Masukan tipe kendaraan :");
                    TK = input.next();
                    
                    SepedaMotor spd = new SepedaMotor(ID,NK,TK,JTA,JT,bb);
                    
                    do { //do pertama setelah pembuatan objek
                        do { //do kedua setelah pembuatan objek
                
                            System.out.println("Apakah anda mau mengganti variabel yang sudah ada?"
                                    + "\n(1 untuk ya dan 0 untuk tidak)");
                            b = input.nextInt();
                
                            switch (b){
                    
                                case 0:
                            
                                    break;
                    
                                case 1:
                        
                                    do{ //do ketiga setelah pembuatan objek
                                        System.out.println("Mana yang anda ingin ganti :"
                                                + "\n 1.  Bahan Bakar"
                                                + "\n 2. Jarak Tempuh"
                                                + "\n 3. Jarak Tempuh Awal"
                                                + "\n 4. ID"
                                                + "\n 5. Nama Kendaraan"
                                                + "\n 6. Tipe Kendaraan");
                        
                                        a = input.nextInt();
                        
                                        switch (a){
                            
                                            case 1:
                                        
                                                System.out.println("Masukan Bahan Bakar :");
                                                bb = input.nextInt();
                                                spd.setKendaraan(ID, bb, JTA, JT);
                                                break;
                                
                                            case 2:
                                        
                                                System.out.println("Masukan Jarak Tempuh");
                                                JT = input.nextFloat();
                                                spd.setKendaraan(ID, bb, JTA, JT);
                                                break;
                                
                                            case 3:
                                    
                                                System.out.println("Masukan Jarak Tempuh Awal");
                                                JTA = input.nextFloat();
                                                spd.setKendaraan(ID, bb, JTA, JT);
                                                break;
                                
                                            case 4:
                                    
                                                System.out.println("Masukan ID");
                                                ID = input.nextInt();
                                                spd.setKendaraan(ID, bb, JTA, JT);
                                                break;
                                
                                            case 5:
                                                
                                                System.out.println("Masukan Nama Kendaraan");
                                                NK = input.next();
                                                spd.setNamaKendaraan(NK);
                                                break;
                                                
                                            case 6:
                                                
                                                System.out.println("Masukan Tipe Kendaraan");
                                                TK  = input.next();
                                                spd.setTipeKendaraan(TK);
                                                break;
                                            
                                            default :
                                    
                                                System.out.println("Hanya masukan 1 sampai 7");
                                                break;
                                        }
                                    }
                                    while (a<1 || a >6); //while untuk do ketiga
                                    break;
                        
                                default:
                                    System.out.println("Hanya masukan 1 dan 0");
                                    break;
                            }
                        } 
                        while(b!=1&&b!=0); //while untuk do ke 2
                
                        do{ //do keempat setelah pembuatan objek
                
                            System.out.println("Apakah anda sudah yakin?"
                                + "\n(0 untuk ya dan 1 untuk tidak)");
                            b = input.nextInt();
                    
                            if (b!=1&&b!=0)
                                System.out.println("Hanya masukan 1 dan 0");
                
                        } 
                        while (b!=1&&b!=0); //while untuk do keempat
                        
                        System.out.println("==");
                        spd.getinfo();
                        System.out.println("==");
                    }
                    
                    while (b == 1); //while untuk do pertama
                    break;
            
                default:
                    System.out.println("Hanya masukan 1 sampai 3 saja");
                    break;
            }
            
            do{
           
                System.out.println("Apakah anda ingin mengulang lagi?"
                        + "\n(1 untuk ya dan 0 untuk tidak)");
                c = input.nextInt();
                if (c!=1 && c!= 0)
                    System.out.println("Hanya masukan 1 atau 0");
            }
            while (c!= 1 && c != 0);
        }
        while (c==1);
    
    }
}