package kontrollstrukturer2;

public class oppgave4 {
    public static void main(String[] args) {
        int teller = 0;
        int sum = 0;
        for(int i=0;i<100;i++){
            teller++;
            sum += i;
        }
        int gjennomsnitt = sum/teller;
        System.out.print(gjennomsnitt);
    }
}
