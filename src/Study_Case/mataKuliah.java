package Study_Case;

public class mataKuliah{
  String kodeMK, namaMK;
  int sks;
  
  public mataKuliah(String kodeMK, String namaMK, int sks){
    this.kodeMK = kodeMK;
    this.namaMK = namaMK;
    this.sks = sks;
  }

  public void tampilData(){
    System.out.println("Kode MK: " +kodeMK);
    System.out.println("Nama MK: "+namaMK);
    System.out.println("SKS: " + sks);
  }
  
}