import java.util.Scanner;

public class Exercise3 {
    /*
    Numbers x and y are given. The program must output to the
console “YES” if both numbers are even or odd, otherwise the
program outputs nothing.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (((x%2==0) && (y%2 ==0)) || ((x%2==1) && (y%2==1))) {
            System.out.println("Yes");
        }
    }
}
