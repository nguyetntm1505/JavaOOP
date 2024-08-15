package ss7_arraylist_linkedlist.mylinkedlist;

public class MyLinkedList {
    private class Node {
        private int value;
        private Node next;//tham chieu den null

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    //a. addFirst (int value)
    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    //b. toString (): Trả về thông tin đối tượng
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node temp = head;

        for (int i = 0; i < size; i++) {
            stringBuilder.append(temp.value).append(" ");
            temp = temp.next;
        }
        return stringBuilder.toString();
    }

    //c. addLast (int element)
    public void addLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    //d. add (int index, int element)
    public void add(int index, int value) {
        if (index < 0 || index > size) {
            System.out.println("Gia tri Index khong hop le!!");
            return;
        } else if (index == 0) {
            addFirst(value);
        } else if (index == size) {
            addLast(value);
        } else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(value);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        size++;
    }

    //e. removeFirst ()
    public void removeFirst() {
        if (size == 0) {
            return;
        } else if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
        size--;
    }

    //f. removeLast ()
    public void removeLast() {
        if (size == 0) {
            return;
        } else if (size == 1) {
            head = null;
            tail = null;
        } else {
            Node temp = head;
            for (int i = 1; i < size - 1; i++) {
                temp = temp.next;
            }
            tail = temp;
            tail.next = null;
        }
        size--;
    }

    //g. remove (int index)
    public void remove(int index) {
        if (index < 0 || index > size) {
            System.out.println("Index nam ngoia pham vi!!");
            return;
        } else if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size--;
    }

    //h. getFirst ()
    public Integer getFirst() {
        if (size == 0) {
            return null;
        } else {
            return head.value;
        }
    }

    //i. getLast ()
    public Integer getLast() {
        if (size == 0) {
            return null;
        } else {
            return tail.value;
        }
    }

    // j. get (int index)
    public Integer get(int index) {
        if (index < 0 || index > size) {
            System.out.println("Index nam ngoai pham vi!!");
            return null;
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.value;
        }
    }

    //k. set (int index, int element)
    public void set(int index, int element) {
        if (index < 0 || index > size) {
            System.out.println("Index nam ngoai pham vi!!");
            return;
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.value = element;
        }
    }

    //l. indexOf (int element)
    public Integer indexOf(int element) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.value == element) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    //m. lastIndexOf (int element)
    public Integer lastIndexOf(int element) {
        int lastIndex = -1;
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.value == element) {
                lastIndex = i;
            }
            temp = temp.next;
        }
        return lastIndex;
    }
}
