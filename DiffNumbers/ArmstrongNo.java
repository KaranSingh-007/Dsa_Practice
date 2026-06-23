import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        int count = 0;
        int nn = num;

        while(nn != 0){
            nn = nn / 10;
            count++;
        }

        nn = num;
        int sum = 0;

        while(nn > 0){
            int lastDigit = nn % 10;
            sum += (int)Math.pow(lastDigit, count);
            nn = nn / 10;
        }

        if(sum == num){
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}