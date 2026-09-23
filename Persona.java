package herencia;
//this is the SuperClass, or Father class, form who the other classes will inherit their attributes.
public class Persona {
  private String nombre;
  
  public Persona(String nombre) {
	  this.nombre=nombre;  
}

public void mostrarinf() {
	System.out.println("Tu nombre es: "+nombre);
	
  }
}
