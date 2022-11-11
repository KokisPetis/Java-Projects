/*
 
Tres amigos compran billetes de lotería y acuerdan repartir los posibles premios
proporcionalmente a lo que ha aportado cada uno.
Hacer un programa que permita introducir por teclado las cantidades aportadas por
cada uno y el premio obtenido y muestre cuanto le corresponde a cada uno.
 
Consulta : http://es.wikipedia.org/wiki/Reparto_proporcional#Repartos_proporcionales
 
 
Salida del programa
----------------------------------------
Escribe la aportación de la primera persona : 25
Escribe la aportación de la segunda persona : 50
Escribe la aportación de la tercera persona : 30
Escribe el importe del premio obtenido: 1300
 
La parte correspondiente a la primera persona es 309.52 euros
La parte correspondiente a la segunda persona es 619.05 euros
La parte correspondiente a la tercera persona es 371.43 euros
 
*/
 
import java.io.*;
import java.util.Scanner;
 
class E08_RepartoPremio {
 
    public static void main(String[] args) throws Exception {
 
     // TODO Auto-generated method stub
     		Scanner entrada=new Scanner(System.in); 
     		
     		System.out.print("Escribe la aportación de la primera persona: ");
     		double primero = entrada.nextDouble();
     		System.out.print("Escribe la aportación de la segunda persona: ");
     		double segundo = entrada.nextDouble();
     		System.out.print("Escribe la aportación de la tercera persona: ");
     		double tercero = entrada.nextDouble();
     		
     		System.out.print("Escribe el importe del premio obtenido: ");
     		double importe = entrada.nextDouble();
     		double porcentaje = primero + segundo + tercero;
     		
     		double premio1 = importe*primero/porcentaje;
     		double premio2 = importe*segundo/porcentaje;
     		double premio3 = importe*tercero/porcentaje;
     		
     		System.out.println("La parte correspondiente a la primera persona es " + premio1 + " euros");
     		System.out.println("La parte correspondiente a la segunda persona es " + premio2 + " euros");
     		System.out.println("La parte correspondiente a la tercera persona es " + premio3 + " euros");
     		entrada.close();
        
    }
}