public class LeetCodeSubString {

    public static void main(String[] args) {
        String s = "abcabcabc";
        String target = "ab";
        int occurrenceCount = countSubstringOccurrences(s, target);
        System.out.println("The substring '" + target + "' appears " + occurrenceCount + " times in '" + s + "'.");

        int totalSubstrings = countTotalSubstrings(s);
        System.out.println("The total number of substrings in '" + s + "' is " + totalSubstrings + ".");

        boolean canBeConstructed = canBeConstructedByRepeatedSubstring(s);
        System.out.println("Can '" + s + "' be constructed by repeating a substring? " + canBeConstructed);
    }

    // Counts how many times 'target' appears in 's'
    public static int countSubstringOccurrences(String s, String target) {
        int count = 0;
        int idx = 0;
        while ((idx = s.indexOf(target, idx)) != -1) {
            count++;
            idx += target.length();
        }
        return count;
    }

    // Returns the total number of possible substrings in the string
    public static int countTotalSubstrings(String s) {
        int n = s.length();
        return n * (n + 1) / 2;
    }

    // Checks if s can be constructed by repeating a substring
    public static boolean canBeConstructedByRepeatedSubstring(String s) {
        int n = s.length();
        for (int len = 1; len <= n / 2; len++) {
            if (n % len == 0) {
                String sub = s.substring(0, len);
                String repeated = sub.repeat(n / len);
                if (repeated.equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }

    String s = "asdf";

}
