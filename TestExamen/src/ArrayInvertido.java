/*
 * Escribe un programa java que invierta el orden de los valores de un array. Por invertir el orden de los valores de un array, me refiero que el último pasa a ser el primero, el penúltimo el segundo y así sucesivamente.

El array será un array hardcodeado de valores enteros, que puede tener cualquier longitud.

El programa primero dibujara por pantalla los elementos del array en orden y luego los elementos del array invertido.
 */
public class ArrayInvertido {
	
    public static void main(String[] args) {

	int[] numeros ={7,3,4,5,9,11};

    int longitud = numeros.length;

    //imprimimos el array de partida

    System.out.println("Array inicial: ");

    for (int i=0; i<longitud;i++){

        System.out.print (numeros[i]+" – ");

    }

    System.out.println("\n");

    //Array invertido: imprimiento el array de atras a adelante

    System.out.println("Array invertido: ");

    for (int i=longitud-1; i>=0; i --){

        System.out.print (numeros[i]+" – ");

    }

    System.out.println("\n");

}

}