import java.util.Arrays;
import java.util.Scanner;

public class Trabajadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner entrada = new Scanner(System.in);
			
			final int trabajadores = 3;
	        final int dias = 5;
	        final int precioHora = 20;
	 
	        //Creamos el array 2D
	 
	        int [][] Array2d = new int [trabajadores][dias];
	        
	        
	        for (int fila=0; fila<trabajadores;fila++) {
	        	System.out.println("entra las horas del trabajador "+(fila+1));
	        	
	        	for(int col=0; col<dias; col++) {
	        		System.out.print("Dia "+(col +1)+":");
	        		Array2d[fila][col]=entrada.nextInt();
	        	}
	        } 
	        
	                System.out.printf("%8d" + Array2d[trabajadores][dias]);
	        
	        
	        
	        
	        //Pedimos los datos y los guardamos en el array
	 
	 
	 
	 
	        //Mostramos la tabla y hacemos los cálculos
	}

}
