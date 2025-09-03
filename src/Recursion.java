import java.util.Arrays;
import java.util.Spliterator;

public class Recursion {

    void printNumberFrom1toN(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        printNumberFrom1toN(i + 1, n);
    }

    void printNumberBackTrackingFrom1ToN(int i, int n) {
        if (i < 1) {
            return;
        }
        printNumberBackTrackingFrom1ToN(i - 1, n);
        System.out.println(i);
    }

    void printNumberBackTrackingFromNto1(int i, int n) {
        if (i < 1) {
            return;
        }
        System.out.println(i);
        printNumberBackTrackingFromNto1(i - 1, n);
    }

    //sum of n numbers
    void sumOfNNumbers(int i, int sumNum) {
        if (i < 1) {
            System.out.println(sumNum);
            return;
        }
        sumOfNNumbers(i - 1, sumNum + i);
    }

    int sumOfNNumbersInFunctionalWay(int i) {
        if (i < 1) {
            return 0;
        }
        return i + sumOfNNumbersInFunctionalWay(i - 1);

    }

    int[] sortArrya(int i, int[] arr, int n) {
        if (i >= n) {
            return arr;
        }
        swapArray(i, arr, n);
        sortArrya(i + 1, arr, n - 1);
        return arr;
    }

    int[] sortArrayByUsingOnevariable(int i, int[] arr) {
        if (i >= arr.length - 1) {
            return arr;
        }
        swapArray(i, arr, arr.length - i - 1);
        sortArrayByUsingOnevariable(i + 1, arr);
        return arr;
    }

    int[] swapArray(int i, int[] arr, int n) {
        int temp = arr[i];
        arr[i] = arr[n];
        arr[n] = temp;
        return arr;
    }

    //check whether String is palindrome or not
    boolean checkWhetherStringIsPalindromeOrNot(String s, int i, int n) {

        if (i >= n ) {
          return true;
        }
        if (s.charAt(i) != s.charAt(n-1)) {
            return false;
        }
        return checkWhetherStringIsPalindromeOrNot(s, i + 1, n - 1);
    }

    //checkWhether the number is palindrome or Not

    boolean checkWhetherNumberIsPalindromeOrNot(int number, int refNumber, int reverseNumber) {
        if (refNumber <= 0) {
            if (reverseNumber == number) {
                return true ;
            }
            else {
                return false;
            }
        }
        int digit = refNumber % 10;
        reverseNumber = reverseNumber * 10 + digit;
        return checkWhetherNumberIsPalindromeOrNot(number, refNumber / 10, reverseNumber);
    }

    //FABINOSY

    int nthFeb(int n)
    {
        if(n<=1)
        {
            return n;
        }
        int first=nthFeb(n-1);
        int second=nthFeb(n-2);
        return first+second;//1
    }




    public static void main(String[] args) {
        Recursion r = new Recursion();
//        r.printNumberFrom1toN(1, 5);
//        r.printNumberBackTrackingFrom1ToN(5, 5);
//        r.printNumberBackTrackingFromNto1(5, 5);
        r.sumOfNNumbers(5, 0);
        System.out.println(r.sumOfNNumbersInFunctionalWay(5));

        int[] arr = {1, 2, 3, 4, 5, 6};

//        int[] arr1 = r.sortArrya(0, arr, arr.length - 1);
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//        }

        int[] arr1 = r.sortArrayByUsingOnevariable(0, arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        String s = "MADSAM";
        System.out.println(r.checkWhetherStringIsPalindromeOrNot(s, 0, s.length()));

        int number=101;
        System.out.println(r.checkWhetherNumberIsPalindromeOrNot(101,101,0));

//        int a=0;
//        int b=1;
//        for(int i=3;i<=10;i++){
//           int c=a+b;
//           a=b;
//           b=c;
//           System.out.println(c);
//
//        }
//
//        for(int i=2;i<=10;i++){
//            System.out.println((i-1)+(i-2));
//
//        }

        System.out.println(r.nthFeb(4));






    }
}
