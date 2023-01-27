import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = false;
        int selection = 0;

        Bird selectedBird;

        do {
            try {
                System.out.println("Penguin <1>\nEagle <2>\nParrot <3>\nChoosing any other number uses fallback bird");
                System.out.print("Choose a Bird to analyze: ");
                selection = input.nextInt();
                flag = true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number");
                input.nextLine();
            }
        } while (!flag);

        switch (selection) {
            case 1:
                selectedBird = new Penguin();
                break;
            case 2:
                selectedBird = new Eagle();
                break;
            case 3:
                selectedBird = new Parrot();
                break;

            default:
                selectedBird = new fallBackBird();
                break;
        }

        System.out.println(selectedBird.toString());

        input.close();
    }
}
