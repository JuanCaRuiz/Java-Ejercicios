public class clases {
  int ID;
  String raza;
  int precio;
  public clases(int ID, String raza, int precio){
    this.ID = ID;
    this.raza = raza;
    this.precio = precio;
  }
  public void correr(){
    System.out.println("Perro corriendo... :)");
  }
  public void datos(){
    System.out.println("ID: "+ID);
    System.out.println("raza: "+raza);
    System.out.println("Precio: $"+precio);
    
  }

}