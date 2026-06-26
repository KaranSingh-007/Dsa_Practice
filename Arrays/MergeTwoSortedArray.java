package Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int num1[] = {2,4,5,0,0,0};
        int num2[] = {1,3,10};
        int i = (num1.length-1)-num2.length;
        int j = num2.length-1;
        int idx = num1.length-1;
        while(i>=0 && j>=0){
            if(num1[i]>num2[j]){
                num1[idx] = num1[i];
                i--;
            }else{
                num1[idx] = num2[j];
                j--;
            }
            idx--;
        }
        while(j>=0){
            num1[idx] = num2[j];
            j--;
            idx--;
        }
    
    for(int n = 0;n<num1.length; n++){
            System.out.print(num1[n]+" ");
    }
}
}
