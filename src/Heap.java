import java.util.ArrayList;
import java.util.List;

public class Heap {
    //we will implemnt head scenerio by using Array List
    private List<Integer> heap ;
    public Heap(){
        this.heap = new ArrayList<>();
    }

    public List<Integer> getHeap(){
        return new ArrayList<>(heap);
    }

    private int leftChild(int index){
        //if we want to make 0 index open formula will be leftIndex = 2 * index;
        //if we don't , want to make 0 index open. formula will be leftIndex = 2 * index +1 ;
        return 2 * index +1;

    }

    private int rightChild(int index){
        //if we want to make 0 index open formula will be leftIndex = 2 * index + 1;
        //if we don't , want to make 0 index open. formula will be leftIndex = 2 * index + 2;
        return 2 * index + 2;
    }

    private int getParent(int index){
        //if we want to make 0 index open formula will be parent = index/2;
        //if we don't , want to make 0 index open. formula will be ent = index-1/2;
        return (index-1)/2 ;
    }

    private void swap(int index1, int index2){
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void insert(int value){
        heap.add(value);
        int current = heap.size() - 1;

        while (current>0 &&
                heap.get(current) > heap.get(getParent(current))){
            swap(current,getParent(current));
            current = getParent(current);
        }
    }

    //by not using sink down
    public Integer remove() {
        if (heap.isEmpty()) return null;
        if (heap.size() == 1) {
            return heap.remove(0);
        }
        int removedValue = heap.get(0);
        int lastValue = heap.remove(heap.size() - 1); // Remove last element
        heap.set(0, lastValue); // Replace root with last element
        int current = 0;
        while (true) {
            int left = leftChild(current);
            int right = rightChild(current);
            int largest = current;

            if (left < heap.size() && heap.get(left) > heap.get(largest)) {
                largest = left;
            }
            if (right < heap.size() && heap.get(right) > heap.get(largest)) {
                largest = right;
            }
            if (largest != current) {
                swap(current, largest);
                current = largest;
            } else {
                break;
            }
        }
        return removedValue;
    }


//    // by using sink down
//    private void sinkDown(int index){
//        int maxIndex = index;
//        while(true){
//            int leftIndex = leftChild(index);
//            int rightIndex = rightChild(index);
//
//            if (leftIndex < heap.size() && heap.g)
//        }
//
//    }




}
