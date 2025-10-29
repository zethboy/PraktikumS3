package app;

import model.Mahasiswa;

public class MainApp {
  public static void main(String [] args){
    Mahasiswa mhs = new Mahasiswa("Yogi", "123456789");
    mhs.tampilkanInfo();
  }
}
