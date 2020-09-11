package BFS;

import java.util.Stack;
/**
 *
 * @author Hengky
 */
public class BFS_3_puzzle {
        static int sumresult;
        static String[] moveres;
        static int[][][] results;
        static int index;
        static Stack s;
        
        public static void equal(int[][]a, int[][] b){
                for(int i=0;i<a.length;i++)
                        for(int j =0;j<a[0].length;j++)
                                a[i][j]=b[i][j];
        }
        
        public static boolean finish(int[][] a,int[][] b){
                for(int i=0;i<a.length;i++)
                        for(int j =0;j<a[0].length;j++)
                                if(a[i][j]!=b[i][j])
                                        return false;
                return true;
        }
        
        public static int[] find(int a , int[][]x){
                int[] temp = new int[2]; 
                for(int i =0;i<x.length;i++)
                        for(int j = 0; j<x[0].length;j++)
                                if(x[i][j] == a){
                                        temp[0] = i;
                                        temp[1] = j;
                                }
                return temp;
        }
        
        public static void print(int[][][]a){
                for(int j=0;j<a[0].length;j++){
                        for(int k = 0;k<a.length;k++){
                                for(int i= 0;i<a[0][0].length;i++)
                                        System.out.print(a[k][j][i]);
                                System.out.print(" ");
                        }
                        System.out.println("");
                }
        }
        
        public static void printmatrix(int a[][]){
                for (int i = 0;i<a.length;i++){
                        for (int j = 0; j<a[0].length;j++)
                                System.out.print(a[i][j]+" ");
                        System.out.println("");
                }
                System.out.println("");
        }
        
