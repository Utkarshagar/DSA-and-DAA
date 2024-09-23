package java_project.class_codes_and_extracode.heaps;

public class lecture_1 {
    public static void main(String[] args) {
        Minheap heap=new MinHeap();
        heap.add(10);
        heap.add(12);
        heap.add(15);
        heap.add(3);
        heap.add(6);
        heap.add(1);
        System.out.println(heap.get());
        System.out.println(heap.remove());
        while(!heap.isEmpty()){
            System.out.println(heap.remove()+" ");
        }

    }
    
}
