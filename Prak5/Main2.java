package Prak5;

public class Main2 {
  public static void main(String[] args) {
    Orang o1= new Orang();
    o1.setName("Budi");
    o1.setUmur(20);
    String nama = o1.getName();
    System.out.println("Halo, " + nama);
    o1.greeting();
  }
}
