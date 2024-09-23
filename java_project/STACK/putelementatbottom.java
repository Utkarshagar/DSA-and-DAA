package java_project.STACK;
import java.util.*;
public class putelementatbottom {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(1);
        st.push(1);
        st.push(1);
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
        if(st.isEmpty())
        st.push(2);
        System.out.println(st.peek());


    }
    
}
