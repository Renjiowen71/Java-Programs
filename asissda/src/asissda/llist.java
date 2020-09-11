/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asissda;

/**
 *
 * @author ASUS
 * @param <E>
 */
public class llist<E> implements List<E> {
    private link<E> head;
    private link<E> tail;
    protected link<E> curr;
    int cnt;
    llist(int size) {
        this();
    }
    llist(){
        curr = tail = head = new link<E>(null);
        cnt = 0;    
    }
    public void show(){
        System.out.println("link awal akhir = ");
        link<E> lihat = head.getnext();
        while(lihat!=null){
            //lihat.tampillink();
           System.out.println(lihat.getelement()+" ");
           lihat = lihat.getnext();
           }
        System.out.println("");
    }
    
    public void clear(){
        head.setnext(null);
        curr = head= tail = new link<E>(null);
    }
    
    public void insert(E item){
        curr.setnext(new link<E>(item,curr.getnext()));
        if(tail == curr)
            tail = curr.getnext();
        cnt++;
    }
    
    public E remove(){
        if(curr.getnext()==null) 
            return null;
        E it = curr.getnext().getelement();
        if(tail == curr.getnext())
            tail = curr;
        curr.setnext(curr.getnext().getnext());
        cnt--;
        return it;
    }

    @Override
    public void append(E item) {
        tail.setnext(new link<E>(item,null));
        tail = tail.getnext();
        cnt++;
    }

    @Override
    public void movetostart() {
        curr = head;
    }

    @Override
    public void movetoend() {
        curr = tail;
    }

    @Override
    public void prev() {
        if(curr == head) 
            return;
        link<E> temp = head;
        while (temp.getnext() != curr){
            temp = temp.getnext();
            curr = temp;
        }
    }

    @Override
    public void next() {
        if(curr != tail)
            curr = curr.getnext();
    }

    @Override
    public int length() {
        return cnt;
    }

    @Override
    public int currpos() {
        link<E> temp = head;
        int i;
        for(i = 0; curr!=temp ;i++)
            curr = curr.getnext();
        return i;
    }

    @Override
    public void movetopost(int pos) {
        if(pos>= 0 && pos<=cnt){
            curr = head;
            for (int i = 0 ; i<pos;i++)
                curr = curr.getnext();
        }
        else
            System.out.println("Posisi diluar hasil");
    }

    @Override
    public E getValue() {
        if(curr.getnext().equals(null)){
            E error = (E) "tidak ada yang didapatkan";
            return error;
        }
        else
            return curr.getnext().getelement();
    }

    
}
