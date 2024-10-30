import java.util.Scanner;
public class BankInterest
{
    public static double calculateInterest(double principal, double rate, double time)
    {
        return (principal * rate * time) / 100;
    }
    public static double calculateInterest(double principal, double rate, double time, int n)
    {
        return principal * Math.pow((1 + rate / (n * 100)), n * time) - principal;
    }
    public static double calculateInterest(double principal, int rate, double time)
    {
        double seniorCitizenRate = rate + 0.5;
        return (principal * seniorCitizenRate * time) / 100;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times you want to calculate interest: ");
        int num = scanner.nextInt();
        for(int i=0; i<=num; i++) {
            System.out.print("Enter the principal amount: ");
            double principal = scanner.nextDouble();
            System.out.print("Enter the rate of interest: ");
            double rate = scanner.nextDouble();
            System.out.print("Enter the time period in years: ");
            double time = scanner.nextDouble();
            System.out.println("\nChoose the type of interest to calculate:");
            System.out.println("1. Simple Interest");
            System.out.println("2. Compound Interest");
            System.out.println("3. Senior Citizen Interest");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                     double simpleInterest = calculateInterest(principal, rate, time);
                    System.out.printf("Simple Interest: %.2f\n", simpleInterest);
                    break;
                case 2:
                    System.out.print("Enter the number of times interest is compounded per year: ");
                    int n = scanner.nextInt();
                    double compoundInterest = calculateInterest(principal, rate, time, n);
                    System.out.printf("Compound Interest: %.2f\n", compoundInterest);
                    break;
                case 3:
                    double seniorCitizenInterest = calculateInterest(principal, rate, time);
                    System.out.println("Senior Citizen Interest: "+ seniorCitizenInterest);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
