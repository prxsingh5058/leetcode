class Solution {
    public int romanToInt(String s) {
        int I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000;

        int ans = 0;

        for(int i =0; i < s.length(); i++) {

            int current;

            if(s.charAt(i) == 'I') 
            {
                current = I;
            }
            else if(s.charAt(i) == 'V') 
            {
                current = V;
            }
            else if(s.charAt(i) == 'X') 
            {
                current = X;
            }
            else if(s.charAt(i) == 'L') 
            {
                current = L;
            }
            else if(s.charAt(i) == 'C') 
            {
                current = C;
            }
            else if(s.charAt(i) == 'D') 
            {
                current = D;
            }
            else {
                current = M;
            }

            if(i + 1 < s.length()) {
                int next;

                if(s.charAt(i+1) == 'I') 
                {
                    next = I;
                }
                else if(s.charAt(i+1) == 'V') 
                {
                    next = V;
                }
                else if(s.charAt(i+1) == 'X') 
                {
                    next = X;
                }
                else if(s.charAt(i+1) == 'L') 
                {
                    next = L;
                }
                else if(s.charAt(i+1) == 'C') 
                {
                    next = C;
                }
                else if(s.charAt(i+1) == 'D') 
                {
                    next = D;
                }
                else {
                    next = M;
                }

                if(current < next) {
                    ans -= current;
                } else {
                    ans += current;
                }
            }
            else {
                ans += current;
            }
        }
        return ans;
    }
}