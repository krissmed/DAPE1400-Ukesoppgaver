package ArtimetikkOgLogiskeUtrykk;

import static javax.swing.JOptionPane.showInputDialog;

    /*Les inn to variabler; navn, alder. Skriv så følgende historie (et eksempel): Per Olsen er i dag 32 år. Han er født i 1986. I 2053 er han 67 år og da vil han være pensjonist.

      (Tallene er utifra året 2018).*/

public class oppgave1 {
    public static void main(String[] args) {
        String navn = showInputDialog("Hva heter du?");
        String alderS = showInputDialog("Hvor gammel er du?");
        int alder = Integer.parseInt(alderS);
        int aar = 2020;
        int fodselsAar = 2020 - alder;
        int pensjonist = fodselsAar + 67;
        String ut = navn + " er i dag " + alder + ". Han er født i " + fodselsAar+ ". I " + pensjonist + " er han 67 år og da vil han være pensjonist.";
        System.out.print(ut);
    }
}
