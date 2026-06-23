import java.util.Scanner;
public class NoOfDigit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int no = sc.nextInt();
        int count = 0;
        while(no !=0){
            no = no/10;
            count ++;
        }
        System.out.println("Total count of digits : "+count);
    }
}
