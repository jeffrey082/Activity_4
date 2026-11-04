public class Main {
 public static void main(String[] args) {

  Employee emp1 = new Employee("Juan Dela Cruz", "EMP001", "IT", 25000.0   );

  Employee emp2 = new Employee("Maria Lopez", "EMP002",  "HR", 22000.0  );

  Manager emp3 = new Manager( "Carlo Mendoza","EMP003","IT",45000.0, 8);

  Employee[] employees = {emp1, emp2, emp3};

  System.out.println("===== EMPLOYEE INFORMATION =====");

    for (Employee emp : employees) {

      if (emp instanceof Manager) {
             System.out.println("===== MANAGER =====");
       }

     emp.displayInfo();

      System.out.println("Annual Salary: " + emp.getAnnualSalary());

            System.out.println();
        }

        emp2.setMonthlySalary(24000.0);

        System.out.println("===== UPDATED INFORMATION =====");

        System.out.println("Name: " + emp2.getName());
        System.out.println("Monthly Salary: " + emp2.getMonthlySalary());

    }
}
