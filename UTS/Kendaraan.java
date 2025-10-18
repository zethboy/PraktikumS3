// Nama : Yogi Nugraha
// NPM : 247006111067

package UTS;

abstract class Kendaraan {
  String brand;
  String model;
  int year;

  public Kendaraan(String brand, String model, int year) {
    this.brand = brand;
    this.model = model;
    this.year = year;
  }

  public abstract void start();

  public abstract void stop();

  public abstract double calculateDailyCost(int distance);

  public void displayInfo(){
    System.out.println("Brand : " + brand);
    System.out.println("Model :" + model);
    System.out.println("Year : " + year);
  }
} 
  

