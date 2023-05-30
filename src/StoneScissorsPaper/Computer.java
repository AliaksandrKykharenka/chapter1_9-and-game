package StoneScissorsPaper;

import java.util.Random;

public class Computer {
    public String getMoveComputer() {
        String figure = "ножницы";
        Random random = new Random();
        int index = random.nextInt(4);
        if (index == 1) {
            figure = "камень";
        } else if (index == 2) {
            figure ="бумага";
        } else if (index == 3) {
            figure = "ножницы";
        }
        return figure;
    }
}

