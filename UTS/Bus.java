// Nama : Yogi Nugraha
// NPM : 247006111067

package UTS;

class Bus extends Kendaraan{
  double loadCapacity;
  double dieselConsumptionPerKM;

  public Bus(String brand, String model, int year, double loadCapacity, double dieselConsumptionPerKM){
    super(brand, model, year);
    this.loadCapacity = loadCapacity;
    this.dieselConsumptionPerKM = dieselConsumptionPerKM;
  }

  @Override
  public void start(){
    System.out.println("Bus " + brand + " dinyalakan dengan sistem tekanan udara.");
  }

  @Override
  public void stop(){
    System.out.println("Bus " + brand + " dimatikan.");
  }

  @Override
  public double calculateDailyCost(int distance){
    return distance * dieselConsumptionPerKM * 20000;
  }

  @Override
  public void displayInfo(){
    super.displayInfo();
    System.out.println("Load Capacity :" + loadCapacity + " ton");
    System.out.println("Diesel Consumption Per KM :" + dieselConsumptionPerKM + " liter");
  }
}
