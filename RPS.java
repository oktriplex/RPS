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
        System.out.println("Ваш ход: (Камень/К), (Бумага/Б), (Ножницы/Н)");
        String playerAnswer = scanner.nextLine();
        // Игроком выбран камень
            if (playerAnswer.equalsIgnoreCase(rock) || playerAnswer.equalsIgnoreCase("Камень"))
            {
                System.out.println("Вы выбрали: Камень");
                int x = getAnswer();
                if (x == 0) {
                    System.out.println("У вас с противником одинаковые знаки. Игра окончена.");
                }
                else if (x == 1) {
                    System.out.println("Противник выбрал: Бумага");
                    System.out.println("Вы проиграли. Игра окончена.");
                }
                else if (x == 2) {
                    System.out.println("Противник выбрал: Ножницы");
                    System.out.println("Вы выиграли. Игра окончена.");
                }
            }
        if (playerAnswer.equalsIgnoreCase(paper) || playerAnswer.equalsIgnoreCase("Бумага"))
        {
            int y = getAnswer();
            System.out.println("Вы выбрали: Бумага");
            if (y == 0) {
                System.out.println("Противник выбрал: Камень");
                System.out.println("Вы выиграли. Игра окончена.");
            }
            else if (y == 1) {
                System.out.println("У вас с противником одинаковые знаки. Игра окончена.");
            }
            else if (y == 2) {
                System.out.println("Противник выбрал: Ножницы");
                System.out.println("Вы проиграли. Игра окончена.");
            }
        }
        if (playerAnswer.equalsIgnoreCase(scissors) || playerAnswer.equalsIgnoreCase("Ножницы"))
        {
            int z = getAnswer();
            System.out.println("Вы выбрали: Ножницы");
            if (z == 0) {
                System.out.println("Противник выбрал: Камень");
                System.out.println("Вы проиграли. Игра окончена.");
            }
            else if (z == 1) {
                System.out.println("Противник выбрал: Бумага");
                System.out.println("Вы выиграли. Игра окончена.");
            }
            else if (z == 2) {
                System.out.println("У вас с противником одинаковые знаки. Игра окончена.");
            }
        }
    }
}