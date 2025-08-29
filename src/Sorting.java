import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sorting {

    public static void main(String[] args) {

//        int[] num1 =  { 64, 25, 12, 22, 11};
//
//        //selection sort
//
//        for (int n = 0; n < num1.length -1; n++) {
//            for (int j = n+1; j < num1.length; j++) {
//                if (num1[n] > num1[j]) {
//                    int temp = num1[j];
//                    num1[j] = num1[n];
//                    num1[n] = temp;
//                }
//            }
//        }
//
//        for (int n = 0; n < num1.length; n++) {
//            System.out.println(num1[n]);
//        }

        Set<String> ts = new TreeSet<String>();

        // Adding elements into the TreeSet
        // using add()
        ts.add("India");
        ts.add("Australia");
        ts.add("South Africa");

        // Adding the duplicate
        // element
        ts.add("India");

        // Displaying the TreeSet
        System.out.println(ts);

        // Removing items from TreeSet
        // using remove()
        ts.remove("Australia");
        System.out.println("Set after removing "
                + "Australia:" + ts);

        // Iterating over Tree set items
        System.out.println("Iterating over set:");
        Iterator<String> i = ts.iterator();

        while (i.hasNext())
            System.out.println(i.next());

    }
}
