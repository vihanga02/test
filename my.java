import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class my {
    public static void main(String[] args) {
        String[][] cars = new String[3][3];

        cars[0][0] = "pakya";
        cars[0][1] = "htta";
        cars[0][2] = "mmmm";
        cars[1][0] = "httgpth";
        cars[1][1] = "acgpth";
        cars[1][2] = "kkkk";
        cars[2][0] = "namasthe";
        cars[2][1] = "namaskaram";
        cars[2][2] = "aesgda";

        for (int i = 0 ; i < cars.length; i++){
            System.out.println();
            for (int j = 0; j<cars[1].length ; j++){
                System.out.println(cars[i][j] + " ");
            }
        }
    }
}
