//Author Brazzoli Marica
/*
Eseguire l'ordinamento di un vettore di interi tramite l'algoritmo di scambio
(usando un intero di transito per lo scambio: salva=a; a=b; b=salva;)  
 */
import java.util.*;
public class ArrayOrdinamento {
    public static void main(String[] args) {
        Random input = new Random();
        int n, n2;
        int [] vec;
        vec = new int [100];
        int [] frequenze;
        frequenze = new int [100];
        for(int i=0; i<100; i++){
            System.out.println("Inserisci un numero");
            n=input.nextInt(10);
            frequenze[n]++;
        }
        for(int i=0; i<100; i++){
            System.out.println("Il numero "+i+ " compare "+frequenze[i]+" volte");
        }
    }
}