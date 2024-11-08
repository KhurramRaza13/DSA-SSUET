package lab2task3;
import java.util.*;
class Employee {
    int id, yearOfJoining;
    String name, gender;
    public Employee() {
        this(1, 1947, "John Cena", "Male");
    }
    public Employee(int id, int yearOfJoining, String name, String gender) {
        this.id = id;
        this.yearOfJoining = yearOfJoining;    
        this.name = name;
        this.gender = gender;
    }
}
public class Lab2Task3 {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>(Arrays.asList(
            new Employee(2, 1069, "Big Show", "Male"),
            new Employee(3, 2069, "Alexa Bliss", "Female"),
            new Employee(4, 3069, "Gigi Dolin", "Female")
        ));
        emp.sort(Comparator.comparingInt(e -> e.yearOfJoining));
        for (Employee e : emp) {
            System.out.println("Name: " + e.name + "\nGender: " + e.gender +
                               "\nId: " + e.id + "\nYear Of Joining: " + e.yearOfJoining + "\n");
        }
    }
}