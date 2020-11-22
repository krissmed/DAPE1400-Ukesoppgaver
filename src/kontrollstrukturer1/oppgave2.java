package kontrollstrukturer1;

import javax.swing.*;

public class oppgave2 {
    public static void main(String[] args) {
        int alder = Integer.parseInt(JOptionPane.showInputDialog("Hvor gammel er du?"));
        if  (alder < 18){
            JOptionPane.showMessageDialog(null, "Du er for ung til å ta førerkort for bil");
        }
        if(alder >= 18){
            JOptionPane.showMessageDialog(null, "Du kan ta førerkort da du blir gammel nok");
        }
}
}