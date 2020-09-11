
package jumlahderet2;
public class JumlahDeret2 {
    public static void main(String[] args) {
        double sum = 0, q, w;
        for (double i=1;i<100;i = i+2){
           w = i + 2;
           q = i/w;
           sum = sum + q;
        }    
            System.out.println(sum);  
    }
    
}
