package latihan1_bentuk;

public class MainBentuk {

    public static void main(String[] args) {
        
        Bentuk b1 = new Bentuk();
        b1.setWarna("Kuning");
        b1.printInfo();
        
        System.out.println("");
        
        Bujursangkar b2 = new Bujursangkar();
        b2.setWarna("Merah");
        b2.setSisi(5.5);
        b2.printInfo();
        
        System.out.println("");
        
        Segitiga s1 = new Segitiga();
        s1.setWarna("Pink");
        s1.setAlas(4.999999);
        s1.setTinggi(20);
        s1.printInfo();
        System.out.println("Luas: "+s1.HitLuas());
        System.out.println("Jenis: "+s1.jenisSegitiga());
    }
}
