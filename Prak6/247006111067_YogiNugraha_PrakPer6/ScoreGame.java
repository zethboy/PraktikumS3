//Yogi Nugraha
//247006111067
//C
//Praktikum 6 Tugas

package Prak6.Tugas;

public class ScoreGame {
    private int poin;

    public ScoreGame(int poin) {
        this.poin = poin;
    }

    //synchronized 
    public synchronized void penguranganPoin(int jumlah) {
        if (poin >= jumlah) {
            System.out.println(Thread.currentThread().getName() + 
                " berhasil mengurangi " + jumlah + " poin.");
            poin -= jumlah;
            System.out.println("Sisa poin: " + poin);
        } else {
            System.out.println(Thread.currentThread().getName() + 
                " gagal mengurangi poin. Poin tidak cukup (" + poin + ")");
        }
    }

    //tanpa synchronized
    public void penguranganPoinNoSync(int jumlah) {
        if (poin >= jumlah) {
            System.out.println(Thread.currentThread().getName() + 
                " berhasil mengurangi " + jumlah + " poin (NoSync).");
            poin -= jumlah;
            System.out.println("Sisa poin (NoSync): " + poin);
        } else {
            System.out.println(Thread.currentThread().getName() + 
                " gagal mengurangi poin (NoSync). Poin tidak cukup (" + poin + ")");
        }
    }
}
