import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class my {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int rows,columns;

    String symbol = "";

    System.out.println("enter rows");
    rows = scanner.nextInt();

    System.out.println("enter column: ");
    columns = scanner.nextInt();

    System.out.println("enter the symbol");
    symbol = scanner.next();

    for (int i = 0 ; i <= rows ; i++){
        System.out.println();
        for (int j = 0 ; j <= columns ; j++){
            System.out.print(symbol);
        }
    }

    }
}
