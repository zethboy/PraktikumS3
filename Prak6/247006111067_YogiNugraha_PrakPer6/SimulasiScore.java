//Yogi Nugraha
//247006111067
//C
//Praktikum 6 Tugas

package Prak6.Tugas;

public class SimulasiScore {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("-- versi tanpa synchronized --");
        ScoreGame game1 = new ScoreGame(100);

        Thread t1 = new ThreadPenguranganPoin(game1, 70, false);
        Thread t2 = new ThreadPenguranganPoin(game1, 50, false);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("\n-- versi dengan synchronized --");
        ScoreGame game2 = new ScoreGame(100);

        Thread t3 = new ThreadPenguranganPoin(game2, 70, true);
        Thread t4 = new ThreadPenguranganPoin(game2, 50, true);

        t3.start();
        t4.start();

        t3.join();
        t4.join();
    }
}
