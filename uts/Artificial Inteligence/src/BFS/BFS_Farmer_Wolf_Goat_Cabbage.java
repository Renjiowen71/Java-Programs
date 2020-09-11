package BFS;

/**
 *
 * @author Hengky
 */
public class BFS_Farmer_Wolf_Goat_Cabbage {
        static int trip;
        static int sumresult;
        static String[] moveres;
        static int[][][] results;
        static int index;
        
        public static void equal(int[][]a, int[][] b){
                for(int i=0;i<a.length;i++)
                        for(int j =0;j<a[0].length;j++)
                                a[i][j]=b[i][j];
        }
        
        public static boolean can(int[][] a){
                if((a[(trip-1)%2][2]==1&&a[(trip-1)%2][3]==1)||(a[(trip-1)%2][2]==1&&a[(trip-1)%2][1]==1))
                        return true;
                return false;
        }
    
        public static boolean win(int[][] a){
                for(int i =0;i<4;i++)
                        if(a[1][i] != 1)
                                return false;
                return true;
        }
        
        public static void BreadthFirstSearch(int[][][] a){
        boolean cari_lagi = true;
        trip++;
        sumresult++;
        moveres = new String[sumresult];
        results = new int[sumresult][2][4];
        // untuk setiap x di a, dicari elemen-elemen di bawahnya
        int b[][][] = new int[4*a.length][2][4];
        String[] move = new String[4*a.length];
        for(int i = 0; i < a.length; i++) {
            if (a[i][0][0]==0&&a[i][1][0]==0)
                continue;
            int [][]c = new int[2][4];
            int [][]d = new int[2][4];
            int [][]e = new int[2][4];
            int [][]f = new int[2][4];
            
            equal(c,a[i]);
            c[0][0] = (c[0][0]+1)%2;
            c[1][0] = (c[1][0]+1)%2;
            equal(e,c);
            equal(d,c);
            equal(f,c);
            if(can(c)){
                c[trip%2][0] = 0;
            }
            move[4*i] = "The farmer crosses the river.";
            // jika ditemukan maka berhenti
            equal(b[4*i],c);
            if(win(c)) {
                cari_lagi = false;
                index = 4*i;
                break;
            }
            d[(trip-1)%2][1]--;
            d[(trip)%2][1]++;
            move[4*i+1] = "The farmer takes the wolf and crosses the river.";
            if((d[(trip-1)%2][1]==-1) || can(d)){
                d[(trip)%2][0] = 0;
            }
            equal(b[4*i+1],d);
            // jika ditemukan maka berhenti
            if(win(d)) {
                cari_lagi = false;
                index = 4*i+1;
                break;
            }
            e[(trip-1)%2][2]--;
            e[(trip)%2][2]++;
            move[4*i+2] = "The farmer takes the goat and crosses the river.";
            if((e[(trip-1)%2][2]==-1) || can(e)){
                e[(trip)%2][0] = 0;
            }
            equal(b[4*i+2],e);
            // jika ditemukan maka berhenti
            if(win(e)) {
                cari_lagi = false;
                index = 4*i+2;
                break;
            }
            f[(trip-1)%2][3]--;
            f[(trip)%2][3]++;
            move[4*i+3] = "The farmer takes the cabbages and crosses the river.";
            if((f[(trip-1)%2][3]==-1) || can(f)){
                f[(trip)%2][0] = 0;
            }
            equal(b[4*i+3],f);
            // jika ditemukan maka berhenti
            if(win(f)) {
                cari_lagi = false;
                index = 4*i+3;
                break;
            }
            
        }
        //print3(b);
        //System.out.println("------------------------");
        
        if(cari_lagi == true){
            BreadthFirstSearch(b);
        }
        sumresult--;
        for(int i = 0;i<a[0].length;i++)
            for(int j = 0;j<a[0][0].length;j++){
                results[sumresult][i][j] = b[index][i][j];
            }
        moveres[sumresult] = move[index];
        index = index/4;
        }
        
        public static void printmatrix(int a[][]){
                for (int i = 0;i<a.length;i++){
                        System.out.print("[ ");
                        for (int j = 0; j<a[0].length;j++)
                                if(a[i][j]==1){
                                        switch (j){
                                                case 0 :
                                                        System.out.print("Farmer ");
                                                        break;
                                                case 1 :
                                                        System.out.print("Wolf ");
                                                        break;
                                                case 2 :
                                                        System.out.print("Goat ");
                                                        break;
                                                default :
                                                        System.out.print("Cabbages ");
                                                        break;
                                        }
                                }
                        System.out.print("]");
                }
                System.out.println("");
        }
        
        public static void result(){
                for(int i = 0;i<results.length;i++){
                        System.out.println("");
                        System.out.println("Step "+(i+1));
                        System.out.println(moveres[i]);
                        printmatrix(results[i]);
                }
                System.out.println("");
        }

        public static void main(String[] args) {
                System.out.println("Initial :");
                System.out.println("[ Farmer Wolf Goat Cabbage ][ ]");
                int x[][] = {{0,0,0,0}, {1,1,1,1}};
                int a[][][] = {{{1,1,1,1}, {0,0,0,0}}};
                BreadthFirstSearch(a);
                result();
        }
        
}