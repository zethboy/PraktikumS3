package Prak3;

public class Hewan {
    void suara() {
        System.out.println("Hewan bersuara...");
    }
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Meong...");
    }
}

class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Guk guk...");
    }
    void jalan() {
        System.out.println("Anjing berjalan...");
    }
}