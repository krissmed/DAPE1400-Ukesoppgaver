package ArtimetikkOgLogiskeUtrykk;
/*
Les inn verdier for antall pizza, antall personer og antallSlicesPerPizza.
Regn så ut hvor mange pizza-slices hver person får dersom man deler likt gitt at en pizza har f.eks 6 slices hver.
Hvor mange slices er det til overs dersom man deler likt? Bruk modulus operatoren.
Skriv ut resultatet på følgende form: ”Dersom man er 4 personer og har 3 pizzaer får hver person 4 slices og 2 blir til overs”.
*/


import javax.sound.midi.SysexMessage;
import javax.swing.*;

public class oppgave7 {
    public static void main(String[] args) {
        String pizzaS = JOptionPane.showInputDialog("Hvor mange pizzaer har dere?");
        String personerS = JOptionPane.showInputDialog("Hvor mange personer er dere?");
        int pizza = Integer.parseInt(pizzaS);
        int personer = Integer.parseInt(personerS);
        int slicePerPizza = 6;
        int pizzaPerPrs = (pizza * slicePerPizza) / personer;
        int rest = (pizza * slicePerPizza) % personer;
        String ut = "Dersom man er " + personer +" personer og har "+ pizzaS + " pizzaer får hver person " + pizzaPerPrs +" slices og " + rest + " blir til overs";
        System.out.print(ut);
    }
}
