import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8_programes {

    public static void main(String[] args) {

        String s = "Hello World";
        String[] str = s.split("");
        Arrays.stream(str).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
        Map<String, Long> map =
                Arrays.stream(str).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(map);
        Map<String, Integer> map1 = new HashMap<>();
        for (String s1 : str) {
            if (map1.containsKey(s1)) {
                map1.put(s1, map1.get(s1) + 1);
            } else {
                map1.put(s1, 1);
            }
        }
        System.out.println(map1);

        StringBuffer reverseWord = new StringBuffer(s);
        System.out.println(reverseWord.reverse());

        System.out.println(IntStream.rangeClosed(1, 10).sum());

        int number = 123456;

        String value = String.valueOf(123456);

        System.out.println(value);
        System.out.println(Arrays.stream(value.split("")).map(str1 -> Integer.parseInt(str1)).collect(Collectors.summarizingInt(Integer::intValue)).getSum());
        Integer[] numList = {2, 4, 5, 11, 1, 2, 3, 7, 5};

        for (int i = 0; i < numList.length - 1; i++) {

            for (int j = i + 1; j < numList.length; j++) {
                if (numList[i] > numList[j]) {
                    int temp = numList[i];
                    numList[i] = numList[j];
                    numList[j] = temp;
                }
            }
        }

        Arrays.stream(numList).forEach(System.out::println);

        String word = "abcabcabc";
        String target = "ab";

        int count = 0;
        int idx = 0;
        while ((idx = word.indexOf(target, idx)) != -1) {
            count++;
            idx += target.length();
        }
        System.out.println(count);

        System.out.println(word.indexOf("c", 0));


        //palindrome
        int num = 121, reversed = 0, temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        if (num == reversed) {
            System.out.println(num + " is a Palindrome number");
        } else {
            System.out.println(num + " is NOT a Palindrome number");
        }
    }


}
