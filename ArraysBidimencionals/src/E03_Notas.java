
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
        int mediaexamen=0;
        int mediaalumno=0;
        int aluNotaMax=0;
        int exNotaMax=0;
        
        double[][] notas = {{7,6,8},
                            {5,4,6},
                            {3,5,9},
                            {8,7,5}
        };
 
double notamax=0;



		//calcular media de cada alumno
		for(int alu=0; alu<notas.length; alu++) {
			int suma=0;
			for(int ex=0; alu<notas[alu].length; alu++) {
			
				mediaalumno=suma/notas[alu].length;
				System.out.printf("la nota media del alummo %");
				
				}
		  	
		}
	
        
        //calcular media de cada examen
        for(int ex=0; ex<notas[0].length; ex++) {
        	int suma=0;
        	for(int alu=0; alu<notas.length; alu++) {
        		  suma+=notas[alu][ex];
        		  //calcular cual es el examen con mas nota
        		  if(notas[alu][ex]>notamax){
        		        notamax= notas[alu][ex];
        		        aluNotaMax=alu;
        		        exNotaMax=ex;
        	  }
        	mediaexamen=suma/notas.length;
        	System.out.printf("la media del examen %d es %f ",ex,mediaexamen);
        	
        	}
        } 
        
        
        

    }
   
}