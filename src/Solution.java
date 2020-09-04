import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Set<String> winningTeams = new TreeSet();
        Set<String> losingTeams = new TreeSet();

        while(sc.hasNextLine()){
            String[] info = sc.nextLine().split(" ");
            if(Integer.parseInt(info[1]) > Integer.parseInt(info[3])){
                winningTeams.add(info[0]);
                losingTeams.add(info[2]);
            }
            else{
                winningTeams.add(info[2]);
                losingTeams.add(info[0]);
            }
        }

        for(String t : losingTeams){
            winningTeams.remove(t);
        }
        for(String t : winningTeams){
            System.out.println(t);
        }
    }

}