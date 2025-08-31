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


    public static void main(String[] args) {
        Recursion r = new Recursion();
        //  r.printNumberFrom1toN(1, 5);
        r.printNumberBackTrackingFrom1ToN(5, 5);
        r.printNumberBackTrackingFromNto1(5,5);
    }
}
