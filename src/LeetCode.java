import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCode {

    public static void main(String[] args) {

        LinkedList<Integer> li = new LinkedList<>();
        li.add(2);
        li.add(4);
        li.add(3);
        LinkedList<Integer> li1 = new LinkedList<>();
        li1.add(5);
        li1.add(6);
        li1.add(4);

        String num1 = li.stream().map(num -> String.valueOf(num)).collect(Collectors.joining(""));
        String num2 = li1.stream().map(num -> String.valueOf(num)).collect(Collectors.joining(""));
        StringBuffer sb = new StringBuffer(num1).reverse();
        StringBuffer sb1 = new StringBuffer(num2).reverse();
        int refNum = Integer.parseInt(sb.toString());
        int refNum2 = Integer.parseInt(sb1.toString());
        int finalResult = refNum + refNum2;
        StringBuffer sb3 = new StringBuffer(String.valueOf(finalResult)).reverse();
        List<Integer> numberList = Arrays.stream(sb3.toString().split("")).
                map(str -> Integer.parseInt(str)).toList();
        System.out.println(numberList);


    }
}
