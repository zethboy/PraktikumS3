package PERT3;

public class LampuBeraksi {
  public static void main(String[] args){
    Lampu LampuKamar = new Lampu();

    System.out.println("Status lampu saat ini : Mati");

    LampuKamar.hidupkan();
    LampuKamar.matikan();
    LampuKamar.matikan();
    LampuKamar.hidupkan();
    LampuKamar.hidupkan();
  }
}
