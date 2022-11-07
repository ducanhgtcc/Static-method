public class Student {
    private final int rollno;
    private final String name;
    private static String college;

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

     static void change() {
        college = "CODEGYM";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
            Student.change();

            Student s1 = new Student(111, "Hoàng");
            Student s2 = new Student(222, "Khánh");
            Student s3 = new Student(333, "Nam");

            s1.display();
            s2.display();
            s3.display();
    }
}
