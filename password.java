import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String password = scanner.nextLine();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals(password)) {
                System.out.printf("Welkome %s!", name);
            } else System.out.println("Wrong password");

        }

    }
}

