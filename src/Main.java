import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        System.out.println("***MENU***");
        int item;
        do {
            System.out.println("1.Admin");
            System.out.println("2.User");
            System.out.println("3.Exit");
            System.out.println("Enter your choice: ");
            item = scanner.nextInt();
        }
        while (item < 1 || item > 3);
        switch (item) {
            case 1 -> adminMenu();
            case 2 -> userMenu();
            case 3 -> System.exit(0);
        }
    }

    public static void adminMenu() {
        System.out.println("***ADMIN MENU***");
        int item;
        do {
            System.out.println("1.User list");
            System.out.println("2.Add User:");
            System.out.println("3.Books management");
            System.out.println("4.Exit");
            System.out.println("Enter your choice: ");
            item = scanner.nextInt();
        }
        while (item < 1 || item > 4);
        switch (item) {
            case 1 -> userList();
            case 2 -> addUser();
            case 3 -> bookManagement();
            case 4 -> System.exit(0);
        }
    }

    public static void addUser() {
        System.out.println("***ADD USER***");

        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Enter address");
        String address = scanner.next();

        System.out.println("Enter age:");
        int age = scanner.nextInt();

        System.out.println("Enter gender:");
        String gender = scanner.next();

        System.out.println("Enter password:");
        String password = scanner.next();

        System.out.println("Enter id:");
        int id = scanner.nextInt();

        users.add(new User(name, address, age, gender, password, id));
        scanner.nextLine();
    }

    public static void bookManagement() {
        System.out.println("***BOOK MANAGEMENT***");
        int item;
        do {
            System.out.println("1.Add books");
            System.out.println("2.Remove books");
            System.out.println("3.Exit");
            System.out.println("Enter your choice: ");
            item = scanner.nextInt();
        }
        while (item < 1 || item > 3);
        switch (item) {
            case 1 -> System.out.println("Add books");
            case 2 -> System.out.println("Remove books");
            case 3 -> System.exit(0);
        }
    }

    public static void userList() {
        System.out.println("***USER LIST***");
        if (users.isEmpty()) {
            System.out.println("There are no users");
            return;
        }
        for (User user : users) {
            System.out.println(user);
            System.out.println("----------------");
        }
    }

    public static void userMenu() {
        System.out.println("***USER MENUE***");
        int item;
        do {
            System.out.println("1.Books list");
            System.out.println("2.My books list");
            System.out.println("3.Borrow books");
            System.out.println("4.Return books");
            System.out.println("5.Exit");
            System.out.println("Enter your choice: ");
            item = scanner.nextInt();
        }
        while (item < 1 || item > 5);
        switch (item) {
            case 1 -> System.out.println("Books list");
            case 2 -> System.out.println("My books list");
            case 3 -> System.out.println("Borrow books");
            case 4 -> System.out.println("Return books");
            case 5 -> System.exit(0);
        }
    }
}
