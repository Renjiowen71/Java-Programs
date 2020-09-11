package asistensiSDA;
import java.util.Scanner;
public class MainList {

    public static void main(String[] args) {
        int i;
       Object eval;
       Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan ukuran list = ");
        i= scanner.nextInt();
        ListA list = new ListA(i);
        do{
            do{
               // Menampilkan Menu
                System.out.println("1. Clear\n"
                                    +"2. Insert\n"
                                    +"3. Append\n"
                                    +"4. Remove\n"
                                    +"5. MoveToStart\n"
                                    +"6. MoveToEnd\n"
                                    +"7. Prev\n"
                                    +"8. Next\n"
                                    +"9. Length\n"
                                    +"10. CurrPos\n"
                                    +"11. Move To Pos\n"
                                    +"12. Get Value\n"
                                    +"13. Show\n"
                                    +"14. Keluar\n"
                                    +"Pilihan Anda:");
               i=scanner.nextInt();
            }while(i<1&&i>14);
            if(i==1){
                list.clear();
                System.out.println("Clear sukses, semua elemen sudah dihapus");
            }
             if(i==2){
                System.out.println("Masukkan elemen yang diinsert = ");
                eval=scanner.nextInt();
                 System.out.println("Indeks yang dipilih = ");
                 eval=scanner.nextInt();
                if(list.length()<list.getMaxSize()&&i<=list.getMaxSize()){
                list.moveToPost(i);
                list.insert(eval);
                    System.out.println("Elemen " +eval+ "telah tersimpan di indeks " +i );
                }
                else{
                    System.out.println("insert gagal karena list penuh");
                }
             }
            else if(i==3){
                System.out.println("Masukkan elemen yang akan di append");
                eval=scanner.nextInt();
                if(list.length()<list.getMaxSize()){
                list.append(eval);
                System.out.println("elemen" +eval+ "telah tersimpan di list");
                }else{
                    System.out.println("append gagal karena list penuh");
            }
                }else if(i==4){
                    if(list.length()<list.getMaxSize() && i<=list.getMaxSize()){
                        list.remove();
                    System.out.println("Elemen pada currPos sudah terhapus");
                    }
                    else{
                        System.out.println("Perintah remove gagal karena indeks yang dipilih melebihi max size");
                    }
                                  
                }else if(i==5){
                list.moveToStart();
                 System.out.println("Posisi curr telah berada di awal");
                }else if(i==6){
                list.moveToEnd();
                 System.out.println("Posisi curr telah berada di akhir");
                }else if(i==7){
                    if(list.length()<list.getMaxSize()&&i>0){
                    list.prev();
                        System.out.println("Posisi curr sudah pindah ke indeks sebelumnya");
                    }
                    else{
                        System.out.println("Tidak ada indeks sebelumnya");
                    }
                
                 }else if(i==8){
                         if(list.length()<list.getMaxSize()){
                         list.currPos();
                     list.next();
                             System.out.println("Posisi curr sudah pindah ke indeks setelahnya");
                         }
                    else{
                        System.out.println("Tidak ada indeks selanjutnya");
                    }
                
                     }else if(i==9){
                System.out.println("Banyaknya list size = "+list.length());
             
               }else if(i==10){
                System.out.println("Posisi currPos saat ini = "+list.currPos());
               
             }else if(i==11){
                 System.out.println("Masukkan indeks = ");
                 i=scanner.nextInt();
                 list.moveToPost(i);
                 System.out.println("Surr telah terpindah ke indeks = "+list.currPos());
              }else if(i==12){
                 System.out.println("Elemen di curr pos adalah "+list.getValue());
             }else if(i==13){
                list.show();       
             }             
        }while(i!=14);
        }
        }


        
    
