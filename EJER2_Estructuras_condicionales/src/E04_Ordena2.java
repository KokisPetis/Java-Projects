/*
 
Programa que lee dos valores por teclado, los ordena y los
muestra ordenados.
La ordenación debe hacerse intercambiando el valor que contienen
las variables, si es necesario.
NO se trata de realizar un "print a b" o "print b a" según el caso.
 
Salida del programa
-----------------------------------------------
Escribe el primer valor : 5
Escribe el segundo valor : 3
Los valores ordenados son 3 5
 
*/
 
import java.io.*;
 
public class E04_Ordena2 {
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
 
        //Leer las variables a y b
        System.out.print("Escribe el primer valor : ");
        int a = Integer.parseInt(entrada.readLine());
 
        System.out.print("Escribe el segundo valor : ");
        int b = Integer.parseInt(entrada.readLine());
         
        //Ordenar las variables a y b. 
        //Intercambia el valor de las variables.
        if ( a>b) {
            int aux = b;
            b = a;
            a = aux;
        }
         
        //Mostrar las variables a y b
        System.out.printf("Los valores ordenados son %d %d ",a,b);
    }
}