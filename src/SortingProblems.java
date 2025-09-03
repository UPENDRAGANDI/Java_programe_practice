import java.util.Arrays;

public class SortingProblems {

    public static void main(String[] args) {

        int[] arr1 = {2, 4, 1, 7, 6, 8, 10, 10};

//                       1,4,2,7,6,8,9,10
//                       1,2,4,7,6,8,9,10
//                       1,2,4,6,7,8,9,10

     //   selection sort
        for (int i = 0; i < arr1.length - 2; i++) {
            for (int j = i + 1; j <= arr1.length-1; j++) {
                if (arr1[i] > arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        Arrays.stream(arr1).forEach(System.out::println);

      //  bubble sort
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = i; j <= arr1.length - i - 1; j++) {
                if (arr1[i] > arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j+1];
                    arr1[j] = temp;
                }
            }
        }
        Arrays.stream(arr1).forEach(System.out::println);

       // firstHighest

        int largestNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > largestNumber) {
                largestNumber = arr1[i];
            }
        }

        System.out.println(largestNumber);

        //Second Largest
//        int largestNumber = Integer.MIN_VALUE;
//        int secondLargestNumber = arr1[0];
//
//        for (int i = 0; i < arr1.length; i++) {
//            if (arr1[i] > largestNumber) {
//                if (i != 0) {
//                    secondLargestNumber = largestNumber;
//                }
//                largestNumber = arr1[i];
//
//            } else if (arr1[i] != largestNumber && arr1[i] > secondLargestNumber) {
//                secondLargestNumber = arr1[i];
//            }
//        }
//
//        System.out.println(secondLargestNumber);
//        System.out.println(largestNumber);


    }
}
