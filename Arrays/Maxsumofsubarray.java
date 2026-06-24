package Arrays;

public class Maxsumofsubarray {
    public static void main(String[] args) {
        int[] arr = {7,-8,4,7,9,8};
        int maxsum = 0;
        for(int i = 0; i<arr.length;i++){
            int sum = arr[i];
            for(int j = i+1; j<arr.length; j++){
                sum = sum + arr[j];
                if(sum > maxsum){
                    maxsum = sum;
                }
            }
        }
        System.out.println(+maxsum);
    }
    
}
