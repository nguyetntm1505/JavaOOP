package ss8_stack_queue.mystack;

public class MyStack<E> {
    private Object[] arr;
    private int capacity;
    private int size;

    private Object[] emptyArray = {};

    public MyStack() {
        this.arr = emptyArray;
    }

    public MyStack(int capacity) {
        this.capacity = capacity;
        this.arr = new Object[this.capacity];
    }

    //a. push(): Thêm phần tử
    public void push(E element) {
        if (arr == emptyArray) {
            this.capacity = 10;
            this.arr = new Object[this.capacity];
        }

        if (size == capacity) {
            this.capacity *= 1.5;
            if (size == capacity) {
                capacity++;
            }
            Object[] brr = new Object[this.capacity];

            //copy arr qua brr
            for (int i = 0; i < size; i++) {
                brr[i] = arr[i];
            }

            //cho arr tham chieu den vung nho moi
            arr = brr;
        }

        arr[size] = element;
        size++;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < size; i++) {
            stringBuilder.append(arr[i]).append(" ");
        }
        return stringBuilder.toString();
    }


    //b. peek (): Trả về thông tin đối tượng
    public E peek() {
        if (size == 0) {
            System.out.println("Ngan xep rong, khong the lay ra!!");
            return null;
        }
        return (E) arr[size - 1];
    }

    //c. pop(): lay ra xem va xoa
    public E pop() {
        if (size == 0) {
            System.out.println("Ngan xep rong, khong the lay ra!!");
            return null;
        }

        E element = (E) arr[size - 1];
        arr[size - 1] = null;
        size--;
        return element;
    }

    //d. isEmpty(): kiểm tra rỗng
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    //e. size(): trả về số lượng phần tử
    public int size() {
        return size;
    }

}
