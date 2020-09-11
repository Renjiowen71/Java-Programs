
package menghitungbunga;

public class MenghitungBunga {

    public static void main(String[] args) {
        double tabungan = 1000000;
        double bunga = 0.08;
        System.out.println(bunga);
        for (int i = 0;i<5;i++){
            tabungan = tabungan + tabungan * bunga; 
        }
        System.out.println("Tabungan anda setelah 5 tahun adalah "+tabungan);
    }
    
}
