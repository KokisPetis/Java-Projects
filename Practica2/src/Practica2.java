import java.util.Iterator;
import java.util.Scanner;

public class Practica2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		
		//EXERCICI1
		System.out.println("quantes mesures vols introduïr? ");
		int tamany=entrada.nextInt();
        double total = 0;
        double ValorLluny = 0;
        double media=0;
		double NewMedia=0;
		
		//creació array buit
		double [] mesures= new double[tamany];
		//primer bucle per saber el total de l'array 
		for (int PH=0; PH<mesures.length;PH++) {
			System.out.println("entra un valor");
			mesures[PH]=entrada.nextDouble();
			total = total + mesures[PH];
			//calculem la mitja
			 media = total / mesures.length;
			 if((mesures[PH]-media)>Math.abs(ValorLluny)) {
				 ValorLluny=mesures[PH];
			 }

			 for (int i = 0; i < mesures.length; i++) {
				if(mesures[i]==ValorLluny) {
					mesures[i]=0;
					NewMedia=total/mesures.length;
				}
			}
	 }
		
		
		
		
		
		//exercici4
		/*
		String[]dies={"Lunes","Martes","Miercoles","Jueves","Viernes","Sábado","Domingo"};
		String[]meses= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		int[]dias= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
		
		
		System.out.println("Introdueix dia de l'any: ");
		int dia=entrada.nextInt();
		if (dia>366) {
			System.out.println("número incorrecto, introduce un número del 1-366");
		}
		
	
		System.out.println(DentsAdalt);
		System.out.println(DentsAbaix);
		*/

		System.out.println("mitjana: "+" "+media );
		System.out.println("valor lluny: "+ValorLluny);
		System.out.println("nova mitja"+" "+ NewMedia);

	}
}
