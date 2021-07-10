  import java.util.Scanner;
  class Main {
  public static void main(String[] args) {
    
    /*
    //clase clases
    System.out.println("Hola mundo!");
    clases perro1 = new clases(1, "Pastor Aleman", 500);
    perro1.datos();
    perro1.correr();
    clases perro2 = new clases(2,"Chihuhua",30);
    perro2.datos();

    //clase auto
    auto sail = new auto(2018, "Chevrolet");
    sail.acelerar();
    sail.velocidad(150);
    System.out.println("Mi carro es un "+sail.marca+" "+sail.modelo);
  
    //clase fecha
    fecha f = new fecha();
    f.setDia(2);
    f.setMes("Julio");
    f.setAño(2021);
    f.hoy();
    System.out.println("La fecha es 0"+f.getDia()+" de "+f.getMes()+" de  "+f.getAño());
 
    //clase herencia
    hijo nuevoHijo = new hijo();
    nuevoHijo.saludo();
     */


  int opc;
  int unidadesConsumo;
  int consumo;
  int factura;
  int estrato;
  double total;
	servicios luz = new servicios();
	servicios gas = new servicios();
  servicios agua = new servicios();
  do {
  System.out.println("************************************");
  System.out.println("Bienvenido al programa. \nQue servicio publico desea revisar? ");
  System.out.println("[1] Luz");
  System.out.println("[2] Gas Natural");
  System.out.println("[3] Agua");
  System.out.println("[0] Salir");
  System.out.println("************************************");
  Scanner o = new Scanner(System.in);
  opc = o.nextInt();
    if (opc == 0) {
      break;} 
    else if (opc > 3){
      System.out.println("Opcion invalida");} 
    else {
      System.out.println("Ingrese las unidades de consumo registradas en el mes:");
      Scanner c = new Scanner(System.in);
      unidadesConsumo = c.nextInt();
      System.out.println("Ingrese su estrato socioeconomico:");
      Scanner e = new Scanner(System.in);
      estrato = e.nextInt();
      if (estrato>0 && estrato<7){
      if (opc == 1){
        System.out.println("Luz");
        luz.setUnidades(unidadesConsumo);
        consumo = 6200;
        System.out.println("El valor por Kilowatt es de : $"+consumo);
        luz.setConsumo(consumo);
        total = luz.facturacion(luz.getConsumo(),luz.getUnidades());
        luz.setEstrato(estrato);
        luz.descuentoEstrato(luz.getEstrato(), total);}
      else if (opc == 2){
        System.out.println("Gas Natural");
        gas.setUnidades(unidadesConsumo);
        consumo = 5234;
        System.out.println("El valor por metro cubico es de : $"+consumo);
        gas.setConsumo(consumo);
        total = gas.facturacion(gas.getConsumo(),gas.getUnidades());
        gas.setEstrato(estrato);
        gas.descuentoEstrato(gas.getEstrato(), total);}
      else if (opc == 3) {
        System.out.println("Agua");
        agua.setUnidades(unidadesConsumo);
        consumo = 9256;
        System.out.println("El valor por metro cubico es de : $"+consumo);
        agua.setConsumo(consumo);
        total = agua.facturacion(agua.getConsumo(), agua.getUnidades());
        agua.setEstrato(estrato);
        agua.descuentoEstrato(agua.getEstrato(), total);}
    }
    else{
      System.out.println("Estrato no valido");} 
    }
  } while (opc != 0);   
  }
}