package StoneScissorsPaper;

import java.util.Scanner;

public class Player {

    public String getMovePlayer() {
        System.out.println("Введи: камень, ножницы или бумага");
        Scanner scanner = new Scanner(System.in);
        String userScanInput = scanner.nextLine();
        if (userScanInput.equals("камень") || userScanInput.equals("ножницы") || userScanInput.equals("бумага")) {
        } else {
            System.out.println("Ввод содержит ошибки, повторите снова");
            getMovePlayer();
        }
        return userScanInput;
    }

}





