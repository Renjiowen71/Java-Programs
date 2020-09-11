package asissda;
import java.util.InputMismatchException;
import java.util.Scanner;
public class NewMain {
    public static void main(String[] args) {
        
        int i = -1, f, g, a, b = -1; 
        Object d;
        Scanner scanner = new Scanner(System.in);
        
        do {
            try {
                System.out.println("Masukan ukuran list");
                i = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Silahkan coba kembali");
            }
            scanner.nextLine(); 
        } while (i <= 0);
        
        alist list = new alist(i);
        
        for (a=1;a==1;){
        System.out.println("Pilihan : "
                + "\n1.  Insert"
                + "\n2.  Append"
                + "\n3.  Clear"
                + "\n4.  Remove"
                + "\n5.  Move current to start"
                + "\n6.  Move current to end"
                + "\n7.  Prev "
                + "\n8.  Next"
                + "\n9.  Lenght"
                + "\n10. Current pos"
                + "\n11. Move to pos"
                + "\n12. Get value"
                + "\n13. Show"
                + "\n14. Get location"
                + "\n15. Retrieve"
                + "\n16. Reverse"
                + "\n17. Swap (indeks)"
                + "\n18. Swap (objek)"
                + "\n19. Random"
                + "\n20. Count"
                + "\n21. End");
        
            do {
                try {
                    System.out.println("Masukan pilihan anda");
                    b = scanner.nextInt();
                }
                catch (InputMismatchException e) {
                    System.out.println("Silahkan coba kembali");
                }
                scanner.nextLine(); 
            } while (b <= 0);
        
            switch (b){
                
                case 1:
                    System.out.println("Masukan objek yang ingin dimasukan");
                    d = scanner.next();
                    list.insert(d);
                    break;
                
                case 2:
                    System.out.println("Masukan objek yang ingin dmasukan");
                    d = scanner.next();
                    list.append(d);
                    break;
                
                case 3:
                   list.clear();
                   break;
                
                case 4:
                   
                    if(list.length()<list.getMaxSize() && i<=list.getMaxSize())
                        System.out.println("Objek yang di remove " +list.remove());
                    else
                        System.out.println("Perintah remove gagal");
                    
                    break;
                
                case 5:
                    list.movetostart();
                    break;
                
                case 6:
                    list.movetoend();
                    break;
                
                case 7:
                    list.prev();
                    break;
                
                case 8:
                    list.next();
                    break;
                
                case 9:
                    System.out.println("Panjang listnya "+list.length());
                    break;
                
                case 11:
                    f = 0;
                    
                    do {
                        try {
                            System.out.println("Pindah ke pos ");
                            f = scanner.nextInt();
                        }
                        catch (InputMismatchException e) {
                            System.out.println("Silahkan coba kembali");    
                        }
                        scanner.nextLine(); 
                    } while (f <= 0);
                    
                    list.movetopost(f);
                    break;
                
                case 10:
                    System.out.println("Pos sekarang " +list.currpos());
                    break;
                
                case 12:
                    System.out.println("Nilai sekarang adalah "+list.getValue());
                    break;
                
                case 13:
                    list.show();
                    break;
                
                case 14:
                    System.out.println("Object yang anda ingin masukan");
                    d = scanner.next();
                    f = list.getlocation(d);
                    
                    if(f!=0)
                        System.out.println("Indeksnya "+list.getlocation(d));
                    else
                        System.out.println("Objek yang dicari tidak ada");
                    break;
                
                case 15:
                    f = 0;
                    
                    do {
                        try {
                            System.out.println("Masukan indeks objek yang ingin diketahui");
                            f = scanner.nextInt();
                        }
                        catch (InputMismatchException e) {
                            System.out.println("Silahkan coba kembali");    
                        }
                        scanner.nextLine(); 
                    } while (f <= 0);
                    
                    System.out.println("Objeknya "+list.retrieve(f));
                    break;
                
                case 16:
                    list.reverse();
                    break;
                
                case 17:
                    f = 0;
                    g =0;
                    
                    do {
                        try {
                            System.out.print("Masukan indeks pertama yang ingin ditukar  ");
                            f = scanner.nextInt();
                            System.out.print("Masukan indeks kedus yang ingin ditukar  ");
                            g = scanner.nextInt();
                        }
                        catch (InputMismatchException e) {
                            System.out.println("Silahkan coba kembali");    
                        }
                        scanner.nextLine(); 
                    } while (f <= 0 || g<=0);
                    
                    list.swapi(f, g);
                    break;
                
                case 18:
                    System.out.println("Masukan objek pertama yang ingin ditukar  ");
                    d = scanner.next();
                    System.out.println("Masukan objek keuda yang ingin ditukar  ");
                    Object h = scanner.next();
                    f = list.getlocation(h);
                    g = list.getlocation(d);
                    
                    if(f*g==0)
                        System.out.println("Objek yang ingin ditukar tidak ada");
                    else
                        list.swapi(f,g);
                    
                    break;
                
                case 19:
                    list.random();
                    break;
                
                case 20:
                    System.out.println("Masukan objek yang ingin dihitung");
                    d = scanner.next();
                    System.out.println("Jumlahnya "+list.count(d));
                    break;
                
                case 21:
                    a =0;
                    break;
                
                default:
                    System.out.println("Tolong pilih angka yang ditentukan");
            }
            
            list.show();
        }
    }
}