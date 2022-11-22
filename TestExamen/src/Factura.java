import java.util.Scanner;

/*
 * Escribe un programa que pida al usuario que introduzca los datos de una factura y luego los presente por pantalla.

    La factura tendrá tres partes. La cabecera, el listado de productos con sus datos, y el pie de factura con el total de la misma.
    La cabecera tendrá la siguiente información: Producto, unidades, precio/unidad y total.
    Le pediremos al usuario que introduzca los datos anteriores para tres productos. Por lo que el cuerpo de la factura tendrá 3 líneas.

Un ejemplo de posible factura impresa sería:

_______________________________________

Producto —Unidades —Precio/unidad —Total

_______________________________________

Mesa—7—101.0—707.0

Silla—3—45.0—135.0

Lampara—11—9.0—99.0

_______________________________________

Total: 941.0
 */
public class Factura {

	public static void main(String args[]) {

		Scanner sc1 = new Scanner(System.in);

		Scanner sc2 = new Scanner(System.in);

		Scanner sc3 = new Scanner(System.in);

		String[] productos = new String[3];

		int[] unidades= new int[3];

		double[] precios= new double[3];

		for (int i=1;i<4;i++){

		System.out.println("Introduce el producto "+i);

		productos[i-1] = sc1.nextLine();

		System.out.println("Introduce las unidades de producto"+i);

		unidades[i-1] = sc2.nextInt();

		System.out.println("Introduce el precio por unidad del producto "+i);

		precios[i-1] = sc3.nextDouble();

		}

		System.out.println(" ");

		System.out.println("_______________________________________");

		System.out.println("Producto —Unidades —Precio/unidad —Total");

		System.out.println("_______________________________________");

		double total=0.0;

		for (int i=1;i<4;i++){

		System.out.print(productos[i-1]+"-"+unidades[i-1]+"—"+precios[i-1]+"—"+unidades[i-1]*precios[i-1]+"\n");

		total = total + (unidades[i-1]*precios[i-1]);

		}

		System.out.println("_______________________________________");

		System.out.println("Total: "+total);

		sc1.close();sc2.close();sc3.close();

		}

		}
