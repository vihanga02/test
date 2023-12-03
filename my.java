import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class my {
    public static void main(String[] args) {
        String name = "Bro";


        boolean result = name.equals("bro");
        boolean result1 = name.equalsIgnoreCase("bro");

        char result2 = name.charAt(0);
        int result3 = name.indexOf("result2");

        boolean result4 = name.isEmpty();
        String result5 = name.toUpperCase();
        String result6 = name.toLowerCase();

        String result7 = name.trim();
        String result8 = name.replace('o','a');


        System.out.println(result2);
        System.out.println(result3);
    }
}
