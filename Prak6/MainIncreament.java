package Prak6;

public class MainIncreament {
  public static int count = 0;

  public static void increment(){
    int temp = count;
    String nameThread = Thread.currentThread().getName();
    System.out.println(nameThread + ": Membaca count (nilainya menjadi = " + temp + ")" );
    temp = temp + 1;
    count = temp;
    System.out.println(nameThread + ": Menulis count(nilainya menjadi =" + count + ")");
  }

  public static void main(String[] args ){
    Thread t1 = new Thread( new Increment());
    Thread t2 = new Thread( new Increment());
    t1.start();
    t2.start(); 

     try {
        t1.join();
        t2.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    System.out.println("Jumlah akhir: " + count);
  }
}
