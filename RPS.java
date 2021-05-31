import java.util.Scanner;

public class RPS {
    public static int getAnswer() {
        return (int) (Math.random() * 3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rock = "К";
        String paper = "Б";
        String scissors = "Н";
        String rockEn = "R";
        String paperEn = "P";
        String scissorsEn = "S";
        // начало || start
        System.out.println("Выберите язык игры. // Select the language of the game.");
        System.out.println("Русский // English");
        String lang = scanner.nextLine();
        if (lang.equalsIgnoreCase("Русский")) {
            System.out.println("Ваш ход: (Камень/К), (Бумага/Б), (Ножницы/Н)");
            String playerAnswer = scanner.nextLine();
            if (playerAnswer.equalsIgnoreCase(rock) || playerAnswer.equalsIgnoreCase("Камень")) {
                System.out.println("Вы выбрали: Камень");
                int x = getAnswer();
                if (x == 0) {
                    System.out.println("У вас с противником одинаковые знаки. Игра окончена.");
                } else if (x == 1) {
                    System.out.println("Противник выбрал: Бумага");
                    System.out.println("Вы проиграли. Игра окончена.");
                } else if (x == 2) {
                    System.out.println("Противник выбрал: Ножницы");
                    System.out.println("Вы выиграли. Игра окончена.");
                }
            }
            if (playerAnswer.equalsIgnoreCase(paper) || playerAnswer.equalsIgnoreCase("Бумага")) {
                int y = getAnswer();
                System.out.println("Вы выбрали: Бумага");
                if (y == 0) {
                    System.out.println("Противник выбрал: Камень");
                    System.out.println("Вы выиграли. Игра окончена.");
                } else if (y == 1) {
                    System.out.println("У вас с противником одинаковые знаки. Игра окончена.");
                } else if (y == 2) {
                    System.out.println("Противник выбрал: Ножницы");
                    System.out.println("Вы проиграли. Игра окончена.");
                }
            }
            if (playerAnswer.equalsIgnoreCase(scissors) || playerAnswer.equalsIgnoreCase("Ножницы")) {
                int z = getAnswer();
                System.out.println("Вы выбрали: Ножницы");
                if (z == 0) {
                    System.out.println("Противник выбрал: Камень");
                    System.out.println("Вы проиграли. Игра окончена.");
                } else if (z == 1) {
                    System.out.println("Противник выбрал: Бумага");
                    System.out.println("Вы выиграли. Игра окончена.");
                } else if (z == 2) {
                    System.out.println("У вас с противником одинаковые знаки. Игра окончена.");
                }
            }
        }
        else if (lang.equalsIgnoreCase("English")) {
            System.out.println("Your turn: (Rock/R), (Paper/P), (Scissors/S)");
            String playerAnswer = scanner.nextLine();
            if (playerAnswer.equalsIgnoreCase(rockEn) || playerAnswer.equalsIgnoreCase("Rock")) {
                System.out.println("You choose: Rock");
                int x = getAnswer();
                if (x == 0) {
                    System.out.println("You and your opponent have the same signs. Game over.");
                } else if (x == 1) {
                    System.out.println("The opponent chose: Paper");
                    System.out.println("You lose. Game over.");
                } else if (x == 2) {
                    System.out.println("The opponent chose: Scissors");
                    System.out.println("You won. Game over.");
                }
            }

            if (playerAnswer.equalsIgnoreCase(paperEn) || playerAnswer.equalsIgnoreCase("Paper")) {
                int y = getAnswer();
                System.out.println("You choose: Paper");
                if (y == 0) {
                    System.out.println("The opponent chose: Камень");
                    System.out.println("You won. Game over.");
                } else if (y == 1) {
                    System.out.println("You and your opponent have the same signs. Game over.");
                } else if (y == 2) {
                    System.out.println("The opponent chose: Scissors");
                    System.out.println("You lose. Game over.");
                }
            }
            if (playerAnswer.equalsIgnoreCase(scissorsEn) || playerAnswer.equalsIgnoreCase("Scissors")) {
                int z = getAnswer();
                System.out.println("You choose: Scissors");
                if (z == 0) {
                    System.out.println("The opponent chose: Rock");
                    System.out.println("You lose. Game over.");
                } else if (z == 1) {
                    System.out.println("The opponent chose: Paper");
                    System.out.println("You won. Game over.");
                } else if (z == 2) {
                    System.out.println("You and your opponent have the same signs. Game over.");
                }
            }
        }
    }
}