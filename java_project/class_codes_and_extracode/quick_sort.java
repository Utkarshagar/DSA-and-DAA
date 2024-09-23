package java_project.class_codes_and_extracode;

public class quick_sort {
    public static void main(String[] args) {
        
        
    }
    private void quicksort(int[]arr,int s,int e){
        if(s>=e){
            return;
        }
        int index=placeatrightindex(arr, s, e);
        quicksort(arr, s, index-1);
        quicksort(arr,index+1,e);

    }
    private static int placeatrightindex(int[]arr,int s,int e ){
        int element=arr[e];
        int position=0;
        for(int i=s;i<e;i++){
            if(arr[i]<element){
                swap(arr,i,position);
                position++;

            }

        }
        swap(arr,position,e);
        return position;
    }
    private static void swap(int[]arr,int i,int j){

    }

    
}
