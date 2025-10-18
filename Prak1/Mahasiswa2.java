package Prak1;

public class Mahasiswa2 {
  String nama;
  int umur;
//Konstruktor
  Mahasiswa2(String nama, int umur){
    this.nama = nama;
    this.umur = umur;
  }

  void tampilkanData(){
    System.out.println("Nama : " + nama );
    System.out.println("Umur : " + umur);
  }

  public static void main(String[] args){
    Mahasiswa2 mhs = new Mahasiswa2("Yogi", 20);
    mhs.tampilkanData();
  }

}
