// Nama : Yogi Nugraha
// NPM : 247006111067

package UTS;

import java.util.ArrayList;

class FleetManager {
  private ArrayList<Kendaraan> vehicles;

  public FleetManager(){
    this.vehicles = new ArrayList<>();
  }

  public void addVehicle(Kendaraan K){
    vehicles.add(K);
    System.out.println(K.brand + " telah ditambahkan ke fleet.");
  }

  public void displayAllVehicles(){
    if(vehicles.isEmpty()){
      System.out.println("Fleet kosong. Tidak ada kendaraan untuk ditampilkaan.");
      return;
    }
    for (int i = 0; i < vehicles.size(); i++){
      System.out.println("\n Kendaraan #" + (i + 1));
      vehicles.get(i).displayInfo();
    }
    System.out.println("-----------------------------");
  }

  public double calculateTotalDailyCost(int distance){
    double totalCost = 0;
    for (Kendaraan K : vehicles){
      totalCost += K.calculateDailyCost(distance);
    }
    return totalCost;
  }

  public ArrayList<Kendaraan> getVehicles() {
    return vehicles;
  }

}

