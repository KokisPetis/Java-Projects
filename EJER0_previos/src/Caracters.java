import java.util.Scanner;

public class Caracters {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		//1 Afegeix al main les instruccions que resolguin aquest cas. Escriu un comentari «// exercici 4», a l’inici.
		//Demana per teclat 2 caràcters i una quantitat entera. Mostra per pantalla una línia amb la parella de caràcters en la
		//quantitat indicada.

		
		System.out.print("Carácter 1:" );
		String caracter1=entrada.next();
		System.out.print("Carácter 2:" );
		String caracter2=entrada.next();
		System.out.print("Cantidad: " );
		int cantidad=entrada.nextInt();

		for (int i=0; i<cantidad; i++) {
		System.out.print(caracter1+caracter2);
		}

	}

}
