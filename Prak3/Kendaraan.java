package Prak3;

interface Kendaraan {
    void bergerak();
}

class Mobil implements Kendaraan {
    public void bergerak() {
        System.out.println("Mobil melaju di jalan.");
    }
}

class Perahu implements Kendaraan {
    public void bergerak() {
        System.out.println("Perahu berlayar di laut.");
    }
}
