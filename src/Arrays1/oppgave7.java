package Arrays1;

public class oppgave7 {
    public static void main(String[] args) {
        int [] liste = {1,2,3,4,5,6,7,8,9};
        int partall = 0;
        int oddetall = 0;
        for(int i = 0; i < liste.length;i++){
            int sjekk = liste[i]%2;
            if(sjekk == 0){
                partall++;
            }else{
                oddetall++;
            }
        }
        System.out.print("Partall: "+ partall + "\n" + "Oddetall: " + oddetall);
    }
}
