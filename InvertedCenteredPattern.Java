import java.util.Scanner;
public class InvertedCenteredPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
// n-1 
//n+i-1