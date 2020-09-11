
package menghitungpi;
import java.util.Scanner;
public class Menghitungpi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan n (Semakin besar n semakin tepat nilai pi):");
        double n = input.nextDouble();
        double pi = 0;
        for (double i = 1; i<=n;i++){
            double q = Math.pow(-1, i + 1)/(2 *i - 1);
            pi = pi + q;
        }
        pi = pi*4;
        System.out.println(pi);
    }
    
}
