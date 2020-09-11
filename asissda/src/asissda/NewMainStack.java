package asissda;
import java.util.Scanner;
public class NewMainStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Stack");
        System.out.println("Masukan panjang stack yang diinginkan :");
        int a = input.nextInt();
        astack stack = new astack(a);
        while (a!=8){
            System.out.println("Pilihan:"
                    + "\n 1. Clear"
                    + "\n 2. Push"
                    + "\n 3. Pop"
                    + "\n 4. Top Value"
                    + "\n 5. Lenght"
                    + "\n 6. Mirror"
                    + "\n 7. Show"
                    + "\n 8. End");
            a = input.nextInt();
            switch (a){
                case 1:
                    stack.clear();
                    System.out.println("Stack sudah dibersihkan");
                    break;
                case 2:
                    System.out.println("Masukan elemen yang ingin dimasukan");
                    Object b = input.next();
                    try{
                        stack.push(b);
                        System.out.println("Berhasil dimasukan");
                    }
                    catch (Exception e){
                        System.out.println("Stack sudah penuh");
                    }
                    
                    break;
                case 3:
                    try{
                        System.out.println(stack.pop()+" berhasil dihapuskan");
                    }
                    catch (Exception e){
                        System.out.println("Stack sudah habis");
                    }
                    break;
                case 4:
                    try{
                        System.out.println("Nilai sekarang " + stack.topvalue());
                    }
                    catch (Exception e){
                        System.out.println("Stack sudah habis");
                    }
                    break;
                case 5:
                    System.out.println("Panjang stack sekarang "+stack.lenght());
                    break;
                case 6:
                    stack.mirror();
                    stack.show();
                    break;
                case 7:
                    stack.show();
                    break;
                case 8:
                    break;
                default :
                    System.out.println("Tolong masukan sesuai pilihan");
                    
            }
        }
    }
    
}
