import java.util.Scanner;
public class SideTriangle1{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

for(int i = 1; i <= n; i++) {
    for(int j = i; j < n; j++) {
        System.out.print(" ");
    }
    for(int k = 1; k <= i; k++) {
        System.out.print("*");
    }
    System.out.println();
}

for(int i = n-1; i >= 1; i--) {
    for(int j = n; j > i; j--) {
        System.out.print(" ");
    }
    for(int k = 1; k <= i; k++) {
        System.out.print("*");
    }
    System.out.println();
}

    }
}