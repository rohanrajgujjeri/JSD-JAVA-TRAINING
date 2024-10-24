import java.util.Scanner;
public class Star2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rows do you want to print bro: ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows ; i++)
        {
            for (int j = 1; j <= rows - i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
