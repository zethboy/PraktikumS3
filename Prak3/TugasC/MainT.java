// Yogi Nugraha
// 247006111067
// C

package Prak3.TugasC;

public class MainT {
    public static void main(String[] args) {
        Tiket tiketBiasa = new Tiket();
        TiketVIP tiketVip = new TiketVIP();

        System.out.println("Harga Tiket Biasa (2 orang): " + tiketBiasa.hitungHarga(2));
        System.out.println("Harga Tiket VIP (2 orang): " + tiketVip.hitungHarga(2));
        System.out.println("Harga Tiket VIP + Snack (2 orang): " + tiketVip.hitungHarga(2, true));
    }
}