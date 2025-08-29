public class LeetCodePattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat fish";
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            System.out.println(false);
            return;
        }
        java.util.Map<Character, String> charToWordMap = new java.util.HashMap<>();
        java.util.Map<String, Character> wordToCharMap = new java.util.HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            if (charToWordMap.containsKey(c)) {
                if (!charToWordMap.get(c).equals(w)) {
                    System.out.println(false);
                    return;
                }
            } else {
                charToWordMap.put(c, w);
            }
            if (wordToCharMap.containsKey(w)) {
                if (wordToCharMap.get(w) != c) {
                    System.out.println(false);
                    return;
                }
            } else {
                wordToCharMap.put(w, c);
            }
        }
        System.out.println(true);
    }

}
