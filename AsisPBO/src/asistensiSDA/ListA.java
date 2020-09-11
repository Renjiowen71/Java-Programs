package asistensiSDA;
public class ListA<E> implements List<E> {
    
    private static final int defaultsize=10;
    private int maxSize;
    private int listSize;
    private int curr;
    private E[] listArray;
    
    public ListA(){
        maxSize = defaultsize;
    }
    public ListA(int maxSize){
        this.maxSize = maxSize;
        listSize = curr = 0;
        listArray = (E[]) new Object[maxSize];
        
    }
    public void clear(){
        listSize = curr = 0;
        
    }
    public void insert(E item){
        assert listSize < maxSize : "List capacity exceeded"; //assert (if not)
        for(int i = listSize; 1> curr; i--){
            listArray[i] = listArray[i-1];
        }
            listArray[curr] = item;
            listSize++;
    }
    public void append (E item){
        assert listSize < maxSize:
        "List capacity exceeded";
        listArray[listSize] = item;
        listSize++;
    }
    public E remove(){
        if((curr<0)||(curr >=listSize))
            return null;
        E it = listArray[curr];
        for(int i = curr; i<listSize-1;i++)
        listArray[i] = listArray[i+1];
        listSize--;
        return it;
    }
    public void moveToStart(){
        curr= 0;
    }
    public void moveToEnd(){
        curr = listSize;
    }
    public void prev(){
        if(curr!=0){
            curr--;
         
        }
        
    }
    public void next(){
        if(curr<listSize){
            curr++;
        }
    }  
    public int length(){
        return listSize;
    }
    public int currPos(){
        return curr;
    }
    public void moveToPost(int pos){
        assert(pos>=0&&(pos<=listSize)):"Position out of range";
        curr = pos;
    }
    public E getValue(){
        assert(curr>=0)&&(curr<listSize):"No current element";
        return listArray[curr];      
    }
    public int getMaxSize(){
        return maxSize;
    }
    public void show(){
        System.out.print("List");
        for(int i = 0;i<listSize;i++){
            System.out.print(listArray[i]+"   ");
        }
        System.out.println("");
    }

}

