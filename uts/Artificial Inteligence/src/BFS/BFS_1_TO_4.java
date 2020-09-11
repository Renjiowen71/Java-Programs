package BFS;

import java.util.Stack;
/**
 *
 * @author Hengky
 */
public class BFS_1_TO_4 {
        static Stack s = new Stack();;
        static int index;

        public static void BreadthFirstSearch(int a[], int x) {
                boolean cari_lagi = true;

                int b[] = new int[2*a.length];
                for(int i = 0; i < a.length; i++) {
                        b[2*i] = a[i]-1;

                        //berhenti jika sudah mencapai goal
                        if(b[2*i] == x) {
                                cari_lagi = false;
                                index = 2*i;
                                break;
                        }

                        b[2*i+1] = a[i]+1;

                        //berhenti jika sudah mencapai goal
                        if(b[2*i+1] == x) {
                                cari_lagi = false;
                                index = 2*i+1;
                                break;
                        }
                }
        
                //untuk print tree yang terbentuk
                //print(b);

                //jika belum ditemukan, maka perlu dilakukan pencarian berikutnya
                if(cari_lagi == true) {
                        BreadthFirstSearch(b, x);
                }
                s.push(b[index]);
                System.out.println(index);
                index = index/2;
        }
    
        public static void print(int a[]) {
                for(int i = 0; i < a.length; i++) {
                        System.out.print(a[i] + " ");
                }
                System.out.println();
        }
    
        public static void result(){
                while(s.empty()==false)
                        System.out.print(" -> "+s.pop());
                System.out.println("");
        }
    
        public static void main(String[] args) {
                int goal = 4;
                //initial
                int a[] = {1};
                BreadthFirstSearch(a, goal);
                System.out.print(a[0]);
                result();
        }
    
}