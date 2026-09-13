class Solution {
    public String removeStars(String s) {
        
        Deque<Character> st = new ArrayDeque<>();

        for(char cr : s.toCharArray()) {
            if(cr == '*' && !st.isEmpty()) {
                st.pop();
            } else {
                st.push(cr);
            }
        }

        String res = "";

        while(!st.isEmpty()) {
            res = st.pop() + res;
        }
        return res;
    }
}