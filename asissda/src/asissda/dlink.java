package asissda;
public class dlink<E> {
    private E element;
    private dlink<E> next;
    private dlink<E> prev;
    
    public dlink(E element, dlink<E> prev, dlink<E> next){
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
    public dlink(dlink<E> prev, dlink<E> next){
        this.next = next;
        this.prev = prev;
    }
    public E getelement(){
        return element;
    }
    public void setelement(E element){
        this.element = element;
    }
    public dlink<E> getnext(){
        return next;
    }
    public void setnext(dlink<E> next){
        this.next = next;
    }
    public dlink<E> getprev(){
        return prev;
    }
    public void setprev(dlink<E> prev){
        this.prev = prev;
    }
    
}
