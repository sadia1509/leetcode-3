public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0, currentOnes = 0;
        for (int n : nums) {
            if (n == 1) {
                currentOnes++;
            } else {
                if (maxOnes < currentOnes) {
                    maxOnes = currentOnes;
                }
                currentOnes = 0;
            }
        }
        return maxOnes < currentOnes ? currentOnes : maxOnes;
    }
}
