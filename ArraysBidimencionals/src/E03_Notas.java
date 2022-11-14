
/*
 
Utiliza un array de dos dimensiones con las notas de 4 alumnos en 3 examenes.
Cada fila corresponde a un alumno y cada columna a un examen.
Establece estos valores en el código del programa.
El programa debe calcular :
 
- la nota media de cada alumno
- la nota mayor indicando alumno y examen correspondientes
- la nota media más alta y que alumno la ha conseguido
- la nota media de cada examen
 
(Para facilitar el ejercicio suponemos que los valores más altos no estan repetidos)
 
Salida del programa
-----------------------------------------------------------------------
La nota media del alumno 1 es 7,00
La nota media del alumno 2 es 5,00
La nota media del alumno 3 es 5,67
La nota media del alumno 4 es 6,67
La media más alta es 7,00 y la ha conseguido el alumno 1
La nota más alta es 9,00 y la ha conseguido el alumno 3 en el examen 3
La media del examen 1 es 5,75
La media del examen 2 es 5,50
La media del examen 3 es 7,00
 
 */
 
import java.io.*;
import java.util.Scanner;
 
public class E03_Notas {
 
    public static void main(String[] args) throws IOException {
 
       Scanner entrada=new Scanner(System.in);
 
        int alumnos = 4;
        int examenes = 3;
        
   
        
        double[][] notas = {{7,6,8},
                            {5,4,6},
                            {3,5,9},
                            {8,7,5}
        };
 
        
        for(int alumn=0; alumn<alumnos; alumn++) {
        	
        	double mediaalumno=((notas[alumn][0]+notas[alumn][1]+notas[alumn][2]) / 3);
        	System.out.println("La nota media del alumno"+" "+(alumn+1)+" "+"es"+" "+mediaalumno);
        	
        };
        
        
        for(int exam=0; exam<examenes; exam++) {
        	double mediaexamen=((notas[0][exam]+notas[1][exam]+notas[2][exam]+notas[3][exam])/4);
        	System.out.println("la nota media del examen"+" "+(exam+1)+" "+ "es"+ " "+mediaexamen);
        	}
 
        	
 
    }
}