import java.util.*;

class EntradaProb6 {
    public String s = new String();
}

public class Main {

    public static String executa(EntradaProb6 p){
        String text = p.s;
        Hashtable<Integer, Character> htb = new Hashtable<>();
        String finalText = "";
        int i = 0;
        while( i < text.length() ) {
            Character charText = text.charAt(i);
            if (!htb.contains(charText)) {
                htb.put(i, charText);
                finalText = finalText + charText;
            }
            i++;
        }       
        return finalText;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        EntradaProb6 p = new EntradaProb6();
        p.s = s.next();

        System.out.println(executa(p));
    }


}