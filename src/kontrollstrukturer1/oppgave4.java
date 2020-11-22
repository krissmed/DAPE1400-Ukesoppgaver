package kontrollstrukturer1;

import javax.swing.*;

public class oppgave4 {
    public static void main(String[] args) {
        int maxAlder = 70;
        int alder = Integer.parseInt(JOptionPane.showInputDialog("Hvor gammel er du?"));
        if (alder < 18){
            JOptionPane.showMessageDialog(null, "Du er for ung til å ta førerkort for bil");
        }else if(alder >= 18 && alder < maxAlder){
            JOptionPane.showMessageDialog(null, "Du kan ta førerkort for bil og du trenger ikke årlige legesjekker \n");
        }else if(alder >= 70){
            JOptionPane.showMessageDialog(null, "Du er absolutt gammel nok for å kjøre bil, men må ha årlige legesjekker\n");
        }
    }

}
