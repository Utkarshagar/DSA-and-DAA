package java_project.codingblocksAssi1;


import java.util.Scanner;

public class sudo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int z=scanner.nextInt();
        int[][] sudokuGrid = new int[z][z];
        // int[][]sudokuGrid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
		// 		{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
		// 		{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

        //Input Sudoku values
        for (int R = 0; R < sudokuGrid.length; R++) {
            for (int C = 0; C < sudokuGrid.length; C++) {
                sudokuGrid[R][C] = scanner.nextInt();
            }
        }

        //displaySudoku(sudokuGrid);
       // System.out.println("----------------------------------------");
        solveSudoku(sudokuGrid, 0, 0);
    }

    // Function to solve the Sudoku puzzle using backtracking
    private static void solveSudoku(int[][] sudokuGrid, int R, int C) {
        // Move to the next row if the column index reaches the end
        if (C == 9) {
            C = 0;
            R += 1;
        }

        // If all rows are traversed, display the solved Sudoku
        if (R == 9) {
            displaySudoku(sudokuGrid);
            return;
        }

        // Skip filled cells and move to the next column
        if (sudokuGrid[R][C] != 0) {
            solveSudoku(sudokuGrid, R, C + 1);
        } else {
            // Try placing numbers from 1 to 9 in the empty cell
            for (int num = 1; num <= 9; num++) {
                if (isValidMove(sudokuGrid, R, C, num)) {
                    // Place the number and recursively move to the next column
                    sudokuGrid[R][C] = num;
                    solveSudoku(sudokuGrid, R, C + 1);
                    // Backtrack by resetting the cell to 0
                    sudokuGrid[R][C] = 0;
                }
            }
        }
    }

    // Function to check if placing a number in a cell is valid
    private static boolean isValidMove(int[][] sudokuGrid, int R, int C, int num) {
        int currentRow = R;
        int currentCol = C;

        // Check for the same number in the row
        for (int i = 0; i < sudokuGrid.length; i++) {
            if (sudokuGrid[i][currentCol] == num) {
                return false;
            }
        }

        // Check for the same number in the column
        for (int i = 0; i < sudokuGrid[0].length; i++) {
            if (sudokuGrid[currentRow][i] == num) {
                return false;
            }
        }

        // Check for the same number in the 3x3 matrix
        currentRow = R - R % 3;
        currentCol = C - C % 3;

        for (int i = currentRow; i < currentRow + 3; i++) {
            for (int j = currentCol; j < currentCol + 3; j++) {
                if (sudokuGrid[i][j] == num) {
                    return false;
                }
            }
        }

        // If no conflicts are found, the move is valid
        return true;
    }

    // Function to display the Sudoku grid
    private static void displaySudoku(int[][] sudokuGrid) {
        for (int i = 0; i < sudokuGrid.length; i++) {
            for (int j = 0; j < sudokuGrid.length; j++) {
                System.out.print(sudokuGrid[i][j] + " ");
            }
            System.out.println();}
        }
    }
        

    

