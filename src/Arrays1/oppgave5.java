package Arrays1;

public class oppgave5 {
    public static void main(String[] args) {
        int [] liste = {45, 34, 5, 8, 10, 2, 13, 25};
        int tellerH = 0;
        int tellerL = 100;
        for(int i=0; i < liste.length;i++){
            if(liste[i] > tellerH){
                tellerH = liste[i];
            }
            if(liste[i] < tellerL){
                tellerL = liste[i];
            }
        }
        System.out.print(tellerH + "\n" + tellerL);
    }
}
