import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] setSizes = Arrays.stream
                (scanner.nextLine()
                        .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int firstSize = setSizes[0];
        LinkedHashSet<String> firstSet = new LinkedHashSet<>();
        for (int i = 0; i < firstSize; i++) {
            firstSet.add(scanner.nextLine());
        }
        int secondSize = setSizes[1];
        LinkedHashSet<String> secondSet = new LinkedHashSet<>();
        for (int i = 0; i < firstSize; i++) {
            secondSet.add(scanner.nextLine());
        }
        firstSet.retainAll(secondSet);
        System.out.println(String.join(" ", firstSet));
    }
}
