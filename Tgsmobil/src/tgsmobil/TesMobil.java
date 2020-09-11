package tgsmobil;
import java.util.Arrays;
public class TesMobil {
    private String merek, warna, tipe;
    private int tahun, jumlah;
    
    public TesMobil(){
        
    }
    
   // Method untuk mengeset 
    public void setmerek(String mrk){
        merek = mrk;
    }
    
    public void setwarna(String wrn){
        warna = wrn;
    }
    
    public void settipe(String tp){
        tipe = tp;
    }
    
    public void settahun(int thn){
        tahun = thn;
    }
    
    public void setjumlah(int jmlh){
        jumlah = jmlh;
    }
    
    //method untuk mengambil
    public String getmerek(){
        return merek;
    }
    
    public String getwarna(){
        return warna;
    }
    
    public String gettipe(){
        return tipe;
    }
    
    public int gettahun(){
        return tahun;
    }
    
    public int getjumlah(){
        return jumlah;
    }
    
    //untuk mengambil info
    public void info(){
        System.out.println("Merek  : " + getmerek() +
                         "\nWarna  : " + getwarna() +
                         "\nTipe   : " + gettipe() +
                         "\nTahun  : " + gettahun() +
                         "\nJumlah : " + getjumlah() +
                         "\n=============================================================");
    }
}
