import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
    static int fib(int n){
        if( n == 0) return 0;
        if ( n == 1 ) return 1;

        int first = 0;
        int second = 1;
        int sum = 0;
        for (int i = 2 ; i <= n ; i++) {
            sum = first + second;
            first = second ;
            second = sum;
        }
        return sum;
    }
}
