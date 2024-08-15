package ss7_arraylist_linkedlist.myarraylist;

public class Main {
    public static void main(String[] args) {
        MyArraylist myArraylist = new MyArraylist();

        //a. add (int element): Thêm phần tử element vào cuối.
        myArraylist.add(10);
        myArraylist.add(80);
        myArraylist.add(30);
        myArraylist.add(40);
        myArraylist.add(50);
        myArraylist.add(60);
        myArraylist.add(70);
        myArraylist.add(80);
        myArraylist.add(90);
        myArraylist.add(100);

        //b. toString (): Trả về thông tin đối tượng
        System.out.println("Danh sach ban dau: " + myArraylist.toString());

        //c. add (int index, int element): Thêm phần tử vào vị trí index
        myArraylist.add(1, 15);
        System.out.println("Danh sach sau khi them 15 vao index 1: " + myArraylist.toString());

        //d. set (int index, int element): Thay thế phần tử tại vị trí index
        myArraylist.set(4, 45);
        System.out.println("Danh sach sau khi thay the 45 vao index 4: " + myArraylist.toString());

        //e. get (int index): Trả về phần tử tại index
        System.out.println("Phan tu tai vi tri thu 2: " + myArraylist.get(2));

        //f. indexOf (int element): Lấy vị trí index phần tử đầu tiên tìm thấy
        System.out.println("Phan tu dau tien co gia tri la 80: " + myArraylist.indexOf(80));

        //g. lastIndexOf (int element o): Lấy vị trí index phần tử cuối cùng tìm thấy
        System.out.println("Phan tu dau tien co gia tri la 80: " + myArraylist.lastIndexOf(80));

        //h. remove (int index): Xóa phần tử lại vị trí index
        myArraylist.remove(3);
        System.out.println("Danh sach sau khi remove: " + myArraylist.toString());

        //i. removeElement (int element): Xóa tất cả phần tử element
        myArraylist.removeElement(80);
        System.out.println("Danh sach sau khi remove: " + myArraylist.toString());
    }
}
