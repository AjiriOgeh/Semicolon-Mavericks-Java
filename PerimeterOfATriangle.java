import java.util.Scanner;

public class PerimeterOfATriangle {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter the first edge: ");
float edge1 = input.nextFloat();

System.out.print("Enter the second edge:");
float edge2 = input.nextFloat();

System.out.print("Enter the third edge:");
float edge3 = input.nextFloat();

float perimeter = edge1 + edge2 + edge3;

if (((edge1 + edge2) > edge3) && ((edge1 + edge3) > edge2) && ((edge3 + edge1) > edge2)) {
System.out.printf("The perimeter of the triangle is %.3f", perimeter);
}

else {
System.out.printf("The input is invalid");
}

}

}