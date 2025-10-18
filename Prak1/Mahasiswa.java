package Prak1;

public class Mahasiswa {
   String nama;
   int umur;

   void tampilData() {
      System.out.println("Nama :" + this.nama);
      System.out.println("Umur :" + this.umur);
   }

   public static void main(String[] var0) {
      Mahasiswa var1 = new Mahasiswa();
      var1.nama = "Yogi";
      var1.umur = 20;
      var1.tampilData();
   }
}