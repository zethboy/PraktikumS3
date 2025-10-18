//Inheritance

package Prak2;

class Kendaraan {
  String merek;

  void jalan(){
    System.out.println(this.merek + "sedang berjalan");
  }
}
  
class Mobil extends Kendaraan{
  int jumlahPintu;
}

class Motor extends Kendaraan{  
  int jumlahBan; 
}
