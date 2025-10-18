// Yogi Nugraha
// 247006111067
// C

package Prak3.TugasC;

class Tiket {
    int hargaDasar = 50000;

    public double hitungHarga(int jumlah) {
        return hargaDasar * jumlah;
    }
}


class TiketVIP extends Tiket {

    @Override
    public double hitungHarga(int jumlah) {
        return (hargaDasar * 1.5) * jumlah;
    }

    public double hitungHarga(int jumlah, boolean includeSnack) {
        double total = hitungHarga(jumlah);
        if (includeSnack) {
            total += 20000 * jumlah;
        }
        return total;
    }
}
