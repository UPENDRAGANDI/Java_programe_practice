import java.util.Optional;

public class Assignement03Optional {
    public static void main(String[] args) {
        String[] names = new String[5];
        Optional<String> op = Optional.ofNullable(names[0]);
        if (!op.isEmpty()) {
            String s = op.get();
            System.out.println(s.length());
        }

        String address = "Vizag";
        Optional<String> op1 = Optional.ofNullable(address);
        if (!op1.isEmpty()) {
            System.out.println(address);
        } else {
            System.out.println("India");
        }

        //  Employees e=new Employees(1,"prasanth",24,"vizag");
        Employees e = null;
        Optional<Employees> opt = Optional.ofNullable(e);
        if (opt.isEmpty()) {
            throw new RuntimeException("Invalid EmployeeException");
        } else {
            System.out.println(e);
        }


    }

}


class Employees {
    private int empNo;
    private String name;
    private int age;
    private String location;

    public Employees(int empNo, String name, int age, String location) {
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
