package mobilinterface;

interface interfacemobil{

    public void nyalakanmesin();
    
    public void matikanmesin();
    
    public void tambahkangerigi();
    
    public void turunkangerigi();
    
    public void tekangas();
    
    public void tekanrem();
    
    
}

interface interfacesirine{
    
    public void nyalakansirine();
    
    public void matikansirine();
    
    public void gantisuarasirine(int jenis);
}

public abstract class mobil implements interfacemobil{

    private boolean mesin = false;

}

abstract class mobiltransportasi extends mobil{
    
    private int jmlkursi;
    
    public abstract void tambahpenumpang();
}

class bus extends mobiltransportasi{
    
    public void nyalakantape(){
        
    }
    
    public void nyalakantv(){
        
    }
    
    public void nyalakanac(){
        
    }
    
    @Override
    public void nyalakanmesin(){
        
    }
    
    @Override
    public void matikanmesin(){
        
    }
    
    @Override
    public void tambahkangerigi(){
        
    }
    
    @Override
    public void turunkangerigi(){
        
    }
    
    @Override
    public void tekangas(){
        
    }
    
    @Override
    public void tekanrem(){
        
    }
    
    @Override
    public void tambahpenumpang(){
        
    }
}

class mobilpribadi extends mobil{
    
    public void nyalakantape(){
        
    }
    
    public void nyalakantv(){
        
    }
    
    public void nyalakanac(){
        
    }
    
    @Override
    public void nyalakanmesin(){
        
    }
    
    @Override
    public void matikanmesin(){
        
    }
    
    @Override
    public void tambahkangerigi(){
        
    }
    
    @Override
    public void turunkangerigi(){
        
    }
    
    @Override
    public void tekangas(){
        
    }
    
    @Override
    public void tekanrem(){
        
    }
}

abstract class mobilnegara extends mobil implements interfacesirine{
    
    public abstract void nyalakantape();
    
    public abstract void nyalakantv();
    
    public abstract void nyalakanac();
}

class ambulance extends mobilnegara{
    
    @Override
    public void nyalakantape(){
        
    }
    
    @Override
    public void nyalakantv(){
        
    }
    
    @Override
    public void nyalakanac(){
        
    }
    
    @Override
    public void nyalakanmesin(){
        
    }
    
    @Override
    public void matikanmesin(){
        
    }
    
    @Override
    public void tambahkangerigi(){
        
    }
    
    @Override
    public void turunkangerigi(){
        
    }
    
    @Override
    public void tekangas(){
        
    }
    
    @Override
    public void tekanrem(){
        
    }
    
    @Override
    public void nyalakansirine(){
        
    }
    
    @Override
    public void matikansirine(){
        
    }
    
    @Override
    public void gantisuarasirine(int jenis){
        
    }
}

class mobilpolisi extends mobilnegara{
    
    @Override
    public void nyalakantape(){
        
    }
    
    @Override
    public void nyalakantv(){
        
    }
    
    @Override
    public void nyalakanac(){
        
    }
    
    @Override
    public void nyalakanmesin(){
        
    }
    
    @Override
    public void matikanmesin(){
        
    }
    
    @Override
    public void tambahkangerigi(){
        
    }
    
    @Override
    public void turunkangerigi(){
        
    }
    
    @Override
    public void tekangas(){
        
    }
    
    @Override
    public void tekanrem(){
        
    }
    
    @Override
    public void nyalakansirine(){
        
    }
    
    @Override
    public void matikansirine(){
        
    }
    
    @Override
    public void gantisuarasirine(int jenis){
        
    }
    
    public void nyalakanradioht(){
        
    }
    
    public void matikanradioht(){
        
    }
}