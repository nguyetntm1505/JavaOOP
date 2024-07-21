package ss1_overview_OOP.distance_point;

import java.util.Scanner;

public class Point {
    Scanner scanner = new Scanner(System.in);
    double x;
    double y;

    void input() {
        System.out.print("Hay nhap toa do x: ");
        x = scanner.nextDouble();
        System.out.print("Hay nhap toa do y: ");
        y = scanner.nextDouble();
    }

    void output() {
        System.out.printf("(%.2f, %.2f)", x, y);
        System.out.println();
    }

    double distancePointTo(Point pointOther) {
        return Math.sqrt(Math.pow(pointOther.x - this.x, 2) + Math.pow(pointOther.y - this.y, 2));
    }
}
