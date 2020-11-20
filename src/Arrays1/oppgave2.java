package Arrays1;

public class oppgave2 {
    public static void main(String[] args) {
        int [] liste = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for(int i=0; i < liste.length; i++){
            sum += liste[i];
        }
        int average = sum/liste.length;
        System.out.print("Sum: "+ sum + "\n" + "Gjennomsnitt: " + average);
    }
}
