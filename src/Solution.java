import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input line
        String text = scanner.nextLine();

        // Split by whitespace
        String[] words = text.split("\\s+");

        // Use LinkedHashMap to preserve insertion order
        LinkedHashMap<String, Integer> wordCounts = new LinkedHashMap<>();

        for (String word : words) {
            // Skip empty strings just in case
            if (!word.isEmpty()) {
                // Increment count or initialize to 1
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }

        // Print the word frequencies
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
