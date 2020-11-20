package ArtimetikkOgLogiskeUtrykk;

/*
Lag et program som regner ut omkretsen til en sirkel Les først inn radiusen.
Regn så ut  omkretsen av sirkelen (2*3.14*radius) og skriver ut svaret på følgende måte:
”Omkretsen av en sirkel med 20.0 cm som radius blir 125.60 cm.”

Tips: Bruk String omkretsenMedToDesimaler = String.format("%.2f" , omkretsen); for å få 2 desimaler.
 */


import javax.swing.*;

public class oppgave4 {
    public static void main(String[] args) {
        String radiusS = JOptionPane.showInputDialog("Skriv inn radiusen");
        double radius = Double.parseDouble(radiusS);
        double omkrets = 2 * Math.PI * radius;
        String omkretsUt = String.format("%.2f", omkrets);
        String ut = "Omkretsen av en sirkel på " + radiusS + " er " + omkretsUt;
        System.out.print(ut);
    }
}
