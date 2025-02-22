import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);

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
            System.out.println("2.Books management");
            System.out.println("3.Exit");
            System.out.println("Enter your choice: ");
            item = scanner.nextInt();
        }
        while (item < 1 || item > 3);
        switch (item) {
            case 1 -> System.out.println("User list");
            case 2 -> bookManagement();
            case 3 -> System.exit(0);
        }
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

    public static void userMenu() {
        System.out.println("***USER MENUE***");
        int item;
        do {
            System.out.println("1.Books list");
            System.out.println("2.My books list");
            System.out.println("3.Borrow books");
            System.out.println("4.Return books");
            System.out.println("5.exit");
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
