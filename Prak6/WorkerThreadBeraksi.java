package Prak6;

public class WorkerThreadBeraksi {
  public static void main(String[] args) throws InterruptedException{
    Worker w1 = new Worker();
    Worker w2 = new Worker();
    w1.start();
    //saya pengen thread w1 selesai duluan
    w1.join();
    w2.start();
  }
}
