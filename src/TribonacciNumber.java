import java.util.Scanner;

public class TribonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tri(n));
    }
    static int tri(int n){
        if(n == 0){
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
          int first = 0;
          int second = 1;
          int third = 1;
            for (int i = 1; i <= n ; i++) {
                int fourth = first + second + third;
                first = second;
                second = third;
                third = fourth;
            }
            return first;
        }
    }
}
