package java_project.STACK;
import java.util.*;

public class Reverse_a_stack {

    public static void main(String[] args) {
        Stack<Integer> st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
        
    }
    public static void reverse( Stack<Integer> st) {
        if(st.isEmpty()){
            return;

        }
        int temp=st.pop();
        reverse(st);
        pushbottom(st,temp);



        
    }
    public static void  pushbottom(Stack<Integer> st,int k){
        if (st.isEmpty()) {
            st.push(k);
        } else {
            int temp = st.pop();
            pushbottom(st, k);
            st.push(temp);
        }
    }
    
}
