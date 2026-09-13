class Solution {
    public String removeDuplicates(String s) {
        
        Deque<Character> st = new ArrayDeque<>();

        for(char c : s.toCharArray()) {

            if(st.isEmpty() || st.peek() != c) {
                st.push(c);
            }
            else {
                st.pop();
            }
        }

        String res = "";
        for(char c : st) {
            res = c + res;
        }
        return res;
    }
}