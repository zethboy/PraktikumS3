// package Prak6;

// public class BreakThreadSafetyBeraksi {
//   public static void main(String[] args) throws InterruptedException{
//     BreakThreadSafety b1 = new BreakThreadSafety();
//     BreakThreadSafety b2 = new BreakThreadSafety();
//     b1.start();

//     try{
//       Thread.sleep(3000);
//     }catch (InterruptedException e){
//       b1.interrupt();
//       System.out.println(e.getMessage());
//     }
//   }
// }
