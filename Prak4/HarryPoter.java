package Prak4;

public class HarryPoter implements BukuBagus {
  @Override
  public void judul(){
    System.out.println("Judul Buku: Harry Poter Anak Durhaka");
    System.out.println("Rating Buku: " + BukuBagus.RATING);
  }
}
