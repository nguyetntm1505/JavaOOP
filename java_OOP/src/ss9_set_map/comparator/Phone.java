package ss9_set_map.comparator;

import java.util.Scanner;

//Ứng dụng quản lý điện thoại
public abstract class Phone  implements Comparable<Phone> {
    private String id;
    private String name;
    private double price;
    private int maintanceTime;
    private String productor;

    public Phone() {
    }

    public Phone(String id, String name, int price, int maintanceTime, String productor) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.maintanceTime = maintanceTime;
        this.productor = productor;
    }

    @Override
    public int compareTo(Phone o) {
        return Double.compare(this.getPrice(), o.price);
    }

    public abstract double calculateTotalPrice();

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getProductor() {
        return productor;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap ten san pham: ");
        this.name = scanner.nextLine();
        System.out.print("Hay nhap gia san pham: ");
        this.price = Integer.parseInt(scanner.nextLine());
        System.out.print("Hay nhap thoi gian bao hanh san pham: ");
        this.maintanceTime = Integer.parseInt(scanner.nextLine());
        System.out.print("Hay nhap hang san xuat cua san pham: ");
        this.productor = scanner.nextLine();

    }

    public void output() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.price);
        System.out.println("Maintance Time: " + this.maintanceTime);
        System.out.println("Productor: " + this.productor);
    }

}
