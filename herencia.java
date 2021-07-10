class padre {
  protected String nombre = "Juan";
  public void saludo(){
    System.out.println("Buenos dias");
  }
}
class hijo extends padre {
  private String nombreHijo = "Zoe";
}