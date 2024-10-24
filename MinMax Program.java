import java.util.Scanner;

public class MinMax
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert 10 numbers to any array: ");
        int[] arr = new int[10];
        for (int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        int minimum = arr[0];
        int maximum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimum)
            {
                minimum = arr[i];
            }
            if (arr[i] > maximum)
            {
                maximum = arr[i];
            }
        }
        System.out.println("Minimum element of an array : "+minimum);
        System.out.println("Maximum element of an array : "+maximum);
    }
}
