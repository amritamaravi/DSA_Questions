import java.util.Scanner;

public class WaterBottles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numBottles = sc.nextInt();
        int numExchange = sc.nextInt();
        System.out.println(numWaterBottles(numBottles, numExchange));
    }

       static int numWaterBottles(int numBottles, int numExchange) {
            int ans = numBottles;
            while(numBottles>=numExchange){
                int newBottles = numBottles / numExchange ;
                int remBottles = numBottles % numExchange ;
                ans = ans + newBottles;
                numBottles = newBottles + remBottles;
            }

            return ans;
        }
    }

