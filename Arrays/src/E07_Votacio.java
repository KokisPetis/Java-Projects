/*
 
Programa que permite realizar el recuento de votos en unas elecciones.
El programa pide el número de candidatos y el número de votantes.
 
Luego pregunta a cada votante a que candidato vota.
Al final muestra el total de votos para cada candidato.
No es necesario almacenar todos los votos, solo irlos contando.
 
Utilizar un array de contadores. Cada vez que se introduce un voto se incrementa el
contador correspondiente.
 
Validar cualquier posible error al votar.
 
 
Salida del programa :
------------------------------------
Entra número de candidatos: 3
Entra número de votantes: 4
 
Votante 1, entra tu voto (1-3): 1
Votante 2, entra tu voto (1-3): 3
Votante 3, entra tu voto (1-3): x
Voto inválido.
Votante 3, entra tu voto (1-3): 5
Voto inválido.
Votante 3, entra tu voto (1-3): 2
Votante 4, entra tu voto (1-3): 1
 
Resultados:
-----------------------
Candidato 1: 2 votos.
Candidato 2: 1 votos.
Candidato 3: 1 votos.
 
 
*/
 
import java.io.*;
import java.util.Scanner;
 
public class E07_Votacio {
 
    public static void main(String[] args) throws Exception {
 
    	Scanner teclado = new Scanner(System.in);
        System.out.println("Entra número de candidatos: ");
        int num_candidatos = teclado.nextInt(); //Aquí especifico el espacio de la array candidatos

        System.out.println("Entra número de votantes:");
        int total_votantes = teclado.nextInt(); //Aquí especifico el espacio de la array votos

        int voto_user; //Voto de cada user

        int[] candidatos = new int[num_candidatos]; // Num de Candidatos

        int[] votos = new int[total_votantes]; // Num de personas que votan


        for (int i = 0; i < votos.length; i++) { //tienes que compararlo con el numero de votantes, para que repita la accion esa cantidad de veces

            do {
                int indice = i + 1;
                System.out.println("Votante " + indice + ", entra tu voto (1-" + num_candidatos + "):");

                // Aquí tenemos el voto del votante
                voto_user = teclado.nextInt();

                if (voto_user > num_candidatos) {
                    System.out.println("Voto inválido.");
                }
                else {
                    candidatos[voto_user-1]++;
                }
            } while (voto_user > num_candidatos);
        }
        System.out.println("Resultados:");
        System.out.println("-----------------------");
        for (int i = 0; i < candidatos.length; i++) {

            System.out.println("Candidato " + (i + 1) + " " + candidatos[i] + " votos.");
        }
    }
  }
