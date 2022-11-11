import java.util.Scanner;

public class Panellets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		System.out.print("Panellets: ");
		int panellet=entrada.nextInt();
		for (int i=0; i<panellet; i++) {
		panellet=panellet-i;
		}
		System.out.print(panellet+" panellets");
	}

}
