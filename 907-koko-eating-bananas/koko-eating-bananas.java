class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int maxPile = 0;
        for(int num : piles) {
            if(num > maxPile) {
                maxPile = num;
            }

        }

        int left = 0;
        int right = maxPile;

        while(left <= right) {

            int k = left + (right - left) / 2;

            int totalHours = 0;

            for(int num : piles) {
                totalHours += Math.ceil((double) num / k);
            }

            if(totalHours <= h) {
                right = k - 1;
            } else{
                left = k + 1;
            }
        }
        return left;
    }
}