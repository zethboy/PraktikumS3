//threads

package Prak6;

// public class MyThread extends Thread {
//   @Override
//   public void run(){
//     for (int i = 1; i <= 5; i++){
//       System.out.println("Therad Berjalan");
//       try{
//         Thread.sleep(1000);
//       } catch (InterruptedException e){
//         System.out.println(e.getMessage());
//       }
//     }
//   }
// }

//increment

public class MyThread implements Runnable {
  @Override
  public void run(){
    for (int i = 1; i <= 5; i++){
      System.out.println("Thread Berjalan");
      try{
        Thread.sleep(1000);
      } catch (InterruptedException e){
        System.out.println(e.getMessage());
      }
    }
  }
}
