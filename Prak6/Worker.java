package Prak6;

public class Worker extends Thread {
  @Override
  public void run(){
    for (int i = 1; i<=5; i++){
      System.out.println("Thread " + getName() + "langkah ke- " +i);
    }
  }
}
