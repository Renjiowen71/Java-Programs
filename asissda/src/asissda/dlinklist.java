package asissda;
public class dlinklist<E> implements List<E> {
    private dlink<E> head;
    private dlink<E> tail;
    protected dlink<E> curr;
    int cnt;
    
    public dlinklist(){
        curr = tail = head = new dlink<E>(null, null);
        cnt = 0;
    }
    
    public void clear(){
        curr = tail = head = new dlink<E>(null, null);
        cnt = 0;
    }
    public void insert(E item){
        curr.setnext(new dlink<E>(item, curr, curr.getnext()));
        if(tail == curr)
            tail = curr.getnext();
        else
            curr.getnext().getnext().setprev(curr.getnext());
        cnt++;
    }
    public void append(E item){
        tail.setnext(new dlink<E>(item, tail, null));
        tail = tail.getnext();
        cnt++;
    }
    public E remove(){
        if(curr.getnext()==tail)
            return null;
        E it = curr.getnext().getelement();
        if(tail == curr.getnext().getnext())
        curr.setnext(curr.getnext().getnext());
        else{    
        curr.setnext(curr.getnext().getnext());
        curr.getnext().getnext().setprev(curr);}
        cnt--;
        return it;
    }
    public void movetostart(){
        curr= head;
    }
    public void movetoend(){
        curr = tail;
    }
    public void prev(){
        if(curr!=head)
            curr = curr.getprev();
    }
    public void next() {
        if(curr!=tail)
            curr = curr.getnext();
    }
    public int length(){
        return cnt;
    }
    public int currpos(){
        dlink<E> temp = head;
        int i;
        for (i = 0; curr!=temp; i++)
            temp = temp.getnext();
        return i;
    }
    public void movetopost(int pos){
        if(pos>=0&&pos<=cnt){
            curr = head;
            for(int i = 0; i<pos;i++)
                curr = curr.getnext();
        }
        else
            System.out.println("Posisi di luar hasil");
        }
    public E getValue(){
        if(curr.getnext() == null){
            E error = (E)"tidak ada yangdidapatkan";
            return error;
        }
        else
            return curr.getnext().getelement();
        }
    public void show(){
        System.out.println("linknya =");
        dlink<E> lihat = head.getnext();
        while(lihat!=null){
            System.out.print(lihat.getelement()+" ");
        lihat = lihat.getnext();
        }
        System.out.println("");
        }

    

    
}
