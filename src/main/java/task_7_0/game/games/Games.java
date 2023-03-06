package task_7_0.game.games;

import task_7_0.game.Extensions;
import task_7_0.game.fighters.*;

import java.util.Random;
import java.util.Scanner;

public class Games {

    public Player playerOne = new Player();
    public Player playerTwo = new Player();

    public Random random = new Random(System.currentTimeMillis());
    private final Extensions extensions = new Extensions();

    private final Scanner in = new Scanner(System.in);

    public void start() {
        System.out.println("Выберите бойца, " +
                "доступные классы:\n" +
                "1. " + Archer.NAME_CLASS_FIGHTERS +
                "\n2. " + Assassin.NAME_CLASS_FIGHTERS +
                "\n3. " + Knight.NAME_CLASS_FIGHTERS +
                "\n4. " + Mage.NAME_CLASS_FIGHTERS +
                "\n5. " + Swordsman.NAME_CLASS_FIGHTERS + "\n");

        userChoice(playerOne);
        outPlayer(playerOne);
        System.out.println("*\nСоздание противника");


        int randomFighters = extensions.customRandom(4);
        createPlayer(Integer.toString(randomFighters), "Олег", playerTwo);
        outPlayer(playerTwo);
        battle();
    }

    public void end() {
        System.out.println("*********************************************");
        System.out.println("Игра окончена");
        determineWinner();
        in.close();
    }

    /**
     * Определить победителя
     */
    private void determineWinner() {
        if (playerOne.humanFighting.getDead() && playerTwo.humanFighting.getDead()) {
            System.out.println("\nНичья");
            outPlayer(playerOne);
            System.out.println();
            outPlayer(playerTwo);
        } else if (playerOne.humanFighting.getDead()) {
            System.out.println("\nПобедил компьютер");
            outWinner(playerTwo, playerOne);
        } else {
            System.out.println("\nПобедил игрок");
            outWinner(playerOne, playerTwo);
        }
    }

    private void outWinner(Player winner, Player loser) {
        String textWinner = "Победитель";
        String textLoser = "Проигравший";

        System.out.println("\n" + textWinner);
        outPlayer(winner);
        System.out.println("\n" + textLoser);
        outPlayer(loser);
    }

    private void battle() {
        System.out.println("\n****** Сражение началось ******");
        int random = extensions.customRandom(1);
        Player turnOne;
        Player turnTwo;

        if (random == 0) {
            System.out.println("*\nПервый ходит игрок");
            turnOne = playerOne;
            turnTwo = playerTwo;
        } else {
            System.out.println("*\nПервый ходит ИИ");
            turnOne = playerTwo;
            turnTwo = playerOne;
        }

        Player currentTurn = turnOne;

        do {
            if (currentTurn == turnOne) {
                battleTurn(currentTurn);
                currentTurn = turnTwo;
            } else {
                battleTurn(currentTurn);
                currentTurn = turnOne;
            }
            System.out.println("*** Ход окончен ***\n");

        } while (!playerOne.humanFighting.getDead() && !playerTwo.humanFighting.getDead());
    }

    private void battleTurn(Player turn) {
        if (turn == playerOne) {
            turnUser();
        } else {
            turnComputer();
        }
    }

    private void turnUser() {
        boolean repeat;
        do {
            Scanner in = new Scanner(System.in);
            String answer;
            System.out.println("*** Ваш ход ***");
            System.out.println("Варианты действий :\n" +
                    "1. Атаковать\n" +
                    "2. Защищаться \n" +
                    "3. Посмотреть информацию о игроках");
            answer = in.nextLine();

            switch (answer) {
                case "1":
                    System.out.println(playerOne.humanFighting.getName() + " " + playerOne.nameFighters + " атакует ");
                    attack(playerOne, playerTwo);
                    repeat = false;
                    break;
                case "2":
                    System.out.println(playerOne.humanFighting.getName() + " " + playerOne.nameFighters + " защищается ");
                    playerOne.humanFighting.defend();
                    repeat = false;
                    break;
                case "3":
                    outPlayer(playerOne);
                    System.out.println();
                    outPlayer(playerTwo);
                    System.out.println();
                    repeat = true;
                    break;
                default:
                    System.out.println("Вы ввели не верное значение попробуйте еще раз");
                    repeat = true;
            }
        } while (repeat);
    }

