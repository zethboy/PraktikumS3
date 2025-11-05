package Prak5;

public class Orang {
  private String nama;
  private int umur;
  
  //getter
  public String getName(){
    return nama;
  }

  //setter
  public void setName(String nama){
    this.nama = nama;
  }

  public void setUmur(int umur){
    //validasi
    if(umur <= 0){
      throw new IllegalArgumentException("Umur tidak sesuai!");
    }
  }

  public void greeting(){
    System.out.println("halo bang!");
  }

}