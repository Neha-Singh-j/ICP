


public class evalaute_RPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (token.equals("+")) {
                int op2 = st.pop();
                int op1 = st.pop();
                st.push(op1 + op2);
            } else if (token.equals("-")) {
                int op2 = st.pop();
                int op1 = st.pop();
                st.push(op1 - op2);
            } else if (token.equals("*")) {
                int op2 = st.pop();
                int op1 = st.pop();
                st.push(op1 * op2);
            } else if (token.equals("/")) {
                int op2 = st.pop();
                int op1 = st.pop();
                st.push(op1 / op2);
            } else {
                st.push(Integer.parseInt(token));
            }
        }
        
        return st.pop();
    }

}
