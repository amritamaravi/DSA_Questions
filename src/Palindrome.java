import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPalindrome(n)) {
            System.out.println(n + " is a Palindrome");
        }
        else{
            System.out.println(n + " is not a Palindrome number");
        }
    }

    static boolean isPalindrome(int n){
        int original = n;
        int reversed = 0;
        while(n > 0){
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }
        return original == reversed;
    }
}
