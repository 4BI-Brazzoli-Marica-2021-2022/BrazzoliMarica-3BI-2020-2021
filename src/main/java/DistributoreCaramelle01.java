//Author Brazzoli Marica
/*
Simulare in linguaggio java il funzionamento di una macchinetta distributrice di caramelle 
che accetta monete e restituisce il resto, fino ad esaurimento delle scorte di caramelle.
*/
import java.util.Scanner;

public class DistributoreCaramelle01 {
     public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int caramelle, ncaramelle;
        double resto, monete, spesa;
        final double costo=0.15;
        caramelle= 200;
        while (caramelle>0){
            System.out.println("Le caramelle disponibili sono " + caramelle);
            System.out.println("Una caramella costa 0.15 centesimi");
            System.out.println("Quante caramelle vuoi comprare?");
            ncaramelle = input.nextInt();
            System.out.println("Inserisci monete");
            monete = input.nextDouble();
            if (ncaramelle<0 || ncaramelle>200){
                System.out.println("Il numero inserito è errato");
            }
            else{
                caramelle -=ncaramelle; 
                spesa = ncaramelle*costo;
                System.out.println("Hai speso: " + spesa + " euro");
                resto= monete - spesa;
                System.out.println("Il tuo resto è di : " + resto + " euro");
            }
        }
        System.out.println("Le caramelle sono esaurite");
    }
}
