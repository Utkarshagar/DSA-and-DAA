package java_project.graph;

public class path {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        int row=0;
        int col=0;
        print(arr, " ", row, col);

    }
    public static void print(int arr[][],String ans,int row,int col){
        if(row==2 && col==2){
            System.out.println(ans+" ");
            return;

        }
        if(row<=arr.length-1)
        print(arr,ans+'V',row+1,col);
        if(col<=arr.length-1){
            print(arr, ans+'H', row, col+1);
        }
    }
    
}
