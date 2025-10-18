package PERT2;

public class SepedaGunung extends sepeda2 {
  void setGir(int pertambahanGir){
    super.setGir(pertambahanGir);
    gir= 2 * getGir();
  }
  
}
