package ch04pc2;
import java.util.Scanner;

/**
 *
 * @author Frank.Olson
 * date: 11/1/2017
 * purpose: to calculate distance travelled
 */
public class ch04pc2 {

    public static void main(String[] args){
        //variables
        double distance, speed, time, j;
        int i;

        //create keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Request input
        System.out.print("Please input the speed (in mph): ");
        speed = keyboard.nextInt();
        System.out.print("Please input the time travelled (in hours): ");
        time = keyboard.nextInt();

        if (speed < 0 || time < 1) {
            System.out.print("You input an incorrect amount.");
            System.exit(0);
        }

        System.out.printf("%10s %10s\n", "Hour", "Distance Traveled");
        System.out.printf("%10s", "--------------------\n");
        for (i = 1; i < time; i++){
            distance = i * speed;
            j = i;
            System.out.printf("%10.0f %10.0f\n", j, distance);
        }

    }

}
