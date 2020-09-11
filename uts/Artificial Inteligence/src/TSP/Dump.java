/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TSP;

import java.util.List;

/**
 *
 * @author Hengky
 */
public class Dump {

        /**
         * @param args the command line arguments
         */
        public static void printmatrix(int a[][]){
                for (int i = 0;i<a.length;i++){
                        for (int j = 0; j<a[0].length;j++)
                                System.out.print(a[i][j]+" ");
                        System.out.println("");
                }
                System.out.println("");
        }
        public static void main(String[] args) {
                // TODO code application logic here
                String temp="";
                temp=temp+"HAHA";
//                System.out.println(temp);
                int adjacency_matrix[][] = {
                                {6,5,1,1},  // Node 1: 40
                                {9,7,1,1},  // Node 2 :10
                                {1,1,8,1},  // Node 3: 20
                                {1,1,1,4},  // Node 4: 30
                };
//                System.out.println(adjacency_matrix[1][0]);
                int[][][] group = new int[4][][];
                        for(int j=0; j<4; j++){
                                group[j]=adjacency_matrix;
                        }
                for(int i=0; i<4; i++){
//                        int adjacency_matrix2[][]=adjacency_matrix;
                        for (int j = 0; j < group[i][i].length; j++) {
                                group[i][i][j]=0;
                                printmatrix(group[i]);
                        }
                        System.out.println("Group"+i);
                        printmatrix(group[i]);
                }
        }
        
}
