package java_project.String;

public class String_builder {
    public static void main(String[] args) {
        // String_builder is a class
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        System.out.println(builder);
        System.out.println(builder.reverse());
    }
    
}
