package Variabler;

import javax.swing.*;

public class oppgave1 {
    public static void main(String[] args) {
        String fornavn = JOptionPane.showInputDialog("Hva er fornavnet ditt?");
        String etternavn = JOptionPane.showInputDialog("Hva er etternavnet ditt?");
        String alder = JOptionPane.showInputDialog("Hvor gammel er du?");
        String adresse = JOptionPane.showInputDialog("Hva er adressen din?");
        String poststed = JOptionPane.showInputDialog("Hva er poststedet ditt?");
        String postnr = JOptionPane.showInputDialog("Hva er postnummeret ditt?");
        String ut = "Navn: " + fornavn + " " + etternavn + "\nAdresse: " + adresse + "\nPostnummer: " + postnr + "\nPoststed: " + poststed + "\nAlder: " + alder;
        System.out.print(ut);
    }
}