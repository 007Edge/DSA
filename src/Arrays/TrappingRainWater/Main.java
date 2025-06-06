package Arrays.TrappingRainWater;

public class Main {
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        int vol = waterTrapped(height);
        System.out.println(vol);
    }

    public static int waterTrapped(int[] height) {
        int[] lmb = new int[height.length];     // left max boundary
        int[] rmb = new int[height.length];     // right max boundary
        int n = height.length;

        int lm = height[0]; // left maximum height
        int rm = height[n-1]; // right maximum height

        for (int i=0; i<n; i++) {

            if (lm < height[i]) {
                lm = height[i];
                lmb[i] = height[i];
            }
            else { lmb[i] = lm; }

            if (rm < height[n-1-i]) {
                rm = height[n-1-i];
                rmb[n-1-i] = height[n-1-i];
            }
            else { rmb[n-1-i] = rm; }
        }
        int vol = 0;
        for (int i=0; i<n; i++) {
            int curr = Math.min(lmb[i],rmb[i]) - height[i];  // water trapped in single bar = min(lmb,rmb) - height
            if (curr < 0) {
                continue;
            }
            vol+=curr;
        }

        return vol;  // returning trapped water

    }
}
