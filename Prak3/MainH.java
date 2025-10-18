package Prak3;

public class MainH {
    public static void main(String[] args) {
        Hewan h1 = new Kucing();
        Hewan h2 = new Anjing();
        Anjing h3 = new Anjing();

        h1.suara();
        h2.suara();
        h3.jalan();
    }
}

