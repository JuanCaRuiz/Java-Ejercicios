public class fecha {
  private int dia;
  private String mes;
  private int año;

  public int getDia(){
    return dia;
  }
  public void setDia(int d){
    this.dia = d;
  }
  public String getMes(){
    return mes;
  }
  public void setMes(String m){
    this.mes = m;
  }
  public int getAño(){
    return año;
  }
  public void setAño(int a){
    this.año = a;
  }
  public void hoy(){
    System.out.println("Hoy es " +dia+"/"+mes+"/"+año);
  }
}