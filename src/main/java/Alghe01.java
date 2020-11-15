//Author Brazzoli Marica
/*
Si supponga che l’andamento della popolazione di un’alga si sviluppi nel seguente modo: 
un anno raddoppia l’anno successivo cala di un terzo.
Creare un programma che dato un valore iniziale della popolazione e un valore da raggiungere 
di popolazione dica quanti anni ci mette quella popolazione a raggiungere o superare quel valore.
 */

import java.util.Scanner;
public class Alghe01 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int aa, popolo, popraggiungere; 
        boolean aadoppio;
        aa = 0;
        aadoppio = true;
        System.out.println("Inserisci la popolazione iniziale di alghe");
        popolo = input.nextInt();
        System.out.println("Inserisci il valore che la popolazione di alghe dovrà raggiungere");
        popraggiungere = input.nextInt();  
        while (popolo < popraggiungere){
            if (aadoppio == true){
                popolo = popolo*2;
            }
            else{
                popolo = popolo*2/3;
            }
            aa++;
        }
        System.out.println("La popolazione impiegherà " +aa+ " anni/o per poter raggiungere il valore " +popraggiungere+ " di popolazione di alghe");
    }
}