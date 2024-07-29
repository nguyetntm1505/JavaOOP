package ss2_constructor.time;

public class Time {
    private int hour;
    private int minus;
    private int second;

    public Time() {
        hour = 0;
        minus = 0;
        second = 0;
    }

    public Time(int hour) {
        this.hour = hour;
        minus = 0;
        second = 0;
    }

    public Time(int hour, int minus) {
        this.hour = hour;
        this.minus = minus;
        second = 0;
    }

    public Time(int hour, int minus, int second) {
        this.hour = hour;
        this.minus = minus;
        this.second = second;
    }

    public Time(Time other) {
        this.hour = other.hour;
        this.minus = other.minus;
        this.second = other.second;
    }

    public void output() {
        System.out.printf("%02d:%02d:%02d\n", hour, minus, second);
    }
}
