import java.util.Scanner;
import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
public class Calculo_Viento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		System.out.print("Velocitat: ");
		int vel=entrada.nextInt();
		int dif1=63-vel;
		int dif2=119-vel;

		if (vel>0 && vel<63) {
		System.out.print("Depressió tropical, si augmenta "+dif1+" canvia a Tempesta tropical");
		}
		if (vel>62 && vel<119) {
		System.out.print("Tempesta tropical, si augmenta "+dif2+" canvia a Huracá");
		}
		if (vel>119) {
		System.out.print("Huracà, no pot fer canvi a cap altre");
		}
	}

}
