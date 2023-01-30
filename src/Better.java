public class Better {
    public interface TwoStringPredicate {
        public int compare(String s1, String s2);
    }

    public static String betterString (String s1, String s2, TwoStringPredicate comparator) {
        if (comparator.compare(s1, s2) > 0) {
            return s1;
        }
        return s2;
    } 

    public interface TwoEntryPredicate<T> {
        public  int compare(T s1, T s2);
    }

    public static <T> T betterEntry (T s1, T s2, TwoEntryPredicate<T> comparator) {
        if (comparator.compare(s1, s2) > 0) {
            return s1;
        }
        return s2;
    }
}
