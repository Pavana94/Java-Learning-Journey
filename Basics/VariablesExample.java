import java.util.Scanner;

public class VariablesExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();
    
        scanner.nextLine(); 

        System.out.print("Enter branch: ");
        String branch = scanner.nextLine();

        System.out.print("Enter Section (e.g., A, B): ");
        char section = scanner.next().charAt(0);

        System.out.print("Enter your CGPA: ");
        float percentage = scanner.nextFloat();

        System.out.print("Enter Attendance Percentage (0-100): ");
        double attendancePercent = scanner.nextDouble();

        System.out.println("\n------------------------------------------");
        System.out.println("            ACADEMIC REPORT CARD          ");
        System.out.println("------------------------------------------");
        System.out.println("Student Name          : " + name);
        System.out.println("Roll Number           : " + rollNumber);
        System.out.println("Branch                : " + branch);
        System.out.println("Section               : " + section);
        System.out.println("Attendance Percent    : " + attendancePercent + "%");
        System.out.println("CGPA                  : " + percentage);
        System.out.println("------------------------------------------");

        scanner.close();
    }
}
