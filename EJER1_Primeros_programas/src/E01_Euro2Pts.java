
/*
 
Calcular el valor en pesetas de una cantidad de euros.
La cantidad de euros se entra por teclado.
 
Salida del programa
----------------------------------------
Entra un valor en euros : 35.6
El valor en pesetas es : 5923.3416 pts.
 
*/
 
import java.io.*;
 
class E01_Euro2Pts {
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
 
        double CAMBIO = 166.386;
         
        //Leer el valor en euros
         
        System.out.print("Entra un valor en euros : ");
        double euros = Double.parseDouble(entrada.readLine());
 
        //Calcular el valor en pesetas
         
        double pts = euros * CAMBIO;
 
        //Mostrar el resultado
         
        System.out.println("\nEl valor en pesetas es : " + pts + " pts.");
    }
}