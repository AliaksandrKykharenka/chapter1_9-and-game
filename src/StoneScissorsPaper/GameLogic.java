package StoneScissorsPaper;

public class GameLogic {
    Player player = new Player();
    Computer computer = new Computer();

    public void gameStart() {
        String playerMove = player.getMovePlayer();
        String computerMove = computer.getMoveComputer();
        System.out.println(" Вы выбрали: " + playerMove);
        System.out.println(" Компьютер выбрал: " + computerMove);


            if (playerMove.equals(computerMove)) {
                System.out.println();
                System.out.println(" Победила дружба");
            } else if (playerMove.equals("камень") && computerMove.equals("ножницы")) {
                System.out.println("Вы победили");
            } else if (playerMove.equals("ножницы") && computerMove.equals("камень")) {
                System.out.println("Победил компьютер");
            } else if (playerMove.equals("бумага") && computerMove.equals("камень")) {
                System.out.println("Вы победили");
            } else if (playerMove.equals("камень") && computerMove.equals("бумага")) {
                System.out.println("Победил компьютер");
            } else if (playerMove.equals("ножницы") && computerMove.equals("бумага")) {
                System.out.println("Вы победили");
            } else if (playerMove.equals("бумага") && computerMove.equals("ножницы"))
                System.out.println("Победил компьютер");

    }
    }
