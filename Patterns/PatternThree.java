import java.util.Scanner;

public class PatternThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        int row = 1;
        int ss = 2 * n - 3;

        while (row <= n) {

            // Left stars
            for (int star1 = 1; star1 <= row; star1++) {
                System.out.print("*");
            }

            // Spaces
            for (int s = 1; s <= ss; s++) {
                System.out.print(" ");
            }

            // Right stars
            for (int star2 = 1; star2 <= row; star2++) {
                if (row == n && star2 == 1) {
                    continue;
                }
                System.out.print("*");
            }

            System.out.println();

            row++;
            ss -= 2;
        }

        sc.close();
    }
}