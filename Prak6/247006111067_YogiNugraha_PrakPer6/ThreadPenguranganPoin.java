//Yogi Nugraha
//247006111067
//C
//Praktikum 6 Tugas

package Prak6.Tugas;

public class ThreadPenguranganPoin extends Thread {
    private ScoreGame score;
    private int jumlah;
    private boolean useSync; // untuk menentukan pakai synchronized atau tidak

    public ThreadPenguranganPoin(ScoreGame score, int jumlah, boolean useSync) {
        this.score = score;
        this.jumlah = jumlah;
        this.useSync = useSync;
    }

    @Override
    public void run() {
        if (useSync)
            score.penguranganPoin(jumlah);     // pakai synchronized
        else
            score.penguranganPoinNoSync(jumlah); // tanpa synchronized
    }
}

