/*
 
Calcular la suma, la resta, el producto y la división con decimales de dos
números enteros leidos por teclado.
 
Salida del programa
---------------------------------------
Entra el primer número : 10
Entra el segundo número : 6
La suma es 16
La resta es 4
El producto es 60
La división es 1.6666666666666667
 
*/
 
import java.io.*;
 
class E02_Aritmetica {
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
 
        //Leer los números
 
        System.out.print("Entra el primer número : ");
        int a = Integer.parseInt(entrada.readLine());
 
        System.out.print("Entra el segundo número : ");
        int b = Integer.parseInt(entrada.readLine());
 
        //Hacer los cálculos
 
        int suma = a + b;
        int resta = a - b;
        int producto = a * b;
        double division = (double)a / b;
 
        //Mostrar los resultados
 
        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println("El producto es " + producto);
        System.out.println("La división es " + division);
    }
}