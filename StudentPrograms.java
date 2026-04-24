import java.util.Scanner;

public class StudentPrograms {

    // Method to calculate Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    // Method to calculate maximum handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    // Method to calculate number of rounds in triangular park
    public static double calculateRounds(double side1, double side2, double side3, double distance) {
        double perimeter = side1 + side2 + side3;
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Simple Interest ---
        System.out.println("=== Simple Interest Calculation ===");
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        double si = calculateSimpleInterest(principal, rate, time);
        System.out.println("The Simple Interest is " + si +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);

        // --- Handshakes ---
        System.out.println("\n=== Maximum Handshakes ===");
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        int handshakes = calculateHandshakes(numberOfStudents);
        System.out.println("Maximum number of possible handshakes: " + handshakes);

        // --- Triangular Park Rounds ---
        System.out.println("\n=== Athlete Rounds in Triangular Park ===");
        System.out.print("Enter side 1 of triangle (in meters): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 of triangle (in meters): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3 of triangle (in meters): ");
        double side3 = sc.nextDouble();

        double distance = 5000; // 5 km in meters
        double rounds = calculateRounds(side1, side2, side3, distance);
        System.out.println("The athlete must complete " + Math.ceil(rounds) + " rounds to finish 5 km run.");

        sc.close();
    }
}