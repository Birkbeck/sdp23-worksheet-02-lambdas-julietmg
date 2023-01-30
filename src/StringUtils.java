import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class StringUtils {

    /**
     * Compares the strings and checks wheter the letter 'e'appears in the
     * beginning. Words with the 'e' in the beginning are returned first.
     * 
     * @param s1
     * @param s2
     * @return
     */
    public static int eChecker(String s1, String s2) {

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

    }

    // predicate is a a condition (means condition)

    public static List<String> allMatches(List<String> list1, Predicate<String> predicate1) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {

            if (predicate1.test(list1.get(i))) {
                result.add(list1.get(i));
            }

        }

        return result; 

    }

}
