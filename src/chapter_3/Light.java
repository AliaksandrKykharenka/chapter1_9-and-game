package chapter_3;
 //calculate distance traveled by light
 //using variables like long

public class Light {
    public static void main(String[] args) {
        int lightSpeed;
        long days;
        long seconds;
        long distance;
        //approximate speed of light miles per second
        lightSpeed = 186000;
        days = 1000; //specify the number of days
         seconds = days * 24 * 60 *60; //convert to seconds
        distance = lightSpeed * seconds; //calculate distance
        System.out.print("For " + days);
        System.out.print(" days the light will pass about ");
        System.out.println(distance +" miles");
    }
}
