package pkg12occt;
public class Mypoint {
    private int x,y;
    public Mypoint(){
        x=0;y=0;
}
    public Mypoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setxy(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void info(){
        System.out.println("("+x +","+y+")");
    }
    public Mypoint dilatasi(int p){
        Mypoint q = new Mypoint();
        q.x = this.x * p;
        q.y = this.y * p;
        return q;
    }
    public Mypoint translasi( Mypoint p){
        Mypoint q = new Mypoint();
        q.x = this.x + p.x;
        q.y = this.y + p.y;
        return q;
    }
    public boolean checkline(Mypoint q, Mypoint w){
        double m1,m2;
        int r;
        if (q.x == x && w.x==x)
            r=1;
        else if (q.x == x)
            r = 0;
        else if (w.x== x)
            r = 0;
        else{
            m1 = (q.y - y)/(q.x - x);
            m2 = (w.y - y)/(w.x - x);
            if(m1 == m2)
                r = 1;
            else 
                r = 0;
        }
            
         if (r==1)
             return true;
         else 
             return false;
        
    }
    public int checkquad(Mypoint q){
        int quad = 0;
        if(q.x>0&&q.y>0)
            quad = 1;
        else if(q.x<0&&q.y>0)
            quad = 2;
        else if(q.x<0&&q.y<0)
            quad = 3;
        else if(q.x>0&&q.y<0)
            quad = 4;
        return quad;
    }
}