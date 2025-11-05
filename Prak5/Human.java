//Exception

package Prak5;

public class Human {
  public static  void main(String[] args){
    int[] angka = {1,2,3};
    try {
      System.out.println(angka[7]);
    }catch (ArrayIndexOutOfBoundsException e){
      System.err.println("Terjadi Kesalahan");
    }finally{
      System.out.println("Baris ini akan tetap dieksekusi");
    }
    System.out.println("Akhir dari program");
  }
}