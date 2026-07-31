class Solution {
    public int findPeakElement(int[] nums) {

        int k = 3;

        int left = 0;
        int right = 2;
        int index = 0;

        if(nums.length == 1) {
            return 0;
        }

            if(nums[0] > nums[1]) {
                return 0;
            }

        while(right < nums.length && left < nums.length) {
            if(nums[left + 1] > nums[left] && nums[left + 1] > nums[right]) {
                return left + 1;
            }

            left++;
            right++;
        }

        return nums.length - 1;
    }
}