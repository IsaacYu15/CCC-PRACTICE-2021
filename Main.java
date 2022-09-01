import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main (String [] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(in.readLine());

        int total = 0;
        int combos = 0;

        for (int i = 0; i < number; i ++) {

            total = number - 5 * i;

            if (total < 0) {
                break;
            } else if (total % 4 == 0) {
                combos ++;
            }
        }

        System.out.println (combos);
    }
}
