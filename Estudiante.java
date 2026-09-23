package herencia;
//This is a SubClass.
public class Estudiante extends Persona implements Deportista{ /*you have to use (extends) to refer to the SuperClass, or father class.
                                                                 you also have to use (inmplements) to add the methods from the interface.                                                                      */
	private String matricula;
	
public Estudiante(String matricula, String nombre) {
	super(nombre); //this is how you add the attribute from the SuperClass
    this.matricula=matricula;
	
  }
//Use (@OVERRIDE) before the method showinf.
@Override
public void mostrarinf() {
 super.mostrarinf();       //Like this you refer to the (showinf) from the SuperClass to show the information.
 System.out.println("Tu matricula es: "+matricula);

}
/* This is how you implement the action from the (interface) *remember if you create an interface and you
    implement it, then you're obligated to use it*/
@Override
public void entrenar() {
	System.out.println("Estoy entrenando para volverme mas fuerte y ganar el campeonato!");
}

}
