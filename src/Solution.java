import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String[] words = text.split("\\s+");

        LinkedHashMap<String, Integer> wordCounts = new LinkedHashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }

        // Print exactly as required
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue());
            System.out.print("\n"); // ensure no extra blank lines
        }

        scanner.close();
    }
}
