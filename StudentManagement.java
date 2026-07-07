import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Student Management System =====");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        int[] marks = new int[5];
        int total = 0;

        for(int i = 0; i < 5; i++) {
            System.out.print("Enter Subject " + (i+1) + " Marks: ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        System.out.println("\nStudent Name : " + name);
        System.out.println("Total Marks : " + total);

        sc.close();
    }
}