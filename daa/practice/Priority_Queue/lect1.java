package daa.practice.Priority_Queue;

import java.util.ArrayList;

public class lect1 {
    ArrayList<Integer> data = new ArrayList<>();

    public void add(int val) {
        data.add(val);
        upheapify(data.size() - 1);
    }

    private void upheapify(int ci) {
        if (ci == 0) {
            return;
        }
        int pi = (ci - 1) / 2;
        if (data.get(pi) < data.get(ci)) {
            swap(pi, ci);
            upheapify(pi);
        }
    }
    // public int remove(){
    //     int value=data.get(0);
    //     data.set(0, data.get(data.size()-1));
    //     data.remo
    // }

    private void swap(int pi, int ci) {
        int temp = data.get(pi);
        data.set(pi, data.get(ci));
        data.set(ci, temp);
    }

    public static void main(String[] args) {
        lect1 pq = new lect1();
        pq.add(10);
        pq.add(30);
        pq.add(20);
        pq.add(5);

        // Display the internal state of the priority queue
        System.out.println(pq.data);
    }
}
