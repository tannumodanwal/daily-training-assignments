import java.util.Scanner;
public class PrintSingleStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of stars to print: ");
        int n = scanner.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 0; j < n; j++){
        //        if(j==0 || i==n){
        //          System.out.print("* ");
        //        }
               
        //     }
        //     System.out.println();
        // }

        for (int k = 1; k <= n * n; k++) {
            int i = (k - 1) / n + 1;   // row number
            int j = (k - 1) % n;       // column number

            if (j == 0 || i == n) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }

            if (j == n - 1) {
                System.out.println();
            }
        }
    }
}