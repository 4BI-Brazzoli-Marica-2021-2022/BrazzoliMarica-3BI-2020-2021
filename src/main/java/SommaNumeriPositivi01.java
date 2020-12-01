//Author Brazzoli Marica
/*
Far inserire all’utente una serie di numeri interi, quando viene inserito un numero negativo farlo 
reinserire e non tenerlo in considerazione, terminare la serie quando viene inserito zero. Terminata la lettura 
della serie scrivere in output la somma dei numeri positivi inseriti.
*/
import java.util.Scanner;
public class SommaNumeriPositivi01 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int num1, positivi, somma;
        somma=0;
        positivi=0;
        System.out.println("Inserisci un numero");
        num1 = input.nextInt();
        while (num1!=0){
                if (num1>0){
                    positivi++;
                    somma+=num1;
                }
                else if(num1<0){
                    System.out.println("Inserisci di nuovo il numero");
                    num1 = input.nextInt();
                    if (num1>0){
                        positivi++;
                        somma+=num1;
                    }
                }
                System.out.println("Inserisci un nuovo numero");
                num1 = input.nextInt();
        }
        System.out.println("Hai inserito " + positivi+ " numeri positivi e la loro somma è " + somma);
    }
}
