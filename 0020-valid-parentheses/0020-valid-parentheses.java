class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(char d:s.toCharArray()){
           if (d == '(' || d == '[' || d == '{') {
    st.push(d);
} else {
    if (st.isEmpty()) return false;

    char f = st.pop();

    if (f == '[' && d != ']') return false;
    if (f == '{' && d != '}') return false;
    if (f == '(' && d != ')') return false;
}
        
        
    }
    return st.isEmpty();
}
}