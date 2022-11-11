/*
 
Mostrar el importe correspondiente a una compra de un artículo
determinado del que se adquieren una o varias unidades.
El IVA a aplicar es del 21% y si el precio total resultante es mayor de
300 euros, se aplicará un descuento del 5%.
 
Salida del programa
----------------------------------------------------
Entra el precio del artículo : 58
Entra el número de unidades : 8
 
Importe total : 533,37
 
*/
 
import java.io.*;
 
public class E03_Factura {
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
 
        System.out.print("Entra el precio del artículo : ");
        double precio = Double.parseDouble(entrada.readLine());
 
        System.out.print("Entra el número de unidades : ");
        int unidades = Integer.parseInt(entrada.readLine());
 
        double total = unidades * precio * 1.21;  // + 21% IVA
 
        if (total>300){
            total = total * 0.95; // 5% descuento
        }
 
        System.out.printf("Importe total : %.2f",total);
    }
}