import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;

public class Assignement05Lambda {

    public static void main(String[] args) {
//Q1
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < 25; i++) {
            Random r = new Random();
            int n = r.nextInt(100);
            al.add(n);
        }

        al.stream().filter(num -> {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count = count + 1;
                }
            }
            if (count > 2) {
                return false;
            } else {
                return true;
            }
        }).forEach(System.out::println);



//Q2
        ArrayList<String> al2 = new ArrayList<>();

        al2.add("One");
        al2.add("Two");
        al2.add("Three");
        al2.add("Four");
        al2.add("Five");
        al2.add("Six");
        al2.add("Seven");
        al2.add("Eight");
        al2.add("Nine");
        al2.add("Ten");

      al2.stream().sorted((s1,s2)->s2.compareTo(s1)).forEach(System.out::println);

    //Q3
        ArrayList<String> al3 = new ArrayList<>();

        al3.add("One");
        al3.add("Two");
        al3.add("Three");
        al3.add("Four");
        al3.add("Five");
        al3.add("Six");
        al3.add("Seven");
        al3.add("Eight");
        al3.add("Nine");
        al3.add("Ten");

        al3.stream().filter(s-> s.length()%2!=0).forEach(System.out::println);
    //Q4
        WordCount w=(s)-> s.length();
        System.out.println(w.count("Charan"));

    }






}


interface  WordCount{
    int count(String str);
}


