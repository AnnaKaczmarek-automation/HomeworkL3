import java.util.Scanner;

public class UserInputHandler {

    public static Employee getEmployeeFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give employees name");
        String name = scanner.nextLine();

        System.out.println("Give employees second name");
        String lastName = scanner.nextLine();

        System.out.println("Give employees salary");
        int salary = Integer.parseInt(scanner.nextLine());

        return new Employee(name, lastName, salary);
    }

    public static int getOptionFromUser() {
        System.out.println("Which option do you choose?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
