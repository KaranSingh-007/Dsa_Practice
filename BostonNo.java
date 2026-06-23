public class BostonNo {

    public static void main(String[] args) {

        int n = 378;

        int sumOfDigits = sumOfDigits(n);
        int primeFactorSum = primeFactorDigitSum(n);

        if(sumOfDigits == primeFactorSum) {
            System.out.println("Boston Number");
        } else {
            System.out.println("Not a Boston Number");
        }
    }

    public static int sumOfDigits(int n) {
        int sum = 0;

        while(n != 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }

        return sum;
    }

    public static int primeFactorDigitSum(int n) {
        int sum = 0;
        int div = 2;

        while(n > 1) {

            if(n % div == 0) {
                sum += sumOfDigits(div);
                n /= div;
            } else {
                div++;
            }
        }

        return sum;
    }
}