//Author Brazzoli Marica
/*
Ogni anno in banca sui conti deposito si accumula un interesse rispetto al saldo iniziale, 
l’interesse accumulato si somma al saldo precedente e concorrerà al calcolo dell’interesse sull’anno successivo.
Dato un saldo iniziale, la percentuale di interesse e una soglia, verificare  dopo quanti anni si raggiunge o supera la soglia.
 */

import java.util.Scanner;
public class DepositoBancario01 {
     public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int anni;
        double saldoiniziale, percentualeinteresse, soglia;
        anni = 0;
        System.out.println("Inserisci il saldo iniziale");
        saldoiniziale = input.nextInt();
        System.out.println("Inserisci la percentuale di interesse");
        percentualeinteresse = input.nextInt();
        System.out.println("Inserisci la soglia che si deve raggiungere");
        soglia = input.nextInt();
        while (saldoiniziale<soglia){
            saldoiniziale= saldoiniziale+(saldoiniziale*percentualeinteresse/100);
            System.out.println("Anni " +anni+ " saldo " +saldoiniziale); 
            anni++;
        }
        System.out.println("Per raggiungere o superare la soglia di " + soglia + " euro ci vogliono " +anni+ " anni"); 
     }    
}
