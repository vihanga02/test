import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.Scanner;

public class my {
    public static void main(String[] args) {
        ArrayList <String> food = new ArrayList<String>();

        food.add("pakaya");
        food.add("htta");
        food.add("hm hm");

        food.set(0 , "kariya");
        food.remove(2);
        //food.clear();

        for (int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }
    }
}
