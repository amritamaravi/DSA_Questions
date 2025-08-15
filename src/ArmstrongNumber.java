import java.util.Scanner;

public class ArmstrongNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (armstrong(n)) {
                System.out.println(n + " is an Armstrong number.");
            } else {
                System.out.println(n + " is not an Armstrong number.");
            }
        }
        static boolean armstrong(int n){
            int original = n;
            int sum = 0;
            int digits = String.valueOf(n).length();

            while(n > 0){
                int digit = n % 10;
                sum += Math.pow(digit, digits);
                n /= 10;
            }
            return sum == original;
        }
    }

