import java.util.Scanner;

public class HappyNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isHappy(n)) {
            System.out.println(n + " is a Happy Number");
        } else {
            System.out.println(n + " is not a Happy Number");
        }

        sc.close();
    }

    public static boolean isHappy(int n) {

        while (n != 1 && n != 4) {
            n = squareDigitSum(n);
        }

        return n == 1;
    }

    public static int squareDigitSum(int n) {

        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }
}