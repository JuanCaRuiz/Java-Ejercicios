public class auto {
  int modelo;
  String marca;

  public auto(int año, String nombre){
    modelo = año;
    marca = nombre;
  } 
  public void acelerar(){
     System.out.println("Acelerando.....");  
  }
  public void velocidad(int velMax){
     System.out.println("LA velocidad maxima es de: "+velMax+" km");  
  }
}