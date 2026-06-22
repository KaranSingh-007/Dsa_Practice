import java.util.Scanner;
public class PrimeFactor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        int div = 2;
        while(num != 1){
            if(num % div == 0){
                System.out.println(div+" ");
                num = num/div;
            }else div ++;
        }
    }
}
