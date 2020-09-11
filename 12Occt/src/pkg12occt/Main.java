package pkg12occt;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Mypoint pointa = new Mypoint();
        Scanner input = new Scanner(System.in);
        int t = 1;
        System.out.println("Masukan koordinat x");
        int x = input.nextInt();
        System.out.println("Masukan koordinat y");
        int y = input.nextInt();
        pointa.setxy(x, y);
        
        while (t==1){
            System.out.println("Apa yang anda ingin lakukan "
                    + "\n 1. Merubah titik"
                    + "\n 2. Melakukan dilatasi"
                    + "\n 3. Melakukan translasi"
                    + "\n 4. Mengecek apakah segaris atau tidak");
            int q = input.nextInt();
            switch (q){
                case 1:
                    System.out.println("Masukan koordinat x");
                    x = input.nextInt();
                    System.out.println("Masukan koordinat y");
                    y = input.nextInt();
                    pointa.setxy(x, y);
                    pointa.info();
                    break;
                
                case 2:
                    System.out.println("Berapa besar dilatasinya");
                    int w = input.nextInt();
                    pointa = pointa.dilatasi(w);
                    pointa.info();
                    break;
                
                case 3:
                    System.out.println("Masukan besarnya translasi terhadap x");
                    int e = input.nextInt();
                    System.out.println("Masukan besarnya translasi terhadap y");
                    int r = input.nextInt();
                    Mypoint pointb = new Mypoint(e,r);
                    pointa = pointa.translasi(pointb);
                    pointa.info();
                    break;
                    
                case 4:
                    System.out.println("Masukan x titik ke 2");
                    e = input.nextInt();
                    System.out.println("Masukan y titik ke 2");
                    r = input.nextInt();
                    System.out.println("Masukan x titik ke 3");
                    int u = input.nextInt();
                    System.out.println("Masukan y titik ke 3");
                    int i = input.nextInt();
                    Mypoint pointc = new Mypoint(e,r);
                    Mypoint pointd = new Mypoint(u,i);
                    if (pointa.checkline(pointc, pointd))
                        System.out.println("Segaris");
                    else 
                        System.out.println("Tidak Segaris");
                    break;
                    
                case 5:
                    int quad = pointa.checkquad(pointa);
                    if (quad == 0 )
                        System.out.println("Titik berada pada koordinat");
                    else
                        System.out.println("Titik berada pada kuadran " + quad);
                
                default:
                    System.out.println("Jembut");
                    break;
            }
            System.out.println("Apakah anda ingin mengulang? Masukan 1 untuk ya");
            t = input.nextInt();
        }
    }
}
