package java_project.recursion_practice;

public class factorial {
    public static void main(String[] args) {
        int n=4;
        //int count=1;
        System.out.println(print(n));}
        //System.out.println(print(n));
        public static int print(int n){
            if(n==1)
            return 1 ;
            
            // count=count*(n);
           
            // //return (n*(n-1));
            // return (count);
            // print(n-1,count);
             n=n*print(n-1);


            return n;

        } 
    
    
}
