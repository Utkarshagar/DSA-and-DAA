class Solution {
    public int[] asteroidCollision(int[] a) {
        int n = a.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(st.isEmpty() || a[i]>0){
                st.push(a[i]);
            }
            else{
                while(!st.isEmpty()){
                        int top = st.peek();
                int mod = Math.abs(a[i]);
                if(top<0){
                    st.push(a[i]);
                    break;

                }
               else if(top==mod){
                    st.pop();
                    break;

                }
               else if(top>mod){
                    break;
                }
                else{
                    st.pop();
                    if(st.isEmpty()){
                        st.push(a[i]);
                        break;
                    }
                }
                }
            
            }
        }
        int ans[] = new int[st.size()];
        for(int i=0;i<st.size();i++){
            ans[i]=st.get(i);
        }
        return ans;
        
    }
}