package MILF;
public class barang {
    
    protected int idbarang, jumlah, berat;
    protected String namabarang;
    
    barang(int id, int j, String nb, int b){
        idbarang= id;
        jumlah = j;
        namabarang = nb;
        berat = b;
    }
    
    public void setid(int id){
        idbarang = id;
    }
    
    public void setberat(int b){
        berat = b;
    }
    
    public void setjumlah(int jumlah){
        this.jumlah = jumlah;
    }
    
    public void setnamabarang(String nb){
        namabarang = nb;
    }
    
    public int getid(){
        return idbarang;
    }
    
    public String getnama(){
        return namabarang;
    }
    
    public int getjumlah(){
        return jumlah;
    }
    
    public int getberat(){
        return berat;
    }
    public String getloc(){
        String q ="";
        int t = 0;
        if (berat>=2000)
            q = "bottom";
        else if (berat >= 1000)
            q = "middle";
        else 
            q = "top";
        if (jumlah >= 200)
            t = 1;
        else if (jumlah >= 100)
            t = 2;
        else
            t = 3;
            
        return ("a" + " " +t +" "+q);
    }
    
    public void getinfo(){
        System.out.println("Id = "+getid());
        System.out.println("Nama = "+getnama());
        System.out.println("Total = "+getjumlah());
        System.out.println("Weight = " +getberat());
    }
}

class makananminuman extends barang{
    
    private int hariexp;
    
    makananminuman(int exp, int b, int id, String nama, int jumlah){
        super(id, jumlah, nama, b);
        hariexp = exp;
    }
    
    public String getloc(){
        String q ="";
        int t = 0;
        if (idbarang >= 1000)
            q = "bottom";
        else if (idbarang >= 100)
            q = "middle";
        else if (idbarang>= 10)
            q = "top";
        if (hariexp >= 365)
            t = 1;
        else if (hariexp >= 180)
            t = 2;
        else if(hariexp >=30)
            t = 3;
            
        return ("a" + " " +t +" "+q);
    }
    
    public void setexp(int exp){
        hariexp = exp;
    }
    
    
    public int getexp(){
        return hariexp;
    }
    
    
    @Override
    public void getinfo(){
        super.getinfo();
        System.out.println("Days before expired= "+getexp());
    }
}

class pembersih extends barang{
    private String barangdituju;
    
    pembersih(String bdt, int jumlah, int id, int b, String nama){
        super(id, jumlah, nama, b );
        barangdituju = bdt;
    }
    
    public String getbyd(){
        return barangdituju;
    }
    
    public void setbyd(String y){
        barangdituju = y;
    }
    @Override
    public void getinfo(){
        super.getinfo();
        System.out.println("Cleans ="+getbyd());
    }
    
}

class rumahtangga extends barang{
    
    private int panjang, lebar, tinggi;
    
    rumahtangga(int panjang, int lebar, int tinggi, int jumlah, int id, String nb, int b){
        super (id, jumlah, nb, b);
        this. lebar = lebar;
        this. panjang = panjang;
        this. tinggi = tinggi;
    }
    
    public int getpanjang(){
        return panjang;
    }
    public int getlebar(){
        return lebar;
    }
    public int gettinggi(){
        return tinggi;
    }
    public void setp(int p){
        panjang = p;
    }
    public void setl(int l){
        lebar = l;
    }
    public void sett(int t){
        tinggi = t;
    }
    public int getvol(){
        return(panjang*tinggi*lebar);
    }
 
    @Override
    public void getinfo(){
        super.getinfo();
        System.out.println("Volume ="+getvol());
    }
    
    @Override
    public String getloc(){
        String q ="";
        int t = 0;
        if (berat>=2000)
            q = "bottom";
        else if (berat >= 1000)
            q = "middle";
        else 
            q = "top";
        if (getvol() >= 200)
            t = 1;
        else if (getvol() >= 100)
            t = 2;
        else
            t = 3;
            
        return ("a" + " " +t +" "+q);
    }
}
