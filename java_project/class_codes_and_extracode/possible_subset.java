package java_project.class_codes_and_extracode;

public class possible_subset {
    public static void main(String[] args) {
        String str="abc";
        String e="";
        int indx=0;
        print(str,e,indx);


    }
    public static void print(String str,String e,int indx){
        if(indx==str.length()){
            System.out.print(e+",");
            return;
        }
        print(str,e+str.charAt(indx),indx+1);
        print(str,e,indx+1);        
    }
}
