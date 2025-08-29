import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment06StreamsApi {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(-1);
        arrayList.add(-2);
        arrayList.add(-4);
        arrayList.add(-5);
        arrayList.add(1);
        arrayList.add(2);
        //Q1
        List<Integer> collect = arrayList.stream().filter(s -> s % 2 == 0 && s < 0).collect(Collectors.toList());
        System.out.println(collect);

        ArrayList<String> arrayListWeekEnds = new ArrayList<>();
        arrayListWeekEnds.add("Monday");
        arrayListWeekEnds.add("Tuesday");
        arrayListWeekEnds.add("Wendenday");
        arrayListWeekEnds.add("Thrusday");
        arrayListWeekEnds.add("Friday");
        arrayListWeekEnds.add("Saturday");
        arrayListWeekEnds.add("Sunday");
        Employee e1 = new Employee(1, "gandi", 23, "pune");
        Employee e2 = new Employee(2, "upendra", 32, "Hyderabad");
        Employee e3 = new Employee(3, "Batchu", 34, "Delhi");
        Employee e4 = new Employee(4, "Chanitya", 21, "pune");
        Employee e5 = new Employee(5, "Pranv", 21, "pune");
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(e1);
        employeeArrayList.add(e2);
        employeeArrayList.add(e3);
        employeeArrayList.add(e4);
        employeeArrayList.add(e5);
        //Q2
        List<Employee> pune = employeeArrayList.stream().filter(s -> s.getLocation().equals("pune")).collect(Collectors.toList());
        System.out.println(pune);

        StudentCL s1 = new StudentCL(1, "gandi", 23);
        StudentCL s2 = new StudentCL(2, "upendra", 98);
        StudentCL s3 = new StudentCL(3, "Batchu", 90);
        StudentCL s4 = new StudentCL(4, "Chanitya", 45);
        StudentCL s5 = new StudentCL(5, "Pranv", 76);

        ArrayList<StudentCL> studentCLS = new ArrayList<>();
        studentCLS.add(s1);
        studentCLS.add(s2);
        studentCLS.add(s3);
        studentCLS.add(s4);
        studentCLS.add(s5);
        //Q3
        List<StudentCL> students = studentCLS.stream().filter(n -> n.getMarks() >= 50).collect(Collectors.toList());
        System.out.println("minimum marks  50 cleared" + students);

        long count = studentCLS.stream()
                .filter(s -> s.getMarks() >= 50)
                .count();

        System.out.println("Students with marks >= 50: " + count);


        //Q4
        arrayListWeekEnds.stream().forEach(System.out::println);

        Employee06 e6 = new Employee06(1, "gandi", "Hyd", 20233);
        Employee06 e7 = new Employee06(2, "upendra", "pune", 20233);
        Employee06 e8 = new Employee06(3, "batchu", "delhi", 20233);
        Employee06 e9 = new Employee06(4, "chatinya", "goa", 20233);
        Employee06 e10 = new Employee06(5, "pranv", "Hyd", 20233);

        ArrayList<Employee06> employee06s = new ArrayList<>();
        employee06s.add(e6);
        employee06s.add(e7);
        employee06s.add(e8);
        employee06s.add(e9);
        employee06s.add(e10);
        //Q5
        employee06s.stream().forEach(System.out::println);


    }
}

class Employee {
    private int empNo;
    private String name;
    private int age;
    private String location;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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


    public Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                '}';
    }

}

class Employee06 {
    private int id;
    private String name;
    private String address;
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public Employee06(int id, String name, String address, int salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee06{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }


}

class StudentCL {
    private int rollNo;
    private String name;
    private int marks;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public StudentCL(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "StudentCL{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }


}



