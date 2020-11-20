package klasserOgObjekter1;

import javax.swing.*;

/*
Utvid oppgave 1 til å lese inn de nødvendige dataene fra input-bokser og skrive resultatet ut i en meldingsboks.
*/

public class oppgave2 {
    public String tittel;
    public int pris;
    public String forfatter;
    public String ISBN;

    public void skrivUt(){
        System.out.print(tittel+"("+ISBN+")"+" skrevet av "+forfatter+" koster "+pris+"kr.");
    }
    public static void main(String[] args) {
        oppgave2 bok = new oppgave2();
        bok.tittel = JOptionPane.showInputDialog("Hva er tittelen på boka");
        String prisS = JOptionPane.showInputDialog("Hva koster boka");
        int pris = Integer.parseInt(prisS);
        bok.pris = pris;
        bok.forfatter = JOptionPane.showInputDialog("Hva heter forfatteren");
        bok.ISBN = JOptionPane.showInputDialog("Hva er ISBN-nummeret");
        bok.skrivUt();
    }
}
