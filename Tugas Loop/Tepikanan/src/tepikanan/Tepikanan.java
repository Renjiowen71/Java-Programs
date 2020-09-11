
package tepikanan;
import java.util.Scanner;
public class Tepikanan {

    public static void main(String[] args) {
        
        System.out.print("Masukan nilai a :");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        System.out.print("Masukan nilai b :");
        double b  = input.nextDouble();
        System.out.print("Masukan nilai n:");
        double n = input.nextDouble();
        double delta, sum = 0;
        delta = (b - a)/n;
        for (double i = 0; i< n; i++){
            double q = a + (i+1)*delta;
            sum = sum + (Math.pow(q,2)+1) * delta;
            System.out.println(sum);
            
        }
        System.out.println("Luasnya adalah = "+sum);
    }
    
}
