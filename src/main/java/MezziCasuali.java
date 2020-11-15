//Author:Brazzoli Marica
/*
 Scrivere un programma MezziCasuali che stampa un numero frazionario ottenuto come 
risultato della chiamata del metodo di libreria Math.random(). Se il risultato di Math.random() 
è minore di 0.5, il metodo lo restituisce così com'è. 
Se invece il risultato di Math.random() è maggiore o uguale a 0.5, lo restituisce diminuito di 0.5.
 */

public class MezziCasuali {
    public static void main(String[] args) {
        double ris;
        ris = Math.random();
        if(ris>=0.5){
            System.out.println(ris-0.5);
        }
        else {
            System.out.println(ris);
        }    
    }
}
