import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitalcomProcess {
	private static Scanner sc = new Scanner(System.in);
	
	private static final GameService service = new GameService();
	private static final List<User> userList = new ArrayList<>();
	
	public static void displayMenu() {
		System.out.println("\n============MENU============\n"
				+ "1) RegisterUser\n"
				+ "2) ViewGames\n"
				+ "3) searchByName\n"
				+ "4) Exit");
		System.out.print("Choose an option: ");
	}
	
	public static void registerUser() {
		System.out.println("\nEnter username: ");
		sc.nextLine();
		String uname = sc.next();
		System.out.println("Enter password: ");
		String pass = sc.next();
		for (User user: userList) {
			if (user.getUserid().equals(uname)) {
				System.out.println("User already exists!");
				return;
			}
		}
		User newUser = new User();
		newUser.addUser(uname, pass);
		userList.add(newUser);
		System.out.println("User added!");
	}
	
	public static void viewGames() {
		System.out.println("\nDisplaying Game Data: ");
		service.viewAll().forEach(System.out::println);
	}
	
	public static void searchByName() {
		System.out.println("\nEnter Author name: ");
		sc.nextLine();
		String result = service.authorSearch(sc.next());
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		int choice;
		do {
			displayMenu();
			choice = sc.nextInt();
			switch(choice) {
				case 1: {
					registerUser();
					break;
				}
				case 2: {
					viewGames();
					break;
				}
				case 3: {
					searchByName();
					break;
				}
				case 4: {
					System.out.println("Exiting...");
					break;
				}
				default: {
					System.out.println("Invalid choice! Try again..");
					break;
				}
			}
		} while (choice!=4);
		sc.close();
	}
}
