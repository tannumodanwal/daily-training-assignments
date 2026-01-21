import java.util.Scanner;
// 1 2 3 4 5
// 2       4
// 3       3
// 4       2
// 5 4 3 2 1

public class HollowSquare {
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("Enter the size of the hollow square: ");
    //     int n = scanner.nextInt();

    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= n; j++) {
    //             if (i == 1 ) {
    //                 System.out.print(j + " ");
    //             } else if (i == n){
    //                 System.out.print(n-j+1 + " ");
    //             } else if (j == 1){
    //                 System.out.print(i + " ");
    //             } else if (j == n){
    //                 System.out.print(n-i+1 + " ");
    //             } else {
    //                 System.out.print("  ");
    //             }
    //         }
    //         System.out.println();
    //    }
    // }
// A B C D E
// A       D
// B       C
// C       B
// E D C B A
// Improved version to print characters instead of numbers

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the hollow square: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 ) {
                    System.out.print((char)('A' + j) + " ");
                } else if (i == n - 1){
                    System.out.print((char)('A' + n - j - 1) + " ");
                } else if (j == 0){
                    System.out.print((char)('A' + i) + " ");
                } else if (j == n - 1){
                    System.out.print((char)('A' + n - i - 1) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
       }
    }

}