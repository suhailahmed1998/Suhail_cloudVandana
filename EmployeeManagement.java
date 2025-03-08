import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
    public static void main(String[] args) {
        
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Suhail", 53400));
        employees.add(new Employee(2, "Ahmed", 88000));
        employees.add(new Employee(3, "Sameer", 120000));

        System.out.println("Employee Details:");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}