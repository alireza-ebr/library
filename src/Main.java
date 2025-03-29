import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Book> books = new ArrayList<>();

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
            case 1 -> addBook();
            case 2 -> removeBook();
            case 3 -> System.exit(0);
        }
    }

    public static void removeBook() {
        System.out.println("***REMOVE BOOK***");
        if (books.isEmpty()) {
            System.out.println("There are no books");
            return;
        }
        System.out.println("Enter id of book you want to remove: ");
        int bookId = scanner.nextInt();
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.getId() == bookId) {
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Book removed successfully");
        } else
            System.out.println("Book not found");
    }

    public static void addBook() {
        System.out.println("***ADD BOOK***");

        System.out.println("Enter title:");
        scanner.nextLine();
        String title = scanner.nextLine();

        System.out.println("Enter author:");
        String author = scanner.nextLine();

        System.out.println("Enter publish year:");
        int year = scanner.nextInt();

        System.out.println("Is the book available?(yes or no)");
        boolean bookAvailable = scanner.next().equals("yes");

        System.out.println("Enter ID:");
        int id = scanner.nextInt();

        books.add(new Book(bookAvailable, author, title, id));
        System.out.println("Book added successfully!");
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
            case 1 -> booksList();
            case 2 ->myBookList();
            case 3 ->  borrowBooks();
            case 4 -> returnBook();
            case 5 -> System.exit(0);
        }
    }

    public static void booksList() {
        System.out.println("***BOOKS LIST***");
        if (books.isEmpty()) {
            System.out.println("There are no books");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
            System.out.println("-------------------");
        }
    }

    public static void borrowBooks() {
        System.out.println("***BORROW BOOK***");
        System.out.println("Enter your user ID");
        int userId = scanner.nextInt();
        User selectUser = null;
        for (User user : users) {
            if (user.getId() == userId) {
                selectUser = user;
                break;
            }
        }
        if (selectUser == null) {
            System.out.println("User not found");
            return;
        }
        System.out.println("Enter the book ID to borrow: ");
        int bookId = scanner.nextInt();
        Book bookToBorrow = null;
        for (Book book : books) {
            if (book.getId() == bookId) {
                bookToBorrow = book;
                break;
            }
        }
        if (bookToBorrow == null) {
            System.out.println("Book not found");
            return;
        }
        if (bookToBorrow.isAvailable()) {
            selectUser.getBorrowedBooks().add(bookToBorrow);
            bookToBorrow.setAvailable(false);
            System.out.println("You have successfully borrowed book" + bookToBorrow.getTitle());
        } else {
            System.out.println("That book is not available");
        }
    }
    public static void returnBook(){
        System.out.println("***RETURN BOOK***");
        System.out.println("Enter your user ID");
        int userId = scanner.nextInt();
        User selectUser = null;
        for (User user : users) {
            if (user.getId() == userId) {
                selectUser = user;
                break;
            }
        }
        if (selectUser == null) {
            System.out.println("User not found");
            return;
        }
        if (selectUser.getBorrowedBooks().isEmpty()){
            System.out.println("You have no borrowed books");
            return;
        }
        System.out.println("Your borrowed books are:");
        for (Book book : selectUser.getBorrowedBooks()) {
            System.out.println("ID" + book.getId() + "-" + book.getTitle());
        }
        System.out.println("Enter the book ID to return: ");
        int bookId = scanner.nextInt();
        Book bookToReturn = null;
        for (Book book : books) {
            if (book.getId() == bookId) {
                bookToReturn = book;
                break;
            }
        }
        if (bookToReturn == null) {
            System.out.println("Book not found");
            return;
        }
        selectUser.getBorrowedBooks().remove(bookToReturn);
        bookToReturn.setAvailable(true);
        System.out.println("You have successfully returned book" + bookToReturn.getTitle());
    }
    public static void myBookList(){
        System.out.println("***MY BOOK LIST***");
        System.out.println("Enter your user ID");
        int userId = scanner.nextInt();
        User selectUser = null;
        for (User user : users) {
            if (user.getId() == userId) {
                selectUser = user;
                break;
            }
        }
        if (selectUser == null) {
            System.out.println("User not found");
            return;
        }
        if (selectUser.getBorrowedBooks().isEmpty()){
            System.out.println("You have no borrowed books");
            return;
        }
        System.out.println("You borroed books:");
        for (Book book : selectUser.getBorrowedBooks()) {
            System.out.println("ID" + book.getId() + "-" + book.getTitle());
        }
    }
}

