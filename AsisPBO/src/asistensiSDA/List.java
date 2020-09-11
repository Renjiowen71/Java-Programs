package asistensiSDA;

 public interface List<E> { //E itu tipe data sama halnya dengan int E itu objek
    public void clear(); //menghapus semua elemen list
    public void insert(E item); //memasukkan elemen baru pada posisi curr
    public void append(E item); //menambah elemen setelah elemen terakhir
    public E remove(); //menghapus elemen pada posisi curr
    public void moveToStart(); //memindah curr pada posisi awal
    public void moveToEnd(); //memindah curr pada posisi akhir
    public void prev(); //memindah curr ke posisi sebelumnya
    public void next(); //memindah curr ke posisi berikutnya
    public int length(); //menghitung panjang (jumlah elemen) list
    public int currPos(); //nilai curr saat ini
    public void moveToPost(int pos); //memindahkan curr ke posisi tertentu
    public E getValue(); //mengakses nilai yang disimpan pada posisi curr saat ini
    
}
  
