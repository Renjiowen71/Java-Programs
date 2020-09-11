/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import java.util.Scanner;
public class UTS {
    
    
    public static void main(String[] args) {
        int n = 5;
        int path[] = new int[n+1];
        path[0] = 0;
        int min = Integer.MAX_VALUE;
        int now = 0;
        int rnow = 0;
        int [][]edges = {
                                {0,2,1,1,3},  // Node 1: A
                                {2,0,1,2,3},  // Node 2 :B
                                {1,1,0,2,3},  // Node 3: C
                                {1,2,2,0,2},  // Node 4: D
                                {3,3,3,2,0}
                };
        for(int i = 1;i<n;i++){
            min = Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                if(edges[rnow][j]>0&&edges[rnow][j]<min){
                    min = edges[rnow][j];
                    now = j;
                    path[i] = j;
                }
                
            }
            
            for(int j = 0;j<n;j++){
                edges[j][rnow] = 0;
            }
            rnow = now;
        }
        for (int i = 0;i<=n;i++)
            System.out.print(path[i]+" ");
    }
        
    
}
