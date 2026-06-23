public class PatternFour{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int row = 1; row <= i; row++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
// *
// **
// ***
// ****
// *****