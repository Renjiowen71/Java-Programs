package kuliah.senin;
import java.util.Scanner;
public class KuliahSenin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai (0 untuk berheti):");
        int a = input.nextInt();
        int i=0;
        int c = 0;
        for (i=i; a!=0;){
            i = i+a;
            c++;
        System.out.println("Masukan nilai (0 untuk berheti):");
        a = input.nextInt();}
        int q = i/c;   
        System.out.println("Jumlah data totalnya: "+i);
        System.out.println("Rata ratanya adalah "+q);
    }
    
}
