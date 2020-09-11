package nov21;
public class OperasiBilangan {
    private double bil1, bil2, hasil;
    
    public OperasiBilangan (){
        bil1 = 0;
        bil2 = 0;
        hasil = 0;
    }
    
    public OperasiBilangan (double bil1, double bil2){
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    
    public double jml(){
        hasil = bil1 + bil2;
        return hasil;
    }
    
    public double kurang(){
        hasil =  bil1 - bil2;
        return hasil;
    }
    
    public void setA(double a){
        bil1 = a;
    }
    
    public double getA(){
        return bil1 ;
    }
    
    public void setB(double b){
        bil2 = b;
    }
    
    public double getB(){
        return bil2;
    }
}
