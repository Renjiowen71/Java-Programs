package asissda;
import java.util.Scanner;
public class NewMainqueue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Queue");
        System.out.println("Masukan panjang queue yang diinginkan :");
        int a = input.nextInt();
        aqueue queue = new aqueue(a);
        while (a!=8){
            System.out.println("Pilihan:"
                    + "\n 1. Clear"
                    + "\n 2. Enqueue"
                    + "\n 3. Dequeue"
                    + "\n 4. Top Value"
                    + "\n 5. Lenght"
                    + "\n 6. Find"
                    + "\n 7. Show"
                    + "\n 8. End");
            a = input.nextInt();
            switch (a){
                case 1:
                    queue.clear();
                    System.out.println("Queue sudah dibersihkan");
                    break;
                case 2:
                    System.out.println("Masukan elemen yang ingin dimasukan");
                    Object b = input.next();
                    queue.enqueue(b);
                    System.out.println("Berhasil dimasukan");
                    
                    break;
                case 3:
                    Object j = queue.dequeue();
                    if(j!=null)
                        System.out.println(j+" berhasil dihapuskan");
                    else
                        System.out.println("Queue kosong");
                    break;
                case 4:
                    System.out.println("Nilai sekarang " + queue.frontvalue());
                    break;
                case 5:
                    System.out.println("Panjang stack sekarang "+queue.length());
                    break;
                case 6:
                    System.out.println("Masukan elemn yang ingin dicari");
                    Object q = input.next();
                    if(queue.sama(q)!=0){
                        int[] f = queue.find(q);
                        System.out.print("Elemen ada di ");
                        for(int i=0;i<queue.sama(q);i++)
                        System.out.print(" "+(f[i]+1));
                        System.out.println("");
                    }
                    else
                        System.out.println("Tidak ada elemen yang sama");
                    break;
                case 7:
                    queue.show();
                    break;
                case 8:
                    break;
                default :
                    System.out.println("Tolong masukan sesuai pilihan");
                    
            }
        }
    }
    
}
