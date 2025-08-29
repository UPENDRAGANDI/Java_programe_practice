import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class MostlyAskedQuestionIsJava {

    public static void main(String[] args) {


        String s1 = "1a  2B3c4D";

        //Two separate String one with 1234 and another one with abcd
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            int ascyValue = s1.codePointAt(i);
            if (ascyValue >= 48 && ascyValue <= 57) {
                sb.append(s1.charAt(i));
            }
            if ((ascyValue >= 97 && ascyValue <= 122 || (ascyValue >= 65 && ascyValue <= 90)) && !(ascyValue >= 91 && ascyValue <= 96)) {
                sb2.append(s1.charAt(i));
            }
        }

        System.out.println(sb);
        System.out.println(sb2);

        //second way

//        for (int i = 0; i < s1.length(); i++) {
//
//            char c=s1.charAt(i);
//            if(Character.isAlphabetic(c))
//            {
//                sb2.append(c);
//            }
//            if(Character.isDigit(c))
//            {
//                sb.append(c);
//            }
//
//        }
//        System.out.println(sb);
//        System.out.println(sb2);

        String s2 = "Hello my name is upendr gandi Hello";

        //In the above String we have to count the Occurences of the word and character

        Map<String, Integer> wordCount = new HashMap<>();

        Map<String, Integer> charCount = new HashMap<>();


        String[] wordsArray = s2.split(" ");
        for (int i = 0; i < wordsArray.length; i++) {

            if (wordCount.containsKey(wordsArray[i])) {
                wordCount.put(wordsArray[i], wordCount.get(wordsArray[i]) + 1);
            } else {
                wordCount.put(wordsArray[i], 1);
            }

        }
        System.out.println(wordCount);
        String[] charactersArray = s2.split("");
//        for (int i = 0; i <charactersArray.length ; i++) {
//            String s=charactersArray[i];
//            if ( !s.equalsIgnoreCase(" ")&& charCount.containsKey(s)) {
//                charCount.put(s, charCount.get(s) + 1);
//            } else if(!s.equalsIgnoreCase(" ")) {
//                charCount.put(s, 1);
//            }
//
//        }

        Arrays.stream(s2.split("")).forEach(s ->
        {
            if (!s.equalsIgnoreCase(" ") && charCount.containsKey(s)) {
                charCount.put(s, charCount.get(s) + 1);
            } else if (!s.equalsIgnoreCase(" ")) {
                charCount.put(s, 1);
            }

        });
        System.out.println(charCount);


        //Sorting

        Integer[] numList = {2, 4, 5, 11, 1, 2, 3, 7, 5};

        //selection sort
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
         System.out.println("=================");
        //bubble sort

        for (int i = 0; i < numList.length - 1; i++) {
            for (int j = 0; j < numList.length-i-1; j++) {
                if (numList[j] < numList[j+1]) {
                    int temp = numList[j];
                    numList[j] = numList[j+1];
                    numList[j+1] = temp;
                }
            }
        }

        Arrays.stream(numList).forEach(System.out::println);


        int min_num=Integer.MIN_VALUE;
        int max_num=Integer.MAX_VALUE;


        for (int i = 0; i < numList.length; i++) {

             int num=numList[i];
             if(numList[i]>min_num)
             {
                 min_num=numList[i];
             }

        }

        System.out.println("maximun_number"+ min_num);//maximum value


        for (int i = 0; i < numList.length; i++) {

            int num=numList[i];
            if(numList[i]<max_num)
            {
                max_num=numList[i];
            }

        }
        System.out.println("Minimu_num"+max_num);//minimum value

///  java 8


        Map<String, Long> wordCount1 = Arrays.stream(s2.split(" "))
                .map(String::toLowerCase) // for case-insensitive counting
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

       System.out.println(wordCount1);


       System.out.println(IntStream.range(1,10).sum());

      int num=Arrays.stream(numList).reduce((x,y)->x+y).get();
      System.out.println(num);

    System.out.println(  Arrays.stream(numList).sorted(Collections.reverseOrder()).distinct().skip(2).findFirst().get());


    List<List<List<Integer>>> nestedList=Arrays.asList(
            Arrays.asList(Arrays.asList(123,3,45,4)),
            Arrays.asList(Arrays.asList(123,3,45,4)),
            Arrays.asList(Arrays.asList(123,3,45,4)),
            Arrays.asList(Arrays.asList(123,3,45,4)));

    System.out.println(nestedList);

    List<Integer>li=nestedList.stream().flatMap(Collection::stream).flatMap(Collection::stream).toList();

    System.out.println(li);

    String s12="reddy";
    s12+="charan";
    System.out.println(s12);
    String s23="reddycharan";
    String s24="charan";
    s24="reddycharan";

        System.out.println(s23);
        System.out.println(s12==s23);
        System.out.println(s24==s23);

        System.out.println(s12.hashCode());
        System.out.println(s23.hashCode());
    }
}
