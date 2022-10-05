import java.util.Scanner;

public class Exercise2 {
    /*
    The program requests a six-digit number and determines after
the input whether the ticket with such number will be winning
(the sum of the first three digits matches the sum of the last three
digits).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a six-digit number!!! ");
        int number = scanner.nextInt();
        int a, b, c ,d ,e ,f ;
        f = number%10;
        e = (number%100 ) / 10 ;
        d = (number%1000) /100 ;
        c = (number%10000) /1000;
        b = (number%100000)/10000;
        a = number/100000;
        if ((number > 99999) && (number < 1000000))
        { if (a+b+c == d+e+f) {
            System.out.println("You won!!!");}
            else System.out.println("Sorry, you didn't win");

        }
        else System.out.println("Incorrect the number of ticket");}
    }

