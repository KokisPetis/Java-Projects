/*
Declara les següents variables i mostra el valor de cadascuna amb la instrucció
 
    System.out.println();
 
identificador    tipus                     valor inicial
 
num              int                       7888
total            double                    9.5764
correcte         boolean                   true
lletra           char                      'S'
comptador        long                      999999999999L  //  la L indica que és long
 
 */
 
public class E01_Variables {
     
    public static void main (String [] args) {
        int num=7888;
        double total=9.5764;
        boolean correcte=true;
        char lletra='S';
        long comptador=999999999999L;
         
        System.out.println("num="+num);
        System.out.println("total="+total);
        System.out.println("lletra="+lletra);
        System.out.println("correcte="+correcte);
        System.out.println("comptador="+comptador);
                 
    }
     
}