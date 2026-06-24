package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,5,4,7,8};
        int target = 8;
        int index = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                index = i;
            }
        }
        System.out.println(index);
    }
    
}
