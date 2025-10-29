package model;

public class Mahasiswa {
  private String nama;
  private String NPM;

  public Mahasiswa(String nama, String NPM){
    this.nama = nama;
    this.NPM = NPM;
  }

  public void tampilkanInfo(){
    System.out.println("Nama: " + nama);
    System.out.println("NPM: " + NPM);
  }
}
