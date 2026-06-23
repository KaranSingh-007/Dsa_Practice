public class PrimeNo{
    public static void main(String args[]){
        boolean t = true;
        for ( int n = 2; n<=100; n++)

        {
        for(int i = 2; i<=n-1; i++){
            if(n % i == 0 ){
                t = false;
                break;
            }
        }
        if(t==true ){
            System.out.println(n);
    }
}
}
}