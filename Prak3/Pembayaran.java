package Prak3;

public class Pembayaran {
    void bayar(int jumlah) {
        System.out.println("Bayar tunai sebesar Rp" + jumlah);
    }

    void bayar(String kartu) {
        System.out.println("Bayar menggunakan kartu: " + kartu);
    }

    void bayar(double saldoEwallet) {
        System.out.println("Bayar dengan e-wallet: Rp" + saldoEwallet);
    }
}
