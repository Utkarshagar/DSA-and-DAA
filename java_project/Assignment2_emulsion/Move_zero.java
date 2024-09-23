package java_project.Assignment2_emulsion;
import java.util.*;

public class Move_zero {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        moveZeroes(arr);
        sc.close();

    }
    public static void moveZeroes(int[] nums) {
        int cnt = 0;
        int j = 0;
        int i =0;
        while(i<nums.length){
            if(nums[i]==0){
                cnt++;
            }
            else{
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        i=0;
        for(i=j;i<nums.length;i++){
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
