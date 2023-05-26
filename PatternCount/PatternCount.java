package PatternCount;

import java.util.Scanner;

public class PatternCount {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Masukkan Input: ");
        String text = scanner.nextLine();

        System.out.print("Masukkan Pattern Count: ");
        String pattern = scanner.nextLine();

        // String text = "aaaaaa";
        // String pattern = "aa";

        int count = pattern_counting (text, pattern);
        System.out.println("Pattern count: " + count);

        scanner.close();
    }

    public static int pattern_counting (String text, String pattern) {
        int count = 0;
        int textLength = text.length();
        int patternLength = pattern.length();

        for (int i=0; i<=textLength - patternLength; i++) {
            boolean match = true;

            for (int j=0; j<patternLength; j++) {
                if (text.charAt(i+j) != pattern.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                count++;
            }
        }

        return count;
    }
}
