//Yogi Nugraha 067 C

package Prak2;
public class Main{
  public static void main(String[] args) {
    SecurityEngineer SecEng = new SecurityEngineer("2.000.000", "Satpam");
    AIEngineer AIEng = new AIEngineer("3.000.000", "Kuproy");
    SecEng.infoGaji();
    SecEng.infoDivisiSec();

    AIEng.infoGaji();
    AIEng.infoDivisiAI();
  }
}
