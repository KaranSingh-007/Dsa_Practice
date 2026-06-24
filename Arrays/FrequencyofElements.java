package Arrays;
public class FrequencyofElements{
    public static void main(String[] args) {
        int[] arr = {6,1,3,1,2,1,1};
        int maxfreq = 0;
        int ans = -1;
        for(int i = 0;i <arr.length; i++){
            int currentfreq = 1;
            for(int j = i+1;j<arr.length; j++){
                if(arr[i] == arr[j]){
                    currentfreq++;
                }
            }
            if(currentfreq > maxfreq){
                maxfreq = currentfreq;
                ans = arr[i];
            }
        }
        System.out.println(ans+" and its frequency is : "+maxfreq);
    }
}