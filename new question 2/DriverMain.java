import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Employee
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        Employee emp = new Employee(empId, name, salary);

        // Input for Product
        System.out.print("Enter Product ID: ");
        int pid = sc.nextInt();
        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Product Quantity: ");
        int quantity = sc.nextInt();
        Product prod = new Product(pid, price, quantity);

        // Display Taxes
        System.out.println("\n--- Tax Details ---");
        emp.calcTax();
        prod.calcTax();

        sc.close();
    }
}
