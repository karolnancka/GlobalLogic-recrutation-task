package firstTask;

import java.util.*;

public class CalculateString {

    public static void getNumbersOfEachChar(String inputString) {

        int stringLength = inputString.length();
        Map<Character, Integer> characters = new HashMap<Character, Integer>(Math.min(stringLength, 26));

        for (int i = 0; i < stringLength; ++i) {
            char charAt = inputString.charAt(i);

            if (!characters.containsKey(charAt)) {
                characters.put(charAt, 1);
            } else {
                characters.put(charAt, characters.get(charAt) + 1);
            }
        }

        TreeMap<Character, Integer> sorted = new TreeMap<>(characters);
        System.out.println("In provided string: '" + inputString + "' we have: \n");
        for (Map.Entry<Character, Integer> entry : sorted.entrySet()) {
            System.out.println(String.format("Letter or sign: %s repeated %s times", entry.getKey(), entry.getValue()));
        }
    }
    public static void main(String[] args) {
        getNumbersOfEachChar("Let's count letters and signs in this string");
    }

}
