package klasserOgObjekter2;

/*
Lag en klasse kalt Klokke. Klassen skal ha tre private heltalls- attributter, time, minutter, sekunder.

Klassen skal ha en konstruktør som initialiserer alle attributtene. Lag også get/set metoder for disse. Set metodene skal sjekke om inndataene er korrekte (0-24 timer, 0-59 på de to andre).

Lag så en metode "visTiden" som skriver ut tiden enten på System.out eller som meldingsboks på følgende format tt : mm : ss.

Skriv så kode i main for å teste ut denne klassen.
*/

import javax.swing.*;

public class oppgave4 {
    private int time;
    private int minutter;
    private int sekunder;

    public void setTime(int time){
        if(time >= 24 || time < 0){
            JOptionPane.showMessageDialog(null, "Timer er mellom 0-24. Prøv igjen");
        }else{
            this.time = time;
        }
    }
    public void setMinutter(int minutter){
        if(minutter >= 59 || minutter < 0){
            JOptionPane.showMessageDialog(null, "Minutter er mellom 0-59. Prøv igjen");
        }else{
            this.minutter = minutter;
        }
    }
    public void setSekunder(int sekunder){
        if(sekunder >= 59 || sekunder < 0){
            JOptionPane.showMessageDialog(null, "Sekunder er mellom 0-59. Prøv igjen");
        }else{
            this.sekunder = sekunder;
        }
    }
    public int getTime(){
        return time;
    }
    public int getMinutter(){
        return minutter;
    }
    public int getSekunder(){
        return sekunder;
    }

    public static void main(String[] args) {
        oppgave4 klokke = new oppgave4();
        klokke.setTime(15);
        klokke.setMinutter(12);
        klokke.setSekunder(34);
        JOptionPane.showMessageDialog(null, klokke.getTime() + " : " + klokke.minutter  +" : " + klokke.sekunder);
    }
}
