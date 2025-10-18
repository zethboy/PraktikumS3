// Nama : Yogi Nugraha
// NPM : 247006111067

package UTS;

class Motor extends Kendaraan {
  boolean isAutomatic;
  double fuelConsumptionPerKM;

  public Motor(String brand, String model, int year, boolean isAutomatic, double fuelConsumptionPerKM){
    super(brand, model, year);
    this.isAutomatic = isAutomatic;
    this.fuelConsumptionPerKM = fuelConsumptionPerKM;
}

@Override
public void start(){
  System.out.println("Motor " + brand + " dinyalakan dengan kick starter.");
}

@Override
public void stop(){
  System.out.println("Motor " + brand + " dimatikan.");
}

@Override 
public double calculateDailyCost(int distance){
  return distance * fuelConsumptionPerKM * 13000;
}

@Override
public void displayInfo(){
  super.displayInfo();
  System.out.println("Is Automatic : " + isAutomatic);
  System.out.println("Fuel Consumption Per KM : " + fuelConsumptionPerKM + " Liter");
}

}

