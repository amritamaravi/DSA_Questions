import java.util.Arrays;

public class SumArrayFromArray {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        printTriangle(A);
    }
    public static void printTriangle (int[] A){
        if(A.length < 1){
            return ;
        }
        int[] sum = new int[A.length - 1];
        for (int i = 0; i < A.length - 1; i++) {
            int x = A[i] + A[i + 1];
            sum[i] = x;
        }

        printTriangle(sum);
        System.out.println(Arrays.toString(A));

    }

}
