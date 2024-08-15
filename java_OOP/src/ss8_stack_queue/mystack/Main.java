package ss8_stack_queue.mystack;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        //a. push(): Thêm phần tử
        stack.push(10);
        stack.push(80);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);


        System.out.println("Danh sach ban dau: " + stack.toString());

        //b. peek (): Trả về thông tin đối tượng
        System.out.println(stack.peek());
        System.out.println(stack.peek());

        //c. pop(): lay ra xem va xoa
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        //d. isEmpty(): kiểm tra rỗng
        System.out.println("Ngan xep co rong khong: " + stack.isEmpty());

        //e. size(): trả về số lượng phần tử
        System.out.println("So luong phan tu la: " + stack.size());

    }
}
