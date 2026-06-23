public class BostonNo {
    public static void main(String args[]){
        int num = 378;
        int n = num;
        int sum = 0;
        int div = 2;
        while(n != 0){
            int dig = n % 10;
            sum =  sum + dig;
            n = n/10; 
        }
        n= num;
        System.out.println(sum);
        while(n != 1){
            if(num % div == 0){
                System.out.println(div+" ");
                n = n/div;
            }else{
                div++;
            }
        }
    }

}
