package kontrollstrukturer1;

import javax.swing.*;

public class oppgave1 {
    public static void main(String[] args) {
        int alder = Integer.parseInt(JOptionPane.showInputDialog("Hvon gammel er du?"));
        if(alder < 18){
            JOptionPane.showMessageDialog(null, "Du er ikke myndig");
        }
        else if(alder >20){
            JOptionPane.showMessageDialog(null, "Du er myndig");
        }else{
            JOptionPane.showMessageDialog(null, "Du er myndig men kan ikke kjøpe alkohol med mer enn 22 % på polet.");
        }
    }
}
