/*
 
Transformación de una cantidad de segundos en horas, minutos y segundos.
La cantidad de segundos se entran por teclado.
 
Salida del programa
---------------------------------------------------
Entra la cantidad de segundos : 5623
5623 segundos son 1 horas, 33 minutos y 43 segundos
 
*/
 
import java.io.*;
import java.util.Scanner;
 
class E09_Segundos {
 
    public static void main(String[] args) throws Exception {
    	/*
   	 
    	Programa que pide una hora del dia (hora, minutos y segundos)
    	y muestra la hora que será un segundo después.
    	 
    	Salida del programa
    	-------------------------------
    	Entra la hora : 23
    	Entra los minutos : 59
    	Entra los segundos : 59
    	 
    	La hora un segundo después es la 00:00:00
    	 
    	 */
    
    	Scanner entrada=new Scanner(System.in);
		System.out.println("Entra la hora : ");
		 int horas = entrada.nextInt();
		 System.out.print("Entra los minutos :");
		 int minutos = entrada.nextInt();
		 System.out.print("Entra los segundos : ");
		 int segundos = entrada.nextInt();
		//Sumar un segundo
		 segundos ++;
	    //Corregir los valores de segundos y minutos si son mayores que 59
		 if (segundos>=60) {
			 segundos=0;
		 	 minutos++; //minutos += 1 // minutos = minutos + 1
	   } if
			(minutos>=60) {
		   	 minutos=0;
	   		 horas++; //horas += 1
	   } if
			(horas==24) {
		     horas=0;
	   }
	 
	    //Mostrar el resultado final
		 
		 
	        System.out.printf("\nLa hora un segundo después es la %02d:%02d:%02d",
	                    horas,minutos,segundos);
		entrada.close();
		
            

      
    }
}