        public static void BreadthFirstSearch(int a[][][], int x[][]) {
                boolean cari_lagi = true;
                sumresult++;
                moveres = new String[sumresult];
                results = new int[sumresult][x.length][x[0].length];
                // untuk setiap x di a, dicari elemen-elemen di bawahnya
                int b[][][] = new int[4*a.length][x.length][x[0].length];
                String[] move = new String[4*a.length];
                
                for(int i = 0; i < a.length; i++) {
                        int c[][] = new int[x.length][x[0].length];
                        equal(c,a[i]);
                        int d[][] = new int[c.length][c[0].length];
                        equal(d,c);
                        int e[][] = new int[c.length][c[0].length];
                        equal(e,c);
                        if(c[0][0] == 0 && c[0][1] == 0)
                                continue;
                        if(c[0][0] == 0) {
                                d[0][0] = d[1][0];
                                d[1][0] = 0;

                                equal(b[4*i+2],d);
                                move[4*i+2] = "bawah";
                                if(finish(d,x)) {
                                        cari_lagi = false;
                                        index = 4*i+2;
                                        break;
                                }

                                e[0][0] = e[0][1];
                                e[0][1] = 0;

                                equal(b[4*i+1],e);
                                move[4*i+1] = "kanan";
                                if(finish(e,x)) {
                                        cari_lagi = false;
                                        index = 4*i+1;
                                        break;
                                }
                        }
                        
                        else if(c[0][x[0].length-1] == 0) {
                                d[0][x[0].length-1] = d[0][x[0].length-2];
                                d[0][x[0].length-2] = 0;

                                equal(b[4*i+3],d);
                                move[4*i+3] = "kiri";
                                if(finish(d,x)) {
                                        cari_lagi = false;
                                        index = 4*i+3;
                                        break;
                                }

                                e[0][x[0].length-1] = e[1][x[0].length-1];
                                e[1][x[0].length-1] = 0;

                                equal(b[4*i+2],e);
                                move[4*i+2] = "bawah";
                                if(finish(e,x)) {
                                        cari_lagi = false;
                                        index = 4*1+2;
                                        break;
                                }
                        }
                        
                        else if(c[x.length-1][0] == 0) {
                                d[x.length-1][0] = d[x[0].length-1][1];
                                d[x.length-1][1] = 0;

                                equal(b[4*i+1],d);
                                move[4*i+1] = "kanan";
                                if(finish(d,x)) {
                                        cari_lagi = false;
                                        index = 4*i+1;
                                        break;
                                }

                                e[x.length-1][0] = e[x.length-2][0];
                                e[x.length-2][0] = 0;

                                equal(b[4*i],e);
                                move[4*i] = "atas";
                                if(finish(e,x)) {
                                        cari_lagi = false;
                                        index = 4*i;
                                        break;
                                }
                        }
                        
                        else if(c[x.length-1][x[0].length-1] == 0){
                                d[x.length-1][x[0].length-1] = d[x.length-2][x[0].length-1];
                                d[x.length-2][x[0].length-1] = 0;
                
                                equal(b[4*i],d);
                                move[4*i] = "atas";
                                if(finish(d,x)) {
                                        cari_lagi = false;
                                        index = 4*i;
                                        break;
                                }

                                e[x.length-1][x[0].length-1] = e[x.length-1][x[0].length-2];
                                e[x.length-1][x[0].length-2] = 0;

                                equal(b[4*i+3],e);
                                move[4*i+3] = "kiri";
                                if(finish(e,x)) {
                                        cari_lagi = false;
                                        index = 4*i+3;
                                        break;
                                }
                        }
                        
                        else {
                                int[] nowloc = find(0,c);
                                int f[][] = new int[c.length][c[0].length];
                                equal(f,c);
                
                                if (nowloc[0] == 0){
                                        d[nowloc[0]][nowloc[1]] = d[nowloc[0]][nowloc[1]-1];
                                        d[nowloc[0]][nowloc[1]-1] = 0;

                                        equal(b[4*i+3],d);
                                        move[4*i+3] = "kiri";
                                        if(finish(d,x)) {
                                                cari_lagi = false;
                                                index = 4*i+3;
                                                break;
                                        }
                    
                                        e[nowloc[0]][nowloc[1]] = e[nowloc[0]][nowloc[1]+1];
                                        e[nowloc[0]][nowloc[1]+1] = 0;

                                        equal(b[4*i+1],e);
                                        move[4*i+1] = "kanan";
                                        if(finish(e,x)) {
                                                cari_lagi = false;
                                                index = 4*i+1;
                                                break;
                                        }
                    
                                        f[nowloc[0]][nowloc[1]] = f[nowloc[0]+1][nowloc[1]];
                                        f[nowloc[0]+1][nowloc[1]] = 0;

                                        equal(b[4*i+2],f);
                                        move[4*i+2] = "bawah";
                                        if(finish(f,x)) {
                                                cari_lagi = false;
                                                index = 4*i+2;
                                                break;
                                        }
                                }
                                
                                else if (nowloc[1] == 0){
                                        d[nowloc[0]][nowloc[1]] = d[nowloc[0]-1][nowloc[1]];
                                        d[nowloc[0]-1][nowloc[1]] = 0;
                    
                                        equal(b[4*i],d);
                                        move[4*i] = "atas";
                                        if(finish(d,x)) {
                                                cari_lagi = false;
                                                index = 4*i;
                                                break;
                                        }

                                        e[nowloc[0]][nowloc[1]] = e[nowloc[0]][nowloc[1]+1];
                                        e[nowloc[0]][nowloc[1]+1] = 0;

                                        equal(b[4*i+1],e);
                                        move[4*i+1] = "kanan";
                                        if(finish(e,x)) {
                                                cari_lagi = false;
                                                index = 4*i+1;
                                                break;
                                        }

                                        f[nowloc[0]][nowloc[1]] = f[nowloc[0]+1][nowloc[1]];
                                        f[nowloc[0]+1][nowloc[1]] = 0;

                                        equal(b[4*i+2],f);
                                        move[4*i+2] = "bawah";
                                        if(finish(f,x)) {
                                                cari_lagi = false;
                                                index = 4*i+2;
                                                break;
                                        }
                                }
                                
                                else if (nowloc[0] == x.length-1){
                                        d[nowloc[0]][nowloc[1]] = d[nowloc[0]][nowloc[1]-1];
                                        d[nowloc[0]][nowloc[1]-1] = 0;

                                        equal(b[4*i+3],d);
                                        move[4*i+3] = "kiri";
                                        if(finish(d,x)) {
                                                cari_lagi = false;
                                                index = 4*i+3;
                                                break;
                                        }

                                        e[nowloc[0]][nowloc[1]] = e[nowloc[0]][nowloc[1]+1];
                                        e[nowloc[0]][nowloc[1]+1] = 0;

                                        equal(b[4*i+1],e);
                                        move[4*i+1] = "kanan";
                                        if(finish(e,x)) {
                                                cari_lagi = false;
                                                index = 4*i+1;
                                                break;
                                        }

                                        f[nowloc[0]][nowloc[1]] = f[nowloc[0]-1][nowloc[1]];
                                        f[nowloc[0]-1][nowloc[1]] = 0;

                                        equal(b[4*i],f);
                                        move[4*i] = "atas";
                                        if(finish(f,x)) {
                                                cari_lagi = false;
                                                index = 4*i;
                                                break;
                                        }
                                }
                                
                                else if (nowloc[1] == x[0].length-1){
                                        d[nowloc[0]][nowloc[1]] = d[nowloc[0]][nowloc[1]-1];
                                        d[nowloc[0]][nowloc[1]-1] = 0;

                                        equal(b[4*i+3],d);
                                        move[4*i+3] = "kiri";
                                        if(finish(d,x)) {
                                                cari_lagi = false;
                                                index = 4*i+3;
                                                break;
                                        }

                                        e[nowloc[0]][nowloc[1]] = e[nowloc[0]-1][nowloc[1]];
                                        e[nowloc[0]-1][nowloc[1]] = 0;

                                        equal(b[4*i],e);
                                        move[4*i] = "atas";
                                        if(finish(e,x)) {
                                                cari_lagi = false;
                                                index = 4*i+1;
                                                break;
                                        }

                                        f[nowloc[0]][nowloc[1]] = f[nowloc[0]+1][nowloc[1]];
                                        f[nowloc[0]+1][nowloc[1]] = 0;

                                        equal(b[4*i+2],f);
                                        move[4*i+2] = "bawah";
                                        if(finish(f,x)) {
                                                cari_lagi = false;
                                                index = 4*i+2;
                                                break;
                                        }
                                }
                                
                                else{
                                        d[nowloc[0]][nowloc[1]] = d[nowloc[0]][nowloc[1]-1];
                                        d[nowloc[0]][nowloc[1]-1] = 0;

                                        equal(b[4*i+3],d);
                                        move[4*i+3] = "kiri";
                                        if(finish(d,x)) {
                                                cari_lagi = false;
                                                index = 4*i+3;
                                                break;
                                        }

                                        e[nowloc[0]][nowloc[1]] = e[nowloc[0]-1][nowloc[1]];
                                        e[nowloc[0]-1][nowloc[1]] = 0;

                                        equal(b[4*i],e);
                                        move[4*i] = "atas";
                                        if(finish(e,x)) {
                                                cari_lagi = false;
                                                index = 4*i;
                                                break;
                                        }

                                        f[nowloc[0]][nowloc[1]] = f[nowloc[0]+1][nowloc[1]];
                                        f[nowloc[0]+1][nowloc[1]] = 0;

                                        equal(b[4*i+2],f);
                                        move[4*i+2] = "bawah";
                                        
                                        if(finish(f,x)) {
                                                cari_lagi = false;
                                                index = 4*i+2;
                                                break;
                                        }
                                        
                                        int[][] g = new int[c.length][c.length];
                                        equal(g,c);
                                        g[nowloc[0]][nowloc[1]] = g[nowloc[0]][nowloc[1]+1];
                                        g[nowloc[0]][nowloc[1]+1] = 0;

                                        equal(b[4*i+1],g);
                                        move[4*i+1] = "kanan";
                                        if(finish(g,x)) {
                                                cari_lagi = false;
                                                index = 4*i+1;
                                                break;
                                        }
                                }
                        }
                }
        
                //print(b);
                //System.out.println("---------------------------------------");
        
                // jika belum ditemukan, maka perlu dilakukan proses berikutnya
                if(cari_lagi == true) {
                        BreadthFirstSearch(b, x);
                }
        
                sumresult--;
                
                for(int i = 0;i<x.length;i++)
                        for(int j = 0;j<x[0].length;j++)
                                results[sumresult][i][j] = b[index][i][j];
                moveres[sumresult] = move[index];
                index = index/4;
        }
        
        public static void result(){
                for(int i = 0;i<results.length;i++){
                        System.out.println("Langkah "+(i+1)+" :");
                        System.out.println("0 geser ke "+moveres[i]);
                        printmatrix(results[i]);
                }
        }
        
        public static void main(String[] args) {
                int goal[][] = {{0,1}, 
                             {2,3}};

                int a[][][] = {{{1,3},
                                {0,2}}};

                BreadthFirstSearch(a, goal);
                System.out.println("Awal :");
                printmatrix(a[0]);
                result();
        }
        
}