@FunctionalInterface
interface StringComparator {
    boolean compare(String s1, String s2);
}
public class Main {
    public static String betteString(String s1, String s2, StringComparator comparator) {
        if (comparator.compare(s1, s2)) {
            return s1;
        } else {
            return s2;
        }
    }
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "hello";
        String longer = betteString(str1, str2, (s1, s2) -> s1.length() > s2.length());
        String first = betteString(str1, str2, (s1, s2) -> true);
        
    }
}