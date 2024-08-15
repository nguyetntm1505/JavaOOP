package ss7_arraylist_linkedlist.mylinkedlist;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        //a. addFirst (int value)
        myLinkedList.addFirst(40);
        myLinkedList.addFirst(30);
        myLinkedList.addFirst(20);
        myLinkedList.addFirst(10);
        myLinkedList.addFirst(10);
        myLinkedList.addFirst(10);
        myLinkedList.addFirst(10);

        //b. toString (): Trả về thông tin đối tượng
        System.out.println("Danh sach ban dau: " + myLinkedList.toString());

        //c. addLast (int element)
        myLinkedList.addLast(50);
        myLinkedList.addLast(60);
        System.out.println("Danh sach: " + myLinkedList.toString());

        //d. add (int index, int element)
        myLinkedList.add(3, 45);
        System.out.println("Danh sach: " + myLinkedList.toString());

        //e. removeFirst ()
        myLinkedList.removeFirst();
        System.out.println("Danh sach: " + myLinkedList.toString());

        //f. removeLast ()
        myLinkedList.removeLast();
        System.out.println("Danh sach: " + myLinkedList.toString());

        //g. remove (int index)
        myLinkedList.remove(2);
        System.out.println("Danh sach: " + myLinkedList.toString());

        //h. getFirst ()
        System.out.println("Phan tu tai vi tri dau tien: " + myLinkedList.getFirst());

        //i. getLast ()
        System.out.println("Phan tu tai vi tri cuoi cung: " + myLinkedList.getLast());

        // j. get (int index)
        System.out.println("Phan tu tai vi tri index: " + myLinkedList.get(2));

        //k. set (int index, int element)
        myLinkedList.set(2, 45);
        System.out.println("Danh sach: " + myLinkedList.toString());

        //l. indexOf (int element)
        System.out.println("Vi tri dau tien cua phan tu [10]: " + myLinkedList.indexOf(10));

        //m. lastIndexOf (int element)
        System.out.println("Vi tri cuoi cung cua phan tu [10]: " + myLinkedList.lastIndexOf(10));
    }
}

