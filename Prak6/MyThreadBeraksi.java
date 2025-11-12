package Prak6;

// public class MyThreadBeraksi {
//   public static void main(String[] args){
//     MyThread t1 = new MyThread();
//     MyThread();
//     t1.start();
//     System.out.println("Thread utama selesai");
//   }
// }


//increament
public class MyThreadBeraksi {
  public static void main(String[] args){
    Thread t1 = new Thread(new MyThread());
    t1.start();
    System.out.println("Thread utama selesai");
  }
}
