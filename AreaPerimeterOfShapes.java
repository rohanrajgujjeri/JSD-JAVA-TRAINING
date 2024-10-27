import java.util.Scanner;
public class AreaPerimeterOfShapes
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Circle");
        System.out.println("5. Parallelogram");
        System.out.println("6. Trapezium");

        int choice = scanner.nextInt();

        switch(choice)
        {
            case 1:
                square();
                break;
            case 2:
                rectangle();
                break;
            case 3:
                triangle();
                break;
            case 4:
                circle();
                break;
            case 5:
                parallelogram();
                break;
            case 6:
                trapezium();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    // Method for area and perimeter of a square
    public static void square()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();

        double area = side * side;
        double perimeter = 4 * side;

        System.out.println("Area of Square: " + area);
        System.out.println("Perimeter of Square: " + perimeter);
    }

    // Method for area and perimeter of a rectangle
    public static void rectangle()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Area of Rectangle: " + area);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }

    // Method for area and perimeter of a triangle
    public static void triangle()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        System.out.print("Enter the other two sides of the triangle: ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();

        double area = 0.5 * base * height;
        double perimeter = base + side1 + side2;

        System.out.println("Area of Triangle: " + area);
        System.out.println("Perimeter of Triangle: " + perimeter);
    }

    // Method for area and perimeter of a circle
    public static void circle()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        System.out.println("Area of Circle: " + area);
        System.out.println("Perimeter of Circle: " + perimeter);
    }

    // Method for area and perimeter of a parallelogram
    public static void parallelogram()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the parallelogram: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the parallelogram: ");
        double height = scanner.nextDouble();
        System.out.print("Enter the side length of the parallelogram: ");
        double side = scanner.nextDouble();

        double area = base * height;
        double perimeter = 2 * (base + side);

        System.out.println("Area of Parallelogram: " + area);
        System.out.println("Perimeter of Parallelogram: " + perimeter);
    }

    // Method for area of a trapezium
    public static void trapezium()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the first base: ");
        double base1 = scanner.nextDouble();
        System.out.print("Enter the length of the second base: ");
        double base2 = scanner.nextDouble();
        System.out.print("Enter the height of the trapezium: ");
        double height = scanner.nextDouble();
        System.out.print("Enter the lengths of the other two sides of the trapezium: ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();

        double area = 0.5 * (base1 + base2) * height;
        double perimeter = base1 + base2 + side1 + side2;

        System.out.println("Area of Trapezium: " + area);
        System.out.println("Perimeter of Trapezium: " + perimeter);
    }
}
