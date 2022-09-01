// 8/15 (took too long :/)
import java.io.*;
public class GoodGroups {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int x = Integer.parseInt(br.readLine());
        String [] workTogether = new String [x];

        for (int i = 0; i < x; i ++) {
            workTogether[i] = br.readLine();
        }

        int y = Integer.parseInt(br.readLine());
        String [] avoid = new String [y];

        for (int i = 0; i < y; i ++) {
            avoid[i] = br.readLine();
        }

        int g = Integer.parseInt(br.readLine());
        
        String [] groupsBrokenDown = new String [g];

        for (int i = 0; i < g; i ++) {
            groupsBrokenDown [i] = br.readLine();
        }
        
        int broken = 0;

        for (int i = 0; i < groupsBrokenDown.length; i ++) {

            String [] group = groupsBrokenDown[i].split(" ");

            for (int a = 0; a < workTogether.length; a++) {
                if (workTogether[a] != null) {
                    int pair = 0;
                    String [] ppl = workTogether[a].split(" ");
    
                    for (int b = 0; b < group.length; b ++) {

                        if (group[b].equals(ppl[0]) || group[b].equals(ppl[1])) {
                            pair ++;
                        }

                    }
    
                    if (pair == 1) {
                        broken ++;
                        workTogether[a] = null;
                    }
                }
            }

            for (int b = 0; b < avoid.length; b++) {
                int pair = 0;
                String [] ppl = avoid[b].split(" ");

                for (int c = 0; c < group.length; c ++) {

                    if (group[c].equals( ppl[0]) || group[c].equals(ppl[1])) {
                        pair ++;
                    }

                }

                if (pair == 2) {
                    broken += 1;
                }
            }
        }

        System.out.println (broken);

    }  
}
