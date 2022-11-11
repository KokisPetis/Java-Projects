import java.util.Scanner;

public class MasGrande {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int numero;
		int grande=Integer.MIN_VALUE;
		
		do {
			System.out.print("introduce un número");
			numero=entrada.nextInt();
			
			if (numero !=0) {
				if(numero>grande) grande=numero;
				System.out.print(grande);
			}
			
		} while(numero !=0);
		
		System.out.println("/n/nÁdeu");
		
		
	}

}
