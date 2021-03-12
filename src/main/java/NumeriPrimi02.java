//Author Brazzoli Marica
/*
Far inserire all’utente una serie di numeri naturali terminante con 1. Dopo aver 
letto la serie il programma dovrà restituire quanti di questi numeri sono primi 
(in questo calcolo non si tenga conto dell’1).
 */
import java.util.Scanner;
public class NumeriPrimi02 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int num, primi, cont, i;
        primi=0;
        i=0;
        cont=0;
        System.out.println("Inserisci un numero");
        num = input.nextInt();
        while (num!=1){
            System.out.println("Inserisci un nuovo numero");
            num = input.nextInt();
            while (i<=num/2){
                if (num%i==0 || num==2){
                    cont++;
                }
            }
            i++;
            if (cont<=2){
                primi++;
            }
        }
        primi=primi-1;
        System.out.println("Hai inserito " + primi+ " numero/i primo/i");
    }
}
