import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        TreeMap<Character, Integer> symbolMap = new TreeMap<>();
        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if(!symbolMap.containsKey(currentSymbol)){
                symbolMap.put(currentSymbol, 1);
            } else {
                int currentCount = symbolMap.get(currentSymbol);
                symbolMap.put(currentSymbol, ++currentCount);
            }
            
        }

        for (Map.Entry<Character, Integer> pair : symbolMap.entrySet()) {
            System.out.printf("%s: %d time/s %n", pair.getKey(), pair.getValue());

        }

    }
}
