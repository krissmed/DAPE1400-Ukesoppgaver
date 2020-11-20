package Arrays2;

import java.util.ArrayList;

public class oppgave1 {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        for(int i=1;i<10;i++){
            arraylist.add(i);
        }
        System.out.print(arraylist.indexOf(3) + " " + arraylist.indexOf(6));
    }
}
