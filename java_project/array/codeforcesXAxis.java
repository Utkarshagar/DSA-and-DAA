package java_project.array;
import java.util.*;

public class codeforcesXAxis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int arr[]=new int[3];
            for(int j=0;j<3;j++){
                arr[j]=sc.nextInt();

            }
            Arrays.sort(arr);
            int x=Math.abs(arr[0]-arr[1]);
            int y=Math.abs(arr[1]-arr[1]);
            int z=Math.abs(arr[2]-arr[1]);

            System.out.println(x+y+z);
        }
    }
    
}
