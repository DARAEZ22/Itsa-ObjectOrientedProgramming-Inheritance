package herencia;
//Everything runs runs here, in the main.
import java.util.Scanner;

public class PersonaApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String vnombre;
		String vmatricula;
		System.out.println("Escribe tu nombre: ");
		vnombre=sc.nextLine();
		System.out.println("Ingresa tu matricula: ");
		vmatricula=sc.nextLine();

	/*	Estudiante E1 = new Estudiante(vmatricula,vnombre); //Object created.
		
				E1.mostrarinf(); //Showing information from the class (Estudiante).
				
		E1.entrenar(); //This is how you show the implementation from the action in (Estudiante) that comes from(Deportista).
		
		*/
		
		Deportista E2 = new Estudiante(vnombre, vmatricula); //Object created as an instance from (Deportista).
		E2.entrenar();    //this will only print what's in the method (entrenar).
		
			sc.close();
	}
}
