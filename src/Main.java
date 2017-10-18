import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            studentList.add(new Student("Tyler", "Jurecki", i, 3));
        }

        ArrayList<Teacher> teacherList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            teacherList.add(new Teacher("Underpaid", "Underappriciated", i, 3));
        }
        HashSet<Student> studentSetone = new HashSet<>();
        studentSetone.add(studentList.get(0));
        studentSetone.add(studentList.get(1));
        studentSetone.add(studentList.get(2));
        studentSetone.add(studentList.get(3));
        studentSetone.add(studentList.get(4));
        studentSetone.add(studentList.get(5));

        HashSet<Student> studentSetTwo = new HashSet<>();
        studentSetTwo.add(studentList.get(0));
        studentSetTwo.add(studentList.get(1));
        studentSetTwo.add(studentList.get(2));
        studentSetTwo.add(studentList.get(3));
        studentSetTwo.add(studentList.get(4));
        studentSetTwo.add(studentList.get(5));

        HashSet<Student> studentSetThree = new HashSet<>();
        studentSetThree.add(studentList.get(0));
        studentSetThree.add(studentList.get(1));
        studentSetThree.add(studentList.get(2));
        studentSetThree.add(studentList.get(3));
        studentSetThree.add(studentList.get(4));
        studentSetThree.add(studentList.get(5));

        HashMap<Teacher, Set> teacherMap = new HashMap<>();
        teacherMap.put(teacherList.get(0), studentSetone);
        teacherMap.put(teacherList.get(1), studentSetTwo);
        teacherMap.put(teacherList.get(2), studentSetThree);

        for (Teacher teacher : teacherMap.keySet()) {
            System.out.println(teacher.getFirstName() + " " + teacher.getLastName());
        }
        for (Set studentSet : teacherMap.values()) {
            for (Student student : (HashSet<Student>) studentSet) {
                System.out.println(student.getFirstName() + " " + student.getLastName());
            }
        }
    }

}






