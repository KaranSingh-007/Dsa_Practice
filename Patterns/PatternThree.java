// import java.util.Scanner;
public class PatternThree {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number : ");
        // int n = sc.nextInt();
        int n = 5;
        int row = 1;
        int ss = 2*n-3;
        while(row <= n){
            for(int star1 = 0; star1<=row ; star1++){
                System.out.print("*");
            }
            for(int s = 1; s<=ss; s++){
                System.out.print(" ");
            }
            for(int star2 = 1; star2<=row; star2++){
                if(row == n && star2 == row ){

                }else{
                    System.out.println("*");
            }
        }
        System.out.println("");
            row++;
            ss = ss-2;

        }
    }
}
