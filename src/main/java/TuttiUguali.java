//Author:Brazzoli Marica
/*
 Scrivere un programma "TuttiUguali" che chiede all’utente di inserire tre numeri 
e stampa "Tutti uguali!" se i tre numeri sono tutti uguali, e altrimenti 
stampa "Almeno uno e’ diverso".
 */
import java.util.Scanner;

public class TuttiUguali {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int num1, num2, num3;
        System.out.println("Inserisci il primo numero");
        num1 = input.nextInt();
        System.out.println("Inserisci il secondo numero");
        num2 = input.nextInt();
        System.out.println("Inserisci il terzo numero");
        num3 = input.nextInt();
        if(num1==num2 && num2==num3){
            System.out.println("Tutti uguali");
        }
        else {
            System.out.println("Almeno uno è diverso");
        }
    }
}
