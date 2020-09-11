package asissda;
public interface queue<E> {
    public void clear();
    public void unqueue(E it);
    public E dequeue();
    public E frontvalue();
    public int length();
    
}
