//Author Brazzoli Marica
/*
Mario è uno studente che ha una quantità di soldi stabilita dall’utente, ogni giorno Mario all’intervallo può acquistare al bar della scuola una pastina che costa 1 euro o un panino che costa 1,5 euro.
Il programma continua a chiedere all’utente cosa mangerà Mario quel giorno finché ha abbastanza soldi o non ha la possibilità di soddisfare il suo appetito con quello che vuole.
Al termine del programma scrivere in output il numero di giorni in cui Mario ha mangiato e quante volte ha mangiato una pastina e quante un panino.
 */

import java.util.Scanner;
public class PaninoPastina01 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int gg, npastina, npanino, scelta;
        double soldi, pastina, panino;
        pastina = 1;
        panino = 1.5;
        npanino = 0;
        npastina = 0;
        gg = 0;
        System.out.println("Inserisci i soldi a disposizione");
        soldi = input.nextInt();
        while (soldi>=1){
            System.out.println("Scegli tra panino e pastina");
            System.out.println("Digita 1 per panino e 2 per pastina");
            scelta = input.nextInt();
            switch (scelta){
                case 1:
                    soldi = soldi -1;
                    npanino++;
                    gg ++;
                    break;
                case 2:
                    soldi = soldi -1.5;
                    npastina++;
                    gg++;
                    break;
                default:
            }
        }
        System.out.println("Mario ha mangiato per " + gg + " giorni");
        System.out.println("Mario ha mangiato " + npanino + " panini");
        System.out.println("Mario ha mangiato " + npastina + " pastine");
    }
}
