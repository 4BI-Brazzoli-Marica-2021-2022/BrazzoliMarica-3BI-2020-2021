//Author Brazzoli Marica
/*
Ogni anno in banca sui conti deposito si accumula un interesse rispetto al saldo iniziale, l’interesse
accumulato si somma al saldo precedente e concorrerà al calcolo dell’interesse sull’anno successivo.
Dato un saldo iniziale, la percentuale di interesse e una soglia, verificare  dopo quanti anni 
si raggiunge o supera la soglia.
 */

import java.util.Scanner;
public class DepositoBancario01 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int saldo, aa, interesse, soglia;
        aa=0;
        System.out.println("Inserisci il saldo iniziale");
        saldo = input.nextInt();
        System.out.println("Inserisci la percentuale di interesse");
        interesse = input.nextInt();
        System.out.println("Inserisci la soglia che si deve rggiungere");
        soglia = input.nextInt();
        while (saldo<soglia){
            saldo = saldo+(saldo*interesse/100);
            aa++;
            System.out.println("Anni "+aa+" Saldo "+saldo);
        }
        System.out.println("Per poter superarre o raggiungere la soglia di " +soglia+ " euro, ci vogliono " +aa+" anni");
    }
}
