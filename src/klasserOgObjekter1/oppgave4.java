package klasserOgObjekter1;

/*
Utvid oppgave 3 med å lese inn dataene fra input-bokser og vise resultatet i en meldingsboks på følgende format:

Navn: Per Hansen
Adresse : Osloveien 82
Telefonnr : 22124512
Alder : 21 år.

Tips: bruk \n for å få ny linje
*/



import static javax.swing.JOptionPane.*;

public class oppgave4 {
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
        person.navn = showInputDialog("Hva er navnet ditt");
        person.adresse = showInputDialog("Hva er adressen din");
        person.telefonnr = showInputDialog("Hva er telefonnummeret ditt");
        String fodselsaarS = showInputDialog("Hvilket år er du født");
        int fodselsaar = Integer.parseInt(fodselsaarS);
        person.fodselsaar = fodselsaar;
        int alder = person.alder();
        System.out.print("Navn: "+person.navn+"\nAdresse: "+person.adresse+"\nTelefonnummer: "+person.telefonnr+"\nAlder: "+alder+" år");
    }
}
