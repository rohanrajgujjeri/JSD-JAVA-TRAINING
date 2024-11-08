import java.util.*;
public class ArrayListExample
{
//    create an array list. perform insertion and deletion of item. delete first element and last element. sort array list.
//      print even and odd elements separately from the list.  print square of elements from the list.
    public static void main(String[] args)
    {
        ArrayList<Integer> arrExample = new ArrayList<>();

        //Adding elements
        arrExample.add(543);
        arrExample.add(234);
        arrExample.add(789);
        arrExample.add(456);
        arrExample.add(852);
        arrExample.add(753);
        arrExample.add(846);
        arrExample.add(846);
        arrExample.add(951);
        System.out.println("Origial ArayList: "+arrExample);

        arrExample.remove(0);
        arrExample.remove(3);

        System.out.println("After Removing: "+arrExample);

        Collections.sort(arrExample);
        System.out.println("Sorted: "+arrExample);

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        arrExample.forEach(i->{
            if(i%2==0){
                evenNumbers.add(i);
            }else{
                oddNumbers.add(i);
            }
        });
        System.out.println("Even: "+evenNumbers);
        System.out.println("Odd: "+oddNumbers);

        ArrayList<Integer> squarNumbers = new ArrayList<>();
        arrExample.forEach(i->{
            squarNumbers.add(i*i);
        });
        System.out.println("Squar numbers: "+squarNumbers);
    }
}
