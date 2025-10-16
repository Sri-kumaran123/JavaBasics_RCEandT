public class TwoArrayIncreasing {
    public static void main(String[] args) {
        
        int[] nums = {1, 2, 3, 2, 3, 4, 5};
        int k = 3;

        boolean found = false;
        int n = nums.length;

        
        for (int i = 0; i <= n - 2 * k; i++) {
            boolean firstIncreasing = true;
            boolean secondIncreasing = true;

            
            for (int j = 0; j < k - 1; j++) {
                if (nums[i + j] >= nums[i + j + 1]) {
                    firstIncreasing = false;
                    break;
                }
            }

            
            for (int j = 0; j < k - 1; j++) {
                if (nums[i + k + j] >= nums[i + k + j + 1]) {
                    secondIncreasing = false;
                    break;
                }
            }

            if (firstIncreasing && secondIncreasing) {
                found = true;
                break;
            }
        }

        // Output result
        if (found) {
            System.out.println("Yes, there exist two adjacent increasing subarrays of length " + k);
        } else {
            System.out.println("No, such subarrays do not exist.");
        }
    }
}