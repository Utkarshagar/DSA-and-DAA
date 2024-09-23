package java_project.javapractice;



public class xpower_n {
    //static int count=0;
    public static void main(String[] args) {
        int n=2;
        int x=4;
       System.out.println(print(n,x));
      
    }
    public static int print(int n,int x){
        if(n==0){
            return 0 ;
        }
        if(x==0){
            return 1;
        }
        return n*print(n,x-1);
        //count++;

        
    }
    
}
