import java.util.Scanner;

public class uno38projectChooseYourPath {

    public static void main(String[] main) {
        Scanner sc = new Scanner(System.in);
        boolean ta = true;
        int choice1 = 0;
        int choice2 = 0;
        int choice3 = 0;
        while (ta) {
            boolean life = true;
            while (life) {
                System.out.println(
                        "You wake up on a sandy beach. You have nothing on you and you lost most of your memory.");
                System.out.println("You wanna go home");
                System.out.println("What would you choose?");
                System.out.println("1: Take another nap.");
                System.out.println("2: Walk around");

                choice1 = getGuess(2);
                if (choice1 == 1) {
                    System.out.println(
                            "You get the best nap in your entire life, this nap is so comfortable you will never awake again.");
                    life = false;
                }
                if (choice1 == 2) {
                    System.out.println("You decided to walk around");
                    System.out.println("After a couple minutes of wandering, you get super hungry and thristy");
                    System.out.println("Luckyly, there is some food trees infront of you");
                    System.out.println("Which one would you choose?");
                    System.out.println("1: Coconut Tree");
                    System.out.println("2: Watermelon Tree");
                    System.out.println("3: Ice Tree");
                    choice2 = getGuess(3);

                    if (choice2 == 1) {
                        System.out.println("Since Coconut is your favourite food, you decided to get some coconut");
                        System.out.println("What would you do?");
                        System.out.println("1: Climb the tree");
                        System.out.println("2: Shake the tree");
                        choice3 = getGuess(2);
                    }
                    if (choice2 == 2) {
                        System.out.println("Since strawberry is your favourite food, you decided to get some chicken");

                        System.out.println("What would you do?");
                        System.out.println("1: Climb the tree");
                        System.out.println("2: Shake the tree");
                    }
                    if (choice2 == 3) {
                        System.out.println("Since Ice is your favourite food, you decided to get some Ice");
                        System.out.println("What would you do?");
                        System.out.println("1: Climb the tree");
                        System.out.println("2: Shake the tree");
                    }
                }

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