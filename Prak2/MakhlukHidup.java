package Prak2;

class MakhlukHidup {
  void bernafas(){
    System.out.println("Makhluk Hidup sedang bernafas");
  }  
}

class hewan extends MakhlukHidup{
  void bergerak(){
    System.out.println("Hewan sedang bergerak");
  }
}

class Kucing extends hewan{
  void bersuara(){
    System.out.println("Miaww!?!?!?!");
  }
}