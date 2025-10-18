public class sepedaBeraksi {
  public static void main(String[] args){
    sepeda sepedaku = new sepeda();
    sepedaku.setGir(1);
    System.out.println("Gir saat ini:" + sepedaku.getGir());

    sepedaku.setGir(3);
    System.out.println("Gir saat ini:" + sepedaku.getGir());
  }
}
