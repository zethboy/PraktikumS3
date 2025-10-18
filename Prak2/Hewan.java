package Prak2;

class Hewan {
  String nama;

  Hewan(String nama){
    this.nama = nama;
  }
}

interface BisaTerbang{
  void terbang();
}

class burung extends Hewan implements BisaTerbang{
  burung(String nama){
    super(nama);
  }

  public void terbang(){
    System.out.println(this.nama + " sedang terbang");
  }
}
