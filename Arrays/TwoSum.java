package Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {5,3,1,6,9};
        int first_index = 0;
        int second_index = 0;
        int target = 10;
        for(int i = 0; i < arr.length; i++ ){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    first_index = i;
                    second_index = j;
                }
            }
        }
        System.out.println(first_index+" "+second_index);
    }
    
}
