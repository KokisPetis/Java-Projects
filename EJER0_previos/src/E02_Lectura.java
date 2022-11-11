/*
  Llegeix del teclat valors per a les variables declarades al main, a continuació 
  mostra el valor de cadascuna. 
  Per llegir del teclat es pot fer servir
   
     Scanner teclat=new Scanner(System.in);
  o
     BufferedReader teclat=new BufferedReader(new InputStreamReader(System.in));
      
 */
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
 
public class E02_Lectura {
     
    public static void main (String [] args) throws NumberFormatException, IOException {
        int num;
        double total;
        boolean correcte;
        char lletra;
        long comptador;
         
        /*
         * Aquest solució mostra les dues maneres de llegir del teclat vistes a classe.
         * Per a obtenir dades des del teclat només s'ha de fer servir una de les dues.
         * En aquest programa es fan servir les dues com a exemple.
         */
         
        //  Aquestes instruccions corresponen a la lectura amb
        //  Scanner
         
        Scanner teclat=new Scanner(System.in);
         
        System.out.print("Introdueix num:");
        num=teclat.nextInt();
        System.out.print("Introdueix total (amb , per decimals):");
        total=teclat.nextDouble();
        System.out.print("Introdueix correcte (true o false):");
        correcte=teclat.nextBoolean();
        System.out.print("Entra una lletra:");
        teclat.nextLine();
        lletra=teclat.nextLine().charAt(0);
        System.out.print("Introdueix comptador:");
        comptador=teclat.nextLong();
         
        System.out.println("num="+num);
        System.out.println("total="+total);
        System.out.println("correcte="+correcte);
        System.out.println("lletra="+lletra);
        System.out.println("comptador="+comptador);
 
        //  Aquestes instruccions corresponen a la lectura amb
        //  BufferedReader
         
        BufferedReader teclat2=new BufferedReader(new InputStreamReader(System.in));
         
        System.out.println();
        System.out.print("Introdueix num:");
        num=Integer.parseInt(teclat2.readLine());
        System.out.print("Introdueix total (amb . per decimals):");
        total=Double.parseDouble(teclat2.readLine());
        System.out.print("Introdueix correcte (true o false):");
        correcte=Boolean.parseBoolean(teclat2.readLine());
        System.out.print("Entra una lletra:");
        lletra=teclat2.readLine().charAt(0);
        System.out.print("Introdueix comptador:");
        comptador=Long.parseLong(teclat2.readLine());
         
        System.out.println("num="+num);
        System.out.println("total="+total);
        System.out.println("correcte="+correcte);
        System.out.println("lletra="+lletra);
        System.out.println("comptador="+comptador);
         
    }
     
}