import java.util.Scanner;
/*Find roots of a quadratic equation and output them to the
screen if there are any. If there are no roots, output message
informing about this. The quadratic equation is defined by the
coefficients a, b, c entered from the keyboard by the user.*/
public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("Введите коэффициенты квадратного равнения");
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        double x, x1, x2;
        d = b * b - 4 * a * c;
        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2.0 * a);
            x2 = (-b - Math.sqrt(d)) / (2.0 * a);
            System.out.println("Корни уравнения :" + x1 + " и " + x2);
        } else if (d < 0) {
            System.out.println("Нет корней");
        }
        else {x= -b/(2*a);
            System.out.println("Корень уравнения : " +  x);}
    }}




