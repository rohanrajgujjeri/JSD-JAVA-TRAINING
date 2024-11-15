import java.util.HashSet;
import java.util.Set;

public class StudentSetExample 
{
    public static void main(String[] args)
  {
        Set<String> students = new HashSet<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("Alice"); 
        System.out.println("Students: " + students);
        if (students.contains("Bob")) 
        {
            System.out.println("Bob is in the set.");
        } else 
        {
            System.out.println("Bob is not in the set.");
        }
        students.remove("Charlie");
        System.out.println("Students after removal: " + students);
    }
}
