package Prak1;

public class HeroAction {
    public static void main(String[] args) {
      
        Hero hero = new Hero(100);
        
        System.out.println("Hero action");
        System.out.println("power saat ini : " + hero.getPower());

        int powerDitambah = 500;
        hero.addPower(powerDitambah);
        System.out.println("\nTambah power: " + powerDitambah);
        System.out.println("power saat ini: " + hero.getPower());
        
       
        int damageDiterima = 150;
        hero.Attacked(damageDiterima);
        System.out.println("\nhero get attacked: " + damageDiterima);
        System.out.println("power saat ini : " + hero.getPower());
    }
}
