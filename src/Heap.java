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
        return index-1/2 ;
    }

    private void swap(int index1, int index2){
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void insert(int value){
        heap.add(value);
        int current = heap.size() - 1;

        while (current>=0 &&
                heap.get(current) > heap.get(getParent(current))){
            swap(current,getParent(current));
            current = getParent(current);
        }
    }



}
