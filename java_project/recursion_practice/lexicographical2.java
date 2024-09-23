package java_project.recursion_practice;

public class lexicographical2 {
    public static void main(String[] args) {
        int n=15;
        int i=0;
        print(n,i);
       }
    private static void print(int n,int ans){
        if(ans<=n){
           // if(ans!=0)
            System.out.println(ans);
            }
        
        if(ans>n)
            return ;
            int i=0;
            if(ans==0){
                i=1;

            }
    
        
        for(;i<=9;i++){
            print(n,ans*10+i);
        }

    }
    
}
