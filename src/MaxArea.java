public class MaxArea {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    static int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxCup = 0;

        while (start < end) {
            int h = Math.min(height[start], height[end]); // take min
            int width = end - start;
            int currCup = h * width;
            maxCup = Math.max(currCup, maxCup);

            // move pointer of smaller height
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }

        return maxCup;
    }
}
