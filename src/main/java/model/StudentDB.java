package model;

public class StudentDB {
    private Student[] students;

    public StudentDB(Student[] students) {
        this.students = students;
    }

    public Student[] getAllStudents() {
        if (students.length > 0) {
            return students;
        }
        return null;
    }

    public Student randomStudent() {
        int studentIndex = (int) (Math.random() * (students.length));
        return students[studentIndex];
    }
}
