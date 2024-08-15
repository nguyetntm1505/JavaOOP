package ss8_stack_queue.myqueue;

public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        //a. add(): Thêm phần tử
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);


        System.out.println("Danh sach ban dau: " + queue.toString());

        //b. peek (): Trả về thông tin đối tượng
        System.out.println(queue.peek());
        System.out.println(queue.peek());

        //c. pop(): lay ra xem va xoa
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        //d. isEmpty(): kiểm tra rỗng
        System.out.println("Ngan xep co rong khong: " + queue.isEmpty());

        //e. size(): trả về số lượng phần tử
        System.out.println("So luong phan tu la: " + queue.size());

    }
}
