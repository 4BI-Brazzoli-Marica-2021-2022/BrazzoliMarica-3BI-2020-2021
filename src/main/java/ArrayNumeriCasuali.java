//Author Brazzoli Marica
/*
Esercizio no.5
Sviluppare un'algoritmo che permetta di riempire un vettore di 5 elementi interi con 5 numeri 
compresi fra 0 e 9 (inclusi) in modo casuale (random) e senza che vi siano ripetizioni.
 */
import java.util.*;
public class ArrayNumeriCasuali {
    public static void main(String[] args) {
        Random input = new Random();
        int cont = 0, n, n2;
        int [] vec;
        vec = new int [5];
        for(int i=0; i<5; i++){
            System.out.println("Inserisci un numero");
            n=input.nextInt(10);
        }
    }
}
