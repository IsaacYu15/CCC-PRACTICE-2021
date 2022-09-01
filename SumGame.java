//15/15
import java.io.*;

public class SumGame {
    public static void main (String [] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int days = Integer.parseInt(in.readLine());
        String [] swifts = in.readLine().split (" ");
        String [] semaphores = in.readLine().split (" ");

        int SW = 0;
        int SM = 0;
        int sameDay = 0;

        for (int i = 0; i < days; i ++) {

            SW += Integer.parseInt(swifts [i]);
            SM += Integer.parseInt(semaphores [i]);

            if (SW == SM) {
                sameDay = i + 1;
            }
        }

        System.out.println (sameDay);
    }
}
