import java.util.Scanner;
public class oppositeTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

       for(int i=n; i>=1; i--){
            for(int j=n-i; j>0; j--){
              System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
              System.out.print("*");
            }
            System.out.println();
        }
        for(int i=2; i<=n; i++){
            for(int j=n-i; j>0; j--){
              System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
              System.out.print("*");
            }
            System.out.println();
        }
    }
}   