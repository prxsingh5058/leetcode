class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int k: nums1) {
            set1.add(k);
        }
        for(int k: nums2) {
            set2.add(k);
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(int i : set1) {
            if(!set2.contains(i)) {
                list1.add(i);
            }
        }
        for(int i : set2) {
            if(!set1.contains(i)) {
                list2.add(i);
            }
        }

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(list1);
        answer.add(list2);

        return answer;
    }
}