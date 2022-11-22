import java.util.Scanner;

/*
 * Desarrolla un programa java para ser usado por los camareros de un restaurante, que sirva para tomar nota de los menus que los clientes van a tomar.

    Primer dato a introducir por el camarero es el número de comensales que tendrá que estar en el rango de 1-5, ya que no hay mesas de más de cinco comensales. El valor introducido debe asegurarse de que se encuentra en el rango definido.
    Entonces el camarero tiene que introducir el menú seleccionado por cada cliente.
    Tenemos tres menus: #1,#2 y #3. Puedes identificar cada menú por el número: menú 1, menú 2 o menú 3.
    Una vez introducidos todos los datos, el programa imprimirá por pantalla los menús solicitados por cada comensal.
    Tienes que emplear un array para registrar los menus que tomará cada comensal. Ten en cuenta que la dimensión de dicho array tendrá que definirse en ejecución, ya que no sabemos a priori cuantos comensales vamos a tener.

    Un ejemplo de una posible salida sería:

Introduce el número de comensales (máximo 5):

3

Introduce el menu pedido por el comensal 1 :

1

Introduce el menu pedido por el comensal 2 :

2

Introduce el menu pedido por el comensal 3 :

1

Comensal 1 va a tomar el menu 1

Comensal 2 va a tomar el menu 2

Comensal 3 va a tomar el menu 1
 */
public class Menus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroComensales;

		int[] menus;

		Scanner sc1 = new Scanner(System.in);

	

		//introducción del número de comensales

		do{

		System.out.println("Introduce el número de comensales (máximo 5):");

		numeroComensales = sc1.nextInt();

		}while(numeroComensales<1 || numeroComensales>5);


		//introducción de los menus para cada comensal

		menus = new int[numeroComensales];

		for(int i=0;i<numeroComensales;i++){

		System.out.println("Introduce el menu pedido por el comensal "+(i+1)+" :");

		menus[i]=sc1.nextInt();

		}


		//dibujando en pantalla los menus tomados por cada comensal

		for (int i= 0; i<numeroComensales;i++){

		System.out.println("Comensal "+(i+1)+" va a tomar el menu "+menus[i]);

		}

	}

}

	
