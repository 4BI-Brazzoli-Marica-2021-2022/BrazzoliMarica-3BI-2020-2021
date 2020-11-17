//Author Brazzoli Marica
/*
Ci sia un  lavandino parzialmente otturato in cui ogni secondo riesce a scaricare 
solo x cl di acqua e ci sia un rubinetto perde nel lavandino, facendo cadere delle gocce d’acqua nel 
lavandino per un totale di y cl di acqua tutte in una volta ogni 3 secondi.
Si crei un programma in cui si facciano inserire all’utente i valori di x e y, il livello 
iniziale dell’acqua e la capacità del lavandino. Il programma deve scrivere l’andamento 
del livello dell’acqua ogni secondo fino a un massimo di 20 secondi, o fermandosi prima nei casi in cui 
o il lavandino si è svuotato completamente o se l’acqua ha riempito totalmente il lavandino (o ha strabordato).
 */

import java.util.Scanner;
public class LavandinoOtturato01 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int liv, capacità, x, y, sec;
        sec = 0;
        System.out.println("Inserisci il valore iniziale del livello dell'acqua");
        liv = input.nextInt();
        System.out.println("Inserisci la capacità del lavandino");
        capacità = input.nextInt();
        System.out.println("Quanti cl riesce a scaricare il lavandino al secondo?");
        x = input.nextInt();
        System.out.println("Quanti cl cadono nel lavandino ogni tre secondi?");
        y = input.nextInt();
        while (sec<20 && liv<capacità && liv>0){
            liv=liv-x;
            sec++;
            if (sec%3 == 0){
                liv=liv+y;
            }
            else if (liv<0){
                liv=0;
            }
            System.out.println("In "+sec+" secondi raggiunge "+liv+" centilitri");
        }
        if (liv == 0){
            System.out.println("Il lavandino è svuotato");
        }
        else if (liv >= capacità){
            System.out.println("Il lavandino è completamente pieno");
        }
     }    
}
