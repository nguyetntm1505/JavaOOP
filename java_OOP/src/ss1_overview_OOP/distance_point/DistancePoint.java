package ss1_overview_OOP.distance_point;

public class DistancePoint {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point();

        System.out.println("Hay nhap toa do cua diem thu nhat: ");
        point1.input();
        System.out.println("Hay nhap toa do cua diem thu hai: ");
        point2.input();

        System.out.print("Toa do cua diem thu nhat la: ");
        point1.output();
        System.out.print("\nToa do cua diem thu hai la: ");
        point2.output();

        double distance = point1.distancePointTo(point2);
        System.out.println("Khoang cach giua 2 toa do: " + distance);

    }
}
