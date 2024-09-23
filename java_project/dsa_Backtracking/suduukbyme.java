package java_project.dsa_Backtracking;

import java.util.Scanner;

public class suduukbyme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[9][9];

       
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                grid[i][j] = sc.nextInt(); 
            }
        }
        display(grid);
        System.out.println("----------------------------------------");
         solve(grid,0,0);

    }

    private static void solve(int[][] grid, int row, int col) {
        if (col==9) {
            col = 0;
            row+=1;
          }
      
        if (row == 9) {
            display(grid);
        return ; 
      }
     
      if (grid[row][col]!=0) {
        solve(grid, row, col+1);
      }else{
        for (int i = 0; i<=9 ; i++) {
            if (check(grid,row,col,i)) {
                grid[row][col] = i;
                solve(grid, row, col+1);
                grid[row][col] = 0;
            }
        }
      }
    }

    private static boolean check(int[][] grid, int row, int col, int val) {
     int r = row;
     int c = col;
     //for row
     for (int i = 0; i < grid.length; i++) {
        if (grid[i][c] == val) {
            return false;
        }
     }
     
     //for col
     for (int i = 0; i < grid[0].length; i++) {
        if (grid[r][i] == val) {
            return false;
        }
     }
     //for3x3 matrix
     r = row -row%3;
     c = col- col%3;

     for (int i = r; i < r+3; i++) {
        for (int j =c ; j < c+3; j++) {
            if (grid[i][j] == val) {
                return false;
            }
        }
     }
    
     return true;
    }

    private static void display(int[][] grid) {
      for ( int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid.length; j++) {
            System.out.print(grid[i][j] + " ");
        }
        System.out.println();
      }
    
    }

    
}