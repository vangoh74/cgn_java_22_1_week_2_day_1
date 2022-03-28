/*  AUFGABE: KLASSEN 1:

    #1  Lege eine Klasse Student an und überlege dir
        drei Eigenschaften

    #2  Schreibe Methoden, um die Eigenschaften zu
        setzen und abzufragen
* */

/*  AUFGABE: PACKAGE
    #1  Verschiebe deine Student Klasse in ein model Package
        und passe die Sichtbarkeiten und Referenzen an
    #2  Schreibe eine Methode toString welche alle Eigenschaften
        eines Studenten als String zurückgibt
    #3  Schreibe für deinen Student Klasse einen Konstruktor
        und verwende ihn
* */

package model;
import java.time.LocalDate;
import java.util.Objects;

public class Student {
    //  KLASSE 1: #1
    private String name;
    private LocalDate birthdate;
    private int studentId;
    private String email;

    //  PACKAGE: #3 Konstruktor
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    // KLASSE 1: #2
    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getBirthdate() {
        return this.birthdate;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public String getEmail(){
        return email;
    }

    //  PACKAGE: #2
    @Override
    public String toString() {
        return "Student{" +
                "name='" + this.name + '\'' +
                ", ID=" + this.studentId +
                ", birthdate=" + this.birthdate +
                ", email='" + this.email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Student student = (Student) o;
        return studentId == student.studentId && Objects.equals(name, student.name) && Objects.equals(birthdate, student.birthdate) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthdate, studentId, email);
    }
}
