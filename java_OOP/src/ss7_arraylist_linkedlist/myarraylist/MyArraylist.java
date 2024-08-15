package ss7_arraylist_linkedlist.myarraylist;

public class MyArraylist {
    private int[] arr;
    private int capacity;
    private int size;

    private int[] emptyArray = {};

    public int size() {
        return size;
    }

    public MyArraylist() {
        this.arr = emptyArray;
    }

    public MyArraylist(int capacity) {
        this.capacity = capacity;
        this.arr = new int[this.capacity];
    }

    //a. add (int element): Thêm phần tử element vào cuối.
    public void add(int element) {
        if (arr == emptyArray) {
            this.capacity = 10;
            this.arr = new int[this.capacity];
        }

        if (size == capacity) {
            this.capacity *= 1.5;
            if (size == capacity) {
                capacity++;
            }
            int[] brr = new int[this.capacity];

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

    //b. toString (): Trả về thông tin đối tượng
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < size; i++) {
            stringBuilder.append(arr[i]).append(" ");
        }
        return stringBuilder.toString();
    }

    //c. add (int index, int element): Thêm phần tử vào vị trí index
    public void add(int index, int element) {
        if (index < 0 || index >= size) {
            System.out.println("Index nam ngoai pham vi");
            return;
        }

        if (size == capacity) {
            this.capacity *= 1.5;
            if (size == capacity) {
                capacity++;
            }
            int[] brr = new int[this.capacity];

            //copy arr qua brr
            for (int i = 0; i < index; i++) {
                brr[i] = arr[i];
            }

            brr[index] = element;

            for (int i = index; i < size; i++) {
                brr[i + 1] = arr[i];
            }

            //cho arr tham chieu den vung nho moi
            arr = brr;
        } else {
            //neu size khong bang capacity thi ko can tao brr moi, ma chi can dich chuyen phan tu index sang trai de nhuong cho cho phan tu index
            for (int i = size; i > index; i--) {
                arr[i] = arr[i - 1];
            }

            arr[index] = element;
        }

        size++;
    }

    //d. set (int index, int element): Thay thế phần tử tại vị trí index
    public void set(int index, int element) {
        if (index < 0 || index >= size) {
            System.out.println("Index nam ngoai pham vi");
            return;
        } else {
            arr[index] = element;
        }
    }

    //e. get (int index): Trả về phần tử tại index
    public Integer get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index nam ngoai pham vi");
            return null;
        }
        return arr[index];
    }

    //f. indexOf (int element): Lấy vị trí index phần tử đầu tiên tìm thấy
    public Integer indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        //neu khong tim thay element tra ve -1
        return -1;
    }

    //g. lastIndexOf (int element o): Lấy vị trí index phần tử cuối cùng tìm thấy
    public Integer lastIndexOf(int element) {
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i] == element) {
                return i;
            }
        }
        //neu khong tim thay element tra ve -1
        return -1;
    }

    //h. remove (int index): Xóa phần tử lại vị trí index
    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index nam ngoai pham vi");
            return;
        }
        for (int i = index; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    //i. removeElement (int element): Xóa tất cả phần tử element
    public void removeElement(int element) {
        int newIndex = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] != element) {
                arr[newIndex] = arr[i];
                newIndex++;
            }
        }
        size = newIndex;
    }
}
