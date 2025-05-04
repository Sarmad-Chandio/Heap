
public class Main {
    public static void main(String[] args) {

        Heap myHeap = new Heap();
        myHeap.insert(99);
        myHeap.insert(72);
        myHeap.insert(61);
        myHeap.insert(58);

        System.out.println(myHeap.getHeap());

        myHeap.insert(100);
        System.out.println(myHeap.getHeap());

        myHeap.insert(75);
        System.out.println(myHeap.getHeap());

        /*
        Expected output:
        [99, 72, 61, 58]
        [100, 99, 61, 58, 72]
        [100, 99, 75, 58, 72, 61]
        * */

        //Test Remove
        System.out.println("***************");
        System.out.println("***************");

        Heap myHeap2 = new Heap();
        myHeap2.insert(95);
        myHeap2.insert(75);
        myHeap2.insert(80);
        myHeap2.insert(55);
        myHeap2.insert(60);
        myHeap2.insert(50);
        myHeap2.insert(65);

        System.out.println(myHeap2.getHeap());

        myHeap2.remove();
        System.out.println(myHeap2.getHeap());
        myHeap2.remove();
        System.out.println(myHeap2.getHeap());

         /*
        Expected output: Remove
       ***************
        [95, 75, 80, 55, 60, 50, 65]
        [80, 75, 55, 60, 50, 65]
        [75, 55, 60, 50, 65]
        * */

    }
}