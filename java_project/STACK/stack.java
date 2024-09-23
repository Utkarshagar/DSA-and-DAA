package java_project.STACK;

//public class lecture2 {
    public class stack{
        int size;
        static int tos=-1;
        int st[];
        stack(){// non parameterised constructor
            st=new int[5];
        }
        stack(int size){//
            st=new int[size];
        }
        public boolean isempty(){
            if(tos==-1){
                return true;
            }
            else{
                return false;
            }
        }
        public boolean isfull(){
            if(tos==st.length-1){
                return true;
            }
            else{
                return false;
            }
        }
        public void push(int val)throws Exception {
            if(isfull()){
                throw new Exception("Stack is full");

            }
            else{
            // tos=tos+1;
            // st[tos]=val;
            st[++tos]=val;
            size++;
        }
    }
    public int  pop()throws Exception {
        if(isempty()){
            throw new Exception("Stack is empty");

        }
        else{
        // int data=st[tos];
        // tos=tos-1;
        int data=st[tos--];
        size--;
        return data;
    }
}
public int peek()throws Exception{
    if(isempty()){
        throw new Exception("Stack is empty");

    }
    else{
    
    int data=st[tos];
    
    return data;
}

}
public  int size(){
    return tos+1;

}
public static void main(String[] args) throws Exception {
    stack st=new stack();
    System.out.println(st.isempty());
    st.push(10);
    
    st.push(3);
    st.push(3);
    st.push(12);
    System.out.println(st.size());
    System.out.println(st.pop());
    System.out.println(st.peek());
    System.out.println(st.isfull());
    
    
    
}

    
    
    
}

//}
