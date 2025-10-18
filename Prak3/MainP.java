package Prak3;

public class MainP{
    public static void main(String[] args) {
        Pembayaran p = new Pembayaran();
        p.bayar(100000);
        p.bayar("Visa Gold");
        p.bayar(250000.50);
    }
}
