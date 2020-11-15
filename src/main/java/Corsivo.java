//Author:Brazzoli Marica
/*
 Scrivere un programma Corsivo che chiede all'utente due numeri (giorno  e mese) 
ed utilizzando il costrutto switch restituisce la data espressa con parole come l'esempio: 
dati i numeri 11 e 9 --> undici settembre due mila e venti.
 */

import java.util.Scanner;

public class Corsivo {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        String ris = null;
        int gg, mm;
        System.out.println("Dammi il giorno");
        gg = input.nextInt();
        System.out.println("Dammi il mese");
        mm = input.nextInt();
        switch (gg){
            case 1:
                ris=new String ("primo");
            break;
            case 2:
                ris=new String ("due");
            break;
            case 3:
                ris=new String ("tre");
            break;
            case 4:
                ris=new String ("quattro");
            break;
            case 5:
                ris=new String ("cinque");
            break;
            case 6:
                ris=new String ("sei");
            break;
            case 7:
                ris=new String ("sette");
            break;
            case 8:
                ris=new String ("otto");
            break;
            case 9:
                ris=new String ("nove");
            break;
            case 10:
                ris=new String ("dieci");
            break;
            case 11:
                ris=new String ("undici");
            break;
            case 12:
                ris=new String ("dodici");
            break;
            case 13:
                ris=new String ("tredici");
            break;
            case 14:
                ris=new String ("quatordici");
            break;
            case 15:
                ris=new String ("quindici");
            break;
            case 16:
                ris=new String ("sedici");
            break;
            case 17:
                ris=new String ("diciassette");
            break;
            case 18:
                ris=new String ("diciotto");
            break;
            case 19:
                ris=new String ("diciannove");
            break;
            case 20:
                ris=new String ("venti");
            break;
            case 21:
                ris=new String ("vent'uno");
            break;
            case 22:
                ris=new String ("ventidue");
            break;
            case 23:
                ris=new String ("ventitre");
            break;
            case 24:
                ris=new String ("ventiquattro");
            break;
            case 25:
                ris=new String ("venticinque");
            break;
            case 26:
                ris=new String ("ventisei");
            break;
            case 27:
                ris=new String ("ventisette");
            break;
            case 28:
                ris=new String ("vent'otto");
            break;
            case 29:
                ris=new String ("ventinove");
            break;
            case 30:
                ris=new String ("trenta");
            break;
            case 31:
                ris=new String ("trent'uno");
            break;
            default: System.out.println("numero errato");
        }   
        switch (mm){
            case 1:
                ris=ris + new String (" gennaio");
            break;
            case 2:
                ris=ris + new String (" febbraio");
            break;
            case 3:
                ris=ris + new String (" marzo");
            break;
            case 4:
                ris=ris + new String (" aprile");
            break;
            case 5:
                ris=ris + new String (" maggio");
            break;
            case 6:
                ris=ris + new String (" giugno");
            break;
            case 7:
                ris=ris + new String (" luglio");
            break;
            case 8:
                ris=ris + new String (" agosto");
            break;
            case 9:
                ris=ris + new String (" settembre");
            break;
            case 10:
                ris=ris + new String (" ottobre");
            break;
            case 11:
                ris=ris + new String (" novembre");
            break;
            case 12:
                ris=ris + new String (" dicembre");
            break;
            default: System.out.println("numero errato");
        }
        ris=ris + " duemila e venti";
        System.out.println(ris);
    }
}
