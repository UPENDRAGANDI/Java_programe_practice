public class Patterns {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(i + " ");
            }
            System.out.println();

        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i + i - 1; j++) {

                System.out.print(j + " ");
            }


        }
        for (int i = 1; i <= n; i++) {
            char c = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(c);
                c++;
            }
            System.out.println();


        }
    }
}
