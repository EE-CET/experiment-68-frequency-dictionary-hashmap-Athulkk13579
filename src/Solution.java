import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyDictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLine()) {
            String text = scanner.nextLine();
            String[] words = text.split("\\s+");

            HashMap<String, Integer> wordCounts = new HashMap<>();

            for (String word : words) {
                if (!word.isEmpty()) {
                    wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                }
            }

            for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

        scanner.close();
    }
}
