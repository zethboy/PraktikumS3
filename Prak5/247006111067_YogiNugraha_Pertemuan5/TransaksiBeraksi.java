// Yogi Nugraha
// 247006111067
// C
// Tugas Praktikum 5 PBO

package Prak5.Tugas;

public class TransaksiBeraksi {
  public static void main(String[] args){
    Transaksi transaksi = new Transaksi();
    
    try {
    System.out.println("Skenario Invalid");

    try {
        transaksi.setPin("123");
    } catch (InvalidPinException e) {
        System.out.println("Kesalahan: " + e.getMessage());
    }

    try {
        transaksi.setJumlahPenarikan(-1000);
    } catch (InvalidJumlahPenarikanException e) {
        System.out.println("Kesalahan: " + e.getMessage());
    }

    } catch (Exception e) {
        System.out.println("Terjadi kesalahan umum: " + e.getMessage());
    }


    try {
       System.out.println("\n Skenario Valid");
       Transaksi transaksi2 = new Transaksi();
            transaksi2.setPin("123456");
            transaksi2.setJumlahPenarikan(500000);
            System.out.println("PIN: " + transaksi2.getPin());
            System.out.println("Jumlah Penarikan: Rp" + transaksi2.getJumlahPenarikan());
        } catch (InvalidPinException | InvalidJumlahPenarikanException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
    }
  }
}
