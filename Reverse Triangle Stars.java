import java.util.Scanner;
public class Star4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows do you want to print bro: ");
        int rows = sc.nextInt();
        for (int i = rows; i > 0; i--) 
        {
            for (int j = 0; j < i; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
