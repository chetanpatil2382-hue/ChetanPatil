import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int n = sc.nextInt();

        int limit = (n % 2 == 0) ? n - 1 : n;  // If n is even, print n-1 numbers
        for (int i = 0; i < limit; i++) {
            System.out.print((2 * i + 1));
            if (i != limit - 1) System.out.print(", ");
        }
    }
}
