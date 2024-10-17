import java.util.Scanner;

public class uno38projectChooseYourPath {

    public static void main(String[] main) {
        Scanner sc = new Scanner(System.in);
        boolean ta = true;
        while (ta) {
            boolean life = true;
            while (life) {
                System.out.println(
                        "You wake up on a sandy beach. You are extremely tried and you lost most of your memory.");
                System.out.println("You wanna go home");
                System.out.println("What would you choose?");
                System.out.println("1: ");
                int choice1 = getGuess(3);

            }
            System.out.println("Wanna try again?(yes or no all lower case)");
            while (true) {
                String joseph = sc.nextLine();
                if (joseph.equals("yes")) {
                    System.out.println("sure lets do it again!");
                    ta = true;
                    break;
                }
                if (joseph.equals("no")) {
                    System.out.println("Sure, thanks for playing!");
                    ta = false;
                    break;
                } else {
                    System.out.println("please give me a yes or no (all lower case)");
                }
            }

        }
    }

    public static int getGuess(int choice) {
        Scanner sc = new Scanner(System.in);
        int userGuess = 0;
        boolean validGuess = false;
        while (!validGuess) {
            // https://www.javatpoint.com/try-catch-block
            try {
                System.out.print("Give me your choices: ");
                userGuess = Integer.parseInt(sc.nextLine());

                if (0 < userGuess && userGuess <= choice) {
                    validGuess = true;
                } else {
                    System.out.println("Please give me a number(1-" + choice + ")");

                }
            } catch (NumberFormatException e) {
                System.out.println("Please give me a valid integer");
            }
        }
        return userGuess;
    }

}