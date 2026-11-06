class Solution {
    public int maxArea(int[] height) {
        
        int n = height.length;
        int area = 0;
        int left = 0;
        int right = n-1;

        while(left < right) {
            int width = right - left;
            int length = Math.min(height[left], height[right]);

            if(area < width * length) {
                area = width * length;
            }

            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return area;
    }
}