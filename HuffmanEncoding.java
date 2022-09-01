//2010 | 15/15

import java.util.*;

public class HuffmanEncoding {
    public static void main (String [] args) {

            Scanner in = new Scanner (System.in);
            int counter = Integer.parseInt(in.nextLine());
    
            ArrayList <String> letter = new ArrayList<>();
            ArrayList <String> code = new ArrayList<>();
    
            
            for (int i = 0; i < counter; i ++) 
            {
                String [] t = in.nextLine().split(" ");
                letter.add (t[0]);
                code.add (t[1]);
            }
    
            String input = in.nextLine();
    
            String compare = "";
            String output = "";
            
            for (int i = 0; i < input.length(); i ++) { 
                
                compare += input.charAt(i); //add to the compare string the code. 

                System.out.println ("Index: " + i + " compare: " + compare);
                if (code.contains(compare)) { 
                    int index = code.indexOf(compare); //returns the position of the first occurrence of specified character(s) in a string.
                    output += letter.get(index);//add the letter with corresponding index
                    compare = "";//restart process
                } 
                
            }
    
            System.out.println (output);
    
            //compare string is null
            //first we see if our array list contains compare if it doesn't we add the index of the char. Loop and repeat
            //E.g. input = 001
            //code doesn't contain "" so it goes to else and turns compare to "0"
            //code doesn't contain "0" so it goes to else and turns compare to "00"
            //code contains "00" so it finds corresponding index with letter and restarts the process
    
        }

}