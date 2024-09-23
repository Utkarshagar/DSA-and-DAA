package java_project.dsa_Backtracking;
import java.util.Scanner;

public class word_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[][] board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        
        String word="ABCCED";

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){

            }
        }
    }
    class Solution {
        public boolean exist(char[][] board, String word) {
             
            for(int i = 0;i< board.length;i++){
                for(int j = 0;j<board[0].length;j++){
                    if(board[i][j]==word.charAt(0)){
                        boolean ans = search(board,i,j,word,0);
                        if(ans==true){
                            
                            return true;
                        }
                    }
                }
            }
            return false;
        }
         public static boolean search(char [][] board , int cr , int cc , String word , int idx){
            if(idx == word.length()){
                return true;
            }
            if(cr<0 || cc<0 || cr>= board.length || cc>= board[0].length || board[cr][cc]!= word.charAt(idx)){
                return false;
            }
            board[cr][cc] = '*';
            int [] r = {-1,0,1,0};
            int [] c = {0,-1,0,1};
            for(int k =0;k< r.length;k++){
                boolean ans = search(board,cr+r[k],cc+c[k],word,idx+1);
                if(ans == true ){
                    return true;
                }
            }
            board[cr][cc] = word.charAt(idx);
            return false;
        }
    }
    
}
