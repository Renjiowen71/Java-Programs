/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luassim;
import java.util.Scanner;
public class Luassim {
   public static void main(String[] args) {
        
        System.out.print("Masukan nilai a :");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        System.out.print("Masukan nilai b :");
        double b  = input.nextDouble();
        System.out.print("Masukan nilai n:");
        double n = input.nextDouble();
        double delta, sum = 0;
        delta = (b - a)/(3*n);
        double luas = (Math.pow(a,2)+1)*delta;
        for (double i = 1; i<n ; i++){
            double q = a + i * delta;
            if (i%2 == 0)
                luas = luas + 2*(Math.pow(q,2)+1)*delta;
            else
                luas = luas + 4*(Math.pow(q,2)+1)*delta;
                }
        luas = luas + (Math.pow(b,2)+1)*delta;
        System.out.println("Luasnya adalah = " + sum);
    }
    
}
