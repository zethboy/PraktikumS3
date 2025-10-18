package Prak1;

public class Hero {
  int power;
  
   public Hero(int power) {
    this.power = power;
    }
  public void addPower(int well){
    power += well;
  }
  public void Attacked(int owshit){
    power -= owshit;
  }
  public int getPower(){
    return this.power;
  }
  
}
