import java.util.*;
public class LinkedListExamples 
{
    public static void main(String[] args) 
  {
        System.out.println("linkedListNumbers  ");

        LinkedList<Integer> linkedListNumbers = new LinkedList<>();

        linkedListNumbers.add(223);
        linkedListNumbers.add(75);
        linkedListNumbers.add(225463);
        linkedListNumbers.add(789);
        linkedListNumbers.add(754);
        linkedListNumbers.add(5865);
        linkedListNumbers.add(98);
        linkedListNumbers.add(96);
        linkedListNumbers.add(74);
        linkedListNumbers.add(58);
        linkedListNumbers.add(36);
        linkedListNumbers.add(12);

        System.out.print("First Element: " + linkedListNumbers.getFirst()+"\n");
        System.out.print("Last Element: " + linkedListNumbers.getLast());
        System.out.println(linkedListNumbers.indexOf(75));
        System.out.println(linkedListNumbers.remove(1));

        linkedListNumbers.forEach(i -> System.out.print(i + " "));
    }
}
