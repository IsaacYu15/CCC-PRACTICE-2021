//2010 | 12/15

import java.io.*;

public class ComputerPurchase {
    public static void main (String [] args) throws IOException {

        BufferedReader scanner = new BufferedReader(
            new InputStreamReader(System.in));

        int iterations = Integer.parseInt(scanner.readLine());
        
        String [] name = new String [2];
        int [] highestScore = new int [2];

        if (iterations == 0) return; //IF 0 INPUT THEN DO NOT RUN CODE AT ALL

        if (iterations == 1) { //IF 1 INPUT THEN ONLY PRINT THAT INPUT
            String [] inputs = scanner.readLine().split(" ");
            System.out.println (inputs[0]);
        }

        for (int i = 0; i < iterations; i ++) 
        {
            String [] inputs = scanner.readLine().split(" "); //SPLIT REMOVES SPACES

            int score = 2 * Integer.parseInt(inputs[1]) + 3 * Integer.parseInt(inputs[2]) + Integer.parseInt(inputs[3]); //CALCULATE SCORE WITH GIVEN FORMULA

            if (score >= highestScore[0]) { //IF THE SCORE IS EQUAL, STILL CONSIDER AS IT COULD BE GREATER THAN THE SECOND HIGHEST SCORE

                if (highestScore[0] > highestScore[1]) { //IF THE SCORE THAT IS REPLACED IS GREATER THAN THE SECOND HIGHEST SCORE, SHIFT IT OVER
                    highestScore[1] = highestScore[0];
                    name [1] = name [0];
                }

                highestScore[0] = score;
                name [0] = inputs[0];

            } else if (score >= highestScore[1]) {//SEE IF SCORE IS GREATER THAN THE SECOND IF IT IS SMALLER THAN THE FIRST
                highestScore[1] = score;
                name [1] = inputs[0];
            }

        }

        for (int i = 0; i < name.length; i ++) {
            System.out.println (name[i]);
        }

    }
}