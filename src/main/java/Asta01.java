//Author Brazzoli Marica
/*
Simulare un’asta in cui ci siano due compratori che si contendono l’acquisto di un oggetto, 
a turno i due compratori dovranno fare un’offerta per l’oggetto da comprare, l’asta termina quando 
uno dei due compratori si ritira offrendo ‘0’, a quel punto l’altro compratore si sarà aggiudicato l’asta. 
Stampare quale compratore si è aggiudicato l’asta e con che cifra.
 */
import java.util.Scanner;
public class Asta01 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int turno, offerta1, offerta2, offerta;
        turno = 1;
        offerta1 = 0;
        offerta2 = 0;
        offerta = 0;
        do{
            if (turno == 1) {
                System.out.println("Il primo compratore fa l'offerta");
            }
            else{
                System.out.println("Il secondo compratore fa l'offerta");
            }
            offerta = input.nextInt();
            if (turno == 1){
                offerta1=offerta;
                turno++;
            }
            else {
                offerta2=offerta;
                turno=turno-1;
            }
        }
        while (offerta!=0);
        if (turno==1){
            System.out.println("Vince l'asta il primo compratore facendo un'offerta di " +offerta1);
        }
        else {
            System.out.println("Vince l'asta il secondo compratore facendo un'offerta di " +offerta2);
        }
    }
}