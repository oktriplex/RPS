package com.oktriplex.RPS;

class RPS {
    // ================================================= \\
    public final static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public final static String rockLong = "Камень";
    public final static String paperLong = "Бумага";
    public final static String scissorsLong = "Ножницы";
    // ================================================= \\
    public final static String yourChoice = "Ваш ход: (Камень/К), (Бумага/Б), (Ножницы/Н)";
    public final static String youChoose = "Вы выбрали: ";
    public final static String enemyChoose = "Противник выбрал: ";
    public final static String youLose = "Вы проиграли. Игра окончена.";
    public final static String youWin = "Вы выиграли. Игра окончена.";
    public final static String draw = "У вас с противником одинаковые знаки. Игра окончена.";
    public final static String Continue = "Желаете продолжить?: (Да/Д), (Нет/Н)";
    // ================================================= \\
    public static String playerAnswer;
    public static String doContinue;
    // ================================================= \\
    public static int getRand() {
        return (int) (Math.random() * 3);
    }
    public static String[] rockChoices = {
            draw,
            enemyChoose + paperLong + "\n" + youLose,
            enemyChoose + scissorsLong + "\n" + youWin,
            youChoose + rockLong
    };
    public static String[] paperChoices = {
            enemyChoose + rockLong + youWin,
            draw,
            enemyChoose + scissorsLong + "\n" + youLose,
            youChoose + paperLong
    };
    public static String[] scissorsChoices = {
            enemyChoose + rockLong + youLose,
            enemyChoose + paperLong + "\n" + youWin,
            draw,
            youChoose + scissorsLong
    };
    public static void chooseWinner(String playerAnswer, int rand) {
        playerAnswer = playerAnswer.toUpperCase();
        if (rockLong.charAt(0) == playerAnswer.charAt(0)) {
            System.out.println(rockChoices[3]);
            System.out.println(rockChoices[rand]);
        }
        if (paperLong.charAt(0) == playerAnswer.charAt(0)) {
            System.out.println(paperChoices[3]);
            System.out.println(paperChoices[rand]);
        }
        if (scissorsLong.charAt(0) == playerAnswer.charAt(0)) {
            System.out.println(scissorsChoices[3]);
            System.out.println(scissorsChoices[rand]);
        }
        System.out.println(Continue);
        doContinue = scanner.nextLine().toUpperCase();
        if (doContinue.charAt(0) == Continue.charAt(22)) { // 22 = char "Д"
            new RPS(getRand());
        }
    }

    public RPS(int rand) {
            System.out.println(yourChoice);
            playerAnswer = scanner.nextLine();
            chooseWinner(playerAnswer, rand);
    }
}

