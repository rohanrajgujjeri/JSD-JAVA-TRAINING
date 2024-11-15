import java.util.HashMap;
import java.util.Map;
public class StudentMapExample 
{
    public static void main(String[] args) 
  {
        Map<Integer, String> studentGrades = new HashMap<>();

        studentGrades.put(101, "A");
        studentGrades.put(102, "B");
        studentGrades.put(103, "A+");
        studentGrades.put(104, "B+");

        System.out.println("Student Grades: " + studentGrades);

        int studentId = 102;
        String grade = studentGrades.get(studentId);
        System.out.println("Grade for student ID " + studentId + ": " + grade);
        if (studentGrades.containsKey(103))
        {
            System.out.println("Student ID 103 is in the map.");
        } else
        {
            System.out.println("Student ID 103 is not in the map.");
        }
        studentGrades.remove(104);
        System.out.println("Student Grades after removal: " + studentGrades);
    }
}
