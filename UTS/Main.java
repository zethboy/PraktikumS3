// Nama : Yogi Nugraha
// NPM : 247006111067

package UTS;

public class Main {
  public static void main(String[] args) {
    FleetManager fleet = new FleetManager();

    System.out.println("-- Menambahkan Kendaraan ke Fleet --");

    Motor motor1 = new Motor("Honda", "Vario 160", 2022, true, 0.02);
    fleet.addVehicle(motor1);

    Bus bus1 = new Bus("Mercedes Benz", "OH 1626", 2018, 10.0, 0.3);
    fleet.addVehicle(bus1);

    fleet.displayAllVehicles();

    System.out.println("\n--- Simulasi Operasional Kendaraan ---");
    int distance = 100;

    for (Kendaraan K : fleet.getVehicles()) {
      System.out.println("\n>>> Operasi untuk " + K.brand + " " + K.model + " <<<");
      K.start();
      K.displayInfo();
      double dailyCost = K.calculateDailyCost(distance);
      System.out.printf("Biaya harian untuk jarak %d km : Rp %,.2f%n", distance, dailyCost);
      K.stop();
    }

    System.out.println("\n--- Rekapitulasi Biaya Harian Fleet ---");
    double totalFleetCost = fleet.calculateTotalDailyCost(distance);
    System.out.printf("Total biaya harian untuk seluruh fleet (%d km): Rp %,.2f%n", distance, totalFleetCost);
    System.out.println("--------------------------------------------------");
  }
}
