import java.util.Scanner;
public class IntegerOccurenceInAnArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int integer=sc.nextInt();
        int arr[] = {5464,8789,46541,66,21,34,4454,66,3};
        int count=0;
        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i]==integer)
            {
                count++;
            }
        }
        System.out.println("Occurence of "+integer+" in an array is: "+count);
    }
}
