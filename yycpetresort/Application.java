package yycpetresort;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Application {
    private static final String APP_NAME = "YYC Pet Resort";
    private static List<Client> clients = new ArrayList<>();
    private static List<Pet> pets = new ArrayList<>();
    private static List<Booking> bookings = new ArrayList<>();
    private static List<Payment> payments = new ArrayList<>();
    private static List<CareProfile> careProfiles = new ArrayList<>();
    private static List<User> users = new ArrayList<>();
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) {
        System.out.println("Welcome to " + APP_NAME + " Application!");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    manageClientInformation(scanner);
                    break;
                case 2:
                    managePetInformation(scanner);
                    break;
                case 3:
                    bookingAndReservations(scanner);
                    break;
                case 4:
                    billingAndPayments(scanner);
                    break;
                case 5:
                    createCareProfile(scanner);
                    break;
                case 6:
                    updateCareProfile(scanner);
                    break;
                case 7:
                    retrieveCareProfile(scanner);
                    break;
                case 8:
                    sendNotifications();
                    break;
                case 9:
                    generateReports();
                    break;
                case 10:
                    userAuthenticationAndAuthorization(scanner);
                    break;
                case 0:
                    System.out.println("Exiting the application. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Manage Client Information");
        System.out.println("2. Manage Pet Information");
        System.out.println("3. Booking and Reservations");
        System.out.println("4. Billing and Payments");
        System.out.println("5. Create Care Profile");
        System.out.println("6. Update Care Profile");
        System.out.println("7. Retrieve Care Profile");
        System.out.println("8. Send Notifications");
        System.out.println("9. Generate Reports");
        System.out.println("10. User Authentication and Authorization");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void manageClientInformation(Scanner scanner) {
        System.out.println("Manage Client Information:");
        System.out.print("Enter client name: ");
        String name = scanner.nextLine();
        System.out.print("Enter client phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter client address: ");
        String address = scanner.nextLine();
        clients.add(new Client(name, phoneNumber, address));
        System.out.println("Client information added successfully.");
    }

    private static void managePetInformation(Scanner scanner) {
        System.out.println("Manage Pet Information:");
        System.out.print("Enter pet name: ");
        String name = scanner.nextLine();
        System.out.print("Enter pet breed: ");
        String breed = scanner.nextLine();
        System.out.print("Enter pet age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter pet medical history: ");
        String medicalHistory = scanner.nextLine();
        pets.add(new Pet(name, breed, age, medicalHistory));
        System.out.println("Pet information added successfully.");
    }

    private static void bookingAndReservations(Scanner scanner) {
        System.out.println("Booking and Reservations:");
        System.out.print("Enter booking start date (yyyy-MM-dd): ");
        Date startDate = parseDate(scanner.nextLine());
        System.out.print("Enter booking end date (yyyy-MM-dd): ");
        Date endDate = parseDate(scanner.nextLine());
        int bookingId = bookings.size() + 1;
        bookings.add(new Booking(startDate, endDate, bookingId));
        System.out.println("Booking created successfully with ID: " + bookingId);
    }

    private static void billingAndPayments(Scanner scanner) {
        System.out.println("Billing and Payments:");
        System.out.print("Enter payment amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter payment date (yyyy-MM-dd): ");
        Date paymentDate = parseDate(scanner.nextLine());
        payments.add(new Payment(amount, paymentDate));
        System.out.println("Payment recorded successfully.");
    }

    private static void createCareProfile(Scanner scanner) {
        System.out.println("Create Care Profile:");
        System.out.print("Enter feeding instructions: ");
        String feedingInstructions = scanner.nextLine();
        System.out.print("Enter medication list: ");
        String medicationList = scanner.nextLine();
        System.out.print("Enter medication instructions: ");
        String medicationInstructions = scanner.nextLine();
        careProfiles.add(new CareProfile(feedingInstructions, medicationList, medicationInstructions));
        System.out.println("Care profile created successfully.");
    }

    private static void updateCareProfile(Scanner scanner) {
        System.out.println("Update Care Profile:");
        System.out.print("Enter new feeding instructions: ");
        String feedingInstructions = scanner.nextLine();
        System.out.print("Enter new medication list: ");
        String medicationList = scanner.nextLine();
        System.out.print("Enter new medication instructions: ");
        String medicationInstructions = scanner.nextLine();
        careProfiles.add(new CareProfile(feedingInstructions, medicationList, medicationInstructions));
        System.out.println("Care profile updated successfully.");
    }

    private static void retrieveCareProfile(Scanner scanner) {
        System.out.println("Retrieve Care Profile:");
        // Implementation to retrieve care profile based on user input (e.g., pet name)
    }

    private static void sendNotifications() {
        System.out.println("Send Notifications:");
        // Implementation to send notifications to clients
    }

    private static void generateReports() {
        System.out.println("Generate Reports:");
        // Implementation to generate various reports
    }

    private static void userAuthenticationAndAuthorization(Scanner scanner) {
        System.out.println("User Authentication and Authorization:");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.print("Enter role: ");
        String role = scanner.nextLine();
        users.add(new User(username, password, role));
        System.out.println("User authenticated and authorized successfully.");
    }

    private static Date parseDate(String dateStr) {
        try {
            return dateFormat.parse(dateStr);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter the date in yyyy-MM-dd format.");
            return null;
        }
    }
}
