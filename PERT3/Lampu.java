package PERT3;

public class Lampu implements InterfaceLampu{
  int statusLampu;

  public void hidupkan(){
    if(statusLampu == KEADAAN_MATI){
      statusLampu = KEADAAN_HIDUP;
      System.out.println("Hidupkan Lampu ! --> Lampu Hidup");
    } else{
      System.out.println("HIdupkan Lampu ! --> Lampu sudah hidup kok");
    }
  }

  public void matikan(){
    if(statusLampu == KEADAAN_HIDUP){
      statusLampu = KEADAAN_MATI;
      System.out.println("Matikkan Lampu ! --> Lampu Mati");
    } else {
      System.out.println("Matikan Lampu ! --> Lampu sudah mati Kok");
    }
  }
}
