package latihan1_bentuk;

public class Bentuk {
    private String warna;
    public String getWarna(){
        return warna;
    }
    public void setWarna(String w){ 
        warna = w;
    }
    public void printInfo(){
        System.out.println("Bentuk berwarna "+getWarna());
    }
}

class Bujursangkar extends Bentuk{
    private double sisi;
    public double getSisi(){
        return sisi;
    }
    public void setSisi(double s){
        sisi = s;
    }
    public double hitungLuas(){
        double luas=0;
        if (sisi>=0)
            luas = Math.pow(sisi, 2);
        else
            System.out.println("Tidak ada panjang sisi kurang dari 0");
        return luas;
    } 
    public void printInfo(){
        System.out.println("Bujursangkar berwarna "+getWarna()+", luas = "+hitungLuas());
    }
}
class Segitiga extends Bentuk{
    private double alas, tinggi;
    public void setAlas(double c){
        alas = c;
    }
    public void setTinggi( double t){
        tinggi = t;
    }
    public double HitLuas(){
        double luas=0;
        if (alas>=0 && tinggi>=0)
            luas = 0.5 * alas * tinggi;
        else
            System.out.println("Tidak ada panjang alas dan tinggi kurang dari 0");
        return luas;
    }
    public String jenisSegitiga(){
        String jenis;
        if (HitLuas()>100)
            jenis="Segitiga Besar";
        else if (HitLuas()>=50&&HitLuas()<=100)
            jenis="Segitiga Sedang";
        else 
            jenis="Segitiga Kecil";
        return jenis;
    }
}