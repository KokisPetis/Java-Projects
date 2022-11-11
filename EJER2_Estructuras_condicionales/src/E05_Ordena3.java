
/*
 
Programa que lee tres valores por teclado, los ordena intercambiando
las variables y los muestra por pantalla.
 
La ordenación debe hacerse intercambiando el valor que contienen
las variables, si es necesario.
NO se trata de realizar un "print a b c" o "print b a c" o ... 
 
Salida del programa
--------------------------------------------------
Escribe el primer valor : 8
Escribe el segundo valor : 3
Escribe el tercer valor : 5
Los valores ordenados son 3 5 8
 
Para verificar que funciona correctamente se deben probar
las 6 posibilidades que existen:
a  b  c
1  2  3
1  3  2
2  1  3
2  3  1
3  1  2
3  2  1
 
*/
 
import java.io.*;
 
public class E05_Ordena3 {
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
 
        //Leer
 
        System.out.print("Escribe el primer valor : ");
        int a = Integer.parseInt(entrada.readLine());
 
        System.out.print("Escribe el segundo valor : ");
        int b = Integer.parseInt(entrada.readLine());
 
        System.out.print("Escribe el tercer valor : ");
        int c = Integer.parseInt(entrada.readLine());
 
 
        //Ordenar. Intercambia el valor de las variables.
 
        int aux = 0;
 
        if ( a>b) {
            aux = b;
            b = a;
            a = aux;
        }
 
        if ( a>c ) {
            aux = c;
            c = a;
            a = aux;
        }
 
        if ( b>c ) {
            aux = c;
            c = b;
            b = aux;
        }
 
        //Mostrar
 
        System.out.printf("Los valores ordenados son %d %d %d ",a,b,c);
    }
}