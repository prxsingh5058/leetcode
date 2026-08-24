class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack <Integer> stack = new Stack<>();

        for(int current : asteroids) {

            while(!stack.isEmpty() && stack.peek()>0 && current < 0) {

                if(stack.peek() > -current) {
                    current = 0;
                }
                else if(stack.peek() == -current) {
                    current = 0;
                    stack.pop();
                    
                    break; //IMPORTANT!!!!!!!!
                }
                else{
                    stack.pop();
                }
            }

            if(current != 0) {
                stack.push(current);
            }
        }
        int[] result = new int[stack.size()];

        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}