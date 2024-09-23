package java_project.codingblocksAssi1;

import java.util.Scanner;

public class towerofhanoi {
    public static void main(String args[]) {
        Scanner in_put=new Scanner(System.in);
        int n=in_put.nextInt();
        // Taking 3 towers src , des, hlp
        String src="A";
        String hlp="C";
        String des="B";
        tower(n,src,hlp,des);
        int k=50;
        for(int i=0;i<100;i++){
            k=k+i;
        }

    }
    public static void tower(int n,String initial,String temp,String fina_l) {
        // for moving disc
        if(n==0)return;
        tower(n-1, initial, fina_l, temp);
        System.out.println("Moving ring "+n+" from "+initial+" to "+fina_l);
        tower(n-1, temp, initial, fina_l);
        
    }
}
    

