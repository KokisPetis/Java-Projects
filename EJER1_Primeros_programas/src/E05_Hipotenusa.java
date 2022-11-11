/*
 
Cálculo de la hipotenusa de un triángulo rectángulo.
La longitud de los catetos se entran por teclado.
 
Utiliza el teorema de Pitágoras. 
  
Consulta : http://es.wikipedia.org/wiki/Teorema_de_Pit%C3%A1goras
 
Salida del programa
-------------------------------------
Entra la longitud del primer cateto : 10
Entra la longitud del segundo cateto : 7
 
La hipotenusa mide 12.207
 
*/
 
import java.io.*;
 
class E05_Hipotenusa {
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
 
        //Leer la longitud de los catetos
 
        System.out.print("Entra la longitud del primer cateto : ");
        double cateto1 = Double.parseDouble(entrada.readLine());
 
        System.out.print("Entra la longitud del segundo cateto : ");
        double cateto2 = Double.parseDouble(entrada.readLine());
 
        //Calcular la hipotenusa
 
        double hipotenusa = Math.sqrt(cateto1*cateto1+cateto2*cateto2);
        //double hipotenusa = Math.hypot(cateto1,cateto2);
 
        //Mostrar el resultado
 
        System.out.printf("\nLa hipotenusa mide %.3f",hipotenusa);
    }
}