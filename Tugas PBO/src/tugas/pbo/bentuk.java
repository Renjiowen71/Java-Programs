package tugas.pbo;
public class bentuk {
    private String warna;
    
    public bentuk(){
    
    }
    
    public String getwarna(){
        return warna;
    }
    
    public void setwarna(String w){ 
        warna = w;
    }
    
    public void printinfo(){
        System.out.println("Warnanya "+getwarna());
    }
}

class bujursangkar extends bentuk{
    private double sisi;
    public double getsisi(){
        return sisi;
    }
    public void setsisi(double s){
        sisi = s;
    }
    public double hitungluas(){
        double luas=0;
        if (sisi>=0)
            luas = sisi*sisi;
        else
            System.out.println("Panjang sisinya kurang dari 0");
        return luas;
    } 
    public void printinfo(){
        System.out.println("Warnanya "+getwarna()+", dan luasnya "+hitungluas());
    }
}
class segitiga extends bentuk{
    private double alas, tinggi;
    public void setalas(double a){
        alas = a;
    }
    public void settinggi( double t){
        tinggi = t;
    }
    public double hitungluas(){
        double l=0;
        if (alas>=0 && tinggi>=0)
            l = 0.5 * alas * tinggi;
        else
            System.out.println("Alas atau tingginya ada yang kurang dari 0");
        return l;
    }
    public String jenissegitiga(){
        String segitiga;
        if (hitungluas()>100)
            segitiga="Segitiga besar";
        else if (hitungluas()>=50&&hitungluas()<=100)
            segitiga="Segitiga sedang";
        else 
            segitiga="Segitiga kecil";
        return segitiga;
    }
    
}
