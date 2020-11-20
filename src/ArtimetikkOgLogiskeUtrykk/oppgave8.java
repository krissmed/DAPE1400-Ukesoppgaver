package ArtimetikkOgLogiskeUtrykk;

    /*
    Hva blir skrevet ut?  Bruk reglene for aritmetikken for å løse oppgaven før du kopierer inn koden og kjører den for å sjekke resutlatet.
    Gitt koden under:
    */

public class oppgave8 {

    public static void main(String[] args) {
        double tall1=1;
        double tall2=2;
        double resultat;
        resultat = tall1 * 4 + (tall2 * 2 + tall1 ) / (tall2-tall1*3);
        System.out.println(resultat); //Forventet reslutat: -1
    }
}

