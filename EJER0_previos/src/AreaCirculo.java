import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		double r=0;
		double a=0;
		
		System.out.println("Dame el radio");
		r=entrada.nextInt();
		
		a=Math.PI * Math.pow(r, 2);
		
		System.out.printf("El area del circulo es : %f", a);
		
	}

}
