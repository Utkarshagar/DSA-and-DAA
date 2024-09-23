package java_project.PRACTICE.viva_practice;

public class exception_handling {
    public static void main(String[] args) {
        int a=10,b=0;
        try{
            int c=a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("main is completed");
    }
    
}
