//Jorge Fraile Gomez
import java.io.*;
import java.util.Scanner;

public class Practica1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		
		// exercici 1
		//demanem variables a introduïr
		System.out.print("Introdueix la component R: ");
		int red=entrada.nextInt();
		
		System.out.print("Introdueix la component G: ");
		int green=entrada.nextInt();
		
		System.out.print("Introdueix la component B: ");
		int blue=entrada.nextInt();
		
		System.out.print("Introdueix un llindar: ");
		int llindar=entrada.nextInt();
		
		//suma dels colors per poder comparar
		int SumaColores=red+green+blue;
	
		if(SumaColores>=llindar) {
			System.out.println("El color és brillant i per tant el text serà negre."
					+ "");
		}
		else {
			System.out.println("El color és fosc i per tant el text serà blanc.");
		}
		
		System.out.println("Inicia l'exercici 2 ");
		//exercici2
		//varaible del pes total
		int PesMaxim=400;
		int PesTotal=0;
	
		System.out.println("Introdueix el número de persones:");
		int persones=entrada.nextInt();
		
		if(persones!=0) {
			for(int i=0;i<persones;i++) {
				System.out.print("Introdueix el pes de la persona"+" "+(i+1)+":");
				int peso=entrada.nextInt();
				PesTotal=PesTotal+peso;
			  }
		
				if(PesTotal>PesMaxim) {
					System.out.println("Pes total"+" "+PesTotal);
					System.out.println("Atenció, pes excessiu!");
				   }
					else {
						System.out.println("Pes total"+PesTotal);
						System.out.println("Pes correcte, l'ascensor pot funcionar.");
					}

	   }
		else {
			System.out.println("Error, Minim una persona");
		}
		
		
		//exercici3
		/*
		System.out.println("Introdueix la mida del taulell ");
		int taulell=entrada.nextInt();
		
		for(int i=0;i<taulell;i++) {
			System.out.println();
			for(int j=0;j<taulell;j++) {
				if(i+j/2==1) {
					System.out.print("░░");
				}
				else {
					System.out.print("██");
				}
			}
		}
		
	*/
		//exercici4
		System.out.println("Inicia l'exercici 4 ");
		
		System.out.println("Introdueix l'hora: ");
		int hores=entrada.nextInt();
		
		System.out.println("Introdueix els minuts hora: ");
		int minuts=entrada.nextInt();
		
		if(hores>=1 && hores<6) {
			System.out.printf("Són les %02d:%02d de la matinada",hores, minuts);
		}
		
		else
		if(hores>=6 && hores<12) {
			System.out.printf("Són les %02d:%02d del matí",hores, minuts);
		}
		else
		if(hores>=12 && hores<15) {
			System.out.printf("Són les %02d:%02d del migdia",hores, minuts);
		}
		else
		if(hores>=15 && hores<19) {
			System.out.printf("Són les %02d:%02d de la tarda",hores, minuts);
		}
		else
		if(hores>=19 && minuts<30 && hores<21 ) {
			System.out.printf("Són les %02d:%02d del vespre",hores, minuts);
		}
		else{
			System.out.printf("Són les %02d:%02d de la nit",hores, minuts);
		}

	}
}
