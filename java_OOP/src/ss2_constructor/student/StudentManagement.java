package ss2_constructor.student;

public class StudentManagement {
    static Student student = new Student("ABC001");

    public static void main(String[] args) {
        System.out.println("---Thong tin ban dau---");
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Score: " + student.getScore());

        student.setName("Nguyen Thi Minh Nguyet");
        student.setScore(9.0);

        System.out.println("---Thong tin sau khi update---");
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Score: " + student.getScore());

        student.setName("  ");
        student.setScore(11.0);

    }
}
