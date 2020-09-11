package asissda;
public class aqueue<E> {
    private int maxsize,front, rear,  length ;
    private E[] listarray;
    
    public aqueue(){
        this(10);
    }
    public aqueue(int maxsize){
        this.maxsize = maxsize+1;
        rear = 0;front=1;length = 0;
        listarray = (E[]) new Object[maxsize+1];
    }
    
    public void clear(){
        rear = 0;
        front = 1;
        length = 0;// baru
    }
    
    public void enqueue(E it){
        if((rear+2)%maxsize!=front){
            rear = (rear+1)%maxsize;
            listarray[rear] = it;
            length ++;
            System.out.println("Elemen sudah dimasukan");
        }
        else
            System.out.println("Queue sudah penuh");
    }
    
    public E dequeue(){
        if(length()!=0){
            E it=listarray[front];
            front = (front+1)%maxsize;
            length--;
            return it;
        }
        else
            return null;
    }
    
    public E frontvalue(){
        if(length()!=0)
            return listarray[front];
        else 
            return null;
    }
    
    public int length(){
        return length;
    }
    
    public void show(){
        if(length==0)
            System.out.println("Queue kosong");
        else{
            int j = front;
            for(int i = 0;i<length;i++,j++){
            System.out.print(listarray[(j+maxsize)%maxsize]+" ");
        }
        System.out.println("");
    }}
    public int[] find(E item){
        int []q = new int [sama(item)];
        for(int w=0,i = 0;i<maxsize;i++)
            if(item.equals(listarray[i])){
                q[w]=(i-front+maxsize)%maxsize;
                w++;}
        return q;
    }
    public int sama(E item){
        int j = front;
        int w = 0;
        for(int i = 0;i<maxsize;i++)
            if(item.equals(listarray[i]))
                w++;
        return w;
    }
}
