import java.util.*;

public class MinMaxMethods {

    // Main
    public static void main(String[] args) {
        // Take user inputs
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        double num1 = scan.nextDouble();
        System.out.println("Please enter a number: ");
        double num2 = scan.nextDouble();
        System.out.println("Please enter a number: ");
        double num3 = scan.nextDouble();

        // Check to see if any of the numbers input have decimals/are doubles
        if (num1 % 1 != 0 || num2 % 1 != 0 || num3 % 1 != 0) {
            System.out.println("Maximum number is: " + floatMax(num1, num2, num3));
            System.out.println("Minimum number is: " + floatMin(num1, num2, num3));
        }
        else {
            System.out.println("Maximum number is: " + max((int) num1, (int) num2, (int) num3));
            System.out.println("Minimum number is: " + min((int) num1, (int) num2, (int) num3));
        }
    }

    // Minimum integer method
    public static int min(int x, int y, int z) {
        int minNum = x;
        if (minNum > y)
            minNum = y;
        if (minNum > z)
            minNum = z;
        return minNum;
    }

    // Maximum integer method
    public static int max(int x, int y, int z) {
        int maxNum = x;
        if (maxNum < y)
            maxNum = y;
        if (maxNum < z)
            maxNum = z;
        return maxNum;
    }

    // Minimum float method
    public static double floatMin(double x, double y, double z) {
        double minNum = x;
        if (minNum > y)
            minNum = y;
        if (minNum > z)
            minNum = z;
        return minNum;
    }

    // Maximum float method
    public static double floatMax(double x, double y, double z) {
        double maxNum = x;
        if (maxNum < y)
            maxNum = y;
        if (maxNum < z)
            maxNum = z;
        return maxNum;
    }
}
