package Application;
import Entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();
        System.out.printf("Area = %.2f", rectangle.Area());
        System.out.printf("\nPerimeter = %.2f", rectangle.Perimeter());
        System.out.printf("\nDiagonal = %.2f", rectangle.Diagonal());


    }
}