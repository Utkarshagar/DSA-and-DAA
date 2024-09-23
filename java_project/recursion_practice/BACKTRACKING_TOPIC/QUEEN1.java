package java_project.recursion_practice.BACKTRACKING_TOPIC;

public class QUEEN1 {
    public static void main(String[] args) {
        int q=2;
        boolean [] board=new boolean [4];
        print(board,q,"",1);
    }
    public static void  print(boolean[]board,int tq , String ans,int qp){
        if(tq<qp){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<board.length;i++){
            if(board[i]==false){
            board[i]=true;
            
            print(board,tq , ans+"B"+i+"Q"+qp,qp+1);}
            board[i]=false;
        }
    }

    
}
