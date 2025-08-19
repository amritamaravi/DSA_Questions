import java.util.Scanner;

public class BulbSwitcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(bulbSwticher(n));
    }
    static int bulbSwticher(int n){
        int count = 0;
        int i = 1;
        while(i*i<=n){
            count++;
            i++;
        }
        return count;
    }
}
