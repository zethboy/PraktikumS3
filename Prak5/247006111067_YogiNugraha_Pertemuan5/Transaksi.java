// Yogi Nugraha
// 247006111067
// C
// Tugas Praktikum 5 PBO

package Prak5.Tugas;

public class Transaksi {
  private String pin;
  private int jumlahPenarikan;

  public void setPin(String pin) throws InvalidPinException {
    if (pin.length() != 6) {
      throw new InvalidPinException("Pin harus 6 digit boskuu!");
    }
    this.pin = pin;
  }

  public String getPin(){
    return pin;
  }

  public void setJumlahPenarikan(int jumlahPenarikan) throws InvalidJumlahPenarikanException {
    if (jumlahPenarikan <= 0) {
      throw new InvalidJumlahPenarikanException("Jumlah penarikan harus lebih dari 0 Boskuu!");
    }
    this.jumlahPenarikan = jumlahPenarikan;
  }

  public int getJumlahPenarikan(){
    return jumlahPenarikan; 
  }
}
