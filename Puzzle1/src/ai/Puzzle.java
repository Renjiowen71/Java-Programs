
package ai;

public class Puzzle {
    private int[][] target;
    private int[][] start;
    private int[][] process;
    private int[] now;
    private int[] size;
    private int step;
    
    public Puzzle(int a, int b, int[][]t, int[][]s){
        target = t;
        start = s;
        
        process = new int[a][b];
        for(int i = 0;i<t.length;i++)
            for(int j = 0;j<t[0].length;j++)
                process[i][j] = s[i][j];
        now = new int[2];
        size = new int[]{a,b};
        findstart();
        step = 0;
    }
    
    public int[][] getstart(){
        return start;
    }
    public int[][] gettarget(){
        return target;
    }
    public int[][] getprocess(){
        return process;
    }
    
    
    public int[] getnow(){
        return now;

    }
    
    public void right(){
        if(now[1] != size[1]-1){
            step++;
            swap(now[0],now[1]+1);
        }
    }
    
    public void left(){
        if(now[1] != 0){
            step++;
            swap(now[0],now[1]-1);
        }
    }
    
    public void down(){
        if(now[0] != size[0]-1){
            step++;
            swap(now[0]+1,now[1]);
        }
    }
    
    public void up(){
        if(now[0] != 0){
            step++;
            swap(now[0]-1,now[1]);
        }
    }

    private void swap(int a, int b){
        process[now[0]][now[1]] = process[a][b];
        process[a][b] = 0;
        now[0] = a;
        now[1] = b;

    }
    
    public void printtarget(){
        System.out.println("Target :");
        for(int i = 0; i<size[0];i++){
            for(int j = 0; j<size[1];j++)
                System.out.print(target[i][j]);
            System.out.println("");
        }
    }
    
    public void printprocess(){
        System.out.println("Langkah ke-"+step);
        for(int i = 0; i<size[0];i++){
            for(int j = 0; j<size[1];j++)
                System.out.print(process[i][j]);
            System.out.println("");
        }
    }
    
    public void printstart(){
        System.out.println("Start :");
        for(int i = 0; i<size[0];i++){
            for(int j = 0; j<size[1];j++)
                System.out.print(start[i][j]);
            System.out.println("");
        }
    }
    
    public boolean finish(){
        for(int i = 0; i<target.length;i++)
            for(int j = 0; j<target[i].length ;j++)
                if (target[i][j] != process[i][j])
                    return false;
            return true;
    }
    
    private void findstart(){
        for(int i =0;i<size[0];i++)
            for(int j = 0; j<size[1];j++)
                if(process[i][j] == 0){
                    now[0] = i;
                    now[1] = j;
                }
                    
    }
    
    public int[] findstart(int a){
        int[] temp = new int[2]; 
        for(int i =0;i<size[0];i++)
            for(int j = 0; j<size[1];j++)
                if(start[i][j] == a){
                    temp[0] = i;
                    temp[1] = j;
                }
        return temp;
    }
    
    public int[] findtarget(int a){
        int[] temp = new int[2]; 
        for(int i =0;i<size[0];i++)
            for(int j = 0; j<size[1];j++)
                if(target[i][j] == a){
                    temp[0] = i;
                    temp[1] = j;
                }
        return temp;
    }
}