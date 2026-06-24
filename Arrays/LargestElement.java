package Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {3,6,2,3,9};
        int largest_number = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > largest_number){
                largest_number = arr[i];
            }
        }
        System.out.println(largest_number);
    }
    
}
