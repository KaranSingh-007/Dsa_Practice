package Arrays;
public class Kadane{
    public static void main(String[] args) {
        int arr[] = {7,-8,4,7,-9};
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0; i< arr.length; i++){
            currSum += arr[i];
            max = Math.max(max,currSum);
            if(currSum < 0){
                currSum = 0;
            }
        }
        System.out.println(max);
    }
}