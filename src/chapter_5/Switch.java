package chapter_5;
// An improved version of the program that
//determines the belonging of the month of the season
public class Switch {
    public static void main(String[] args) {
        int month = 4;
        String season;
        switch (month){
            case 12:
            case 1:
            case 2:
                season = " to the winter";
                break;
            case 3:
            case 4:
            case 5:
                season = " to the spring";
                break;
            case 6:
            case 7:
            case 8:
                season = " to the summer";
                break;
            case 9:
            case 10:
            case 11:
                season = " to the autumn";
                break;
            default:
                season = " to the fictional months";
        }
        System.out.println(" April refer" + season + ".");
    }

}
