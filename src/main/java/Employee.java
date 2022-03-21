public class Employee {

    private String name;
    private String secondName;
    private int salary;


    public Employee(String name, String secondName, int salary) {
        this.name = name;
        this.secondName = secondName;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getSalary() {
        return salary;
    }


}

