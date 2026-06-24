package Arrays;

public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {3,6,47,7};
        int Smallest_Element = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]< Smallest_Element){
                Smallest_Element = arr[i];
            }
        }System.out.println(Smallest_Element);
    }    
}
