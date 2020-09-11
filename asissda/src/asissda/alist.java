package asissda;
import java.util.Random;
public class alist<E> implements List<E> {
    private final int defaultsize = 10;
    private int maxsize;
    private int listsize;
    private int curr;
    private E[] listarray;
    
    public alist(){
        maxsize = defaultsize;
    }
    
    public alist(int maxsize){
        this.maxsize= maxsize;
        listsize = curr = 0;
        listarray = (E[]) new Object[maxsize];
    }
    
    @Override
    public void clear(){
        listsize = curr = 0;
    }
    
    @Override
    public void insert(E item){
        
        if(listsize >= maxsize)  
            System.out.println("Kapasitas list berlebih");
        else{
            
            for (int i = listsize; i>curr; i--)
                listarray[i] = listarray[i-1];
                listarray[curr] = item;
                listsize++;
        }
    }
    
    @Override
    public void append(E item){
        
        if(listsize >= maxsize) 
            System.out.println("Kapasitas list berlebih");
        else
            listarray[listsize++] = item;
    }
    
    @Override
    public E remove() {
        
        if ((curr < 0) ||(curr>=listsize))
            return null;
        E it = listarray[curr];
        
        for(int i = curr; i <listsize-1;i++)
            listarray[i] = listarray[i+1];
        
        listsize--;
        return it;
    }
    
    @Override
    public void movetostart(){
        curr=0;
    }
    
    @Override
    public void movetoend(){
        curr = listsize-1;
    }
    
    @Override
    public void prev(){
        if (curr !=0)
            curr--;
    }
    
    @Override
    public void next(){
        if (curr !=10)
            curr++;
    }
    
    public void show(){
        System.out.println("list :");
        
        for (int i = 0;i<listsize;i++)
            System.out.print(listarray[i]+"  ");
        
        System.out.println("");
    }
    
    @Override
     public int length(){
     return listsize;       
     }
     
    @Override
     public int currpos(){
         return curr+1;
     }
     
    @Override
     public void movetopost(int pos){
        
         if(pos>listsize||pos<1)
             System.out.println("Pos diluar list");
         else
            curr = pos-1;
     }
     
    @Override
     public E getValue(){
         return listarray[curr];
     }
     public int getMaxSize(){
        return maxsize;
    }
     
     public int getlocation(E item){
        int a=0;
         
        for(int i=1;i<=listsize;i++)
             
            if(listarray[i-1].equals(item))
                 a = i;
         
        return a;
     }
     
     public E retrieve(int a){
         return listarray[a];
     }
     
     public void reverse(){
         E[] temp = (E[]) new Object[maxsize];
         
         for (int i = listsize-1, j = 0;i>=0;i--,j++)
             temp[i] = listarray[j];
         
         for (int i = listsize-1;i>=0;i--)
             listarray[i] = temp[i];
     }
     
     public void swapi(int a, int b){
         E temp = listarray[b-1];
         listarray[b-1] = listarray[a-1];
         listarray[a-1] = temp;
     }
     
     public void random(){
        int index;
        Random random = new Random();
        
        for (int i = listsize-1; i >=0; i--){
            index = random.nextInt(i + 1);
            
            if (index != i&&index>0&&index<=listsize)
                swapi(index,i);
        }
     }
     
     public int count(E item){
         int count = 0;
         
         for(int i=0; i<listsize; i++)
                 
             if(listarray[i].equals(item))
                 count++;
         
         return count;
     }
        
}
