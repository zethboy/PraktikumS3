public class mobil3 {
  String warna;
  int tahunProduksi;
  public mobil3(String warna, int tahunProduksi){
    this.warna = warna;
    this.tahunProduksi = tahunProduksi;
  }
  public void info(){
    System.out.println("Warna= " + warna);
    System.out.println("Tahun Produksi =" + tahunProduksi);
  }
}