    private void turnComputer() {
        System.out.println("*** Ход ИИ ***");
        int random = extensions.customRandom(1);
        if (random == 0) {
            System.out.println(playerTwo.humanFighting.getName() + " " + playerTwo.nameFighters + " атакует ");
            attack(playerTwo, playerOne);
        } else {
            System.out.println(playerTwo.humanFighting.getName() + " " + playerTwo.nameFighters + " защищается ");
            playerTwo.humanFighting.defend();
        }
    }

    private void attack(Player attackerPlayer, Player defenderPlayer) {
        if (defenderPlayer.humanFighting.dodge()) {
            System.out.println(defenderPlayer.humanFighting.getName() + " Увернулся от атаки");
        } else {
            int damage = attackerPlayer.humanFighting.bop();
            defenderPlayer.humanFighting.takeDamage(damage);
            System.out.println(attackerPlayer.humanFighting.getName() + " нанес урон " + damage);
        }
    }

    private void userChoice(Player player) {
        boolean repeat = false;
        String namePlayerFighters = "";
        String answerUser = "";
        do {
            System.out.print("Введите номер от 1 до 5: ");
            answerUser = in.nextLine();

            switch (answerUser) {
                case "1":
                    namePlayerFighters = Archer.NAME_CLASS_FIGHTERS;
                    break;
                case "2":
                    namePlayerFighters = Assassin.NAME_CLASS_FIGHTERS;
                    break;
                case "3":
                    namePlayerFighters = Knight.NAME_CLASS_FIGHTERS;
                    break;
                case "4":
                    namePlayerFighters = Mage.NAME_CLASS_FIGHTERS;
                    break;
                case "5":
                    namePlayerFighters = Swordsman.NAME_CLASS_FIGHTERS;
                    break;
                default:
                    System.out.println("Вы ввели не верное значение");
                    repeat = true;
            }
        } while (repeat);

        System.out.println("Отлично ! " + namePlayerFighters + " добавлен в вашу команду.");
        System.out.print("Давайте придумаем имя вашего бойца : ");
        String namePlayerOne = in.nextLine();
        createPlayer(answerUser, namePlayerOne, player);
    }

    private void createPlayer(String answerUser, String namePlayerOne, Player player) {
        System.out.print("*\nГенерация персонажа\n*\n");
        int ageRandom = extensions.customRandom(70);


        switch (answerUser) {
            case "1":
                player.nameFighters = Archer.NAME_CLASS_FIGHTERS;
                player.humanFighting = new Archer(namePlayerOne, ageRandom);
                break;
            case "2":
                player.nameFighters = Assassin.NAME_CLASS_FIGHTERS;
                player.humanFighting = new Assassin(namePlayerOne, ageRandom);
                break;
            case "3":
                player.nameFighters = Knight.NAME_CLASS_FIGHTERS;
                player.humanFighting = new Knight(namePlayerOne, ageRandom);
                break;
            case "4":
                player.nameFighters = Mage.NAME_CLASS_FIGHTERS;
                player.humanFighting = new Mage(namePlayerOne, ageRandom);
                break;
            default:
                player.nameFighters = Swordsman.NAME_CLASS_FIGHTERS;
                player.humanFighting = new Swordsman(namePlayerOne, ageRandom);
        }
    }

    private void outPlayer(Player player) {
        System.out.println("Имя бойца : " + player.humanFighting.getName());
        System.out.println("Возраст : " + player.humanFighting.getAge());
        System.out.println("Класс : " + player.nameFighters);
        System.out.println("Жизни : " + player.humanFighting.getLife());
        System.out.println("Броня : " + player.humanFighting.getArmor());
    }

}

