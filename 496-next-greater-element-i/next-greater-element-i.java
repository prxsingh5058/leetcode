class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Deque<Integer> stack = new ArrayDeque<>();
        int[] ans = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++) {

            int curr = 0;

            for(int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]) {
                    curr = j;
                    break;
                }
            }

            int greater = -1;

            for(int k = curr + 1; k < nums2.length; k++) {
                if(nums2[k] > nums2[curr]) {
                    greater = nums2[k];
                    break;
                }
            }

            ans[i] = greater;
        }

        return ans;
    }
}