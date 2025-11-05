//Catch Beringkat

package Prak5;

import java.util.Scanner;

public class Main {
  public static  void main(String[] args){
    Scanner inputan= new Scanner(System.in);
   try {
  
   int[] angka = {1, 2, 3};
   System.out.print("Masukkan Angka: ");
   int inputAngka = inputan.nextInt();

   int hasil = 100 / inputAngka;
   System.out.println("Hasil: " + hasil);

   int dataArray = angka[inputAngka];
   System.out.println("Data Array: " + dataArray);
   }catch(ArithmeticException e){
      System.err.println("Terjadi Kesalahan: Pembagian dengan nol tidak diperbolehkan.");
   }catch(ArrayIndexOutOfBoundsException e){
      System.err.println("Terjadi Kesalahan: Indeks array di luar batas.");
   }finally{
      System.out.println("Baris ini akan tetap dieksekusi");
   }
    System.out.println("Akhir dari program");
  }
}
