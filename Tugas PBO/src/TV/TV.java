package TV;
public class TV {
    private boolean ontv = false; 
    protected int channel = 0, volume = 0;
    public TV(){
        channel = 0;
        volume = 0;
    }
    
    public boolean getontv(){
        return ontv;
    }
    
    public int getchannel(){
        return channel;
    }
    
    public void setchannel(int a){
        channel = a;
    }
    
    public int getvolume(){
        return volume;
    }
    
    public void on(){
        ontv = true;
    }
    
    public void off(){
        ontv = false;
    }
    
    public void channelup(){
        if (getontv() == true)
            channel ++;
        channel = channel % 10;
    }
    
    public void channeldown(){
        if (getontv() == true)
            channel --;
        if (channel == -1)
            channel += 10;
    }
    
    public void volumeup(){
        if (getontv() == true)
            volume ++;
        if (getvolume()==11)
            volume = 10;    
    }
    
    public void volumedown(){
        if (getontv() == true)
            volume --;
        if (getvolume()== -1)
            volume = 0;
    }
    
    
    
    public void gambarchannel(int ch){
        switch (ch){
            case 0 :
                break;
            case 1 :
                break;
            case 2 :
                break;
            case 3 :
                break;
            case 4 :
                break;
            case 5 :
                break;
            case 6 :
                break;
            case 7 :
                break;
            case 8 :
                break;
            case 9 :
                break;
            case 69 :
                break;
            default :
                break;
                
        }
    }
}

class smarttv extends TV{
    private boolean oncable = false;
    protected int channelbefore = getchannel();
    protected int volumebefore = getvolume();
    
    public smarttv(){
        channel = 0;
        volume = 0;
    }
    
    public boolean getoncable(){
        return oncable;
    }
    public void oncable(){
        oncable = true;
    }
    
    public void offcable(){
        oncable = false;
    }
    
    @Override
    public void channelup(){
        channelbefore = channel;
        if (getontv() == true && getoncable() == true)
            channel ++;
        channel = channel % 100;
    }
    
    @Override
    public void channeldown(){
        channelbefore = channel;
        if (getontv() == true && getoncable() == true)
            channel --;
        if (channel == -1)
            channel += 100;
    }
    
    @Override
    public void volumeup(){
        if (getontv() == true && getoncable() == true)
            volume ++;
        if (getvolume()==11)
            volume = 10;    
    }
    
    @Override
    public void volumedown(){
        if (getontv() == true && getoncable() == true)
            volume --;
        if (getvolume()== -1)
            volume = 0;
    }
    
    
    public void mutevolume(){
        if (volume != 0){
            volumebefore = volume;
            volume = 0;}
        else if(volume == 0)
            volume = volumebefore;
    }
    
    public void setchannel(int ch){
        channelbefore = channel;
        channel = ch;
    }
    
    public void returnchannel(){
        int channelstorage;
        channelstorage = channel;
        channel = channelbefore;
        channelbefore = channelstorage;
    }
}
