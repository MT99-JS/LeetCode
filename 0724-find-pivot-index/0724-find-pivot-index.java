class Solution {
    public int pivotIndex(int[] nums) {

        int[] sumArray = nums.clone();
        int count = -1;

        for (int i = 1; i < nums.length; i++) {
            sumArray[i] = nums[i] + sumArray[i - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            int leftSum = (i == 0) ? 0 : sumArray[i - 1];
            int rightSum = sumArray[nums.length - 1] - sumArray[i];

            if (leftSum == rightSum) {
                count = i;
            }
        }

        return count;
    }
}