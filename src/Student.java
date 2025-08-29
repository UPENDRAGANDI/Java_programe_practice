import java.util.*;

import java.util.function.Function;

import java.util.stream.Collectors;

public class Student {

    int rollNo;
    String name;
    int age;
    Student(int rollNo,String name,int age)
    {
        this.rollNo=rollNo;
        this.age=age;
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, name, age);
    }

    public static void main(String[] args) {
//        int num=10;
//        Integer num2=num;
//        int num3=num2;
//
//        String s="12345";
//        Integer num4=Integer.parseInt(s);
//        Long num5=Long.parseLong(s);
//        System.out.println(num5);
//        System.out.println(num4.toString());


        Set<Integer> num1=new HashSet<Integer>();
        for (int i = 0; i < 5; i++) {
            num1.add(i);

        }

        System.out.println(num1);

        Set<Integer> num2=new HashSet<Integer>();
        for (int i = 3; i < 10; i++) {
            num2.add(i);
        }
        System.out.println(num2);

        Set<Integer> finalSet=new HashSet<Integer>();

        finalSet.addAll(num1);
        finalSet.addAll(num2);

        System.out.println(finalSet);

        Set<Integer> finalSet1=new HashSet<Integer>(num1);
        finalSet1.retainAll(num2);

        System.out.println(finalSet1);


        Set<Integer> finalSet2=new HashSet<Integer>(num1);
        finalSet2.removeAll(num2);
        System.out.println(finalSet2);

//        Consumer<List<Integer>> printListOfNumbers=(numbers)->numbers.stream().forEach(System.out::println);
//
//        printListOfNumbers.accept(new ArrayList<>(finalSet1));

//        Predicate<Integer> checkEvenOrNor=(numbers)->numbers%2==0;
//        Consumer<List<Integer>> printListOfNumbers=(numbers)->numbers.stream().filter(checkEvenOrNor).forEach(System.out::println);
//        printListOfNumbers.accept(new ArrayList<>(finalSet1));
//        Function<List<Integer>,List<Integer>> printEventNumbers=(numbers)->numbers.stream().filter(checkEvenOrNor).toList();
//        System.out.println(printEventNumbers.apply(new ArrayList<>(finalSet1)));


//
//
//        Student student=new Student(1,"charan",30);
//        Student student1=new Student(1,"charan",30);
//        Student student2=new Student(2,"upendra",25);
//        Student student3=new Student(3,"praveen",26);
//
//        Map<Student,Integer> map=new HashMap<>();
//        map.put(student,1);
//        map.put(student1,1);
//        map.put(student2,2);
//        map.put(student3,3);
//
//        for(Map.Entry<Student, Integer> m: map.entrySet())
//        {
//           Student students=m.getKey();
//           System.out.println(students.rollNo);
//        }
//
//
//        String s1="praveen";
//        String s2="praveen";
//
//        String s3=new String("Praveen");
//        String s4=new String("Praveen");
//
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
//        System.out.println(s3==s4);
//        System.out.println(s3.equals(s4));

//        String na="praveen kumar";
//
//        Arrays.stream(na.split("")).forEach(System.out::println);

//        String input = "praveen kumar";
//
//        Map<Character, Long> letterCount = input.chars() // IntStream of characters
//                .mapToObj(c -> (char) c) // Convert int to Character
//                .filter(Character::isLetter) // Optional: filter to include only letters
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        letterCount.forEach((ch, count) ->
//                System.out.println(ch + ": " + count));
//      int count=  Arrays.stream(na.split("")).filter(c->c.equalsIgnoreCase("a")).toList().size();
//      System.out.println(count);

        LinkedList list = new LinkedList();

        // adding  elements
//        list.add("Geeks");
//        list.add(4);
//        list.add("Geeks");
//        list.add("8");

        // printing the list
        System.out.println("The initial list is :" + list);

        // peek at the first element of the list
        // Prints 1st element, "Geeks"
        System.out.println("First element of the list is : " + list.peekFirst());

        System.out.println("The final list is :" + list);

        System.out.println("First element of the list is : " + list.poll());

        System.out.println("First element of the list is : " + list.pop());

        System.out.println("The final list is :" + list);





    }








}
