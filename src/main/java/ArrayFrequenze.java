//Author Brazzoli Marica
/*
Dato un vettore di 100 interi (numeri interi generati Random e compresi da 0 a 9) 
inserire in un secondo array (array "frequenze"), le frequenze dei numeri che appaiono 
nel primo vettore.
 */
import java.util.*;
public class ArrayFrequenze {
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

