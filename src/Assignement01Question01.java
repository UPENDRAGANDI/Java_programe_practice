public class Assignement01Question01 {



}

interface Vehicle {
    default void message() {
        System.out.println("Inside Vehicle");
        Vehicle.staticMessage();
    }
    static void staticMessage() {
        System.out.println("Vehicle static method called");
    }
}

interface FourWheeler {
    default void message() {
        System.out.println("Inside FourWheeler");
        FourWheeler.staticMessage();
    }
    static void staticMessage() {
        System.out.println("FourWheeler static method called");
    }
}

class Car implements Vehicle, FourWheeler {


    public static void main(String[] args) {
        Car car = new Car();
        car.message();

        Test t1=(n1,n2,n3)->n1+n2+n3;

        Test t2=(n1,n2,n3)->n1*n2*n3;
        System.out.println(t2.myFunction(1,2,3));
        System.out.println(t2.myFunction(3,2,3));
    }

    @Override
    public void message() {
        Vehicle.super.message();
    }

    interface Test{
        int myFunction(int num1,int num2,int num3);
    }



}
