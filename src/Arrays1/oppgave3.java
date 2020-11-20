package Arrays1;

public class oppgave3 {
    public static void main(String[] args) {
            String [] liste = {"Per", "Hansen", "Line", "Olsen", "Ola", "Pedersen", "Kari", "Finnsen"};
            String ut = "";
            for(int i=0; i < liste.length;i++){
                int mod = i % 2;
                if(mod != 0){
                    ut += liste[i] + "\n";
                }else {
                    ut += liste[i] + " ";
                }
            }
        System.out.print(ut);
    }
}
