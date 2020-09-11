/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luastrap;

import java.util.Scanner;
public class Luastrap {
    public static void main(String[] args) {
        
        System.out.print("Masukan nilai a :");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        System.out.print("Masukan nilai b :");
        double b  = input.nextDouble();
        System.out.print("Masukan nilai n:");
        double n = input.nextDouble();
        double delta, sum = 0;
        delta = (b - a)/(2*n);
        for (double i = 0 ; i<n; i++){
            double q = Math.pow((a + i * delta),2);
            double w = Math.pow((a + (i+1)* delta),2);
            sum = sum + w + q + 2;
        }
        sum = sum*delta;
        System.out.println("Luasnya adalah = " + sum);
    }
    
}
