package lab2hometask3;
import java.util.HashSet;
import java.util.Scanner;
class Employee {
    String name; int id;
    Employee(String name, int id) { this.name = name; this.id = id; }
    @Override public boolean equals(Object obj) {
        return this == obj || (obj instanceof Employee e && id == e.id && name.equals(e.name));}
    @Override public int hashCode() { return 31 * name.hashCode() + id; }
    @Override public String toString() { return name + " (ID: " + id + ")";}}
public class Lab2HomeTask3 {
    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Employee\n2. Check Employee Exists\n3. Display Employees\n4. Exit");
            switch (scanner.nextInt()) {
                case 1:
                    employees.add(new Employee(scanner.next(), scanner.nextInt()));
                    System.out.println("Employee added.");
                    break;
                case 2:
                    System.out.println(employees.contains(new Employee(scanner.next(), scanner.nextInt())) ? "Employee exists." : "Employee does not exist.");
                    break;
                case 3:
                    System.out.println("Employees: " + employees);
                    break;
                case 4:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");}}}}