import java.util.Scanner;
import java.io.*;


public class NumeroPrimo {

	public static void main(String[] args) {
	
		Scanner entrada=new Scanner(System.in);
		int numero;
		int divisores = 0; 
		
		do {
		System.out.print("Introduce un número: ");
		 numero=entrada.nextInt();
		}
		while (numero<2); 
		
		entrada.close();
		
		System.out.println("Los numeros primos són: "+numero+" " + "son : ");
		
			//calculo primos
		for(int i=0; i<numero; i++) {
			
			for (int a=1; a<=i; a++) {
				if(i % a == 0) {
					divisores++;
				}
			}
				if(divisores == 2) {
					System.out.print(i+ ", ");
				}
				divisores=0;
		}
	}

}
