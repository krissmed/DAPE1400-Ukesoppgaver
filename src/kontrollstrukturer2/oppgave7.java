package kontrollstrukturer2;

public class oppgave7 {
    public static void main(String[] args) {
        int teller = 0;
        while(teller<20){
            int sjekk = teller%2;
            if(sjekk == 0){
                System.out.print(teller+"\n");
            }
            teller++;
        }
    }
}
