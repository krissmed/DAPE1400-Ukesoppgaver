package klasserOgObjekter1;

/*
Lag en klasse kalt Person. Denne skal inneholde følgende attributter:

-navn
-adresse
-telefonnr
-fødselsår
Lag en metode for å regne ut alderen til en person. Metoden skal ikke ta inn noen parametere, den skal regne ut alderen ut i fra fødselsår.
Metoden skal returnere alderen.

Lag så en metode som, tar inn alderen, og som skriver ut alle vitale data for personen på følgende måte:

Per Hansen med adresse Osloveien 82 med telefonnummer 22124512 er 21 år.

Opprett et eller flere person objekter i main-metoden for å teste ut.
*/

public class oppgave3 {
    String navn;
    String adresse;
    String telefonnr;
    int fodselsaar;

    public int alder(){
        int gjelendeAar = 2020;
        int alder = gjelendeAar - fodselsaar;
        return alder;
    }

    public static void main(String[] args) {
        oppgave3 person = new oppgave3();
        person.navn = "Per Hansen";
        person.adresse = "Osloveien 82";
        person.telefonnr = "12345678";
        person.fodselsaar = 1999;
        int alder = person.alder();
        System.out.print(person.navn+" med adresse "+person.adresse+" med telefonnummer "+person.telefonnr+" er "+alder+" år.");
    }
}
