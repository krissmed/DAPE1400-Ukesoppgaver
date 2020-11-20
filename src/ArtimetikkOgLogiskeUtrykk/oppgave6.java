package ArtimetikkOgLogiskeUtrykk;

import javax.swing.*;
/*
Lag et program som regner om fra fahrenheit til celsius. Les inn verdien for fahrenheit og regn ut tilsvarende celsius med følgende formel: C = (F-32)/1.8. Skriv så ut resultatet i Celsius.
*/

public class oppgave6 {
    public static void main(String[] args) {
        String kroner = JOptionPane.showInputDialog("Skriv inn et beløp (nok)");
        double dollarkurs = 9.2087;
        double nok = Double.parseDouble(kroner);
        double dollar = nok * dollarkurs;
        String ut = kroner + " nok tilsvarer " + dollar + " dollar med en dollarkurs på " + dollarkurs;
        System.out.print(ut);
    }
}
