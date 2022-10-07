import java.util.Scanner;
/*Define entrance of a nine-storey apartment building according
to the specified apartment number N. There are M apartments on
each floor. Output the number of the entrance to the console.*/
public class Exercise6 {
    public static void main(String[] args) {
        int floors = 9;
        System.out.println("Введите количество квартир на этаже");
        Scanner scanner = new Scanner(System.in);
        int flatsOnFloor = scanner.nextInt();
        int entranceFlats = floors * flatsOnFloor;
        System.out.println("Введите номер квартиры");
        int flat = scanner.nextInt();
        int entrance = flat / entranceFlats + 1;
        System.out.printf("Ваш подъезд : %d", entrance );
        }
    }

