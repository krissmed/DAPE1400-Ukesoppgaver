package ArtimetikkOgLogiskeUtrykk;

import static javax.swing.JOptionPane.showInputDialog;
/*Lag et program som regner ut arealet av et rektangel. Programmet skal lese inn lengden og bredden på rektangelet.  Regn så ut  arealet og skriver ut svaret på følgende måte: ”Et rektangel med bredde 20.0 cm og lengde 40.0 cm har et areal på 800.0 cm^2”.*/


public class oppgave3 {
    public static void main(String[] args) {
        String breddeS = showInputDialog("Skriv inn bredden på rektangelet (cm)");
        String lengdeS = showInputDialog("Skriv inn lengden på rektangelet (cm)");
        double bredde = Double.parseDouble(breddeS);
        double lengde = Double.parseDouble(lengdeS);
        double areal = bredde*lengde;
        String ut = "Et rektangel med bredde " + bredde + " og lengde "+ lengde +" har et areal på "+ areal + "cm^2";
        System.out.print(ut);
    }
}
