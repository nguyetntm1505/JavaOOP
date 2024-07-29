package ss2_constructor.student;

public class Student {
    private String id;
    private String name;
    private double score;

    public Student() {

    }

    public Student(String id) {
        this.id = id;
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        if (name.trim().equals("")) {
            System.out.println("Loi: Ten bat buoc nhap!!");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setScore(double score) {
        if (score >= 0 && score <= 10) {
            this.score = score;
        } else {
            System.out.println("Loi: Diem bat buoc tu 0 den 10!!");
        }
    }

    public double getScore() {
        return score;
    }
}
