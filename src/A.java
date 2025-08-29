public class A {


    int sum(int num1,int num2)
    {
        return num1+num2;
    }

    int sum(double num1,double num2)
    {
        return (int) (num1+num2);
    }


    public static void main (String[]args)
    {
        A a=new A();
        System.out.println(a.sum(1,2));
        System.out.println(a.sum(1.00,2.00));
    }
}
