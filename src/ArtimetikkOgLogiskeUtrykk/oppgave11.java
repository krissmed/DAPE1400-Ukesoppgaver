package ArtimetikkOgLogiskeUtrykk;

import javax.swing.*;

/*
Les inn et tall mellom 0 og 1000 og skriv ut summen av sifrene i tallet (tverrsummen). F.eks inndata 751 skal gi utdata 7 + 5 + 1 = 13. Tips: 751 % 10 = 1 og 751 / 10 = 75.
*/

public class oppgave11 {
    public static void main(String[] args) {
        String tallS = JOptionPane.showInputDialog("Skriv inn et tall mellom 0 og 1000");
        int tall = Integer.parseInt(tallS);
        int tall1 = tall / 10;
        int tall2 = tall1 / 10;
        int tall3 = tall2 / 10;
        int tall4 = tall3 / 10;
        int tall1M = tall % 10;
        int tall2M = tall1 % 10;
        int tall3M = tall2 % 10;
        int tall4M = tall3 % 10;
        int sum = tall1M + tall2M + tall3M + tall4M;
        System.out.print(sum);
    }
}
