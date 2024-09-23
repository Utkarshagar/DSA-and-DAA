package java_project.practice1;

public class moveallx {
    public static void main(String[] args) {
        String str="axbxxcd";
        String s="";
        int count=0;
        int i=0;
        print(s, str, count,i);
        
    }
    public static void print(String s,String str,int count,int i){
        if(i==str.length()){
            for(int j=0;j<count;j++){
                s=s+'x';
            }
            System.out.println(s);
            return;

        }
        char c=str.charAt(i);
        if(c=='x'){
            count++;
            print(s, str, count, i+1);
        }
        else{
            s=s+c;
            print(s, str, count, i+1);
        }

        
        
    }
    
}
