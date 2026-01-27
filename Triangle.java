import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<2*i-1; j++){
                System.out.print("*");
    
            }
            System.out.println();
        }
    }
    
}
