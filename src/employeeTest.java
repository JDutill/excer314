import java.util.Scanner;

/**
 * Created by Joey on 9/29/2016.
 */
public class employeeTest {
    public static void main(String[] args) {
        employee employee1 = new employee("first", "last", 0.0);
        employee employee2 = new employee("first", "last", 0.0);

        Scanner input = new Scanner(System.in);

        String firstName;
        String lastName;
        double monthlySalary;

        System.out.println("Enter details of employee1:\n");

        System.out.print("Enter First Name: ");
        firstName = input.next();
        employee1.setFirstName(firstName);
        employee1.getFirstName();
        System.out.print("Enter Last Name: ");
        lastName = input.next();
        employee1.setLastName(lastName);
        employee1.getLastName();
        System.out.print("Enter Monthly Salary: ");
        monthlySalary = input.nextDouble();
        if (monthlySalary > 0)
            employee1.setMonthlySalary(monthlySalary);
        employee1.getMonthlySalary();


        System.out.println();

        System.out.println("Enter details of employee2:\n");

        System.out.print("Enter First Name: ");
        firstName = input.next();
        employee2.setFirstName(firstName);
        employee2.getFirstName();
        System.out.println("Enter Last Name: ");
        lastName = input.next();
        employee2.setLastName(lastName);
        employee2.getLastName();
        System.out.print("Enter Monthly Salary: ");
        monthlySalary = input.nextDouble();
        if (monthlySalary > 0)
            employee2.setMonthlySalary(monthlySalary);
        employee2.getMonthlySalary();

        System.out.println();

        employee1.yearlySalary();
        employee2.yearlySalary();

        employee1.displayYearlySalary();

        System.out.println();

        employee2.displayYearlySalary();

        System.out.println();

        employee1.yearlySalaryIncrease();
        employee2.yearlySalaryIncrease();





        employee1.displayYearlySalaryIncrease();

        System.out.println();

        employee2.displayYearlySalaryIncrease();




    }
}
