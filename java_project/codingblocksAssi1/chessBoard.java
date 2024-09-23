package java_project.codingblocksAssi1;

public class chessBoard {
    static int count=0;
    public static void main(String[] args) {
        int n=3;
        
        print(n,0,0,"");
        System.out.println("\n"+count);
    }
    public static void print(int n,int row,int col,String ans) {
        ans+="{"+row+"-"+col+"}";
        if(row>=n || col>=n){
            return;
        }
        if(row==n-1 && col==n-1){
            System.out.println(ans+" ");
            count++;
            
            return;
        }
        
        //knight
        int [ ]r={2,1};
        int [ ]c={1,2};
        for(int i=0;i<c.length;i++){
            print(n,row+r[i],col+c[i],ans+"k");
        }
        // rook
        if(row==0|| col==0|| row+1==n|| col+1==n){
            for(int i=col+1;i<n;i++){
                print(n, row, i,ans+"R");
            }
            for(int i=row+1;i<n;i++){
                print(n,i,col,ans+"R");
            }
        
       
    }
        // bishop
        // for(int i=row+1;i<n;i++){
        //     for(int j=col+1;j<n;j++){
        //         if(i==j){
        //             print(n,row+i,col+j);
        //         }
        //     }
        // }
        if(row==col || row+col==n-1){
            int r1=row;
            int c1=col;
            for(int i=1;i<n;i++){
                print(n,r1+1,c1+i,ans+"B");
            }
        }    
    }  
}

