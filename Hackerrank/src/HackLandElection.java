import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by shubham.goyal on 1/20/17.
 */
public class HackLandElection {

    static String electionWinner(String[] votes) {

        TreeMap<String, Integer> myMap = new TreeMap<>();
        for(String s : votes) {
            if(myMap.containsKey(s)) {
                myMap.put(s, myMap.get(s) + 1);
            }
            else {
                myMap.put(s, 1);
            }
        }

        int max = 0;
        String current = "";
        for(String s: myMap.keySet()) {

            if(myMap.get(s) >= max) {
                max = myMap.get(s);
                current = s;
            }
        }

        return current;
    }


    public static void main(String[] args) {
        String[] data = {"shubham", "shubham", "goyal", "goyal", "pop", "pop"};
        System.out.println(electionWinner(data));
    }
}
