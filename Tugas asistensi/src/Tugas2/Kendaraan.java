package Tugas2;
public class Kendaraan {
    
    private int idKendaraan;
    protected float jarakTempuhAwal, jarakTempuh;
    private float bahanbakar;
    
    public Kendaraan(int ID, float JTA, float JT, float bb){
        idKendaraan = ID;
        jarakTempuhAwal = JTA;
        jarakTempuh = JT;
        bahanbakar = bb;
    }
    
    //Method untuk set
    public void setKendaraan(int ID, float bb, float JTA, float JT){
        idKendaraan = ID;
        bahanbakar = bb;
        jarakTempuhAwal = JTA;
        jarakTempuh = JT;
    }
    
    //Method untuk get
    public int getId(){
        return idKendaraan;
    }
    
    public float getBahanBakar(){
        return bahanbakar;
    }
    
    public float getJarakTempuhAwal(){
        return jarakTempuhAwal;
    }
    
    public float getJarakTempuh(){
        return jarakTempuh;
    }
    
    public float getTotalJarak(){
        return jarakTempuhAwal + jarakTempuh;
    }
   
    public String efektivitas(){
        if (0 <= jarakTempuh || jarakTempuh >= 500)
            return "jarak tempuh tidak efektif";
        else if (0 <= bahanbakar || bahanbakar >= 500)
            return"bahan bakar tidak efektif";
        else{
            double e = Math.exp(bahanbakar/Math.floor(jarakTempuh)) * Math.log10(2);
        if (0<=e && e<=500)
            return "efektif";
        else
            return "tidak efektif";
        }
    }
    
    //Method mengambil info
    public void getinfo(){
        System.out.println("Id kendaraannya " +getId());
        System.out.println("Jarak tempuh awalnya " +getJarakTempuhAwal());
        System.out.println("Jarak tempuhnya " +getJarakTempuh());
        System.out.println("Jarak tempuh totalnya " + getTotalJarak());
        System.out.println("Efektifitasnya dinilai " +efektivitas());
    }
}

class Mobil extends Kendaraan {
    
    private String namaKendaraan, tipeKendaraan;
    private int kapasitasMesin;
    
    public Mobil(int ID, String nK, String tK, int KM, float JTA, float JT, float bb) {
        super(ID,JTA,JT,bb);
        namaKendaraan = nK;
        tipeKendaraan = tK;
        kapasitasMesin = KM;
    }
    
    //Method untuk set
    public void setNamaKendaraan(String nK){
        namaKendaraan = nK;
    }
    
    public void setTipeKendaraan(String tK){
        tipeKendaraan = tK;
    }
    
    public void setKapasitasMesin(int KP){
        kapasitasMesin = KP; 
    }
    
    //Method untuk get
    public String getNama(){
        return namaKendaraan;
    }
    
    public String getTipe(){
        return tipeKendaraan;
    }
    
    public int getKapasitasMesin(){
        return kapasitasMesin;
    }
    
    //Method untuk info
    public void getinfo(){
        System.out.println("Nama Kendaraannya adalah " + getNama());
        System.out.println("Tipe Kendaraannya adala" + getTipe());
        System.out.println("Kpasitas mesinnya " + getKapasitasMesin());
        System.out.println("Total jaraknya " + getTotalJarak());
        System.out.println("Bahan bakarnya "+ getBahanBakar());
        System.out.println("Efektifitasnya dinilai " +efektivitas());
    }
}

class SepedaMotor extends Kendaraan {
    
    private String namaKendaraan, tipeKendaraan;
    
    public SepedaMotor(int ID, String nK, String tK,  float JTA, float JT, float bb) {
        super(ID,JTA,JT,bb);
        namaKendaraan = nK;
        tipeKendaraan = tK;
    }
    
    //Method untuk set
    public void setNamaKendaraan(String nK){
        namaKendaraan = nK;
    }
    
    public void setTipeKendaraan(String tK){
        tipeKendaraan = tK;
    }
    
    //Method untuk get
    public String getNama(){
        return namaKendaraan;
    }
    
    public String getTipe(){
        return tipeKendaraan;
    }
    
    
    //Method untuk info
    public void getinfo(){
        System.out.println("Nama Kendaraannya adalah " + getNama());
        System.out.println("Tipe Kendaraannya adala" + getTipe());
        System.out.println("Total jaraknya " + getTotalJarak());
        System.out.println("Bahan bakarnya "+ getBahanBakar());
        System.out.println("Efektifitasnya dinilai " +efektivitas());
    }
}