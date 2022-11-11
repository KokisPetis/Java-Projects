/*
 
Cálculo del coste de la gasolina para hacer un viaje. 
Por teclado se entran la distancia al destino, el precio 
del litro de gasolina y el consumo del coche en litros
por cada 100 km.
 
Salida del programa
----------------------------------------
Escribe la distancia al destino en km : 100
Escribe el precio de 1l de gasolina : 1.40
Escribe el consumo del coche en litros cada 100 km : 3
 
El coste del viaje es de 4.20 euros
 
*/
 
import java.io.*;
import java.util.Scanner;
 
class E07_CosteGasolina {
 
    public static void main(String[] args) throws Exception {
 

		Scanner entrada=new Scanner(System.in); 
		
		System.out.print("Escribe la distancia al destino en km: ");
		double distancia = entrada.nextDouble();
		System.out.print("Escribe el precio de 1l de gasolina : ");
		double precio = entrada.nextDouble();
		System.out.print("Escribe el consumo del coche en litros cada 100 km: ");
		double consumo = entrada.nextDouble();
		
		double gasto = distancia * consumo;
		double costeFinal = gasto * precio / 100;
		
		System.out.print("El coste del viaje es de "+ costeFinal +" euros");
		
		entrada.close();
        
    }
}