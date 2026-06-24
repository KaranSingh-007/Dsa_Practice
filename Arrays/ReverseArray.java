package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {4,5,2,7,9};
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int s = 0; s<arr.length; s++){
            System.out.println(arr[s]);
        }
    }
    
}
