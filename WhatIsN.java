//15/15
import java.util.*;
public class WhatIsN {

    public static void main (String [] args) {

       
        Scanner in = new Scanner (System.in);
        int number = in.nextInt();

        int combinations = 0;

        if (number == 1) {
            System.out.println(1);
        } else {

            for (int i = 0; i < number; i ++) {

                int t = number - i;

                if (t <= 5 && i <= 5 && (t >= i)) {
                    combinations ++;
                }

            }

            System.out.println (combinations);

        }

    }    
}
