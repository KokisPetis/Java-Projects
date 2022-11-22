import java.util.Scanner;

public class PiramideAsteriscos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		int n,m;
		boolean NumeCorrecto=false;
		
		do {
			System.out.print("Ingrese la cantidad filas (numero impar)");
			n=teclado.nextInt();
			System.out.print("Ingrese la cantidad columnas (numero impar)");
			m=teclado.nextInt();
			
			if(n%2 !=0 && m%2 !=0) {
				NumeCorrecto=true;
			} else {
				System.out.println("error. debe ingresar un numero impar");
			}
			System.out.println();
		} while(!NumeCorrecto);
		
		char matriz[][]=new char [n][m];
		
		int mitad = matriz[0].length / 2;
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[0].length; j++) {
				if((i+j) >=mitad && (j-i) <=mitad) {
					matriz[i][j]='*';
				} else {
					matriz[i][j]=' ';
				}
				
				System.out.print(matriz[i][j]+" ");
			}
			
			System.out.println();
		}
	}

}

