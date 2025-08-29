import java.util.Arrays;
import java.util.*;
import java.lang.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Interview {

    public static void main(String[] args) {
//
//        String s = "Hello Java Java";
//        //print the distinct characters
//        //print the distinct words
//        //count the occurences of each word
//        //count the occurences of each character
//        Map<Character, Long> charCount = s.chars()
//                .mapToObj(c -> (char) c)                  // Convert int (ASCII code) to Character
//                .filter(c -> c != ' ')                    // Ignore space characters
//                .collect(Collectors.groupingBy(
//                        Function.identity(),                  // Group by the character itself
//                        LinkedHashMap::new,                   // Maintain insertion order
//                        Collectors.counting()                 // Count how many times each character occurs
//                ));
//        System.out.println(charCount);
//        //print the distinct characters
//        Arrays.stream(s.split("")).distinct().filter(c -> !c.equalsIgnoreCase(" ")).forEach(System.out::println);
//
//        //print the distinct words
//        Arrays.stream(s.split(" ")).distinct().filter(c -> !c.equalsIgnoreCase(" ")).forEach(System.out::println);
//
//        //count the occurences of each word
//        Map<String, Integer> countOfWords = new HashMap<>();
//        Arrays.stream(s.split(" ")).filter(c -> !c.equalsIgnoreCase(" ")).forEach(c1 -> {
//            if (countOfWords.containsKey(c1)) {
//                Integer cunnt = countOfWords.get(c1);
//                countOfWords.put(c1, cunnt + 1);
//            } else {
//
//                countOfWords.put(c1, 1);
//            }
//
//        });
//        System.out.println(countOfWords);
//
//        //count the occurences of each letter
//        Map<String, Integer> countOfEachCharacter = new LinkedHashMap<>();
//        Arrays.stream(s.split("")).filter(c -> !c.equalsIgnoreCase(" ")).forEach(c1 -> {
//            if (countOfEachCharacter.containsKey(c1)) {
//                Integer cunnt = countOfEachCharacter.get(c1);
//                countOfEachCharacter.put(c1, cunnt + 1);
//            } else {
//
//                countOfEachCharacter.put(c1, 1);
//            }
//
//        });
//        System.out.println(countOfEachCharacter);


        int[] nums = {3, 2, 4, 1, 10, 0};
//
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//
//                if (nums[i] > nums[j]) {
//                    int temp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = temp;
//                }
//
//            }
//        }
//        Arrays.stream(nums).forEach(System.out::println);

        //bobule short

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if (nums[j] < nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }

            }
        }

        Arrays.stream(nums).forEach(System.out::println);


//        int highestValue = Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (highestValue < nums[j]) {
//                    highestValue = nums[j];
//                }
//
//            }
//        }
//        System.out.println(highestValue);
//
//
//        String s3 = "111";
//        StringBuilder sb = new StringBuilder(s3);
//        String s4 = String.valueOf(sb.reverse());
//        if (s3.equals(s4)) {
//            System.out.println("palindrome");
//        } else {
//            System.out.println(" not palindrome");
//        }


    }
}
