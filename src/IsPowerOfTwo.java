import java.sql.SQLOutput;
import java.util.Scanner;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        System.out.println(isPowerOfTwo(n));
    }
    static boolean isPowerOfTwo (int n){
        if(n<1){
            return false;
        }
        while(n % 2 == 0){
            n = n/2;
        }
        if(n == 1){
            return true;
        }
        else {
            return false;
        }
    }
}
