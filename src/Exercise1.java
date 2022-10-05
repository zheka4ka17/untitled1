import java.util.Scanner;
  /*The time is entered from the keyboard (the number of hours
 from 0 to 24), and the program displays greeting corresponding
  to the entered time (for example, if 15 is entered, the greeting
   “good day” is displayed)*/
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of hours");
        int x = scanner.nextInt();
        if ((x >= 0) && (x <= 24))
            if (x <= 5) {
                System.out.println("Good night");
            } else if (x <= 10) {
                System.out.println("Good morning");
            } else if (x <= 18) {
                System.out.println("Good day");
            } else System.out.println("Good evening");}
    }






