class Solution {
    public int equalPairs(int[][] grid) {
        
        int n = grid.length;

        HashMap <String, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            String key = "";

            for(int j = 0; j < n; j++) {
                key += grid[i][j] + ",";
            }

            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int count = 0;

        for(int j = 0; j < n; j++) {
            String key = "";

            for(int i = 0; i < n; i++) {
                key += grid[i][j] + ",";
            }

            count += map.getOrDefault(key, 0);
        }

        return count;
    }
}