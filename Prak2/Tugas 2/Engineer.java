//Yogi Nugraha 067 C

package Prak2;

class Engineer {
  String gaji;

    Engineer(String gaji) {
        this.gaji = gaji;
    }

    void infoGaji() {
        System.out.println("Gaji: " + gaji);
    }
}

class SecurityEngineer extends Engineer{
   String divisiSecurity;

    SecurityEngineer(String gaji, String divisiSecurity) {
        super(gaji);
        this.divisiSecurity = divisiSecurity;
    }

    void infoDivisiSec() {
        System.out.println("Divisi Security: " + divisiSecurity);
    }
}

class AIEngineer extends Engineer {
 String divisiAI;

  AIEngineer(String gaji, String divisiAI){
    super(gaji);
    this.divisiAI = divisiAI;
  }
  
  void infoDivisiAI(){
    System.out.println("Divisi AI :" + divisiAI);
  }
}