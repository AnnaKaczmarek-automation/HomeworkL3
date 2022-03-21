import java.util.ArrayList;

public class Company {

    private ArrayList<Employee> employees = new ArrayList<>();


    public  void getAllData() {

        for (Employee employee : employees) {
            System.out.println("Salary for" + " " + employee.getName() + " " + employee.getSecondName() + " " + "is" + " "
                    + employee.getSalary());
        }
    }
    public void getTotalSalary(){
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        System.out.println(sum);
    }

    public void addNewEmployee(Employee employee){
        employees.add(employee);
    }

}
