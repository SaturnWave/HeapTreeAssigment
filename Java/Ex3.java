import java.util.ArrayList;

public class Ex3 {
    private ArrayList<Integer> heap;

    public Ex3() {
        heap = new ArrayList<>();
    }

    private void upheap(int index) {
        if (index == 0) {
            return;
        }

        int parentIndex = (index - 1) / 2;
        if (heap.get(index) < heap.get(parentIndex)) {
            int temp = heap.get(index);
            heap.set(index, heap.get(parentIndex));
            heap.set(parentIndex, temp);
            upheap(parentIndex);
        }
    }

    public void add(int element) {
        heap.add(element);
        upheap(heap.size() - 1);
    }

    public static void main(String[] args) {
        Ex3 pq = new Ex3();
        pq.add(10);
        pq.add(4);
        pq.add(15);
        pq.add(3); // Triggers upheap

        System.out.println(pq.heap);
    }
}
