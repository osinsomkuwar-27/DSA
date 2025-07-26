public class Trappedrainwater {

    public static int calculateTrappedWater(int height[]) {

        int n = height.length;
        //calculate leftmax boundary array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        //calculate leftmax boundary array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        // Calculate the total trapped water
        int waterTrapped = 0;

        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        // waterlevel = min(leftMax, rightMax) - height[i]
        // waterTrapped = sum of waterlevel for all i   
        // Calculate trapped water
        for (int i = 0; i < n; i++) {
            waterTrapped += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return waterTrapped;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Trapped Rain Water: " + calculateTrappedWater(height));
    }
}
/*
Time and Space Complexity Analysis:

Time Complexity:
- O(n)
  → One pass to fill `leftMax[]` → O(n)
  → One pass to fill `rightMax[]` → O(n)
  → One pass to calculate total water → O(n)
  → Total = O(n + n + n) = O(n)

Space Complexity:
- O(n)
  → Extra space used for `leftMax[]` and `rightMax[]` arrays, each of size n
*/