import java.sql.Array;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

//
//        int a = 2;
//        int b = 3;
//        int c;
//
//        c = b;
//        b = a;
//        a = c;
//        System.out.println(a + "  " + b);

      int[] nums = {2, -3, 40, 10, 55, 7, 6, 3};
//        int a = 0;
//        int b = 0;
//        int c = 0;
//        for (int i = 0; i < (nums.length) - 1; i++) {
//            a = nums[i];
//            b = nums[i + 1];
//            if (a > b) {
//                c = nums[i];
//                nums[i + 1] = c;
//                nums[i] = b;
//            }
//
//        }

        int highestValue=Integer.MIN_VALUE;
        for (int i = 0; i < (nums.length) ; i++) {
            if (highestValue< nums[i]) {
               highestValue=nums[i];
            }

        }
       System.out.println(highestValue);

        int lowestValue=Integer.MAX_VALUE;
        for (int i = 0; i < (nums.length) ; i++) {

            if (lowestValue>nums[i]) {
                lowestValue=nums[i];
            }

        }
        System.out.println(lowestValue);
//
//        for (int i = 0; i < (nums.length) - 1; i++) {
//            a = nums[i];
//            b = nums[i + 1];
//            if (a < b) {
//                c = nums[i];
//                nums[i + 1] = c;
//                nums[i] = b;
//            }
//
//        }
//        System.out.println(c);
//
//
  }
}
