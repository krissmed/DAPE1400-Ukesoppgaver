package Variabler;

import javax.swing.*;

public class oppgave2 {

    public static void main(String[] args) {
        String tall1 = JOptionPane.showInputDialog("Skriv inn et tall");
        String tall2 = JOptionPane.showInputDialog("Skriv inn et tall til");
        String tall3 = JOptionPane.showInputDialog("Skriv inn et tall til");
        double tall1d;
        double tall2d;
        double tall3d;
        try{
            tall1d = Double.parseDouble(tall1);
            tall2d = Double.parseDouble(tall2);
            tall3d = Double.parseDouble(tall3);
        }catch (Exception e){
            tall1d = 0;
            tall2d = 0;
            tall3d = 0;
        }
        double sum = tall1d + tall2d + tall3d;
        double snitt = (tall1d + tall2d + tall3d)/3;
        System.out.print(tall1d + " + " + tall2d + " + " + tall3d + " = " + sum + "\n" +
                "Gjennomsnittet de tre tallene er " + snitt);
    }
}
