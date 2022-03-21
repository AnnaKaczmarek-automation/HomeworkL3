public class Main {

    public static void main(String[] args) {
        Company company = new Company();
        setupCompany(company);

        while (true) {
            displayMenu();
            generateOutputForMenuOptions(company);
        }
    }
    public static void displayMenu() {
        System.out.println("Menu");
        System.out.println("1 – Print sum of all employees salary");
        System.out.println("2 – Display all employees data");
        System.out.println("3 – Add new employee");
        System.out.println("4 – End program");
    }

    public static void generateOutputForMenuOptions(Company company) {
        switch (UserInputHandler.getOptionFromUser()) {
            case 1:
                company.getTotalSalary();
                break;
            case 2:
                company.getAllData();
                break;
            case 3:
                company.addNewEmployee(UserInputHandler.getEmployeeFromUser());
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Incorrect data. Choose option from 1 to 4");
        }
    }

    public static void setupCompany(Company company){
        System.out.println("Give data for employees ");
        for (int i = 0 ; i < 5 ; i++){
            company.addNewEmployee(UserInputHandler.getEmployeeFromUser());
        }
    }
}