package kontrollstrukturer1;

import javax.swing.*;

public class oppgave5 {
    public static void main(String[] args) {
        String aarstid;
        String mnd = JOptionPane.showInputDialog("Hvilken måned er det?");
        switch (mnd){
            case "januar":
                aarstid = "vinter";
                break;
            case "februar":
                aarstid = "vinter";
                break;
            case "mars":
                aarstid = "vår";
                break;
            case "april":
                aarstid = "vår";
                break;
            case "mai":
                aarstid = "vår";
                break;
            case "juni":
            case "juli":
                aarstid = "sommer";
                break;
            case "august":
                aarstid = "sommer";
                break;
            case "september":
                aarstid = "høst";
                break;
            case "oktober":
                aarstid = "høst";
                break;
            case "november":
                aarstid = "høst";
                break;
            case "desember":
                aarstid = "vinter";
                break;
            default:
                aarstid = "Ukjent";
                break;
            }
            JOptionPane.showMessageDialog(null, "Det er "+aarstid);
        }
    }

