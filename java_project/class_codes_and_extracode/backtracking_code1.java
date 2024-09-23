package java_project.class_codes_and_extracode;

public class backtracking_code1 {
    public static void main(String[] args) {
        boolean[]arr=new boolean[5];

    }
    static void print(int cars,int n,String ans,boolean arr[]){
        
    }
    
}
class Solution {
    public int integerReplacement(int n) {
        return replace(n, 0);
    }

    public static int replace(int n, int count) {
        if (n == 1) {
            return count;
        }
        if (n % 2 == 0) {
            return replace(n / 2, count + 1);
        } else {
            // Handle the case where adding or subtracting 1 results in a number divisible by 4
            // This helps to minimize the number of operations
            if (n == 3 || (n & 2) == 0) {
                return replace(n - 1, count + 1);
            } else {
                return replace(n + 1, count + 1);
            }
        }
    }
}

