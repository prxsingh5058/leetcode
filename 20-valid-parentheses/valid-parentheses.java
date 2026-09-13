class Solution {
    public boolean isValid(String s) {

        Deque<Character> st = new ArrayDeque<>();

        for(char a : s.toCharArray()) {

            if(a == '(' || a == '{' || a == '[') {
                st.push(a);
            }

            else if(st.isEmpty()) {
                return false;
            }

            else {
                if(a == ')' && st.peek() != '(') {
                    return false;
                }

                if(a == '}' && st.peek() != '{') {
                    return false;
                }

                if(a == ']' && st.peek() != '[') {
                    return false;
                }

                st.pop();
            }
        }

        return st.isEmpty();
    }
}

