package asissda;
public class astack<E> implements stack<E>{
    private static final int defaultsize = 10;
    private int maxsize;
    private int top;
    private E[] listarray;
    
    astack(){
        this(defaultsize);
    }
    astack(int size){
        maxsize = size;
        top = 0;
        listarray = (E[]) new Object[maxsize];
    }

    
    public void clear(){
        top = 0;
    }
    public void push(E it){
        listarray[top++] = it;
    }
    public E pop(){
        if(top == 0)
            return listarray[-1];
        return listarray[--top];
    }
    public E topvalue(){
        return listarray[top-1];
    }
    public int lenght(){
        return top;
    }
    public void show(){
        E[] temp = listarray;
        System.out.println("List :");
        for(int i=0;i<top;i++)
            System.out.println(pop()+" ");
        listarray = temp;
    }
    public void mirror(){
        E[] temp = (E[]) new Object[listarray.length];
        for(int i = 0; i<top;i++)
            temp[i] = pop();
        listarray = temp;
    }
    
}
