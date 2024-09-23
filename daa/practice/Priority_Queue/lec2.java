package daa.practice.Priority_Queue;

import java.util.*;
public class lec2 {
    ArrayList<Integer> ans=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    public void add(int data){
        ans.add(data);
        unheapefy(ans.size()-1);
    }
    private void unheapefy(int ci){
        int pi=(ci-1)/2;
        if(ans.get(pi)<ans.get(ci)){
            swap(pi,ci,ans);
            unheapefy(pi);
        }
        

    }
    private int  remove(){
        int m=ans.get(0);
        int temp=ans.get(0);
        ans.set(0,ans.get(ans.size()-1));
        ans.set(ans.size()-1,temp);
        ans.remove(ans.size()-1);
        downheapify(0);
        return m;


    }
    public void downheapify(int a){
        int idx=a;
        int lci=2*a+1;
        int rci=2*a+2;
        if(lci<ans.size()&& ans.get(lci)>ans.get(idx)){
            idx=lci;
        }
        if(rci<ans.size()&& ans.get(rci)>ans.get(idx)){
            idx=rci;
        }
        if(a!=idx){
            swap(a,idx,ans);
            downheapify(idx);
        }

    }
    public void swap(int pi,int ci,ArrayList<Integer>ans){
        int temp=ans.get(pi);
        ans.set(pi,ans.get(ci));
        ans.set(ci,temp);


    }
    public void display(){
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={5,2,6,3,9};
        lec2 pq= new lec2();
        pq.add(5);
        pq.add(2);
        pq.add(6);
        pq.add(3);
        pq.add(9);
        pq.display();
        System.out.println();
        System.out.print(pq.remove());
        System.out.println();
        pq.display();

        

        
    }
    
    
    
}
