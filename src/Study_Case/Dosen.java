package Study_Case;

public class Dosen {
  String nidn, namaDosen;
  public Dosen(String nidn, String namaDosen){
    this.nidn = nidn;
    this.namaDosen = namaDosen;
  }    

  public void tampilData(){
    System.out.println("NIDN: " +nidn);
    System.out.println("Nama Dosen: "+namaDosen);
  }
  
}