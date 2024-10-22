import java.util.Scanner;
public class ArrayEvenOdd
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
        System.out.println("Numbers with even index : ");
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.println("Numbers with odd index : ");
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.println("Squares of all elements : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]*arr[i]+" ");
        }
        System.out.println();
        int sum=0;
        System.out.println("Elements divisible by 2 : ");
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
                sum+=arr[i];
            }
        }
        System.out.println("Sum of Elements divisible by 2 is : "+ sum);
    }
}
