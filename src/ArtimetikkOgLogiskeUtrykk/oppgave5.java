package ArtimetikkOgLogiskeUtrykk;

import static javax.swing.JOptionPane.showInputDialog;
/*Lag et program som regner ut omkretsen til en sirkel Les først inn radiusen. Regn så ut  omkretsen av sirkelen (2*3.14*radius) og skriver ut svaret på følgende måte: ”Omkretsen av en sirkel med 20.0 cm som radius blir 125.60 cm.”

        Tips: Bruk String omkretsenMedToDesimaler = String.format("%.2f" , omkretsen); for å få 2 desimaler.*/
public class oppgave5 {
    public static void main(String[] args) {
        String fahrenheit = showInputDialog("Skriv inn temperaturen (fahrenheit)");
        double f = Double.parseDouble(fahrenheit);
        double c = (f-32)/1.8;
        String ut = fahrenheit + "*f er lik " + c + "*c";
        System.out.print(ut);
    }
}
