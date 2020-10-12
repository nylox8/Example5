import java.util.Scanner;
class Example5 {
    public static void main (String [] argv) {
        double radius, length, area;
        final double PI = 3.14159;
        System.out.println("Enter radius:");

        //Reading the Value
        Scanner response;
        //"Response" just to add some variety from your examples :)
        response = new Scanner(System.in);
        radius = response.nextDouble();

        length = 2 * PI * radius;
        area = PI * radius * radius;
        System.out.println("length: " + length);
        System.out.println("area: " + area);
    }
}