
import java.util.Scanner;

class AreaOfTriangle1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of the triangle in cm: ");
        double base = input.nextDouble();
        System.out.print("Enter the height of the triangle in cm: ");
        double height = input.nextDouble();
        
        double areaSqCm = 0.5 * base * height;
        double areaSqIn = areaSqCm / 6.4516;
        
        System.out.println("The Area of the triangle in sq in is " + areaSqIn 
                           + " and sq cm is " + areaSqCm);
        
    }
}
