package Prak5;

class Main3{
  static void validasiUmur(int umur) throws UmurException{
    if(umur < 18){
      throw new UmurException("Umur minimal 18 tahum");
    }
  }

  public static void main(String[] args){
    try{
      validasiUmur(20);
    }catch(UmurException e){
      System.out.println("Error: " + e.getMessage());
    }
  } 
}