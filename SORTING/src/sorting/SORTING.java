
package sorting;


public class SORTING {

    
    public static void main(String[] args) {
        int [] angkaacak = {1, 23, 75, 2, 4, 7, 98, 93, 11, 15, 20, 12, 26, 17, 10, 6, 13, 14, 8, 19};
        System.out.println("Angka acak sebelum di sorting =");
        printa(angkaacak);
        int [] angkasort = mergesort(angkaacak);
        System.out.println("Angka setelah di sorting Insert  =");
        for (int i=0; i<angkasort.length;i++) {
            System.out.print(angkasort[i]+" ");
        
        }
    }
    public static int[] methods_sorting_Buble(int[] angkaacak){
        int temp;
        for (int i=0; i<angkaacak.length-1;i++){
            for(int now = 0; now<angkaacak.length-1;now++){
                if(angkaacak[now+1]<angkaacak[now]){
                    temp = angkaacak[now+1];
                    angkaacak[now+1] = angkaacak[now];
                    angkaacak[now] = temp;
                }
            }
        }
        return angkaacak;
    }
    public static int[] methods_sorting_Insert (int[] angkaacak) {
        int temp;
        int now;
        for(int i=1;i<angkaacak.length; i++){
            now=i;
            while(angkaacak[now-1]>angkaacak[now]){
                temp = angkaacak[now-1];
                angkaacak[now-1] = angkaacak[now];
                angkaacak[now] = temp;
                now--;
                if(now ==0)
                    break;
            }
        
        }
        return angkaacak;
        
    }
    public static int[] methods_sorting_Selection (int[] angkaacak){
        int temp;
        int min;
        for (int i=0;i<angkaacak.length-1;i++) {
            min= i;
            for (int j=i+1; j<angkaacak.length; j++) {
                if (angkaacak[min]>angkaacak[j]) {
                    min = j;
                }
            }
            temp=angkaacak[i];
            angkaacak[i]=angkaacak[min];
            angkaacak[min]=temp;
        }
        return angkaacak;
    }
    public static void printa(int[] a){
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println("");
    }
    public static int[] mergesort(int[] angkaacak){
        if(angkaacak.length==1)
            return angkaacak;
        int tengah = (angkaacak.length)/2;
        int[] awal = new int[tengah];
        int[] akhir = new int[angkaacak.length-tengah];
        for(int i = 0;i<tengah;i++)
            awal[i] = angkaacak[i];
        int awaldiakhir =0;
        for(int i = tengah;i<angkaacak.length;i++){
            akhir[awaldiakhir] = angkaacak[i]; 
            awaldiakhir++;
        }
        
        awal = mergesort(awal);
        
        akhir = mergesort(akhir);
        
        int awaldiawal = 0;
        awaldiakhir = 0;
        for(int i = 0;i<angkaacak.length;i++){
            if(awaldiakhir == akhir.length){
                angkaacak[i] = awal[awaldiawal];
                awaldiawal++;
            }
            else if(awaldiawal == awal.length){
                angkaacak[i] = akhir[awaldiakhir];
                awaldiakhir++;
            }
            else if(awal[awaldiawal]<akhir[awaldiakhir]){
                angkaacak[i] = awal[awaldiawal];
                awaldiawal++;
            }
            else{
                angkaacak[i] = akhir[awaldiakhir];
                awaldiakhir++;
            }
        }
        return angkaacak;
    }
    
}
