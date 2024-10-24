import java.util.Scanner;
public class Star
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rows do you want to print bro: ");
        int rows = sc.nextInt();
        for (int i = 0; i <= rows; i++) 
        {
            for (int j = 0; j <= i; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
