package AlphabetCount;

import java.util.*;

public class AlphabetCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Masukkan Kalimat: ");
        String input = scanner.nextLine();

        Map<Character, Integer> AlphabetCountMap = countAlphabet(input);
        List<Map.Entry<Character, Integer>> sortingAlphabet = sortAlphabetically(AlphabetCountMap);

        System.out.println("Output: " + sortingAlphabet);

        scanner.close();
    }

    public static Map<Character, Integer> countAlphabet(String input) {
        Map<Character, Integer> AlphabetCountMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                AlphabetCountMap.put(ch, AlphabetCountMap.getOrDefault(ch, 0) + 1);
            }
        }

        return AlphabetCountMap;
    }

    public static List <Map.Entry<Character, Integer>> sortAlphabetically (Map<Character, Integer> AlphabetCountMap) {
        List<Map.Entry<Character, Integer>> sortingAlphabet = new ArrayList<>(AlphabetCountMap.entrySet());

        Collections.sort(sortingAlphabet, (a, b) -> {
            if (Character.toLowerCase(a.getKey()) == Character.toLowerCase(b.getKey())) {
                return Character.compare(a.getKey(), b.getKey());
            }
            return Character.compare(Character.toLowerCase(a.getKey()), Character.toLowerCase(b.getKey()));
        });

        return sortingAlphabet;
    }
}