package Arrays1;

public class oppgave4 {
    public static void main(String[] args) {
        int [] liste = {45, 34, 5, 8, 10, 2, 13, 25};
        int [] listeBaklengs = {1,1,1,1,1,1,1,1};
        int teller = 0;
        for(int i=(liste.length - 1); i >= 0;i--){
            System.out.print(liste[i] + " ");
        }
    }
}
