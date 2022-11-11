/*
 
Programa que pide un número al usuario y le dice si es mayor que cero o no
 
Salida del programa
------------------------------------------------------
Introduce un número : -23
-23 no es mayor que 0
 
*/
 
import java.io.*;
 
public class E01_EsMayorCero {
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
 
        System.out.print("Introduce un número : ");
        int num = Integer.parseInt(entrada.readLine());
 
        if ( num>0 ) {
            System.out.println(num + " es mayor que 0");
        } else {
            System.out.println(num + " no es mayor que 0");
        }
    }
}