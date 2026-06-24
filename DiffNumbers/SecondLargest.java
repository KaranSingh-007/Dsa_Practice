import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int first_large = 0;
        int second_large = 0;
        while(n != 0){
            int new_no = n%10;
            if(new_no > first_large){
                first_large = new_no;
            }else if (new_no < first_large && new_no > second_large) {
                second_large = new_no;
            }
            n = n/10;
        }
        System.out.println(second_large);
    }
}
