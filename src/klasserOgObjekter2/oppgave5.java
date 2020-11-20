package klasserOgObjekter2;
/*
Nedenfor ser du en skisse av klassen Konto. Din oppgave er å erstatte skrive Javakode isteden.
 */


import javax.swing.*;

public class oppgave5 {
    private String navn;
    private String kontonummer;
    private double saldo;
    //  Attributtene for kontoinnehavers navn, kontornummer og saldo.

    oppgave5(String navn, String kontonummer, double saldo){
        this.navn = navn;
        this.kontonummer = kontonummer;
        this.saldo = saldo;
    }     //  Kontruktør som skal gi startverdier til ALLE attributtene

    public double getSaldo(){
        return saldo;
    }    /*  Kontoutskrifts-metode, som skriver ut kontoinnehaverens
       navn, kontonummer og saldo i et dialogvindu. */

    public void setSaldo(double beløp){
        double nySaldo = saldo + beløp;
        this.saldo = nySaldo;
        JOptionPane.showMessageDialog(null, "Du har nå "+nySaldo+"kr på konto.");
    }    /*  Metode som setter inn et beløp på kontoen.
        Beløpets størrelse skal tas imot via en parameter til metoden.
        Metoden skal returnere en tekst som inneholder informasjon om
        den nye saldoen.  */

    public double taUt(double utVerdi){
        if(utVerdi <= saldo) {
            double nySaldo = saldo - utVerdi;
            this.saldo = nySaldo;
            JOptionPane.showMessageDialog(null, "Du har tatt ut "+utVerdi+"kr fra konto. Ny saldo er"+nySaldo);
            return utVerdi;
        }else{
            JOptionPane.showMessageDialog(null, "Du har ikke nok penger på kontoen");
            return 0;
        }
    }    /*  Metode som tar ut et beløp fra kontoen, under forutsetning av
        at det er dekning for beløpet.
        Uttaks-beløpets størrelse skal tas imot via en parameter til metoden.
        Hvis det er dekning på kontoen, skal metoden returnere en tekst
        med informasjon om den nye saldoen. Hvis  det ikke er dekning,
        skal den returnerte teksten inneholde informasjon om det. */


    public static void main(String[] args) {
        oppgave5 konto = new oppgave5("Krisitian", "123456789", 1234.50);
        konto.getSaldo();
        konto.setSaldo(100);
        konto.taUt(100);
    }
} // end of class Konto













