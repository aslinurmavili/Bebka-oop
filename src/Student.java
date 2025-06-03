public class Student extends Person {
    private String studentId;


    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Öğrenci No: " + studentId);
    }
}

