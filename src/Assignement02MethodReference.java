public class Assignement02MethodReference {


    public static void main(String[] args) {
        //Q1
        Factorials f = new Factorials();
        Fact f1 = f::factorial;
        System.out.println(f1.factorial(20));

        //Q2
        Digit dg = DigitsCounter::digitCount;
        System.out.println(dg.digitCounter(30000));

        //Q3
        CheckNumber c = PrimeNumbersCheck::new;
        c.checkNumbers(23);


    }

}

interface Fact {
    int factorial(int n);
}

class Factorials {
    int factorial(int n) {
        int fact = 1;
        for (int i = n; i > 1; i--) {
            fact = fact * i;
        }
        return fact;
    }
}

interface Digit {
    int digitCounter(int n);
}

class DigitsCounter {

    public static int digitCount(int num) {
        String s = String.valueOf(num);
        return s.length();
    }
}

interface CheckNumber {
    PrimeNumbersCheck checkNumbers( int num);
}

class PrimeNumbersCheck {
    public PrimeNumbersCheck(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count = count + 1;
            }
        }
        if (count > 2) {
            System.out.println("Not a Prime Number");
        } else {
            System.out.println("Prime Number");
        }
    }

}
