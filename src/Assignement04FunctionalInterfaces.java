import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Assignement04FunctionalInterfaces {

    public static void main(String[] args) {
        EmployeAttributes e1 = new EmployeAttributes(1, "gandi", 23, "pune", 500000);
        EmployeAttributes e2 = new EmployeAttributes(2, "upendra", 32, "Hyderabad", 4000000);
        EmployeAttributes e3 = new EmployeAttributes(3, "Batchu", 34, "Delhi", 300000);
        EmployeAttributes e4 = new EmployeAttributes(4, "Chanitya", 21, "pune", 100000);
        EmployeAttributes e5 = new EmployeAttributes(5, "Pranv", 21, "pune", 9000);
        ArrayList<EmployeAttributes> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(e1);
        employeeArrayList.add(e2);
        employeeArrayList.add(e3);
        employeeArrayList.add(e4);
        employeeArrayList.add(e5);
        //Q1
        LocationFunction locationFunction = (e) -> e.getLocation();
        List<String> addressList = employeeArrayList.stream().filter(s -> s.getLocation() != null).map(locationFunction).collect(Collectors.toList());
        System.out.println(addressList);

        //Q2
        List<Integer> numList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numList.add(i);
        }
        int sumOfNum = numList.stream().reduce((x, y) -> x + y).get();
        System.out.println(sumOfNum);

        //Q3
        List<String> al = new ArrayList<>();

        al.add("TTT");
        al.add("lal");
        al.add("NOT");

        PalindromePredicate palindromePredicate = (s) -> {
            StringBuilder sb = new StringBuilder(s);
            String str = sb.reverse().toString();
            if (s.equalsIgnoreCase(str)) {
                return true;
            } else {
                return false;
            }
        };
        List<String> palindromeStrings = al.stream().filter(palindromePredicate).toList();
        System.out.println(palindromeStrings);
        //Q4
        employeeArrayList.stream().filter(e -> e.getSalary() > 10000).map(e -> e.getName()).forEach(System.out::println);

        //Q5
        List<Integer> perfectSqures = numList.stream().filter(num -> {
            int num1 = (int) Math.sqrt(num);
            if (num1 * num1 == num) {
                return true;
            } else {
                return false;
            }
        }).toList();
        System.out.println(perfectSqures);
        //Q6
        List<String> al1 = new ArrayList<>();
        al1.add("One");
        al1.add("Two");
        al1.add("Three");
        al1.add("Four");
        al1.add("Five");
        al1.add("Six");
        al1.add("Seven");
        al1.add("Eight");
        al1.add("Nine");
        al1.add("Ten");
        int index = 0;
        Consumer<Integer> consume = (num) -> {
            StringBuilder sb = new StringBuilder(al1.get(num));
            String sb1 = sb.reverse().toString();
            al1.set(num, sb1);
        };
        for (int i = 0; i < al.size(); i++) {
            consume.accept(i);
        }
        System.out.println(al1);
        //Q7
        Consumer<Integer> checkerEvenOrOdd = (num) -> {
            if (num % 2 == 0) {
                System.out.println(num + "  Even");
            } else {
                System.out.println(num + "  Odd");
            }
        };
        numList.stream().forEach(checkerEvenOrOdd);

        //Q8

        System.out.println(Math.sqrt(3));

        Supplier<List<Integer>> sup = () ->
        {
            List<Integer> primeNumberList = new ArrayList<>();
            int number = 2;
            while (primeNumberList.size() < 10) {

                if (checkPrime(number)) {
                    primeNumberList.add(number);
                }
                number += 1;
            }
            return primeNumberList;
        };
        System.out.println(sup.get());


    }

    public static boolean checkPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count = count + 1;
            }
        }
        if (count > 2) {
            return false;
        } else {
            return true;
        }
    }
}

interface LocationFunction extends Function<EmployeAttributes, String> {
}

interface PalindromePredicate extends Predicate<String> {
}


class EmployeAttributes {
    private int empNo;
    private String name;
    private int age;
    private String location;
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public EmployeAttributes(int empNo, String name, int age, String location, int salary) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
        this.salary = salary;
    }


}



