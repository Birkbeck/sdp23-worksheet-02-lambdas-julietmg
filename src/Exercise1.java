import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise1 {

    public static int compareAlphabetically(String s1, String s2) {
        for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {

            if (s1.charAt(i) < s2.charAt(i)) {
                return -1;
            }

            if (s2.charAt(i) < s1.charAt(i)) {
                return 1;
            }
        }

        return s1.length() - s2.length();
    }

    public static void main(String[] args) {

        String[] words = { "dog", "beautiful", "elegance", "doll", "tulips", "power", "entry", "entrance", "high",
                "creativity", "pool", "imagine", "reversible", "untouchable", "bug", "kit", "kitty" };
        System.out.println(Arrays.asList(words));

        // Sortinh the array by length (i.e. shortest to longest)
        Arrays.sort(words, (String s1, String s2) -> s1.length() - s2.length());
        System.out.println(Arrays.asList(words));

        // Sorting by the reverse length (i.e. longest to shortest)
        Arrays.sort(words, (String s1, String s2) -> s2.length() - s1.length());
        System.out.println(Arrays.asList(words));

        // Sorting by first character
        Arrays.sort(words, (String s1, String s2) -> s1.charAt(0) - s2.charAt(0));
        System.out.println(Arrays.asList(words));

        // My own example: Alphabetically
        Arrays.sort(words, (String s1, String s2) -> compareAlphabetically(s1, s2));
        System.out.println(Arrays.asList(words));

        // Sorting strings starting with those that start with the letter "'e'"
        Arrays.sort(words, (String s1, String s2) -> {
            if (s1.charAt(0) == 'e' && s2.charAt(0) == 'e') {
                return 0;
            }
            if (s1.charAt(0) == 'e') {
                return -1;
            }
            if (s2.charAt(0) == 'e') {
                return 1;
            }
            return 0;
        });

        System.out.println(Arrays.asList(words));

        // Task 2, example written used newly created class StringUtils and its ethod
        // eChecker
        Arrays.sort(words, (String s1, String s2) -> StringUtils.eChecker(s1, s2));
        System.out.println(Arrays.asList(words));

        // Task 3
        String result = Better.betterString("cat", "doggo", (String s1, String s2) -> s1.length() - s2.length());
        System.out.println(result);

        // Task 4
        String result2 = Better.betterEntry("cat", "doggo", (String s1, String s2) -> s1.length() - s2.length());
        System.out.println(result2);

        // Own example, using the generic method with other type.
        int result3 = Better.betterEntry(105, 32, (Integer s1, Integer s2) -> {
            if (s1 < s2) {
                return 1;
            }
            return -1;
        });

        System.out.println(result3);

        // Task 5
        List<String> wordList = Arrays.asList(words);
        List<String> shortWords = StringUtils.allMatches(wordList, s -> s.length() < 4);
        System.out.println(shortWords);
        List<String> wordsWithB = StringUtils.allMatches(wordList, s -> s.contains("b"));
        System.out.println(wordsWithB);
        List<String> evenLengthWords = StringUtils.allMatches(wordList, s -> (s.length() % 2) == 0);
        System.out.println(evenLengthWords);

    }

}
