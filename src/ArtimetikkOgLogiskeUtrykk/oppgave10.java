package ArtimetikkOgLogiskeUtrykk;

import javax.swing.*;

/*
Lag et program som leser inn et heltall, alder. Avhengig av hva denne er så skal det skrives ut en tekst tilsvarende : ”Du kan ta førerkortet for bil da du er gammel nok” eller ”Du er for ung til å ta førerkort for bil”. Gjør dette ved bruk to if-setninger.
*/


public class oppgave10 {
    public static void main(String[] args) {
        String alderS = JOptionPane.showInputDialog("Hvor gammel er du?");
        int alder = Integer.parseInt(alderS);
        if (alder >= 18){
            System.out.print("Du kan ta førerkortet for bil da du er gammel nok ");
        }
        if(alder < 18){
            System.out.print("Du er for ung til å ta førerkort for bil");
        }
    }
}
