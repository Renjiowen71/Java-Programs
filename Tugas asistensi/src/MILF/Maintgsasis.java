package MILF;
import java.util.Scanner;
public class Maintgsasis {
    public static void main(String[] args) {
        int loop1 = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("===========My Item Lcation Finder===========");
        System.out.println("\nInput items   :");
        while (loop1 == 0){
            loop1 = 1;
            System.out.println("Type of the item : "
                    + "\n1 for food and drink"
                    + "\n2 for cleaning"
                    + "\n3 for household"
                    + "\n4 other ");
            int option1 = input.nextInt();
            switch (option1){
                case 1 :
                    System.out.println("Food and Drink");
                    System.out.print("Id = ");
                    int id = input.nextInt();
                    System.out.print("Name = ");
                    String name = input.next();
                    System.out.print("Weight = ");
                    int b = input.nextInt();
                    System.out.print("Total = ");
                    int jumlah = input.nextInt();
                    System.out.print("Days before expired = ");
                    int exp = input.nextInt();
                    System.out.println("");
                    makananminuman a = new makananminuman(exp,b,id,name,jumlah);
                    a.getinfo();
                    System.out.println("==");
                    System.out.println("Do you want to change anyhing   :"
                            + "\n1 for yes"
                            + "\n2 for no");
                    int option2 = input.nextInt();
                    if (option2 == 1){
                        System.out.print("Id = ");
                        id = input.nextInt();
                        System.out.print("Name = ");
                        name = input.next();
                        System.out.print("Weight = ");
                        b = input.nextInt();
                        System.out.print("Total = ");
                        jumlah = input.nextInt();
                        System.out.print("Days before expired = ");
                        exp = input.nextInt();
                        System.out.println("");
                        a.setberat(b);
                        a.setexp(exp);
                        a.setid(id);
                        a.setjumlah(jumlah);
                        a.setnamabarang(name);
                        a.getinfo();
                        System.out.println("Lokasinya "+a.getloc());
                    }
                    else if (option2 != 2)
                        System.out.println("We consider it as a no");
                break;
                case 2 :
                    System.out.println("Cleaning Item");
                    System.out.print("Id = ");
                    id = input.nextInt();
                    System.out.print("Name = ");
                    name = input.next();
                    System.out.print("Weight = ");
                    b = input.nextInt();
                    System.out.print("Total = ");
                    jumlah = input.nextInt();
                    System.out.print("This item clean =");
                    String bdt = input.next();
                    pembersih c = new pembersih(bdt, jumlah, id, b, name);
                    c.getinfo();
                    System.out.println("==");
                    System.out.println("Do you want to change anyhing   :"
                            + "\n1 for yes"
                            + "\n2 for no");
                    option2 = input.nextInt();
                    if (option2 == 1){
                        System.out.println("Cleaning Item");
                        System.out.print("Id = ");
                        id = input.nextInt();
                        System.out.print("Name = ");
                        name = input.next();
                        System.out.print("Weight = ");
                        b = input.nextInt();
                        System.out.print("Total = ");
                        jumlah = input.nextInt();
                        System.out.print("This item clean =");
                        bdt = input.next();
                        System.out.println("");
                        c.setberat(b);
                        c.setid(id);
                        c.setjumlah(jumlah);
                        c.setnamabarang(name);
                        c.setbyd(bdt);
                        c.getinfo();
                        System.out.println("Lokasinya "+c.getloc());
                    }
                    else if (option2 != 2)
                        System.out.println("We consider it as a no");
                break;
                case 3 :
                    System.out.println("Household");
                    System.out.print("Id = ");
                    id = input.nextInt();
                    System.out.print("Name = ");
                    name = input.next();
                    System.out.print("Weight = ");
                    b = input.nextInt();
                    System.out.print("Total = ");
                    jumlah = input.nextInt();
                    System.out.println("Length = ");
                    int p = input.nextInt();
                    System.out.println("Width = ");
                    int l = input.nextInt();
                    System.out.println("Height = ");
                    int t = input.nextInt();
                    System.out.println("");
                    rumahtangga d = new rumahtangga(p, l, t, jumlah, id, name,b);
                    d.getinfo();
                    System.out.println("==");
                    System.out.println("Do you want to change anyhing   :"
                            + "\n1 for yes"
                            + "\n2 for no");
                    option2 = input.nextInt();
                    if (option2 == 1){
                        System.out.print("Id = ");
                        id = input.nextInt();
                        System.out.print("Name = ");
                        name = input.next();
                        System.out.print("Weight = ");
                        b = input.nextInt();
                        System.out.print("Total = ");
                        jumlah = input.nextInt();
                        System.out.println("Length = ");
                        p = input.nextInt();
                        System.out.println("Width = ");
                        l = input.nextInt();
                        System.out.println("Height = ");
                        t = input.nextInt();
                        System.out.println("");
                        d.setberat(b);
                        d.setid(id);
                        d.setjumlah(jumlah);
                        d.setnamabarang(name);
                        d.setl(l);
                        d.setp(p);
                        d.sett(t);
                        d.getinfo();
                        System.out.println("Lokasinya "+d.getloc());
                    }
                    else if (option2 != 2)
                        System.out.println("We consider it as a no");
                break;
                case 4 :
                    System.out.println("Other");
                    System.out.print("Id = ");
                    id = input.nextInt();
                    System.out.print("Name = ");
                    name = input.next();
                    System.out.print("Weight = ");
                    b = input.nextInt();
                    System.out.print("Total = ");
                    jumlah = input.nextInt();
                    System.out.println("");
                    barang e = new barang(id,b,name,jumlah);
                    e.getinfo();
                    System.out.println("==");
                    System.out.println("Do you want to change anyhing   :"
                            + "\n1 for yes"
                            + "\n2 for no");
                    option2 = input.nextInt();
                    if (option2 == 1){
                        System.out.print("Id = ");
                        id = input.nextInt();
                        System.out.print("Name = ");
                        name = input.next();
                        System.out.print("Weight = ");
                        b = input.nextInt();
                        System.out.print("Total = ");
                        jumlah = input.nextInt();
                        System.out.println("");
                        e.setberat(b);
                        e.setid(id);
                        e.setjumlah(jumlah);
                        e.setnamabarang(name);
                        e.getinfo();
                        System.out.println("Lokasinya "+e.getloc());
                    }
                    else if (option2 != 2)
                        System.out.println("We consider it as a no");
                break;
                default :
                    loop1 = 0;
                    System.out.println("Only input 1 - 4 please");
                break;        
            }        
                
                
                
        }
    }
    
}
